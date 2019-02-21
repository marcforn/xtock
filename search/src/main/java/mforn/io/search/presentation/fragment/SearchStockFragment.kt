package mforn.io.search.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mforn.io.common.presentation.view.BaseFragment
import mforn.io.search.R


fun newInstanceOfSearchStockFragment() = SearchStockFragment()


class SearchStockFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_search_stock, container, false)
    }
}