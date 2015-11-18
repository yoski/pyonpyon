package com.yoski.droidpyonpyon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.Transformation;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton myButton = (ImageButton)findViewById(R.id.droidBody);
        final ImageView myHead = (ImageView)findViewById(R.id.droidHead);

        myButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            pyonpyon();
                                        }
                                    }
        );

    }

    private void pyonpyon() {
        final int margin = 60;
        final ImageView myHead = (ImageView)findViewById(R.id.droidHead);
        Animation a = new Animation() {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) myHead.getLayoutParams();
                params.bottomMargin = (int) (margin * interpolatedTime);
                myHead.setLayoutParams(params);
            }
        };
        a.setDuration(300); // in ms
        myHead.startAnimation(a);
    }
}
