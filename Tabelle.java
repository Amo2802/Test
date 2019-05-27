package com.example.texversion2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class Tabelle extends AppCompatActivity implements  View.OnClickListener {

    private int buttonState = 1;
    public static final String TAG = "Tabelle";
    TextView theDate;
    ImageButton i11, i12, i13, i14, i15, i16, i17, i18, i19, i110, i111, i112, btn_1_1, changelanguage;
    Button f21, f31, f41, f22, f23, f24, f25, f35, f26, f27, f28, f29, f210, f211, f36, f37, f46,f49,f39, f212, week;
    String xo = "X";
    int[][] MainActivityStorage;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale();
        setContentView(R.layout.activity_tabelle);

//Language
            changelanguage = (ImageButton) findViewById(R.id.changelang);
            changelanguage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showChangeLanguageDialog();

                }

            });

//Vom Kalender kommend
            theDate = (TextView) findViewById(R.id.date);

            Intent incomingIntent = getIntent();
            final String date = incomingIntent.getStringExtra("DATE1");
            final String date1 = incomingIntent.getStringExtra("DATE");
            String date2 = incomingIntent.getStringExtra("DATE2");
            theDate.setText(date);

//Kalender aufrufen
            btn_1_1 = findViewById(R.id.btn_1_1);
            btn_1_1.setOnClickListener(this);


//Wochenansicht aufrufen
            week = findViewById(R.id.week);
            week.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id.week:

                            Intent intent3 = new Intent (Tabelle.this, WeekActivity.class);
                            intent3.putExtra("WEEK", date1);
                            startActivity(intent3);
                    }
                }
            });

//Tabellenprogrammierung//

            i11 = findViewById(R.id.img_1_1);
            i12 = findViewById(R.id.img_1_2);
            i13 = findViewById(R.id.img_1_3);
            i14 = findViewById(R.id.img_1_4);
            i15 = findViewById(R.id.img_1_5);
            i16 = findViewById(R.id.img_1_6);
            i17 = findViewById(R.id.img_1_7);
            i18 = findViewById(R.id.img_1_8);
            i19 = findViewById(R.id.img_1_9);
            i110 = findViewById(R.id.img_1_10);
            i111 = findViewById(R.id.img_1_11);
            i112 = findViewById(R.id.img_1_12);

            f21 = findViewById(R.id.field_2_1);
            f31 = findViewById(R.id.field_3_1);
            f41 = findViewById(R.id.field_4_1);
            f22 = findViewById(R.id.field_2_2);
            f36 = findViewById(R.id.field_3_6);
            f37 = findViewById(R.id.field_3_7);
            f23 = findViewById(R.id.field_2_3);
            f49 = findViewById(R.id.field_4_9);
            f46 = findViewById(R.id.field_4_6);
            f24 = findViewById(R.id.field_2_4);
            f211 = findViewById(R.id.field_2_11);
            f25 = findViewById(R.id.field_2_5);
            f35 = findViewById(R.id.field_3_5);
            f26 = findViewById(R.id.field_2_6);
            f27 = findViewById(R.id.field_2_7);
            f28 = findViewById(R.id.field_2_8);
            f29 = findViewById(R.id.field_2_9);
            f210 = findViewById(R.id.field_2_10);
            f39 = findViewById(R.id.field_3_9);
            f212 =findViewById(R.id.field_2_12);


            i11.setOnClickListener(this);
            i12.setOnClickListener(this);
            i13.setOnClickListener(this);
            i14.setOnClickListener(this);
            i15.setOnClickListener(this);
            i16.setOnClickListener(this);
            i17.setOnClickListener(this);
            i18.setOnClickListener(this);
            i19.setOnClickListener(this);
            i110.setOnClickListener(this);
            i111.setOnClickListener(this);
            i112.setOnClickListener(this);
