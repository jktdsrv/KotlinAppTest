package com.vince.kotlinapplication.Helper

import android.widget.EditText

object Validation {

    fun EditText.passwordValidation():Boolean {
        return this.text.toString().isNotEmpty() && this.text.toString().length.compareTo(6) == 1
    }
}