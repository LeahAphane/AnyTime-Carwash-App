package com.example.anytimecarwash

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class BookingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookings)

        // Back button in toolbar (if you have one)
        val backButton: ImageButton? = findViewById(R.id.btn_back)
        backButton?.setImageResource(R.drawable.ic_arrow_back)
        backButton?.setOnClickListener {
            // Navigate back to HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }

        // Buttons for upcoming and past bookings
        val btnUpcoming = findViewById<Button>(R.id.btn_upcoming)
        val btnPast = findViewById<Button>(R.id.btn_past)

        btnUpcoming.setOnClickListener {
            val intent = Intent(this, UpcomingActivity::class.java)
            startActivity(intent)
        }

        btnPast.setOnClickListener {
            val intent = Intent(this, PastActivity::class.java)
            startActivity(intent)
        }
    }


}
