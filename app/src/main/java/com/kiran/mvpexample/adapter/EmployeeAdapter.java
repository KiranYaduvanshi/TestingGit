package com.kiran.mvpexample.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.kiran.mvpexample.R;
import com.kiran.mvpexample.databinding.EmployeeListBinding;
import com.kiran.mvpexample.model.Employee_Module;
import com.kiran.mvpexample.model.emp_list.Data;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.Holder> {

    ArrayList<Data> empList = new ArrayList<>();
    Context context;

    public EmployeeAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        EmployeeListBinding binding = DataBindingUtil.inflate(inflater, R.layout.employee_list, parent, false);
        return new Holder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.binding.setEmployeeItem(empList.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return empList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        EmployeeListBinding binding;

        public Holder(EmployeeListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public void addEmpList(ArrayList<Data> empList) {
        this.empList = empList;
        notifyDataSetChanged();

    }
}
