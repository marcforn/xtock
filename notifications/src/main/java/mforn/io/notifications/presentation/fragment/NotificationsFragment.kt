package mforn.io.notifications.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mforn.io.common.presentation.view.BaseFragment
import mforn.io.notifications.R


fun newInstanceOfNotificationsFragment() = NotificationsFragment()


class NotificationsFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }
}