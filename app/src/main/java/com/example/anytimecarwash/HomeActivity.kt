package com.example.anytimecarwash

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.anytimecarwash.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up navigation listeners
        setupNavigation()
    }

    private fun setupNavigation() {
        binding.settingsIcon.setOnClickListener { navigateTo(SettingsActivity::class.java) }
        binding.bookingsIcon.setOnClickListener { navigateTo(BookingsActivity::class.java) }
        binding.basicIcon.setOnClickListener { navigateTo(BookingsActivity::class.java) }
        binding.homeIcon.setOnClickListener { navigateTo(HomeActivity::class.java) }
        binding.premiumIcon.setOnClickListener { navigateTo(BookingsActivity::class.java) }
        binding.fullIcon.setOnClickListener { navigateTo(BookingsActivity::class.java) }
        binding.profileIcon.setOnClickListener { navigateTo(ProfileActivity::class.java) }
    }

    private fun navigateTo(destination: Class<*>) {
        try {
            if (destination == HomeActivity::class.java) {
                // Prevent recreating the same activity unnecessarily
                return
            }
            val intent = Intent(this, destination)
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, "Navigation failed: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}