package mforn.io.xtock.presentation.common.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


fun FragmentManager.replace(
    containerResId: Int,
    fragment: Fragment?,
    backStackName: String? = null,
    commitAllowingStateLoss: Boolean = false
) {
    fragment?.let {
        val fragmentTransaction = beginTransaction()
        fragmentTransaction.replace(containerResId, it)
        backStackName?.let {
            fragmentTransaction.addToBackStack(it)
        }
        if (commitAllowingStateLoss) {
            fragmentTransaction.commitAllowingStateLoss()
        } else {
            fragmentTransaction.commit()
        }
    }
}

fun FragmentManager.replace(containerResId: Int, fragment: Fragment) {
    replace(containerResId, fragment, null, false)
}

fun FragmentManager.remove(fragment: Fragment?) {
    fragment?.let {
        if (it.isAdded) {
            beginTransaction().remove(it).commit()
        }
    }
}


