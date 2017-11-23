package com.example.arturmusayelyan.components;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by artur.musayelyan on 23/11/2017.
 */

public class ItemFragment extends Fragment {

    private static final String POSITION = "position";

    public static ItemFragment newInstance(int position, int colorResId) {
        Bundle bundle = new Bundle();
        bundle.putInt(POSITION,position);
        bundle.putInt("color",colorResId);
        ItemFragment fragment = new ItemFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_item,container,false);
        TextView item_tv=view.findViewById(R.id.fragment_tv);
        item_tv.setText("#"+(getArguments().getInt(POSITION)+1));

        view.setBackgroundColor(ContextCompat.getColor(getActivity(),getArguments().getInt("color")));
        return view;
    }


}
