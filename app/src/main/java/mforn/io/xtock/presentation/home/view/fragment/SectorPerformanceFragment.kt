package mforn.io.xtock.presentation.home.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mforn.io.xtock.R
import mforn.io.xtock.presentation.common.view.BaseFragment
import mforn.io.xtock.presentation.home.viewmodel.PerformanceViewModel


fun newInstanceOfPerformanceFragment() = SectorPerformanceFragment()


class SectorPerformanceFragment : BaseFragment() {

//    @Inject
//    lateinit var aux : String

//    @Inject
//    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: PerformanceViewModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sector_performance, container, false)
    }

}