package com.example.tolmachenko.weatherappd;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Olga Tolmachenko on 21.09.17.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    public ForecastAdapter() {

    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ForecastViewHolder extends RecyclerView.ViewHolder {

        TextView dateTimeView;
        TextView cityView;
        TextView degreesView;

        public ForecastViewHolder(View parentView) {
            super(parentView);
            dateTimeView = (TextView) parentView.findViewById(R.id.dateTime);
            cityView = (TextView) parentView.findViewById(R.id.city);
            degreesView = (TextView) parentView.findViewById(R.id.degrees);
        }
    }
}
