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

public class MainActivity extends AppCompatActivity
{

   private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

   private TextView mScoreView; // controls the score view
   private TextView mQuestionView; // controls the question view

   private Button mButtonChoice1; // first choice will be set here to user.
   private Button mButtonChoice2; // second choice will be set here to user.
   private Button mButtonChoice3; // third choice will be set here to user.
   private Button mQuit; // A quit button if the user wants to move on to next question.

   private String mAnswer; // holds the right answer
   private int mScore = 0; // keeps track of score
   private int mQuestionNumber = 0; // keeps track of question number

   /*
    * majority of game logic in here. Action Bar will be displayed on top to make
    * the Quiz Android icon. Buttons will be linked to choices. There will be an
    * onClickListener for each button. If it is pressed, the game checks for
    * whether it is the right or wrong answer. If it is right it will update the
    * score by 1. If it is wrong it will not update the score. Either way it will
    * move on to the next question. Toast is an android class that allows the user
    * to see if they got the right or wrong answer on the bottom. It also will
    * notify the game ending. Then it will start from the beginning. This is a
    * simple way to study, flashcard style.
    * 
    */
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      ActionBar actionBar = getSupportActionBar();
      actionBar.setDisplayHomeAsUpEnabled(true);

      mScoreView = (TextView) findViewById(R.id.score);
      mQuestionView = (TextView) findViewById(R.id.question);
      mButtonChoice1 = (Button) findViewById(R.id.choice1);
      mButtonChoice2 = (Button) findViewById(R.id.choice2);
      mButtonChoice3 = (Button) findViewById(R.id.choice3);
      mQuit = (Button) findViewById(R.id.quit);

      updateQuestions();

      // Start of Button Listener for Button 1
      mButtonChoice1.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View view)
         {
            if (mButtonChoice1.getText() == mAnswer)
            {
               mScore += 1;
               updateScore(mScore);
               updateQuestions();
               // if correct show it
               Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
            } else
            {
               // else make it false
               Toast.makeText(MainActivity.this, "false", Toast.LENGTH_SHORT).show();
               updateQuestions();
            }
         }
      });
      // End of Button Listener for Button 1

      // Start of Button Listener for Button 2
      mButtonChoice2.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View view)
         {
            if (mButtonChoice2.getText() == mAnswer)
            {
               mScore += 1;
               updateScore(mScore);
               updateQuestions();
               // if correct show it
               Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
            } else
            {
               // else make it false
               Toast.makeText(MainActivity.this, "false", Toast.LENGTH_SHORT).show();
               updateQuestions();
            }
         }
      });
      // End of Button Listener for Button 2

      // Start of Button Listener for Button 3
      mButtonChoice3.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View view)
         {
            if (mButtonChoice3.getText() == mAnswer)
            {
               mScore += 1;
               updateScore(mScore);
               updateQuestions();
               // if correct show it
               Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
            } else
            {
               // else make it false
               Toast.makeText(MainActivity.this, "false", Toast.LENGTH_SHORT).show();
               updateQuestions();
            }
         }
      });
      // End of Button Listener for Button 3

      mQuit.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View view)
         {
            mQuestionNumber = 0; // placeholder for now
         }
      });

      // mQuestionNumber = 0;//should restart program
   }

   /*
    * Program will need to update questions after a successful or unsuccessful
    * question. Referenced from Question Library. Also updates correct Answer 
    * for Question
    */
   private void updateQuestions()
   {
      if (mQuestionNumber < mQuestionLibrary.getLength())
      {
         mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
         mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
         mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
         mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

         mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
         mQuestionNumber++;
      } else
      {
         Toast.makeText(MainActivity.this, "Test is Over", Toast.LENGTH_SHORT).show();
      }
   }
   
   /*
    * will add the score if the user gets answer right. Does nothing otherwise.
    */
   private void updateScore(int point)
   {
      mScoreView.setText("" + mScore);

   }
}
