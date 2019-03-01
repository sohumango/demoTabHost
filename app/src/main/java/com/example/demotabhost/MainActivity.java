package com.example.demotabhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabhost = (TabHost)findViewById(R.id.tabHost1);
        tabhost.setup();
        TabHost.TabSpec tab1 = tabhost.newTabSpec("tab1");
        tab1.setIndicator("タブ１");
        tab1.setContent(R.id.tab1);
        tabhost.addTab(tab1);

        TabHost.TabSpec tab2 = tabhost.newTabSpec("tab2");
        tab2.setIndicator("タブ2");
        tab2.setContent(R.id.tab2);
        tabhost.addTab(tab2);

        TabHost.TabSpec tab3 = tabhost.newTabSpec("tab3");
        tab3.setIndicator("タブ3");
        tab3.setContent(R.id.tab3);
        tabhost.addTab(tab3);

        TabHost.TabSpec tab4 = tabhost.newTabSpec("tab4");
        tab4.setIndicator("タブ4");
        tab4.setContent(R.id.tab4);
        tabhost.addTab(tab4);

        tabhost.setCurrentTab(1);
    }

}
