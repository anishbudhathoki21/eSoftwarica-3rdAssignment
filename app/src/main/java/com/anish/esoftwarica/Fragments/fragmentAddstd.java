package com.anish.esoftwarica.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.anish.esoftwarica.Activity.DashboardActivity;
import com.anish.esoftwarica.Model.AddStudent;
import com.anish.esoftwarica.R;

import java.util.List;

public class fragmentAddstd extends Fragment {

    EditText name, age, address;
    Button btnSave;
    RadioButton rdoButton;
    RadioGroup rdoGroup;
    List<AddStudent> listStudents;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view =  inflater.inflate(R.layout.add_student, container, false);

        name = view.findViewById(R.id.etFullname);
        address = view.findViewById(R.id.etAddress);
        age = view.findViewById(R.id.etAge);
        rdoGroup = view.findViewById(R.id.radioSex);
        btnSave = view.findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emptyValidation()) {
                    int selectedRadio = rdoGroup.getCheckedRadioButtonId();
                    rdoButton = view.findViewById(selectedRadio);

                    listStudents = DashboardActivity.addStudents;

                    AddStudent model;

                    if (rdoButton.getText().toString().equals("Male")) {
                        model = new AddStudent(name.getText().toString(), address.getText().toString(), rdoButton.getText().toString(), Integer.parseInt(age.getText().toString()), R.drawable.male1);
                        listStudents.add(model);
                    } else if (rdoButton.getText().toString().equals("Female")) {
                        model = new AddStudent(name.getText().toString(), address.getText().toString(), rdoButton.getText().toString(), Integer.parseInt(age.getText().toString()), R.drawable.femlae);
                        listStudents.add(model);
                    } else if (rdoButton.getText().toString().equals("Others")) {
                        model = new AddStudent(name.getText().toString(), address.getText().toString(), rdoButton.getText().toString(), Integer.parseInt(age.getText().toString()), R.drawable.noimage);
                        listStudents.add(model);
                    }
                    Toast.makeText(getContext(), "Done", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }


    public boolean emptyValidation(){
        if(name.getText().toString().isEmpty()){
            name.setError("enter your name please");
            return false;
        }if(age.getText().toString().isEmpty()){
            age.setError("enter your age please");
            return false;
        }
        if(address.getText().toString().isEmpty()){
            address.setError("enter your address please");
            return false;
        }

        return true;
    }
}
