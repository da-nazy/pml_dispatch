package com.pml_dispatch;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pml_dispatch.api.payload;
import com.pml_dispatch.api.staffLoginRespons;
import com.pml_dispatch.api.staffRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class login extends AppCompatActivity {
Button login;
pmtApi pmtApi;
EditText email_phone,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        bindView();
        login.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(login.this,dashboard.class);
              //  startActivity(intent);
                getPmlUser();
            }
        });

        //Gson
        Gson gson =new GsonBuilder().serializeNulls().create();
        //For retrofit
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://api.pmt.com.ng")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        pmtApi=retrofit.create(pmtApi.class);

    }

    public void bindView(){
        login=findViewById(R.id.login_but);
        email_phone=findViewById(R.id.email_phone_login);
        password=findViewById(R.id.password_login);
    }



    public boolean isConnected() throws InterruptedException, IOException {
        String command = "ping -i 5 -c 1 google.com";
        return Runtime.getRuntime().exec(command).waitFor() == 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void getPmlUser(){



        Call<staffRequest> call=pmtApi.login(new staffLoginRespons("EMAIL","ejiekwu.goodluck@peacegroup.ng","newERP"));
        call.enqueue(new Callback<staffRequest>() {
            @Override
            public void onResponse(Call<staffRequest> call, Response<staffRequest> response) {

                staffRequest user_payload;
                while(response!=null){
                    user_payload=response.body();

              //      String content=" ";
            //        content+= "Payload id" + user_payload.getApi().get_id() + "\n";
              //      content+= "Token" + user_payload.getToken() + "\n";
                    Toast.makeText(getApplicationContext(),user_payload.getMessage()+" ",Toast.LENGTH_SHORT).show();
           System.out.println(user_payload.getPayload().getUser().get_id() +" "+ response.body());

                }

            }

            @Override
            public void onFailure(Call<staffRequest> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Testing"+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}