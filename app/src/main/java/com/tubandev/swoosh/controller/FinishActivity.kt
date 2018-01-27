package com.tubandev.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tubandev.swoosh.R
import com.tubandev.swoosh.utilities.EXTRA_LEAGUE
import com.tubandev.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Look for $league $skill league near you.."
    }
}
