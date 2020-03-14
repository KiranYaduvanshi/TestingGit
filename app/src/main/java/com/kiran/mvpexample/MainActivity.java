package com.kiran.mvpexample;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import com.kiran.mvpexample.adapter.EmployeeAdapter;
import com.kiran.mvpexample.databinding.ActivityMainBinding;
import com.kiran.mvpexample.dialog.ProgressDialog;
import com.kiran.mvpexample.model.Employee_Module;
import com.kiran.mvpexample.model.emp_list.EmployeResponseModel;
import com.kiran.mvpexample.presentator.EmployeePresentator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements EmployeePresentator.employeePresentator {

   ActivityMainBinding binding;
   EmployeePresentator presentator;
   EmployeeAdapter adapter;
   ProgressDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        dialog=new ProgressDialog(this);
        presentator=new EmployeePresentator(this);
        inflateList();
        getApiEmpList();
    }

    public void inflateList(){
        adapter=new EmployeeAdapter(this);
         binding.recyclerView.setAdapter(adapter);
    }

    public void getApiEmpList(){
        presentator.getEmpList();

    }

    @Override
    public void onEmpListSuccess(EmployeResponseModel responseModel) {
        dialog.dismiss();

            if(responseModel.getStatus_code().equals("200")){
                adapter.addEmpList(responseModel.getData());
            }else {
                // show error case
            }
    }

    @Override
    public void onEmpListError(Throwable t) {
      dialog.dismiss();
        //Log.e("Tag","Error-->>>"+t);

    }

    @Override
    public void onEmpListLoading() {
        dialog.show();
    }

    public void testing(){

    }
}
