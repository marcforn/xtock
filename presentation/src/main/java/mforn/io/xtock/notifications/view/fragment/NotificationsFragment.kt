package mforn.io.xtock.notifications.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mforn.io.xtock.R
import mforn.io.xtock.common.view.BaseFragment


fun newInstanceOfNotificationsFragment() = NotificationsFragment()


class NotificationsFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }
}