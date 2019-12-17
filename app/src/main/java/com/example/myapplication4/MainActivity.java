package com.example.myapplication4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static androidx.appcompat.app.AlertDialog.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_sbm = (Button) findViewById(R.id.button);
        button_sbm.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {

        Builder a_builder = new Builder(MainActivity.this);
        a_builder.setMessage("Do you want to close this app!!!").setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = a_builder.create();
        alert.setTitle("ALERT!!");
        alert.show();

    }

}