package np.com.jdulal.mywallpaper.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import np.com.jdulal.mywallpaper.Interface.ItemClickListener;
import np.com.jdulal.mywallpaper.R;

/**
 * Created by jdulal on 2/27/2018.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView category_name;
    public ImageView background_image;


    ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }


    public CategoryViewHolder(View itemView) {
        super(itemView);
        background_image   = itemView.findViewById(R.id.image);
        category_name=itemView.findViewById(R.id.name);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition());

    }
}
