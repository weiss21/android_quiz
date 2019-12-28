/*
Wais Robleh, CST338, Final Spring 2019
 */

package com.example.quiz;

public class QuestionLibrary
{

   // array that holds the questions.
   private String nQuestions[] =
   { "Which part of the plant holds it in the soil?", "This part of the plant attracts energy from the sun",
         "This part of the plant attracts bees, butterflies and hummingbirds",
         "The __________ holds the plant upright" };

   // A double 3x3 array. Each Array holds three choices for the buttons, dependent
   // on question.
   private String nChoices[][] =
   {
         { "Roots", "Stem", "Flower" },
         { "Fruit", "Leaves", "Seeds" },
         { "Bark", "Flower", "Roots" },
         { "Flower", "Leaves", "Stem" } };

   // holds correct answers for each choice that can be made.
   private String nCorrectAnswers[] =
   { "Roots", "Leaves", "Flower", "Stem" };

   // returns the Question in the nQuestion array.
   public String getQuestion(int n)
   {
      String question = nQuestions[n];
      return question;
   }

   // returns the first choice in a nChoices Array.
   public String getChoice1(int n)
   {
      String choice1 = nChoices[n][0];
      return choice1;
   }

   // returns the second choice in a nChoices Array.
   public String getChoice2(int n)
   {
      String choice2 = nChoices[n][1];
      return choice2;
   }

   // returns the third choice in a nChoices Array.
   public String getChoice3(int n)
   {
      String choice3 = nChoices[n][2];
      return choice3;
   }

   // returns the correct answer in the nChoices array.
   public String getCorrectAnswer(int n)
   {
      String answer = nCorrectAnswers[n];
      return answer;
   }

   // returns the length of the nQuestions array. This will help in keeping track
   // of the amount of questions there are in Main.
   public int getLength()
   {
      return nQuestions.length;
   }

}
