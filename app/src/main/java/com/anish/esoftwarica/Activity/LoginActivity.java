package com.anish.esoftwarica.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.anish.esoftwarica.R;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    public EditText etUsername;
    public EditText etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.etUsername=(EditText)findViewById(R.id.etUsername);
        this.etPassword=(EditText)findViewById(R.id.etPassword);
        this.btnLogin=(Button)findViewById(R.id.btnLogin);

        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!LoginActivity.this.etUsername.getText().toString().equals("softwarica") || !LoginActivity.this.etPassword.getText().toString().equals("coventry")) {
                    Toast.makeText(LoginActivity.this, "Either username or password is incorrect", 0).show();
                    LoginActivity.this.etUsername.setError("Username or Password is invalid");
                    LoginActivity.this.etUsername.requestFocus();
                    return;
                }
                LoginActivity.this.startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                LoginActivity.this.finish();
            }
        });


    }
}
