package com.example.optionsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int identifier;
    View view;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = this.getWindow().getDecorView();
    }


    public void go(View view) {
        si = new Intent(this, secondActivity.class);
        startActivity(si);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        identifier = item.getItemId();
        if (identifier == R.id.blue) {
            view.setBackgroundColor(Color.BLUE);
        } else if (identifier == R.id.green) {
            view.setBackgroundColor(Color.GREEN);
        } else if (identifier == R.id.red) {
            view.setBackgroundColor(Color.RED);
        }

        return true;
    }


}