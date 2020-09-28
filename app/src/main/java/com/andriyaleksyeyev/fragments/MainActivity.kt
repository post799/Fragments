package com.andriyaleksyeyev.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.andriyaleksyeyev.fragments.myfragments.HelpFragment
import com.andriyaleksyeyev.fragments.myfragments.MobileFragment
import com.andriyaleksyeyev.fragments.myfragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mobileFragment = MobileFragment()
    private val settingsFragment = SettingsFragment()
    private val helpFragment = HelpFragment()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.mobile->replaceFragment(mobileFragment)
                R.id.help->replaceFragment(helpFragment)
                R.id.settings->replaceFragment(settingsFragment)
            }
            true
        }

        replaceFragment(mobileFragment)

    }
    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit()
    }
}