package ru.zinoview.navigationproject.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import ru.zinoview.navigationproject.R

class FragmentA : BaseFragment(R.layout.fragment_a_layout) {

    override fun back() = navigation.exit()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            navigation.navigateTo(FragmentB())
        }
    }


}