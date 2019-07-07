package mforn.io.sector.presentation.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import mforn.io.common.presentation.view.BaseFragment
import mforn.io.sector.R
import mforn.io.sector.presentation.view.adapter.SectorPerformanceAdapter
import mforn.io.sector.presentation.viewmodel.SectorPerformanceViewModel
import javax.inject.Inject


fun newInstanceOfPerformanceFragment() = SectorPerformanceFragment()


class SectorPerformanceFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: SectorPerformanceViewModel

    private val adapter: SectorPerformanceAdapter = SectorPerformanceAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProviders.of(this, viewModelFactory)[SectorPerformanceViewModel::class.java]

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sector_performance, container, false)
    }


}