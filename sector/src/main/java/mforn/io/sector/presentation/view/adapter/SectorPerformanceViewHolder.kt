package mforn.io.sector.presentation.view.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mforn.io.sector.R
import mforn.io.sector.presentation.model.SectorPerformanceViewData

class SectorPerformanceViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    private val name: TextView = view.findViewById(R.id.tv_name)
    private val performance: TextView = view.findViewById(R.id.tv_performance)
    private val date: TextView = view.findViewById(R.id.tv_date)


    fun setData(itemViewData: SectorPerformanceViewData) {
        name.text = itemViewData.name
        performance.text = itemViewData.performance.toString()
        date.text = itemViewData.date
    }

    fun setOnClickListener(listener: View.OnClickListener) {
        view.setOnClickListener(listener)
    }
}