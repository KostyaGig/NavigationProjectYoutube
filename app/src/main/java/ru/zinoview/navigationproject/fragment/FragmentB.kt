package ru.zinoview.navigationproject.fragment

import ru.zinoview.navigationproject.R

class FragmentB : BaseFragment(R.layout.fragment_b_layout) {

    override fun back()
        = navigation.navigateTo(FragmentA())
}