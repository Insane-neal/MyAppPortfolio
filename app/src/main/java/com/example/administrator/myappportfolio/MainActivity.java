package com.example.administrator.myappportfolio;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView appListView = (ListView)this.findViewById(R.id.listView_app_portfolio);
        //save all the hard coded strings in res/values/strings.xml
        String[] appNamesArray = {
                getString(R.string.sportify_streamer),
                getString(R.string.scores_app),
                getString(R.string.library_app),
                getString(R.string.build_it_bigger),
                getString(R.string.xyz_reader),
                getString(R.string.capstone_my_own_app)
        };
        List<String> appNames = Arrays.asList(appNamesArray);
        ListAdapter appNamesAdapter = new ListAdapter(this,appNames);
        appListView.setAdapter(appNamesAdapter);
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
}
