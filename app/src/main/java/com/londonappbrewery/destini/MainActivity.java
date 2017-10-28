package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex;
    int mAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        //mQuestion = mQuestionBank[mIndex].getMQuestionId();


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                if(mButtonTop.getText() == mButtonTop.getResources().getString(R.string.T1_Ans1)) {
                    mButtonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T3_Ans2));
                    mStoryText.setText(getResources().getString(R.string.T3_Story));
                }else if (mButtonTop.getText() == mButtonTop.getResources().getString(R.string.T3_Ans1)) {
                    mStoryText.setText(getResources().getString(R.string.T6_End));
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }if (mButtonTop.getText() == mButtonTop.getResources().getString(R.string.T2_Ans1)){
                    mStoryText.setText(getResources().getString(R.string.T3_Story));
                    mButtonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T3_Ans2));
                }

            }

        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                if(mButtonBottom.getText() == mButtonBottom.getResources().getString(R.string.T1_Ans2)){
                    mButtonTop.setText(getResources().getString(R.string.T2_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T2_Ans2));
                    mStoryText.setText(getResources().getString(R.string.T2_Story));
                }else if (mButtonBottom.getText() == mButtonBottom.getResources().getString(R.string.T2_Ans2)) {
                    mStoryText.setText(getResources().getString(R.string.T4_End));
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }if (mButtonBottom.getText() == mButtonBottom.getResources().getString(R.string.T3_Ans2)) {
                    mStoryText.setText(getResources().getString(R.string.T5_End));
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }

            }

        });

    }

}
