package mforn.io.xtock.presentation.home

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import mforn.io.xtock.R
import mforn.io.xtock.presentation.common.BaseActivity

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setViews()
    }

    private fun setViews() {
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_sector_performance -> {
                message.setText(R.string.sector_performance)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.text = ""
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
