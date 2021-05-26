package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    private List<RecyclerViewClass> userList;

    public Adapter (List<RecyclerViewClass>userList){ this.userList = userList;}

    @NonNull
    @Override
    public Adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_design_format,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Viewholder holder, int position) {
        int resource=userList.get(position).getRvImageView1();
        String name=userList.get(position).getRvTextView1();
        String skill=userList.get(position).getRvTextView3();
        String number=userList.get(position).getRvTextView2();
        String line=userList.get(position).getDivider();

        holder.setData(resource,name,skill,number,line);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class Viewholder extends ViewHolder{

        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
        private TextView divider;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.rvImageView1);
            textView=itemView.findViewById(R.id.rvTextView);
            textView2=itemView.findViewById(R.id.rvTextView2);
            textView3=itemView.findViewById(R.id.rvTextView3);
            divider=itemView.findViewById(R.id.divider);
        }

        public void setData(int resource, String name, String skill, String number, String line) {
            imageView.setImageResource(resource);
            textView.setText(name);
            textView3.setText(skill);
            textView2.setText(number);
            divider.setText(line);
        }
    }
}
