package com.pml_dispatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registeration extends AppCompatActivity {
Button register;
EditText email_phone,pwd_su;
com.google.android.material.textfield.TextInputLayout email_phone_wrapper,pwd_wrapper_su;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        bindView();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),login.class);
                startActivity(intent);
            }
        });
        bgClick(email_phone,email_phone_wrapper);
        bgClick(pwd_su,pwd_wrapper_su);
    }

    public void bgClick(View view,final View view2){

        view.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    view2.setBackground(null);

                    //  Toast.makeText(getApplicationContext(),"Has focus",Toast.LENGTH_SHORT).show();
                }else{
                    EditText t=(EditText)view;

                    if(t.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(), t.getText()+"", Toast.LENGTH_SHORT).show();
                        view2.setBackgroundResource(R.mipmap.button);

                    }else{
                        view2.setBackground(null);
                        //  Toast.makeText(getApplicationContext(),"No focus",Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }

    public void bindView(){
        register=findViewById(R.id.register_button);
        email_phone=findViewById(R.id.email_phone_login);
        email_phone_wrapper=findViewById(R.id.email_phone_wrapper_li);
        pwd_wrapper_su=findViewById(R.id.pwd1_wrapper_su);
        pwd_su=findViewById(R.id.pwd1_su);
    }
}