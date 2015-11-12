package com.yoski.droidpyonpyon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView myText = (TextView)findViewById(R.id.helloWorld);
        Button myButton = (Button)findViewById(R.id.helloWorldButton);

        myText.setAlpha(0);

        myButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            myText.setAlpha(1.0f);
                                        }
                                    }
        );

    }
}
