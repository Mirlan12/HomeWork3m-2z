package com.example.myapplication;

import android.location.Address;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourFragment extends Fragment {

    private TextView name_tv2;
    private TextView age3;
    private TextView address;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        name_tv2 = requireActivity().findViewById(R.id.tv_name2);
        age3 = requireActivity().findViewById(R.id.tw_age2);
        address = requireActivity().findViewById(R.id.Address1);

        String result = getArguments().getString("age1");
        String result1 = getArguments().getString("name1");
        String result2 = getArguments().getString("Address");

        name_tv2.setText(result1);
        age3.setText(result);
        address.setText(result2);
    }

}