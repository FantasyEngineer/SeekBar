package com.hjg.seekbar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SeekBarHint.OnSeekBarHintProgressChangeListener {
    private SeekBarHint mSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekBar = (SeekBarHint) findViewById(R.id.seekbar);
        mSeekBar.setPopupStyle(SeekBarHint.POPUP_FOLLOW);
        mSeekBar.setLeftText(1.0f);
        mSeekBar.setRightText(10.0f);

        mSeekBar.setOnProgressChangeListener(this);

    }


    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        mSeekBar.setProgressText(5);
        mSeekBar.setLeftText(0);
        mSeekBar.setRightText(10);
        mSeekBar.setOnProgressChangeListener(this);
        mSeekBar.post(new Runnable() {
            public void run() {
                mSeekBar.initShow();
                //mSeekBar.setMax();
            }
        });
    }

	   /* @Override
        public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()){
	            case R.id.action_fixed:
	                mSeekBar.setPopupStyle(SeekBarHint.POPUP_FIXED);
	                return true;

	            case R.id.action_follow:
	                mSeekBar.setPopupStyle(SeekBarHint.POPUP_FOLLOW);
	                return true;
	        }

	        return super.onOptionsItemSelected(item);
	    }*/

    @Override
    public String onHintTextChanged(SeekBarHint seekBarHint, float progress) {
        //return "p: "+progress;
        return null;
    }
}