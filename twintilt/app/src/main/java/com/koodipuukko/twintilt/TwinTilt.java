package com.koodipuukko.twintilt;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class TwinTilt
  extends ActionBarActivity
  {
    @Override protected void onCreate(Bundle savedInstanceState)
      {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twin_tilt);
      }

    @Override public boolean onCreateOptionsMenu(Menu menu)
      {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_twin_tilt, menu);
        return true;
      }

    @Override public boolean onOptionsItemSelected(MenuItem item)
      {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
          {
            return true;
          }
        return super.onOptionsItemSelected(item);
      }

    public void sendMessage(View view)
      {
        Intent intent = new Intent(this, TwinTiltCode.class);
        startActivity(intent);
      }
  }
