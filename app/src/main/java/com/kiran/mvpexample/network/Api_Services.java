package com.kiran.mvpexample.network;

import com.kiran.mvpexample.model.Employee_Module;
import com.kiran.mvpexample.model.emp_list.EmployeResponseModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface Api_Services {

    /***
     * Network Api
     */

    @GET("training_api/public/api/view-employee-list")
    Call<EmployeResponseModel> getEmployeeList(@Header("device-id") String deviceId,
                                               @Header("device-type") String deviceType,
                                               @Header("app-version") String appVersion,
                                               @Header("device-token") String deviceToken);


}
