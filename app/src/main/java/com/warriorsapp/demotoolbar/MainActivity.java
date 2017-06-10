package com.warriorsapp.demotoolbar;

/*
 * Adriano Alves
 * Jun 07 2017
 * Pratice About ToolBar on Android
 */

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the toolbat
        toolbar = (Toolbar)findViewById(R.id.toolbar);
//        toolbar.setLogo(R.drawable.android);

        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null) getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    // Method to create and set the menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // method to handle the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int itemId = item.getItemId();

        if (itemId == R.id.itemOne_id) Toast.makeText(this,"Item One",Toast.LENGTH_SHORT).show();
        else if (itemId == R.id.itemTow_id) Toast.makeText(this, "Item Two",Toast.LENGTH_SHORT).show();
        else if (itemId == R.id.itemThree_id) Toast.makeText(this,"Item Three",Toast.LENGTH_SHORT).show();
        else if( itemId == android.R.id.home) finish();
        else Toast.makeText(this,"NONE",Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
