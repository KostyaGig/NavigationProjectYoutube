package ru.zinoview.navigationproject.fragment

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import ru.zinoview.navigationproject.navigation.ActivityNavigation
import ru.zinoview.navigationproject.navigation.Back

abstract class BaseFragment(@LayoutRes idRes: Int) : Fragment(idRes), Back {

    protected val navigation by lazy {
        requireActivity() as ActivityNavigation
    }

}