//Buttons
            f21.setOnClickListener(this);
            f31.setOnClickListener(this);
            f41.setOnClickListener(this);
            f22.setOnClickListener(this);
            f36.setOnClickListener(this);
            f49.setOnClickListener(this);
            f23.setOnClickListener(this);
            f37.setOnClickListener(this);
            f46.setOnClickListener(this);
            f24.setOnClickListener(this);
            f39.setOnClickListener(this);
            f25.setOnClickListener(this);
            f35.setOnClickListener(this);
            f26.setOnClickListener(this);
            f27.setOnClickListener(this);
            f28.setOnClickListener(this);
            f29.setOnClickListener(this);
            f210.setOnClickListener(this);
            f211.setOnClickListener(this);
            f212.setOnClickListener(this);


            MainActivityStorage =new int[12][12];

            SharedPreferences sharedPreferences = getSharedPreferences(date1, 0);
            f21.setText(sharedPreferences.getString("myKey1", ""));

            f22.setText(sharedPreferences.getString("myKey2", ""));
            color(date1, f22, "myKey2");

            f23.setText(sharedPreferences.getString("myKey3", ""));
            check_checked(date1, f23, "myKey3");

            f24.setText(sharedPreferences.getString("myKey4", ""));
            check_checked(date1, f24, "myKey4");

            f25.setText(sharedPreferences.getString("myKey5", ""));

            f26.setText(sharedPreferences.getString("myKey6", ""));

            f27.setText(sharedPreferences.getString("myKey7", ""));

            f28.setText(sharedPreferences.getString("myKey8", ""));
            color2 (date1, f28, "myKey8");

            f29.setText(sharedPreferences.getString("myKey9", ""));


            f210.setText(sharedPreferences.getString("myKey10", ""));
            check_checked(date1, f210, "myKey10");

            f211.setText(sharedPreferences.getString("myKey11", ""));
            check_checked(date1, f211, "myKey11");

            f31.setText(sharedPreferences.getString("myKey12", ""));

            f35.setText(sharedPreferences.getString("myKey13", ""));

            f36.setText(sharedPreferences.getString("myKey14", ""));

            f37.setText(sharedPreferences.getString("myKey15", ""));

            f39.setText(sharedPreferences.getString("myKey16", ""));

            f41.setText(sharedPreferences.getString("myKey17", ""));

            f46.setText(sharedPreferences.getString("myKey18", ""));

            f49.setText(sharedPreferences.getString("myKey19", ""));

            f212.setText(sharedPreferences.getString("myKey20", ""));
            check_checked(date1, f29, "myKey20");
            //int color =((ColorDrawable)f28.getBackground()).getColor();



        }

    private void color2(String date1, Button f28, String myKey8) {

        if (f28.getText().toString().equals("X")){
            f28.setBackgroundColor(Color.parseColor("#3B9621"));
        }else {
            f28.setBackgroundColor(Color.parseColor("#DB1F1F"));
        }
    }

    private void color(String date1, Button f22, String myKey2) {


        if (f22.getText().toString().equals("X")){
            f22.setBackgroundColor(Color.parseColor("#3B9621"));
        }else {
            f22.setBackgroundColor(Color.parseColor("#DB1F1F"));
        }

    }


    @Override
        protected void onStop() {
            super.onStop();
            update_data();
        }

        public void update_data(){
            Intent incomingIntent = getIntent();
            String date = incomingIntent.getStringExtra("DATE1");
            String date1 = incomingIntent.getStringExtra("DATE");
            theDate.setText(date);
            SharedPreferences sharedPreferences = getSharedPreferences(date1, 0);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("myKey1", f21.getText().toString());
            editor.putString("myKey2", f22.getText().toString());
            editor.putString("myKey3", f23.getText().toString());
            editor.putString("myKey4", f24.getText().toString());
            editor.putString("myKey5", f25.getText().toString());
            editor.putString("myKey6", f26.getText().toString());
            editor.putString("myKey7", f27.getText().toString());
            editor.putString("myKey8", f28.getText().toString());
            editor.putString("myKey9", f29.getText().toString());
            editor.putString("myKey10", f210.getText().toString());
            editor.putString("myKey11", f211.getText().toString());
            editor.putString("myKey12", f31.getText().toString());
            editor.putString("myKey13", f35.getText().toString());
            editor.putString("myKey14", f36.getText().toString());
            editor.putString("myKey15", f37.getText().toString());
            editor.putString("myKey16", f39.getText().toString());
            editor.putString("myKey17", f41.getText().toString());
            editor.putString("myKey18", f46.getText().toString());
            editor.putString("myKey19", f49.getText().toString());
            editor.putString("myKey20", f212.getText().toString());
            //editor.putInt("Color1", getColor());

            editor.commit();
        }

        public void check_checked(String date1, Button btn, String key){
            int checked_in_week = check(date1, key);


            checked_in_week=check (date1, "myKey3");
            if(checked_in_week >= 3){
                f23.setBackgroundResource(R.color.colorYellow);
            }
            if(checked_in_week >= 4){
                f23.setBackgroundResource(R.color.colorRed);
            }

            checked_in_week= check (date1, "myKey4");
            if(checked_in_week >= 1){
                f24.setBackgroundResource(R.color.colorGreen);}
            if(checked_in_week >= 5){
                f24.setBackgroundResource(R.color.colorRed);
            }

            checked_in_week= check (date1, "myKey10");
            if(checked_in_week >= 4){
                f210.setBackgroundResource(R.color.colorYellow);}
            if(checked_in_week >= 5){
                f210.setBackgroundResource(R.color.colorRed);
            }


            checked_in_week= check (date1, "myKey11");
            if(checked_in_week >= 4){
                f211.setBackgroundResource(R.color.colorYellow);}
            if(checked_in_week >= 5){
                f211.setBackgroundResource(R.color.colorRed);
            }

            checked_in_week= check (date1, "myKey20");
            if(checked_in_week >= 4){
                f212.setBackgroundResource(R.color.colorYellow);}
            if(checked_in_week >= 5){
                f212.setBackgroundResource(R.color.colorRed);
            }
        }

        public int check(String date1, String key){
            String first_date1 = get_start_of_week(date1);
            String checking = "";
            SharedPreferences sharedPreferences;
            int checked = 0;
            String x = "";
            int diff = get_diff(first_date1, date1);
            for (int i = 0; i < diff; i++){
                x = "";
                checking = add_day1(first_date1, i);
                sharedPreferences = getSharedPreferences(checking, 0);

                x =sharedPreferences.getString(key, "");
                if (x != "") checked ++;

            }

            return checked;
        }

        public int get_diff(String start, String end){
            if (start.equals(end)) return 0;
            String new_date1 = "";
            for(int i = 1; i < 7; i++){
                new_date1 = add_day1(start, i);
                if(new_date1.equals(end)) return i;
            }
            return 7;
        }

        public String get_start_of_week(String date1){
            int start = 2;
            int current = get_day_of_week(date1);
            int add;
            if (current >start){
                add = current-start;
            }
            else if(current == start){
                return date1;
            }
            else {
                add = (7-start)+current;

            }
            add -= add*2;
            return add_day1(date1, add);
        }

        public int get_day_of_week(String dt){
            //it will return 1 to 7
            SimpleDateFormat sdf = new SimpleDateFormat("d.M.yyyy");
            Calendar c = Calendar.getInstance();
            try {
                c.setTime(sdf.parse(dt));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return c.get(Calendar.DAY_OF_WEEK);
        }

        public String add_day1(String dt, int days){
            SimpleDateFormat sdf = new SimpleDateFormat("d.M.yyyy");
            Calendar c = Calendar.getInstance();
            try {
                c.setTime(sdf.parse(dt));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            c.add(Calendar.DATE, days);  // number of days to add
            dt = sdf.format(c.getTime());  // dt is now the new date
            return dt;
        }


        private void showChangeLanguageDialog() {
            final String [] listItems ={"Deutsch", "English"};
            AlertDialog.Builder mBuilder= new AlertDialog.Builder(Tabelle.this);
            mBuilder.setTitle("Choose Language...");
            mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    if (i== 0){
                        Deutsch();
                        setLocale("de");
                        Intent intent = new Intent(Tabelle.this, MainActivity.class);
                        intent.putExtra("Language", 1);
                        startActivity(intent);
                        recreate();
                    }
                    else if (i== 1){
                        English();
                        setLocale("en");
                        Intent intent = new Intent(Tabelle.this, MainActivity.class);
                        intent.putExtra("Language1", 1);
                        startActivity(intent);
                        recreate();
                    }

                    dialog.dismiss();
                }
            });
            AlertDialog mDialog= mBuilder.create();
            mDialog.show();
        }

        private void setLocale(String lang) {
            Locale locale = new Locale(lang);
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale= locale;
            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            SharedPreferences.Editor editor = getSharedPreferences("Settings", 0).edit();
            editor.putString("myLang", lang);
            editor.apply();
        }
        public void loadLocale(){
            SharedPreferences prefs =getSharedPreferences("Settings", Activity.MODE_PRIVATE);
            String language= prefs.getString("myLang", "" );
            setLocale(language);
        }

        private void English() {

            Intent incomingIntent = getIntent();
            String date = incomingIntent.getStringExtra("DATE1");
            theDate.setText(date);


            i11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_1:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }}});
            i12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_2:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });
            i13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_3:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });

            i14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_4:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });

            i15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_5:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });

            i16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_6:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });

            i17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_7:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });

            i18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_8:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });

            i19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_9:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });

            i110.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_10:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });

            i111.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_11:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });

            i112.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id. img_1_12:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Message");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert= builder.create();
                            alert.show();
                    }
                }
            });
            SharedPreferences sharedPreferences= getSharedPreferences("Englisch", 0);
            theDate.setText(sharedPreferences.getString("myEnglisch", ""));
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("myEnglisch", theDate.getText().toString());
            editor.commit();
        }

        private void Deutsch() {

            Intent incomingIntent = getIntent();
            String date2 = incomingIntent.getStringExtra("DATE2");
            theDate.setText(date2);

            i11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_1:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_2:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });
            i13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_3:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_4:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_5:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_6:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_7:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_8:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_9:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i110.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_10:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i111.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_11:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

            i112.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.img_1_12:
                            AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                            builder.setTitle("");
                            builder.setMessage("Nachricht");
                            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                    }
                }
            });

        }

