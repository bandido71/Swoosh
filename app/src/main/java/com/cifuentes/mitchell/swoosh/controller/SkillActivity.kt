package com.cifuentes.mitchell.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.cifuentes.mitchell.swoosh.R
import com.cifuentes.mitchell.swoosh.model.Player
import com.cifuentes.mitchell.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onBallerSkillClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"

    }

    fun onBeginnerSkillClicked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"

    }

    fun onSkillFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }


}
