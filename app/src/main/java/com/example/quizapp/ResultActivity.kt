package com.example.quizapp


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity: AppCompatActivity() {

    lateinit var tvCorrect:TextView
    lateinit var tvIncorrect:TextView
    lateinit var tvResult1:TextView
    lateinit var tvResult2:TextView
    lateinit var tvResult3:TextView
    lateinit var tvResult4:TextView
    lateinit var tvResult5:TextView
    lateinit var tvResult6:TextView
    lateinit var tvResult7:TextView
    lateinit var tvResult8:TextView
    lateinit var tvResult9:TextView
    lateinit var tvResult10:TextView
    lateinit var bTryAgain:Button
    lateinit var bShare:Button
    var countCorrect=0
    var countIncorrect=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        initViews()

    }

    private fun initViews() {

        var getExtraRes=intent.getIntegerArrayListExtra("res")
        tvCorrect=findViewById(R.id.tv_correct_answers)
        tvIncorrect=findViewById(R.id.tv_incorrect_answers)
        bTryAgain=findViewById(R.id.b_try_again_result)
        bShare=findViewById(R.id.b_share_result)
        tvResult1=findViewById(R.id.tv_answer1_result)
        tvResult2=findViewById(R.id.tv_answer2_result)
        tvResult3=findViewById(R.id.tv_answer3_result)
        tvResult4=findViewById(R.id.tv_answer4_result)
        tvResult5=findViewById(R.id.tv_answer5_result)
        tvResult6=findViewById(R.id.tv_answer6_result)
        tvResult7=findViewById(R.id.tv_answer7_result)
        tvResult8=findViewById(R.id.tv_answer8_result)
        tvResult9=findViewById(R.id.tv_answer9_result)
        tvResult10=findViewById(R.id.tv_answer10_result)

        if (getExtraRes?.get(0)==2){

            tvResult1.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult1.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }

    }
}