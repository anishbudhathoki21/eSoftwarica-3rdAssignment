package com.anish.esoftwarica.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anish.esoftwarica.Activity.DashboardActivity;
import com.anish.esoftwarica.Adapter.AddStudents;
import com.anish.esoftwarica.Model.AddStudent;
import com.anish.esoftwarica.R;

import java.util.ArrayList;
import java.util.List;

public class fragmentHome extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
        recyclerView = view.findViewById(R.id.recylerView);


        AddStudents addStudents1 = new AddStudents(getContext(), DashboardActivity.addStudents);
        recyclerView.setAdapter(addStudents1);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

}

