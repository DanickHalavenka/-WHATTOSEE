package com.RaProject.whattosee.ui.done;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.RaProject.whattosee.R;



public class DoneFragment extends Fragment {

    private DoneViewModel doneViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        doneViewModel =
                ViewModelProviders.of(this).get(DoneViewModel.class);
        View root = inflater.inflate(R.layout.fragment_done, container, false);
        final TextView textView = root.findViewById(R.id.text_done);
        doneViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}