package com.example.owner.colorcodequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        WebView webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("file:///androidandroidasset/graph.html");
    }

    /*var massive = [
    {date: '2014-8-3', value:'1'},
    {date: '2014-8-4', value:'2'},
    {date: '2014-9-3', value:'3'},
    {date: '2014-10-14', value:'2'},
    {date: '2014-10-13', value:'8'},
    {date: '2014-7-3', value:'1'},
    {date: '2014-7-4', value:'2'},
    {date: '2014-7-7', value:'3'},
    {date: '2014-7-14', value:'2'},
    {date: '2014-6-3', value:'1'},
    {date: '2014-6-4', value:'2'},
    {date: '2014-6-5', value:'3'},
    {date: '2014-6-14', value:'2'}
    ];
    $('div#js-glanceyear').glanceyear(massive);  */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_graph, menu);
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
}
