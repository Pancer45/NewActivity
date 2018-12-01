package com.samsung.myitschool.newactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Regist(View v) {
        EditText ed_login = findViewById(R.id.editText3);
        EditText ed_password = findViewById(R.id.editText2);
        String login = ed_login.getText().toString();
        String password = ed_password.getText().toString();

        SaveLogin reg = new SaveLogin(login, password, true);

        System.out.print(reg.res);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Логин", login);
        startActivity(intent);
    }
}
