package com.cifuentes.mitchell.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cifuentes.mitchell.swoosh.utilities.EXTRA_LEAGUE
import com.cifuentes.mitchell.swoosh.R

class SkillActivity : AppCompatActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onSkillFinishClicked(view: View) {
        val finishActivity = Intent(this, FinishActivity::class.java)
        startActivity(finishActivity)
    }

    fun onBallerSkillClicked(view: View) {

    }

    fun onBeginnerSkillClicked(view: View) {

    }


}
