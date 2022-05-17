package com.example.smartattendence;

import static com.example.smartattendence.R.layout.activity_employee_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class EmployeeList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(activity_employee_list);
        RecyclerView r = findViewById(R.id.Rv);
        String[] data = {"Sachin ", " is ", " the "," best","1","2","3","4","5","8","9","10","11","12","13"};
        EmployeeAdpater adapter = new EmployeeAdpater(getApplication(),data);
        r.setAdapter(adapter);
        r.setLayoutManager(new LinearLayoutManager(EmployeeList.this));
    }
}