package com.psiincgames.rutheless;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TownMap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.town_map);

        findViewById(R.id.townpic).setBackgroundResource(R.drawable.stockmap);

        Button button1 = (Button) findViewById(R.id.left1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TownMap.this, BattleScreen.class);
                startActivity(intent);
            }
        });
        button1.setText("Battle!");
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