package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.savollar.Savollar

class TestActivity : AppCompatActivity() {
    lateinit var ivBack:ImageView
    lateinit var tvName: TextView
    lateinit var tvQuestionNumber: TextView
    lateinit var tvQuestion: TextView
    lateinit var rbAnswer1: RadioButton
    lateinit var rbAnswer2: RadioButton
    lateinit var rbAnswer3: RadioButton
    lateinit var rbAnswer4: RadioButton
    lateinit var rgAnswers: RadioGroup
    lateinit var bSubmitNext: Button
    lateinit var questions: ArrayList<Savollar>
    lateinit var res:ArrayList<Int>
    var count = 0
    var selected = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        loadQuestions()
        initViews()
        backToName()

    }


    private fun initViews() {
        res=ArrayList<Int>()
        val data = intent.getStringExtra("name")
        tvName = findViewById(R.id.tv_name)
        tvQuestion = findViewById(R.id.tv_question)
        tvQuestionNumber = findViewById(R.id.tv_question_number)
        rbAnswer1 = findViewById(R.id.rb_answer1)
        rbAnswer2 = findViewById(R.id.rb_answer2)
        rbAnswer3 = findViewById(R.id.rb_answer3)
        rbAnswer4 = findViewById(R.id.rb_answer4)
        bSubmitNext = findViewById(R.id.b_submit_next)
        tvName.text = data

        setQuestion(count)

        bSubmitNext.setOnClickListener {

            if (rbAnswer1.isChecked) {
                selected = 1
            } else if (rbAnswer2.isChecked) {
                selected = 2
            } else if (rbAnswer3.isChecked) {
                selected = 3
            } else if (rbAnswer4.isChecked) {
                selected = 4
            }
            if (selected>0){

                res.add(selected)
                count++
                setQuestion(count)

            }



        }

    }

    private fun setQuestion(i: Int) {
        selected = 0
        tvQuestionNumber.text = "Question ${i + 1}/${questions.size}"
        if (count==questions.size){

            val openResultActivity=Intent(this, ResultActivity::class.java)
            openResultActivity.putIntegerArrayListExtra("res",res)
            startActivity(openResultActivity)

        }
        tvQuestion.text = questions[i].savol
        rbAnswer1.text = questions[i].javob1
        rbAnswer1.isChecked=false
        rbAnswer2.text = questions[i].javob2
        rbAnswer2.isChecked=false
        rbAnswer3.text = questions[i].javob3
        rbAnswer3.isChecked=false
        rbAnswer4.text = questions[i].javob4
        rbAnswer4.isChecked=false
    }

    private fun loadQuestions() {
        questions = ArrayList()
        questions.add(Savollar("1-jahon urushi qaysi shartnoma imzolangandan keyin tugagan", "Antikomintern pakti", "Versal shartnomasi", "Molotov_Ribbentrop", "Polsha koridori shartnomasi", 2))
        questions.add(Savollar("Xalqlar jangi qachon bo'lib o'tgan", "1813-yil,16-19-oktabr", "1813-yil,7-10-iyun", "1813-yil,21-24-noyabr", "1813-yil,1-4-iyun", 1))
        questions.add(Savollar("Amir Temur nechanchi yilda Xorazmdan Oltin O'rda xonlarini quvib chiqargan", "1391-yil", "1390-yil", "1389-yil", "1388-yil", 4))
        questions.add(Savollar("U.Cherchill nechanchi yilda nobel mukofotini qo'lga kiritgan", "1953-yil", "1955-yil", "1949-yil", "1956-yil", 1))
        questions.add(Savollar("Savol5", "javob1", "javob2", "javob3", "javob4", 3))
        questions.add(Savollar("Savol6", "javob1", "javob2", "javob3", "javob4", 2))
        questions.add(Savollar("Savol7", "javob1", "javob2", "javob3", "javob4", 4))
        questions.add(Savollar("Savol8", "javob1", "javob2", "javob3", "javob4", 1))
        questions.add(Savollar("Savol9", "javob1", "javob2", "javob3", "javob4", 2))
        questions.add(Savollar("Savol10", "javob1", "javob2", "javob3", "javob4", 1))
    }
    fun backToName(){

        ivBack=findViewById(R.id.iv_back)
        ivBack.setOnClickListener {

            val backToNameActivity=Intent(this,NameActivity::class.java)
            startActivity(backToNameActivity)

        }

    }
}