package com.ikemura.simanchu_nu_takara_sagashi.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ikemura.simanchu_nu_takara_sagashi.feature.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }

}
