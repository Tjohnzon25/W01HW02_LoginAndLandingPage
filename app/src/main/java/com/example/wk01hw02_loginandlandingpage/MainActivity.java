package com.example.wk01hw02_loginandlandingpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.loginBtn);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        TextView incorrect = findViewById(R.id.incorrectTextView);

        incorrect.setVisibility(View.INVISIBLE);

        List<String> usernameList = new ArrayList<String>();
        List<String> passwordList = new ArrayList<String>();

        usernameList.add("Apple_1");
        usernameList.add("Banana_2");
        usernameList.add("Cherry_3");
        usernameList.add("Date_4");
        usernameList.add("Eggfruit_5");
        usernameList.add("Fig_6");
        usernameList.add("Grape_7");
        usernameList.add("Honeydew_8");
        usernameList.add("Inca_9");
        usernameList.add("Jackfruit_10");

        passwordList.add("Fruit_1");
        passwordList.add("Fruit_2");
        passwordList.add("Fruit_3");
        passwordList.add("Fruit_4");
        passwordList.add("Fruit_5");
        passwordList.add("Fruit_6");
        passwordList.add("Fruit_7");
        passwordList.add("Fruit_8");
        passwordList.add("Fruit_9");
        passwordList.add("Fruit_10");

        loginBtn.setOnClickListener(v -> {

            String newUsername = username.getText().toString();
            String newPassword = password.getText().toString();

            for(int i = 0; i < 10; i++) {
                if (checkUsername(newUsername, usernameList.get(i)) && checkPassword(newPassword, passwordList.get(i))) {

                    Intent intent = new Intent(getApplicationContext(), Retrofit.class);

                    String num = String.valueOf(i + 1);
                    String welcome = usernameList.get(i);

                    intent.putExtra("num", num);
                    intent.putExtra("welcomeUser", welcome);

                    startActivity(intent);
                }
            }

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    incorrect.setVisibility(View.INVISIBLE);
                }

                }, 3000); //for 3 seconds

            incorrect.setVisibility(View.VISIBLE);

        });
    }

    public boolean checkUsername(String username_1, String username_2){
        return username_1.equals(username_2);
    }

    public boolean checkPassword(String password_1, String password_2){
        return password_1.equals(password_2);
    }

}