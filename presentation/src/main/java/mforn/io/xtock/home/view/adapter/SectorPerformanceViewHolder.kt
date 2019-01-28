package mforn.io.xtock.home.view.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mforn.io.xtock.R
import mforn.io.xtock.home.model.SectorPerformanceViewData

class SectorPerformanceViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    private val name: TextView = view.findViewById(R.id.tv_name)
    private val performance: TextView = view.findViewById(R.id.tv_performance)
    private val date: TextView = view.findViewById(R.id.tv_date)


    fun setData(itemViewData: SectorPerformanceViewData) {
        name.text = itemViewData.name
        performance.text = itemViewData.performance
        date.text = itemViewData.date
    }

    fun setOnClickListener(listener: View.OnClickListener) {
        view.setOnClickListener(listener)
    }
}