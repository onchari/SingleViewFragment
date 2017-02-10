package com.example.user2.singleviewfragment;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Configuration  configuration = getResources().getConfiguration();

        FragmentManager fragmentManager = getSupportFragmentManager();
       FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        /*
        Check the device orientation and act accordingly
         */
        if(configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            //landscape device mode
            LM_Fragement lm_fragement = new LM_Fragement();
            fragmentTransaction.replace(android.R.id.content, lm_fragement);
        }else{
            //portraid mode
            PM_Fragment pm_fragment = new PM_Fragment();
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }

        fragmentTransaction.commit();
    }
}
