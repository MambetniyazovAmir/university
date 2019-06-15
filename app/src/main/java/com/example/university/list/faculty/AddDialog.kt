package com.example.university.list.faculty

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.university.OnAddButtonClickListener
import com.example.university.R
import kotlinx.android.synthetic.main.dialog_layout.*

class AddDialog(context: Activity, private val callback: OnAddButtonClickListener) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_layout)
        addBtn.setOnClickListener {
            if (name.text.isNotEmpty()) {
                callback.onAddButtonClick(name.text.toString())
                dismiss()
            }
        }
    }
}