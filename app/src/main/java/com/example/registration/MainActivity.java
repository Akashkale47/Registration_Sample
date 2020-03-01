package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button next;
    public EditText addharNo,fullName, number, email, weight;
    public RadioButton male,female;
    public RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.btNext);
        next.setOnClickListener(this);
        addharNo = findViewById(R.id.etAddharNo);
        fullName = findViewById(R.id.etFullName);
        number = findViewById(R.id.etCallNumber);
        email = findViewById(R.id.etEmail);
        weight = findViewById(R.id.etWeight);
        gender =  (RadioGroup) findViewById(R.id.radio_group_button);
        male = findViewById(R.id.rb_male);
        female = findViewById(R.id.rb_female);
    }


    @Override
    public void onClick(View v) {
        String Addhar = addharNo.getText().toString();
        String Name = fullName.getText().toString();
        String Number = number.getText().toString();
        String Email = email.getText().toString();
        String Weight = weight.getText().toString();
        int selectedId = gender.getCheckedRadioButtonId();
        male = (RadioButton) findViewById(selectedId);
      //  String Male = male.getText().toString();
      //  String Female = female.getText().toString();
        Toast.makeText(this, " "+Addhar+" "+Name+" "+Number+" "+Email+" "+Weight+" "+male.getText(), Toast.LENGTH_SHORT).show();


    }
}

