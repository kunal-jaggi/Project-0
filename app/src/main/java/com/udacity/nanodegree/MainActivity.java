package com.udacity.nanodegree;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSportify;
    Button btnDuoScores;
    Button       btnDuoLib;
    Button btnBltBgr;
    Button        btnReader;
    Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSportify = (Button) findViewById(R.id.btnSportify);
        btnDuoScores = (Button) findViewById(R.id.btnDuoScores);
        btnDuoLib = (Button) findViewById(R.id.btnDuoLib);
        btnBltBgr = (Button) findViewById(R.id.btnBltBgr);
        btnReader = (Button) findViewById(R.id.btnReader);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when the user touches the button
     * @param view
     */
    public void launchApp(View view){
        switch (view.getId()){

            case R.id.btnSportify:
                showToast("This button will launch " +btnSportify.getText()+ " app!");
                break;

            case R.id.btnDuoScores:
                showToast("This button will launch " +btnDuoScores.getText()+ " app!");
                break;

            case R.id.btnDuoLib:
                showToast("This button will launch " +btnDuoLib.getText()+ " app!");
                break;

            case R.id.btnCapstone:
                showToast("This button will launch " +btnCapstone.getText()+ " app!");
                break;

            case R.id.btnBltBgr:
                showToast("This button will launch " +btnBltBgr.getText()+ " app!");
                break;

            case R.id.btnReader:
                showToast("This button will launch " +btnReader.getText()+ " app!");
                break;
        }
    }

    /**
     *
     * @param msg message to be displayed
     */
    private void showToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
