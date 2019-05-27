package com.example.texversion2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WeekActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton image_1_1, image_1_2, image_1_3, image_1_4, image_1_5, image_1_6, image_1_7,image_1_8, image_1_9, image_1_10, image_1_11,image_1_12;
    Toolbar toolbar;
    TextView text_1_1, text_1_2, text_1_3, text_1_4, text_1_5, text_1_6, text_1_7, text_1_8, text_1_9, text_1_10, text_1_11, text_1_12,
    text_1_13, text_1_14, text_1_15, text_1_16, text_1_17, text_1_18, text_1_19, text_1_20, text_2_1, text_2_2, text_2_3,
    text_2_4, text_2_5, text_2_6, text_2_7, text_2_8, text_2_9, text_2_10, text_2_11, text_2_12, text_2_13, text_2_14, text_2_15,
    text_2_16, text_2_17, text_2_18, text_2_19, text_2_20, text_3_1, text_3_2, text_3_3, text_3_4, text_3_5, text_3_6, text_3_7,
    text_3_8, text_3_9, text_3_10, text_3_11, text_3_12, text_3_13, text_3_14, text_3_15, text_3_16, text_3_17, text_3_18, text_3_19,
    text_3_20, text_4_1, text_4_2, text_4_3, text_4_4, text_4_5, text_4_6, text_4_7, text_4_8, text_4_9, text_4_10, text_4_11, text_4_12,
    text_4_13, text_4_14, text_4_15, text_4_16, text_4_17, text_4_18, text_4_19, text_4_20, text_5_1, text_5_2, text_5_3, text_5_4, text_5_5,
    text_5_6, text_5_7, text_5_8, text_5_9, text_5_10, text_5_11, text_5_12, text_5_13, text_5_14, text_5_15, text_5_16, text_5_17, text_5_18,
    text_5_19, text_5_20, text_6_1, text_6_2, text_6_3, text_6_4, text_6_5, text_6_6, text_6_7, text_6_8, text_6_9, text_6_10, text_6_11, text_6_12,
    text_6_13, text_6_14, text_6_15, text_6_16, text_6_17, text_6_18, text_6_19, text_6_20, text_7_1, text_7_2, text_7_3, text_7_4, text_7_5, text_7_6,
    text_7_7, text_7_8, text_7_9, text_7_10, text_7_11, text_7_12, text_7_13, text_7_14, text_7_15, text_7_16, text_7_17, text_7_18, text_7_19, text_7_20;
    public static final String TAG= "WeekActivity";
    public Map<String, TextView> views = new HashMap<String, TextView>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);


            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            image_1_1 = (ImageButton) findViewById(R.id.image_1_1);
            image_1_2 =(ImageButton)findViewById(R.id.image_1_2);
            image_1_3 =(ImageButton)findViewById(R.id.image_1_3);
            image_1_4 =(ImageButton)findViewById(R.id.image_1_4);
            image_1_5 =(ImageButton)findViewById(R.id.image_1_5);
            image_1_6 =(ImageButton)findViewById(R.id.image_1_6);
            image_1_7 =(ImageButton)findViewById(R.id.image_1_7);
            image_1_8 =(ImageButton)findViewById(R.id.image_1_8);
            image_1_9 =(ImageButton)findViewById(R.id.image_1_9);
            image_1_10 =(ImageButton)findViewById(R.id.image_1_10);
            image_1_11 =(ImageButton)findViewById(R.id.image_1_11);
            image_1_12 =(ImageButton)findViewById(R.id.image_1_12);


            views.put("1_1", (TextView)findViewById(R.id.text_1_1));
            views.put("1_2", (TextView)findViewById(R.id.text_1_2));
            views.put("1_3", (TextView)findViewById(R.id.text_1_3));
            views.put("1_4", (TextView)findViewById(R.id.text_1_4));
            views.put("1_5", (TextView)findViewById(R.id.text_1_5));
            views.put("1_6", (TextView)findViewById(R.id.text_1_6));
            views.put("1_7", (TextView)findViewById(R.id.text_1_7));
            views.put("1_8", (TextView)findViewById(R.id.text_1_8));
            views.put("1_9", (TextView)findViewById(R.id.text_1_9));
            views.put("1_10", (TextView)findViewById(R.id.text_1_10));
            views.put("1_11", (TextView)findViewById(R.id.text_1_11));
            views.put("1_12", (TextView)findViewById(R.id.text_1_12));
            views.put("1_13", (TextView)findViewById(R.id.text_1_13));
            views.put("1_14", (TextView)findViewById(R.id.text_1_14));
            views.put("1_15", (TextView)findViewById(R.id.text_1_15));
            views.put("1_16", (TextView)findViewById(R.id.text_1_16));
            views.put("1_17", (TextView)findViewById(R.id.text_1_17));
            views.put("1_18", (TextView)findViewById(R.id.text_1_18));
            views.put("1_19", (TextView)findViewById(R.id.text_1_19));
            views.put("1_20", (TextView)findViewById(R.id.text_1_20));
            views.put("2_1", (TextView)findViewById(R.id.text_2_1));
            views.put("2_2", (TextView)findViewById(R.id.text_2_2));
            views.put("2_3", (TextView)findViewById(R.id.text_2_3));
            views.put("2_4", (TextView)findViewById(R.id.text_2_4));
            views.put("2_5", (TextView)findViewById(R.id.text_2_5));
            views.put("2_6", (TextView)findViewById(R.id.text_2_6));
            views.put("2_7", (TextView)findViewById(R.id.text_2_7));
            views.put("2_8", (TextView)findViewById(R.id.text_2_8));
            views.put("2_9", (TextView)findViewById(R.id.text_2_9));
            views.put("2_10", (TextView)findViewById(R.id.text_2_10));
            views.put("2_11", (TextView)findViewById(R.id.text_2_11));
            views.put("2_12", (TextView)findViewById(R.id.text_2_12));
            views.put("2_13", (TextView)findViewById(R.id.text_2_13));
            views.put("2_14", (TextView)findViewById(R.id.text_2_14));
            views.put("2_15", (TextView)findViewById(R.id.text_2_15));
            views.put("2_16", (TextView)findViewById(R.id.text_2_16));
            views.put("2_17", (TextView)findViewById(R.id.text_2_17));
            views.put("2_18", (TextView)findViewById(R.id.text_2_18));
            views.put("2_19", (TextView)findViewById(R.id.text_2_19));
            views.put("2_20", (TextView)findViewById(R.id.text_2_20));
            views.put("3_1", (TextView)findViewById(R.id.text_3_1));
            views.put("3_2", (TextView)findViewById(R.id.text_3_2));
            views.put("3_3", (TextView)findViewById(R.id.text_3_3));
            views.put("3_4", (TextView)findViewById(R.id.text_3_4));
            views.put("3_5", (TextView)findViewById(R.id.text_3_5));
            views.put("3_6", (TextView)findViewById(R.id.text_3_6));
            views.put("3_7", (TextView)findViewById(R.id.text_3_7));
            views.put("3_8", (TextView)findViewById(R.id.text_3_8));
            views.put("3_9", (TextView)findViewById(R.id.text_3_9));
            views.put("3_10", (TextView)findViewById(R.id.text_3_10));
            views.put("3_11", (TextView)findViewById(R.id.text_3_11));
            views.put("3_12", (TextView)findViewById(R.id.text_3_12));
            views.put("3_13", (TextView)findViewById(R.id.text_3_13));
            views.put("3_14", (TextView)findViewById(R.id.text_3_14));
            views.put("3_15", (TextView)findViewById(R.id.text_3_15));
            views.put("3_16", (TextView)findViewById(R.id.text_3_16));
            views.put("3_17", (TextView)findViewById(R.id.text_3_17));
            views.put("3_18", (TextView)findViewById(R.id.text_3_18));
            views.put("3_19", (TextView)findViewById(R.id.text_3_19));
            views.put("3_20", (TextView)findViewById(R.id.text_3_20));
            views.put("4_1", (TextView)findViewById(R.id.text_4_1));
            views.put("4_2", (TextView)findViewById(R.id.text_4_2));
            views.put("4_3", (TextView)findViewById(R.id.text_4_3));
            views.put("4_4", (TextView)findViewById(R.id.text_4_4));
            views.put("4_5", (TextView)findViewById(R.id.text_4_5));
            views.put("4_6", (TextView)findViewById(R.id.text_4_6));
            views.put("4_7", (TextView)findViewById(R.id.text_4_7));
            views.put("4_8", (TextView)findViewById(R.id.text_4_8));
            views.put("4_9", (TextView)findViewById(R.id.text_4_9));
            views.put("4_10", (TextView)findViewById(R.id.text_4_10));
            views.put("4_11", (TextView)findViewById(R.id.text_4_11));
            views.put("4_12", (TextView)findViewById(R.id.text_4_12));
            views.put("4_13", (TextView)findViewById(R.id.text_4_13));
            views.put("4_14", (TextView)findViewById(R.id.text_4_14));
            views.put("4_15", (TextView)findViewById(R.id.text_4_15));
            views.put("4_16", (TextView)findViewById(R.id.text_4_16));
            views.put("4_17", (TextView)findViewById(R.id.text_4_17));
            views.put("4_18", (TextView)findViewById(R.id.text_4_18));
            views.put("4_19", (TextView)findViewById(R.id.text_4_19));
            views.put("4_20", (TextView)findViewById(R.id.text_4_20));
            views.put("5_1", (TextView)findViewById(R.id.text_5_1));
            views.put("5_2", (TextView)findViewById(R.id.text_5_2));
            views.put("5_3", (TextView)findViewById(R.id.text_5_3));
            views.put("5_4", (TextView)findViewById(R.id.text_5_4));
            views.put("5_5", (TextView)findViewById(R.id.text_5_5));
            views.put("5_6", (TextView)findViewById(R.id.text_5_6));
            views.put("5_7", (TextView)findViewById(R.id.text_5_7));
            views.put("5_8", (TextView)findViewById(R.id.text_5_8));
            views.put("5_9", (TextView)findViewById(R.id.text_5_9));
            views.put("5_10", (TextView)findViewById(R.id.text_5_10));
            views.put("5_11", (TextView)findViewById(R.id.text_5_11));
            views.put("5_12", (TextView)findViewById(R.id.text_5_12));
            views.put("5_13", (TextView)findViewById(R.id.text_5_13));
            views.put("5_14", (TextView)findViewById(R.id.text_5_14));
            views.put("5_15", (TextView)findViewById(R.id.text_5_15));
            views.put("5_16", (TextView)findViewById(R.id.text_5_16));
            views.put("5_17", (TextView)findViewById(R.id.text_5_17));
            views.put("5_18", (TextView)findViewById(R.id.text_5_18));
            views.put("5_19", (TextView)findViewById(R.id.text_5_19));
            views.put("5_20", (TextView)findViewById(R.id.text_5_20));
            views.put("6_1", (TextView)findViewById(R.id.text_6_1));
            views.put("6_2", (TextView)findViewById(R.id.text_6_2));
            views.put("6_3", (TextView)findViewById(R.id.text_6_3));
            views.put("6_4", (TextView)findViewById(R.id.text_6_4));
            views.put("6_5", (TextView)findViewById(R.id.text_6_5));
            views.put("6_6", (TextView)findViewById(R.id.text_6_6));
            views.put("6_7", (TextView)findViewById(R.id.text_6_7));
            views.put("6_8", (TextView)findViewById(R.id.text_6_8));
            views.put("6_9", (TextView)findViewById(R.id.text_6_9));
            views.put("6_10", (TextView)findViewById(R.id.text_6_10));
            views.put("6_11", (TextView)findViewById(R.id.text_6_11));
            views.put("6_12", (TextView)findViewById(R.id.text_6_12));
            views.put("6_13", (TextView)findViewById(R.id.text_6_13));
            views.put("6_14", (TextView)findViewById(R.id.text_6_14));
            views.put("6_15", (TextView)findViewById(R.id.text_6_15));
            views.put("6_16", (TextView)findViewById(R.id.text_6_16));
            views.put("6_17", (TextView)findViewById(R.id.text_6_17));
            views.put("6_18", (TextView)findViewById(R.id.text_6_18));
            views.put("6_19", (TextView)findViewById(R.id.text_6_19));
            views.put("6_20", (TextView)findViewById(R.id.text_6_20));
            views.put("7_1", (TextView)findViewById(R.id.text_7_1));
            views.put("7_2", (TextView)findViewById(R.id.text_7_2));
            views.put("7_3", (TextView)findViewById(R.id.text_7_3));
            views.put("7_4", (TextView)findViewById(R.id.text_7_4));
            views.put("7_5", (TextView)findViewById(R.id.text_7_5));
            views.put("7_6", (TextView)findViewById(R.id.text_7_6));
            views.put("7_7", (TextView)findViewById(R.id.text_7_7));
            views.put("7_8", (TextView)findViewById(R.id.text_7_8));
            views.put("7_9", (TextView)findViewById(R.id.text_7_9));
            views.put("7_10", (TextView)findViewById(R.id.text_7_10));
            views.put("7_11", (TextView)findViewById(R.id.text_7_11));
            views.put("7_12", (TextView)findViewById(R.id.text_7_12));
            views.put("7_13", (TextView)findViewById(R.id.text_7_13));
            views.put("7_14", (TextView)findViewById(R.id.text_7_14));
            views.put("7_15", (TextView)findViewById(R.id.text_7_15));
            views.put("7_16", (TextView)findViewById(R.id.text_7_16));
            views.put("7_17", (TextView)findViewById(R.id.text_7_17));
            views.put("7_18", (TextView)findViewById(R.id.text_7_18));
            views.put("7_19", (TextView)findViewById(R.id.text_7_19));
            views.put("7_20", (TextView)findViewById(R.id.text_7_20));


            image_1_1.setOnClickListener(this);
            image_1_2.setOnClickListener(this);
            image_1_3.setOnClickListener(this);
            image_1_4.setOnClickListener(this);
            image_1_5.setOnClickListener(this);
            image_1_6.setOnClickListener(this);
            image_1_7.setOnClickListener(this);
            image_1_8.setOnClickListener(this);
            image_1_9.setOnClickListener(this);
            image_1_10.setOnClickListener(this);
            image_1_11.setOnClickListener(this);
            image_1_12.setOnClickListener(this);


           // Calendar c = Calendar.getInstance();
            //String currentDateString =
                   // new SimpleDateFormat("d.M.yyyy", Locale.ENGLISH).format(c.getTime());
           // draw_x(currentDateString);
            Intent intent = getIntent();
            String date = intent.getStringExtra("WEEK");
            draw_x(date);
        }

        public void draw_x (String currentdate) {
            String start = get_start_of_week(currentdate);
            String checking, x;
            SharedPreferences sharedPreferences;
            int[] checked = new int[20];
            for (int r = 0; r < 20; r++) checked[r] = 0;
            for (int i = 1; i <= 7; i++) {
                checking = add_day(start, (i - 1));
                sharedPreferences = getSharedPreferences(checking, 0);
                for (int j = 1; j <= 20; j++) {
                    x = sharedPreferences.getString("myKey" + j, "");
                    views.get(i + "_" + j).setText(x);
                    if (x != "") {
                        checked[j - 1] += 1;
                    }
                    if (checked[(j - 1)] >= 4) {

                        //views.get(i+"_"+j).setBackgroundColor(getResources().getColor(R.color.coloBlue));

                    }
                }
            }
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
            return add_day(date1, add);
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

        public String add_day(String dt, int days){
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


        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id. image_1_1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_2:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_3:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_4:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_5:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_6:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_7:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_8:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_9:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_10:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_11:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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
                case R.id. image_1_12:
                    AlertDialog.Builder builder = new AlertDialog.Builder(WeekActivity.this);
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

    }



