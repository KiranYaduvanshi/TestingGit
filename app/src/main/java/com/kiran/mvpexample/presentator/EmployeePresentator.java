package com.kiran.mvpexample.presentator;

import android.content.Context;

import com.kiran.mvpexample.MainActivity;
import com.kiran.mvpexample.constant.EmpListConstant;
import com.kiran.mvpexample.databinding.EmployeeListBinding;
import com.kiran.mvpexample.model.Employee_Module;
import com.kiran.mvpexample.model.emp_list.EmployeResponseModel;
import com.kiran.mvpexample.network.Client_Request;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmployeePresentator {

    //http://202.164.56.83/training_api/public/api/view-employee-list
    Context context;
    employeePresentator listener;

    public EmployeePresentator(MainActivity context) {
        this.context = context;
        listener = context;
    }

    public void getEmpList() {
          listener.onEmpListLoading();
        Client_Request.getInstance().services.getEmployeeList(EmpListConstant.DEVICE_ID,
                EmpListConstant.DEVICE_TYPE,
                EmpListConstant.APP_VERSION,
                EmpListConstant.DEVICE_TYPE).enqueue(new Callback<EmployeResponseModel>() {
            @Override
            public void onResponse(Call<EmployeResponseModel> call, Response<EmployeResponseModel> response) {
                EmployeResponseModel empResponse = response.body();
                listener.onEmpListSuccess(empResponse);
            }

            @Override
            public void onFailure(Call<EmployeResponseModel> call, Throwable t) {
                listener.onEmpListError(t);

            }
        });
    }

    public interface employeePresentator {
        void onEmpListSuccess(EmployeResponseModel empResponse);

        void onEmpListError(Throwable t);

        void onEmpListLoading();


    }
}
