package com.anish.esoftwarica.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anish.esoftwarica.Model.AddStudent;
import com.anish.esoftwarica.R;

import java.util.List;

public class AddStudents extends RecyclerView.Adapter<AddStudents.StudentViewHolder> {

    Context context;
    List<AddStudent> studentList;
    public AddStudents(Context context, List<AddStudent> studentList){
        this.context = context;
        this.studentList = studentList;
    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.student_cardview,parent,false);
       return new StudentViewHolder(view,context,studentList);

    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

        AddStudent addStudent= studentList.get(position);
        holder.imgStudent.setImageResource(addStudent.getImage());
        holder.name.setText(addStudent.getFname());
        holder.age.setText(addStudent.getAge() + "");
        holder.gender.setText(addStudent.getGender());
        holder.address.setText(addStudent.getAddress());


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imgStudent, imgDel;
        private TextView name, age, address, gender;
        Context context;
        List<AddStudent> list;

        public StudentViewHolder(@NonNull View itemView,Context context,List<AddStudent> studentList) {
            super(itemView);
            imgDel=itemView.findViewById(R.id.imgDel);
            imgStudent = itemView.findViewById(R.id.imgStudent);
            name=itemView.findViewById(R.id.tvName);
            age=itemView.findViewById(R.id.tvAge);
            gender = itemView.findViewById((R.id.tvGender));
            address=itemView.findViewById(R.id.tvAddress);

            this.context = context;
            this.list = studentList;

            imgDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    list.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                }
            });
        }
    }
}
