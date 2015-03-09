package com.psiincgames.rutheless;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


public class BattleScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battle_screen);

        findViewById(R.id.playerpic).setBackgroundResource(R.drawable.stockplayer);
        findViewById(R.id.enemypic).setBackgroundResource(R.drawable.stockmonster);

        TextView areaname = (TextView) findViewById(R.id.areaname);
        areaname.setText("Wild Terrible Drawing Attacks!");

        final LinearLayout scrollview = (LinearLayout) findViewById(R.id.battleinfolist);
        final Activity This = this;

        Button option1 = (Button) findViewById(R.id.left1);
        option1.setText("Attack!");
        option1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView info = new TextView(This);
                info.setText("You tried to attack but you're terribly drawn as well!");
                scrollview.addView(info);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}