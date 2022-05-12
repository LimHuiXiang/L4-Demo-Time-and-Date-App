package sg.edu.rp.c346.id20006757.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker dp;
        TimePicker tp;
        Button btnDisplayDate;
        Button btnDisplayTime;
        TextView tvDisplay;
        Button Reset;

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.displaydate);
        btnDisplayTime = findViewById(R.id.displaytime);
        tvDisplay = findViewById(R.id.tvdisplay);
        Reset = findViewById(R.id.resetbutton);


        //3 set event listener

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                int month = dp.getMonth() +1;
                String textDate = dp.getDayOfMonth() + "/" + month + "/" + dp.getYear();
                tvDisplay.setText("Date is " + textDate);


            }
        });
        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action

                String textTime = tp.getCurrentHour() + ":" +tp.getCurrentMinute();
                tvDisplay.setText("Time is " + textTime);



            }
        });

       Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action


                dp.updateDate(2020 , 00,01);
                tp.setCurrentHour(00);
                tp.setCurrentMinute(00);

                tvDisplay.setText("Date is " + dp.getDayOfMonth()+ dp.getMonth()+ dp.getYear() + " Time is "  + tp.getCurrentHour() +tp.getCurrentMinute());



            }
        });


    }
}