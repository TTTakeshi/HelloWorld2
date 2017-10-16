package com.example.takeshi.helloworld2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
/**
 * Created by takeshi on 2017/09/30.
 */

public class HelloWorld extends Activity {

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(new HelloView(this));
    }

}
