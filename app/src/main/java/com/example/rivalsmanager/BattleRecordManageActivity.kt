package com.example.rivalsmanager


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_battle_record.*

class BattleRecordManageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battle_record)

        add_deck.setOnClickListener {
            val intent = Intent(application,DeckAddActivity::class.java)
            startActivity(intent)
        }
    }
}
