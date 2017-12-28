package com.example.chiriku.pelatihanintent;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    EditText editTxtUsername , editTxtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_menu);

        editTxtUsername = findViewById(R.id.edt_txt_username);
        editTxtPassword = findViewById(R.id.edt_txt_password);
        btnLogin = findViewById(R.id.btn_login);



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTxtUsername.getText().toString();
                String password = editTxtPassword.getText().toString();


                //mencek username=amcc dan password =amcc
                if (username.equals("amcc") && password.equals("amcc")){
                    Intent intent = new Intent(LoginActivity.this , MainActivity.class);
                    startActivity(intent);

                }
                else {

                    editTxtUsername.setText("");
                    editTxtPassword.setText("")

                }

            }
        });
    }
}
