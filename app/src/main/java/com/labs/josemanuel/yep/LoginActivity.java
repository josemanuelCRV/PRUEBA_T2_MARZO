package com.labs.josemanuel.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by JoseManuel on 07/03/2016.
 */
public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cambiarFont();


        final Button buttonSend = (Button) findViewById(R.id.button_login);
        buttonSend.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                  Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                  startActivity(intent);

            }
        });





    }





    private void cambiarFont() {
        TextView myTitle = (TextView) findViewById(R.id.title_login);
        TextView mySubtitle = (TextView) findViewById(R.id.subtitle_login);
        TextView mylabelSign = (TextView) findViewById(R.id.label_signup);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubtitle.setTypeface(myFont);
        mylabelSign.setTypeface(myFont);
    }


}
