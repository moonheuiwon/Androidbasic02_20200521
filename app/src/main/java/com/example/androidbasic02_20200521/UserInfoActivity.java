package com.example.androidbasic02_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.androidbasic02_20200521.databinding.ActivityUserInfoBinding;

import java.util.Calendar;

public  class UserInfoActivity extends BaseActivity {

    ActivityUserInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_info);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        String name = getIntent().getStringExtra("userName");
        int birthYear = getIntent().getIntExtra("userBirthYear", -1);

        int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear + 1;

//        문희원(26세) 양식으로 가공
        binding.userInfoTxt.setText(String.format("%s(%d세)", name, age));

    }
}
