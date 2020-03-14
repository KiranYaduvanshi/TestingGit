package com.kiran.mvpexample.model.emp_list;

import java.util.ArrayList;

public class EmployeResponseModel
{
    private String status_code;
    private String message;
    private ArrayList<Data> data;

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public ArrayList<Data> getData ()
    {
        return data;
    }

    public void setData (ArrayList<Data> data)
    {
        this.data = data;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [status_code = "+status_code+", data = "+data+", message = "+message+"]";
    }
}
