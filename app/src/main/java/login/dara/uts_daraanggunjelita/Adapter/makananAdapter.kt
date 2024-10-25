package login.dara.uts_daraanggunjelita.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import login.dara.uts_daraanggunjelita.DetailMakananActivity
import login.dara.uts_daraanggunjelita.R
import login.dara.uts_daraanggunjelita.makanan
import login.dara.uts_daraanggunjelita.model.modelMakanan

class makananAdapter(
    val itemList:ArrayList<modelMakanan>,
    val getActivity: makanan

):
RecyclerView.Adapter<makananAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //deklarasi widget dari layoutitem
        var itemImage: ImageView
        var itemNama: TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar)
            itemNama = itemView.findViewById(R.id.nama) as TextView

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //manggil layout

        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_makanan, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemNama.setText(itemList[position].nama)
        //kita intent
        holder.itemView.setOnClickListener(){
            //inten
            //context atau this --> getActivity
            val intent = Intent(getActivity, DetailMakananActivity::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("image",itemList[position].image)
            intent.putExtra("nama",itemList[position].nama)
            //passed ke detail
            getActivity.startActivity(intent)
      }
        }
}


