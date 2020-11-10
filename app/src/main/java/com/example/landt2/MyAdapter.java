package com.example.landt2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * MyAdapter job is to put data into each row of the list view
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.WordViewHolder> {
   String[] languages;
    LayoutInflater layoutInflator;
    public MyAdapter(Context context, String[] langData) {
        languages=langData;
        layoutInflator=LayoutInflater.from(context);
    }

    /**
     * oncreateViewHolder job is to buy wooden planks
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View rowView=layoutInflator.inflate(R.layout.row_listview,parent,false);
        return new WordViewHolder(rowView);
    }
    /**
     * onBindViewHolder job is to write data on the planks
     * @param holder
     * @param position
     */

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.WordViewHolder holder, int position) {
       holder.titleTextView.setText(languages[position]);
    }

    /**
     * job is to keep count of number of items in dataset
     * @return
     */
    @Override
    public int getItemCount() {
        return languages.length;
    }

    /**
     * WordViewHolder job is to hold the recycled stok and new stock of wooden planks
     */

    public class WordViewHolder extends RecyclerView.ViewHolder {
        public  TextView titleTextView;;
        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView=itemView.findViewById(R.id.textviewrow);
        }
    }
}