//Ausfuehrung

        @Override
        public void onClick(View v) {

            // Intent incomingIntent = getIntent();
            //String date1 = incomingIntent.getStringExtra("DATE1");
            //String date = incomingIntent.getStringExtra("DATE");
            //theDate.setText(date1);
            // buttonState ++;

// Kalender aufrufen
            switch (v.getId()){
                case R.id.btn_1_1:
                    Intent intent = new Intent (Tabelle.this, MainActivity.class);
                    intent.putExtra("Load", 1);
                    startActivity(intent);
            }

//ImageButton, AlertDialog
            switch (v.getId()){
                case R.id. img_1_1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_2:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_3:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_4:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_5:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_6:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_7:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_8:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_9:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_10:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_11:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }
            switch (v.getId()){
                case R.id. img_1_12:
                    AlertDialog.Builder builder = new AlertDialog.Builder(Tabelle.this);
                    builder.setTitle("");
                    builder.setMessage("Message");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    AlertDialog alert= builder.create();
                    alert.show();
            }



//Tabellenbutton, X oder kein X
            switch (v.getId()) {
                case R.id.field_2_1:
                    f21.setText(xo);
                    handleInput( 2, 1, f21);
                    break;
                case R.id.field_3_1:
                    f31.setText(xo);
                    handleInput( 3,1, f31);
                    break;
                case R.id.field_4_1:
                    f41.setText(xo);
                    handleInput( 4,  1, f41);
                    break;
                case R.id.field_2_2:
                    f22.setText(xo);
                    handle( 2,  2, f22);
                    break;
                case R.id.field_3_9:
                    f39.setText(xo);
                    handleInput( 3, 8, f39);
                    break;
                case R.id.field_3_7:
                    f37.setText(xo);
                    handleInput( 3,7, f37);
                    break;
                case R.id.field_2_3:
                    f23.setText(xo);
                    handleInput(2, 3, f23);
                    break;
                case R.id.field_3_6:
                    f36.setText(xo);
                    handleInput(3,  6, f36);
                    break;
                case R.id.field_4_9:
                    f49.setText(xo);
                    handleInput( 4,  8, f49);
                    break;
                case R.id.field_2_4:
                    f24.setText(xo);
                    handleInput( 2,  4, f24);
                    break;
                case R.id.field_4_6:
                    f46.setText(xo);
                    handleInput( 4,  6, f46);
                    break;
                case R.id.field_2_5:
                    f25.setText(xo);
                    handleInput( 2,  5, f25);
                    break;
                case R.id.field_3_5:
                    f35.setText(xo);
                    handleInput( 3,  5, f35);
                    break;
                case R.id.field_2_6:
                    f26.setText(xo);
                    handleInput( 2,  6, f26);
                    break;
                case R.id.field_2_7:
                    f27.setText(xo);
                    handleInput( 2,  7, f27);
                    break;
                case R.id.field_2_8:
                    f28.setText(xo);
                    Input( 2,  8, f28);
                    break;
                case R.id.field_2_9:
                    f29.setText(xo);
                    handleInput( 2,  9,f29);
                    break;
                case R.id.field_2_10:
                    f210.setText(xo);
                    handleInput( 2,  10, f210);
                    break;
                case R.id.field_2_11:
                    f211.setText(xo);
                    handleInput( 2,  11, f211);
                    break;
                case R.id.field_2_12:
                    f212.setText(xo);
                    handleInput( 2,  12, f212);
                    break;
            }
            update_data();
        }


        private void Input (int x, int y, Button b){
            if (MainActivityStorage[x - 1][y - 1] == 0) {
                b.setText("X");
                f28.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                MainActivityStorage[x - 1][y - 1] = 1;


            } else{
                b.setText("");
                f28.setBackgroundColor(getResources().getColor(R.color.colorRed));
                MainActivityStorage[x - 1][y - 1] = 0;

            }
        }


        private void handle (int x, int y, Button b){

            if (MainActivityStorage[x - 1][y - 1] == 0) {
                b.setText("X");
                f22.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                MainActivityStorage[x - 1][y - 1] = 1;

            }
            else{
                b.setText("");
                f22.setBackgroundColor(getResources().getColor(R.color.colorRed));
                MainActivityStorage[x - 1][y - 1] = 0;

            }
            }

        private void handleInput (int x, int y, Button b){
            if (MainActivityStorage[x - 1][y - 1] == 0) {
                b.setText("X");
                MainActivityStorage[x - 1][y - 1] = 1;

            } else{
                b.setText("");
                MainActivityStorage[x - 1][y - 1] = 0;
            }

        }

    }




