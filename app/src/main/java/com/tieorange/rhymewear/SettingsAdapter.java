package com.tieorange.rhymewear;

import android.content.Context;
import android.support.wearable.view.WearableListView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SettingsAdapter extends WearableListView.Adapter {

    private final Context context;
    private final List<Rhyme> items;

    public SettingsAdapter(Context context, List<Rhyme> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public WearableListView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new WearableListView.ViewHolder(new SettingsItemView(context));
    }

    @Override
    public void onBindViewHolder(WearableListView.ViewHolder viewHolder, final int position) {
        SettingsItemView SettingsItemView = (SettingsItemView) viewHolder.itemView;
        final Rhyme item = items.get(position);

        TextView textView = (TextView) SettingsItemView.findViewById(R.id.text);
        textView.setText(item.title);

        final ImageView imageView = (ImageView) SettingsItemView.findViewById(R.id.image);
        imageView.setImageResource(item.iconRes);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}