package com.example.amangeldi_abdibaitov_mo3_hw_8
//amangeldi_abdibaitov_mo3_hw_8
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.amangeldi_abdibaitov_mo3_hw_8.databinding.ItemWubbaLubbaDubDubBinding

class CartoonAdapter(
    private val rickAndMortyList: List<ModelRv>,
    val onItemClick: (position: Int) -> Unit
) : RecyclerView.Adapter<CartoonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemWubbaLubbaDubDubBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(rickAndMortyList[position])
    }

    override fun getItemCount() = rickAndMortyList.size

    inner class ViewHolder(private val binding: ItemWubbaLubbaDubDubBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(characters: ModelRv) = with(binding) {
            with(characters) {
                tvName.text = name
                tvDead.text = deadOrAlive
                Glide.with(imgVCharacter).load(picture).into(imgVCharacter)
            }
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }
}
