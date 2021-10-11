package com.example.asproclaud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText password;
    private EditText login;
    private final String login_input = "admin";
    private final String password_input = "123";
    private String login_text;
    private String password_text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button auth = findViewById(R.id.auth);
        password = findViewById(R.id.Password);
        login = findViewById(R.id.login);


        auth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_text = login.getText().toString();
                password_text = password.getText().toString();

                if (login_text.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.no_user_input, Toast.LENGTH_LONG).show();
                }
                if (password_text.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.no_password_input, Toast.LENGTH_LONG).show();
                }
                else
                {
                    if (!login_text.equals(login_input) || !password_text.equals(password_input)) {
                        Toast.makeText(MainActivity.this, R.string.error_login_and_password, Toast.LENGTH_LONG).show();
                        password.setText("");
                    }
                    else {
                        Intent intent = new Intent(MainActivity.this, home.class);
                        startActivity(intent);
                    }
                }
            }

        });

    }

}