package com.example.j.datedialogexample;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;

public class DatePickActivity extends FragmentActivity implements DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_pick);

        String value = "";

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle.containsKey("key"))
            value = bundle.getString("key","");

        Log.i("PARAM", value);

        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "datePicker");
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Log.i("TIME:DATE", day+"/"+month+"/"+year);
        finish();
    }
}
