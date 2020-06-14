package com.example.navigation2.ui.filter;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navigation2.R;
import com.example.navigation2.ui.chats.ChatsViewModel;

public class FilterFragment extends Fragment {

    private FilterViewModel filterViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        filterViewModel =
                ViewModelProviders.of(this).get(FilterViewModel.class);
        View root = inflater.inflate(R.layout.filter_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_filter);
        filterViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
