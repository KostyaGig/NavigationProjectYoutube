package ru.zinoview.navigationproject.navigation

import ru.zinoview.navigationproject.fragment.BaseFragment

interface Navigation {

    fun navigateTo(fragment: BaseFragment)
}