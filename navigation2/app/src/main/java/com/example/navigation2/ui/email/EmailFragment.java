package com.example.navigation2.ui.email;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.navigation2.R;

public class EmailFragment extends Fragment {

    private EmailViewModel emailViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        emailViewModel =
                ViewModelProviders.of(this).get(EmailViewModel.class);
        View root = inflater.inflate(R.layout.fragment_email, container, false);
        final TextView textView = root.findViewById(R.id.text_email);
       emailViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}