package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdFragment extends Fragment {

    private TextView name_age;
    private TextView tv_name1;
    private Button addressBut;
    private EditText address;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        name_age = requireActivity().findViewById(R.id.tv_age1);
        tv_name1 = requireActivity().findViewById(R.id.tv_name1);
        addressBut = requireActivity().findViewById(R.id.buttonAdr);
        address = requireActivity().findViewById(R.id.Address);

        String result = getArguments().getString("age");
        String result1 = getArguments().getString("name")
                ;


        name_age.setText(result + "лет");
        tv_name1.setText(result1);
        clicklistener3();

    }

    private void clicklistener3() {
        addressBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("Address", address.getText().toString());
                bundle.putString("name1", tv_name1.getText().toString());
                bundle.putString("age1", name_age.getText().toString());
                FourFragment fragment = new FourFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, fragment).commit();
           }
        });
    }
}