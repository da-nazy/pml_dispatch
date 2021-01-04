package com.pml_dispatch;
import com.pml_dispatch.api.payload;
import com.pml_dispatch.api.staffLoginRespons;
import com.pml_dispatch.api.staffRequest;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface pmtApi {
    @Headers("Content-Type: application/json")
    @POST("/api/erp/staff/login")
    Call<staffRequest> login(@Body staffLoginRespons object);
    //FooResponse postRawJson(@Body TypedInput body);
}
