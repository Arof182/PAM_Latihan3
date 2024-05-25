package com.example.latihan

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.examplefragment)

        showCustomDialog()
    }

    private fun showCustomDialog() {
        val dialog = Dialog(this)
        val binding = DialogExampleBinding.inflate()
        dialog.setContentView(binding.root)

        binding.dialogTitle.text = "Custom Dialog Title"
        binding.confirmButton.setOnClickListener {
            // Handle button click
            dialog.dismiss()
        }

        dialog.show()
    }
}
