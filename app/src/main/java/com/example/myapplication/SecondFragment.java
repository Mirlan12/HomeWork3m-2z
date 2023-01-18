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

import org.w3c.dom.Text;


public class SecondFragment extends Fragment {

    private TextView textView;
    private Button btn_age;
    private EditText et_age;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = requireActivity().findViewById(R.id.tv_name);
        String result = getArguments().getString("Name");
        textView.setText("Hello " + result);
        et_age = requireActivity().findViewById(R.id.et_age);
        btn_age = requireActivity().findViewById(R.id.btn_age);
        clicklistener2();

    }

    private void clicklistener2() {
        btn_age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("age", et_age.getText().toString());
                bundle.putString("name", textView.getText().toString());

                ThirdFragment fragment = new ThirdFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, fragment).commit();
            }
        });
    }
}