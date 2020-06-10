package com.zakrodionov.testrapidshowdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Используем showNow вместо show
// но возникаю крэши c livedata, supportFragmentManager
// https://medium.com/@cs.ibrahimyilmaz/livedata-and-illegalstateexception-fragmentmanager-is-already-executing-transaction-235a6330cc12
// фикс в использовании childFragmentManager
class MainActivity : AppCompatActivity() {
    val TAG = "125"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0..1000){
            if (supportFragmentManager.findFragmentByTag(TAG) == null){
                CommonDialog().showNow(supportFragmentManager, TAG)
            }
        }

        //time
        //sdfsdf
    }
}