package com.example.a11quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Pml2Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView question, qCount, timer;
    private Button option1, option2, option3, option4;
    private List<Question> questionList;
    private int quesNum;
    private CountDownTimer countDown;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pml2);


        question = findViewById(R.id.question);
        qCount = findViewById(R.id.quest_numb);
        timer = findViewById(R.id.countdown);

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);
        getQuestionsList();
        score = 0;
    }
    private void getQuestionsList()
    {
        //QUESTION AND ANSWARE SPACE, NEED TO BE CHANGED
        questionList = new ArrayList<>();
        questionList.add(new Question("Which one of the following fractions is the same as six-eighths (6⁄8)?","3/4", "2/4","1/4","3/8", 1));
        questionList.add(new Question("Which one of the fractions below is the biggest?","1/4", "1/3","2/6","3/12", 2));
        questionList.add(new Question("If you eat 5⁄7 of a cake, how much cake will be left?","7/7", "3/7","2/7","12/7", 3));
        questionList.add(new Question("Which fraction lies between 2⁄6 and 4⁄6?","5/6", "3/4","1/6","1/2", 4));
        questionList.add(new Question("What does 7⁄9 − 4⁄9 equal?","1/3", "11/8","1/6","4/18", 1));
        setQuestion();
    }
    private void setQuestion()
    {
        timer.setText(String.valueOf(10));
        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getOptionA());
        option2.setText(questionList.get(0).getOptionB());
        option3.setText(questionList.get(0).getOptionC());
        option4.setText(questionList.get(0).getOptionD());
        qCount.setText(String.valueOf(1) + "/" + String.valueOf(questionList.size()));
        startTimer();
        quesNum = 0;
    }
    private void startTimer()
    {
        countDown = new CountDownTimer(12000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(millisUntilFinished < 10000)
                    timer.setText(String.valueOf(millisUntilFinished/1000));
            }
            @Override
            public void onFinish() {
                changeQuestion();
            }
        };
        countDown.start();
    }
    @Override
    public void onClick(View v) {
        int selectedOprion = 0;
        switch (v.getId())
        {
            case R.id.option1:
                selectedOprion = 1;
                break;
            case R.id.option2:
                selectedOprion = 2;
                break;
            case R.id.option3:
                selectedOprion = 3;
                break;
            case R.id.option4:
                selectedOprion = 4;
                break;
            default:
        }
        countDown.cancel();
        checkAnswer(selectedOprion, v);
    }
    @SuppressLint("NewApi")
    private void checkAnswer(int selectedOption, View view)
    {
        if(selectedOption == questionList.get(quesNum).getCorrectAns())
        {
            //Right Answer
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            score++;
        }
        else
        {
            //Wrong Answer
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.RED));
            switch (questionList.get(quesNum).getCorrectAns())
            {
                case 1:
                    option1.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 2:
                    option2.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 3:
                    option3.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 4:
                    option4.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
            }
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeQuestion();
            }
        }, 2000);
    }
    private void changeQuestion()
    {
        if( quesNum < questionList.size() -1 )
        {
            quesNum++;
            playAnim(question, 0, 0);
            playAnim(option1, 0, 1);
            playAnim(option2, 0,2);
            playAnim(option3, 0,3);
            playAnim(option4, 0,4);
            qCount.setText(String.valueOf(quesNum+1) + "/" + String.valueOf(questionList.size()));
            timer.setText(String.valueOf(10));
            startTimer();
        }
        else
        {
            // Go to Score Activity
            Intent intent = new Intent(Pml2Activity.this,ScoreActivity.class);
            intent.putExtra("SCORE", String.valueOf(score) + "/" + String.valueOf(questionList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            Pml2Activity.this.finish();
        }
    }
    private void playAnim(final View view, final int value, final int viewNum)
    {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500)
                .setStartDelay(100).setInterpolator(new DecelerateInterpolator())
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                    }
                    @SuppressLint("NewApi")
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        if(value == 0)
                        {
                            switch (viewNum)
                            {
                                case 0:
                                    ((TextView)view).setText(questionList.get(quesNum).getQuestion());
                                    break;
                                case 1:
                                    ((Button)view).setText(questionList.get(quesNum).getOptionA());
                                    break;
                                case 2:
                                    ((Button)view).setText(questionList.get(quesNum).getOptionB());
                                    break;
                                case 3:
                                    ((Button)view).setText(questionList.get(quesNum).getOptionC());
                                    break;
                                case 4:
                                    ((Button)view).setText(questionList.get(quesNum).getOptionD());
                                    break;
                            }
                            if(viewNum != 0)
                                ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#172573")));
                            playAnim(view,1,viewNum);
                        }
                    }
                    @Override
                    public void onAnimationCancel(Animator animation) {
                    }
                    @Override
                    public void onAnimationRepeat(Animator animation) {
                    }
                });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        countDown.cancel();
    }
}