package mforn.io.xtock.sector.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mforn.io.xtock.R
import mforn.io.xtock.sector.model.SectorPerformanceViewData

class SectorPerformanceAdapter : RecyclerView.Adapter<SectorPerformanceViewHolder>() {

    private val dataset = mutableListOf<SectorPerformanceViewData>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectorPerformanceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sector_performance_item, parent, false)
        return SectorPerformanceViewHolder(view)
    }

    override fun onBindViewHolder(holder: SectorPerformanceViewHolder, position: Int) {
        val item = dataset[position]
        holder.setData(item)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    fun updateDataSet(newDataSet: List<SectorPerformanceViewData>) {
        this.dataset.clear()
        this.dataset.addAll(newDataSet)
        notifyDataSetChanged()
    }

}
