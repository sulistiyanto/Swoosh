package com.tubandev.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tubandev.swoosh.R
import com.tubandev.swoosh.model.Player
import com.tubandev.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Look for ${player.league} ${player.skill} league near you.."
    }
}
