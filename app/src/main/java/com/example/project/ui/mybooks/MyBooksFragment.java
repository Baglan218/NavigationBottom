package com.example.project.ui.mybooks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.project.R;

public class MyBooksFragment extends Fragment {

    View view;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_my_books, container, false);

        return view;
    }
}