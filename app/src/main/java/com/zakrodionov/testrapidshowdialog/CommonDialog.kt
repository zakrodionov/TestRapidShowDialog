package com.zakrodionov.testrapidshowdialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class CommonDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage("Пример текста")
        builder.setPositiveButton("Закрыть", null)
        val dialog = builder.create()
        return dialog
    }

}