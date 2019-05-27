package com.example.texversion2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

import com.squareup.timessquare.CalendarPickerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public static final String TAG= "MainActivity";
    private CalendarPickerView calendarPickerView;
    private CalendarView calendarView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String languageToLoad1  = "en"; // your language
        Locale locale1 = new Locale(languageToLoad1);
        Locale.setDefault(locale1);
        Configuration config1 = new Configuration();
        config1.locale = locale1;
        getBaseContext().getResources().updateConfiguration(config1,
                getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.activity_main);

        //loadrun_language();
        Intent intent = getIntent();
        if (intent.hasExtra("Language"))run_language("de");

        Intent intent1 = getIntent();
        if (intent1.hasExtra("Language1"))run_language("en");

        /*Date today= new Date();
        Calendar nextYear = Calendar.getInstance();
        nextYear.add(Calendar.YEAR, 1);

        calendarPickerView = (CalendarPickerView) findViewById(R.id.calendar);
        calendarPickerView.init(today, nextYear.getTime()).withSelectedDate(today);


        Intent incommingintent = getIntent();
        //if (!incommingintent.hasExtra("Load"))run_tabelle();

        calendarPickerView.setOnDateSelectedListener( new CalendarPickerView.OnDateSelectedListener(){
            @NonNull
            @Override
            public void onDateSelected(Date date){
                Calendar calSelected = Calendar.getInstance();
                calSelected.setTime(date);

                String selectedDate =" " + calSelected.get(Calendar.DAY_OF_MONTH)
                        + "." + (calSelected.get(Calendar.MONTH)+1)
                        + "" + calSelected.get(Calendar.YEAR);
                //String date = dayOfMonth  + "." + (month + 1)+"." + year;

                Calendar c = Calendar.getInstance();
                String currentDateString =
                        new SimpleDateFormat("dd.MMMM.yyyy", Locale.ENGLISH).format(c.getTime());

                String currentDS =
                        new SimpleDateFormat("dd.MMMM.yyyy", Locale.GERMAN).format(c.getTime());


                Intent intent = new Intent (MainActivity.this, Tabelle.class);
                intent.putExtra("DATE", selectedDate);
                intent.putExtra("DATE1", currentDateString);
                intent.putExtra("DATE2", currentDS);
                startActivity(intent);

            }
            @Override
            public void onDateUnselected(Date date){

            }
        });*/
        calendarView = (CalendarView)findViewById(R.id.calendarview);

        Intent incommingintent = getIntent();
        if (!incommingintent.hasExtra("Load"))run_tabelle();

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @NonNull
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {

                String date = dayOfMonth  + "." + (month + 1)+"." + year;

                java.util.Calendar c = java.util.Calendar.getInstance();
                c.set(java.util.Calendar.DAY_OF_MONTH, dayOfMonth);
                c.set(java.util.Calendar.MONTH, month);
                c.set(java.util.Calendar.YEAR, year);

                String currentDateString =
                        new SimpleDateFormat("dd.MMMM.yyyy", Locale.ENGLISH).format(c.getTime());
                //Log.d(TAG, "dd.MMMM.yyyy" + date);
                String currentDS =
                        new SimpleDateFormat("dd.MMMM.yyyy", Locale.GERMAN).format(c.getTime());

                Intent intent = new Intent(MainActivity.this, Tabelle.class);
                intent.putExtra("DATE", date);
                intent.putExtra("DATE1", currentDateString);
                intent.putExtra("DATE2", currentDS);
                startActivity(intent);
            }
        });

    }

    private void run_language(String languageToLoad) {
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.activity_main);
        SharedPreferences.Editor editor = getSharedPreferences("Langu1", 0).edit();
        editor.putString("Lang2",languageToLoad);
        editor.apply();

    }
    public void loadrun_language(){
        SharedPreferences prefs= getSharedPreferences("Langu1", Activity.MODE_PRIVATE);
        String language= prefs.getString("Lang2", "");
        run_language(language);
    }

    public void run_tabelle(){
        Date date =Calendar.getInstance().getTime();
        DateFormat dateFormat= new SimpleDateFormat("dd.MMMM.yyyy", Locale.ENGLISH);
        String strDate= dateFormat.format(date);

        Intent intent = new Intent (MainActivity.this, Tabelle.class);
        intent.putExtra("DATE", strDate);
        intent.putExtra("DATE1", strDate);
        startActivity(intent);
    }
}
