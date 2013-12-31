package out.in;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageactivities1 extends BaseAdapter {
    private Context mContext;

    public imageactivities1(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.c01, R.drawable.c02,
            R.drawable.c3, R.drawable.c4,
            R.drawable.c5, R.drawable.c6,
            R.drawable.c7, R.drawable.c55,
            R.drawable.c9, R.drawable.c01,
            R.drawable.c01, R.drawable.c02,
            R.drawable.c3, R.drawable.c4,
            R.drawable.c5, R.drawable.c6,
            R.drawable.c7, R.drawable.act1, R.drawable.act2,
            R.drawable.act1, R.drawable.act3,
            R.drawable.act1, R.drawable.act3,
            R.drawable.act8, R.drawable.act7,
            R.drawable.oc14, R.drawable.oc1,
            R.drawable.oc16, R.drawable.oc14,
            R.drawable.oc13
    };
}