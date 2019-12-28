/*
Wais Robleh, CST338, Final Spring 2019
 */

package com.example.quiz;

import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

//private static int SPLASH_TIME_OUT = 4000;

public class HomeActivity extends AppCompatActivity
{

   /*
    * Does not hold any variables. Has one method called OnCreate() which is a
    * void. It does not do anything besides present a welcome screen xml folder for
    * about 4 seconds. Then it transfers to the MainActivity class to run that
    * logic's OnCreate().
    */
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_home);

      // Starts Splash Screen Opening
      new Handler().postDelayed(new Runnable()
      {
         @Override
         public void run()
         {
            Intent homeIntent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(homeIntent);
            finish();
         }
      }, 4000);
   }
}
