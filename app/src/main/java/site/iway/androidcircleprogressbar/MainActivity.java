package site.iway.androidcircleprogressbar;

import android.app.Activity;
import android.os.Bundle;

import site.iway.androidhelpers.CircleProgressBar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleProgressBar progressBar = (CircleProgressBar) findViewById(R.id.progressBar);
        progressBar.setProgress(30, true);
    }
}
