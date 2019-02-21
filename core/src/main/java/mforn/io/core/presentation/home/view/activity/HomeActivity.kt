package mforn.io.core.presentation.home.view.activity

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import mforn.io.core.R
import mforn.io.core.presentation.common.view.BaseActivity
import mforn.io.core.presentation.common.view.replace
import mforn.io.core.presentation.notifications.view.fragment.newInstanceOfNotificationsFragment
import mforn.io.core.presentation.search.view.fragment.newInstanceOfSearchStockFragment
import mforn.io.core.presentation.sector.view.fragment.newInstanceOfPerformanceFragment

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setViews()
        setViewsListeners()
        setData()
    }

    private fun setViews() {
        setContentView(R.layout.activity_main)
    }

    private fun setViewsListeners() {
        bottom_navigation_view.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_search_stock -> {
                    supportActionBar?.title = getString(R.string.title_search_stock)
                    supportFragmentManager.replace(
                        R.id.fragment_container, newInstanceOfSearchStockFragment()
                    )
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_sector_performance -> {
                    supportActionBar?.title = getString(R.string.title_sector_performance)
                    supportFragmentManager.replace(
                        R.id.fragment_container,
                        newInstanceOfPerformanceFragment()
                    )
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_notifications -> {
                    supportActionBar?.title = getString(R.string.title_notifications)
                    supportFragmentManager.replace(
                        R.id.fragment_container,
                        newInstanceOfNotificationsFragment()
                    )
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })

    }

    private fun setData() {
        bottom_navigation_view.selectedItemId = R.id.navigation_search_stock
    }

}
