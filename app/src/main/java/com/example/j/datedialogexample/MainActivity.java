package com.example.j.datedialogexample;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;

import android.widget.TimePicker;

public class MainActivity extends FragmentActivity implements TimePickerDialog.OnTimeSetListener {

    public static final String AUTHORITY = BuildConfig.APPLICATION_ID;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");

        Intent intent = new Intent(this,DatePickActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("key","value");
        intent.putExtras(bundle);
        startActivity(intent);

        Log.i("package",AUTHORITY);
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Do something with the time chosen by the user
        Log.i("TIME", hourOfDay+":"+minute);
        finish();
    }
}
