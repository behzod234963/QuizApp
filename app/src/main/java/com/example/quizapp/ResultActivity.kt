package com.example.quizapp


import android.content.Intent
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
        if (getExtraRes?.get(1)==1){

            tvResult2.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult2.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }
        if (getExtraRes?.get(2)==4){

            tvResult3.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult3.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }
        if (getExtraRes?.get(3)==1){

            tvResult4.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult4.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }
        if (getExtraRes?.get(4)==3){

            tvResult5.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult5.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }
        if (getExtraRes?.get(5)==4){

            tvResult6.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult6.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }
        if (getExtraRes?.get(6)==1){

            tvResult7.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult7.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }
        if (getExtraRes?.get(7)==2){

            tvResult8.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult8.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }
        if (getExtraRes?.get(8)==4){

            tvResult9.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult9.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }
        if (getExtraRes?.get(9)==2){

            tvResult10.background=resources.getDrawable(R.drawable.bg_correct)
            countCorrect++
            tvCorrect.text="To'g'ri javoblar: $countCorrect"

        }else{

            tvResult10.background=resources.getDrawable(R.drawable.bg_incorrect)
            countIncorrect++
            tvIncorrect.text="Xato javoblar: $countIncorrect"

        }
        bTryAgain.setOnClickListener {

            val backToName=Intent(this,NameActivity::class.java)
            startActivity(backToName)

        }

    }
}