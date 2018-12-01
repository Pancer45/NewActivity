package com.samsung.myitschool.newactivity;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String val = getIntent().getStringExtra("Логин");
        EditText result = findViewById(R.id.editText);
        result.setText(val);
    }

    public void goToSecond(View v) {
        EditText ed = findViewById(R.id.editText);
        String login_check = ed.getText().toString();
        String password_check = ed.getText().toString();

        SaveLogin log = new SaveLogin(login_check, password_check, false);
        System.out.print(log.res);
    }

    public void goToRegist(View v) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

        System.out.print("Регистрация");
    }
}
