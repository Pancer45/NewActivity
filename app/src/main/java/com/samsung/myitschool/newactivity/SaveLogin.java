package com.samsung.myitschool.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;

public class SaveLogin extends AppCompatActivity {

    String res;
    String[] check_login = {"sd"};

    SaveLogin(String password, String login, boolean s){
        if (s) {
            check_login = Arrays.copyOf(check_login, check_login.length + 1);
            check_login[check_login.length - 1] = login + password;
        }
        else{
            int w = 0;
            for (int i = 0; i <= check_login.length; i++){
                if (check_login[i].equals(login + password)){
                    w = 1;
                    System.out.print("Верно!");
                    this.res = "Готово!";
                    break;
                }
            }
            if (w == 0){
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
            }
        }
    }
}
