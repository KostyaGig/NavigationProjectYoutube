package ru.zinoview.navigationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.zinoview.navigationproject.fragment.BaseFragment
import ru.zinoview.navigationproject.fragment.FragmentA
import ru.zinoview.navigationproject.navigation.ActivityNavigation

class MainActivity : AppCompatActivity(), ActivityNavigation {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigateTo(FragmentA())
    }


    override fun onBackPressed() {
        val fragment = supportFragmentManager.fragments.first() as BaseFragment
        fragment.back()
    }

    override fun navigateTo(fragment: BaseFragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragment)
            .commit()
    }

    override fun exit() = finish()

    override fun onDestroy() {
        super.onDestroy()
        Log.d("zinoviewk","ondestroy")
    }
}