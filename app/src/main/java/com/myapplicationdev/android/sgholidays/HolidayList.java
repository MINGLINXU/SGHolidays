package com.myapplicationdev.android.sgholidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HolidayList extends AppCompatActivity {

    ListView lvHoliday;
    TextView tvHolidayTitle;
    ArrayAdapter aa;
    ArrayList<PH> holiday1, holiday2;

    String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday_list);

        tvHolidayTitle = findViewById(R.id.tvType);
        lvHoliday = findViewById(R.id.lvHoliday);

        holiday1 = new ArrayList<PH>();
        holiday2 = new ArrayList<PH>();
        holiday1.add(new PH("Secular", "New Year's Day","newyear", "1 Jan 2020"));
        holiday1.add(new PH("Secular", "Labour Day","labourday", "1 May 2020"));
        holiday2.add(new PH("Ethnic & Religion", "Chinese New Year","cny", "25-26 Jan 2020"));
        holiday2.add(new PH("Ethnic & Religion", "Good Friday","goodfriday", "10 April 2020"));
        holiday2.add(new PH("Ethnic & Religion", "Vesak Day","vesakday", "7 May 2020"));
        holiday2.add(new PH("Ethnic & Religion", "Hari Raya Puasa","harirayapuasa", "24 May 2020"));
        holiday2.add(new PH("Ethnic & Religion", "Hari Raya Haji","harirayahaji", "31 July 2020"));
        holiday2.add(new PH("Ethnic & Religion", "National Day","nationalday", "9 August 2020"));
        holiday2.add(new PH("Ethnic & Religion", "Deepavali","deepavali", "14 November 2020"));
        holiday2.add(new PH("Ethnic & Religion", "Christmas Day","christmas", "25 December 2020"));

        Intent i = getIntent();
        category = i.getStringExtra("Holiday Type");
        tvHolidayTitle.setText(category);

        if(category.equals("Secular")){
            aa = new CustomerAdapter(this, R.layout.row, holiday1);
        }else if(category.equals("Ethnic & Religion")){
            aa = new CustomerAdapter(this, R.layout.row, holiday2);
        }
        lvHoliday.setAdapter(aa);

        lvHoliday.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(category.equals("Secular")){
                    PH selectedHoliday = holiday1.get(position);

                    Toast.makeText(HolidayList.this, selectedHoliday.getTitle() + ", Date: " + selectedHoliday.getDate(), Toast.LENGTH_LONG).show();
                }else{
                    PH selectedHoliday = holiday2.get(position);

                    Toast.makeText(HolidayList.this, selectedHoliday.getTitle() + ", Date: " + selectedHoliday.getDate(), Toast.LENGTH_LONG).show();
                }

            }
        });




    }
}
