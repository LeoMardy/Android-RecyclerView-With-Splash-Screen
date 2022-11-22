package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView=findViewById(R.id.recyclerView);

        List<item> items=new ArrayList<item>();

        items.add(new item("SiVum","Microsoft","Web Application developer",R.drawable.k));
        items.add(new item("Leo Mardy","LEO TECH LTD BD","Application software developer",R.drawable.a));
        items.add(new item("Asif Khan","LEO TECH LTD BD","Google software Engineer",R.drawable.b));
        items.add(new item("Srizon","LEO TECH LTD BD","Facebook page developer",R.drawable.c));
        items.add(new item("Riyad","MEGA PROGECT","Mechanical Engineer",R.drawable.d));
        items.add(new item("Roton ","MEGA PROJECT","Mechanical Engineer",R.drawable.e));
        items.add(new item("Pius","LEO TECH LTD BD","Apple software Engineer",R.drawable.f));
        items.add(new item("Debasis","IT SOFT","Application software developer",R.drawable.h));
        items.add(new item("Mahmud","IT WORKSHOP"," Project Manager",R.drawable.g));
        items.add(new item("Majharul Islam","IT soft","C++_",R.drawable.i));
        items.add(new item("Linkon Hossain","B Tech Soft","Python developer",R.drawable.j));
        items.add(new item("Shanto","IT soft","Game developer",R.drawable.l));
        items.add(new item("Rohit Islam","Jio SIM","Mongo DB",R.drawable.m));
        items.add(new item("Pronoy","Google","Software Engineer",R.drawable.n));
        items.add(new item("Faruk","Voda SIM","Web Application",R.drawable.o));
        items.add(new item("Chandon","Gulzar Group","teacher",R.drawable.p));
        items.add(new item("Ripon","TATA Company","Mechanical Engineer",R.drawable.q));
        items.add(new item("Binamra","Microsoft","Project Manager",R.drawable.r));
        items.add(new item("Nadim","Chain Company","java developer",R.drawable.s));
        items.add(new item("Ridoy","No Job","No Education",R.drawable.t));
        items.add(new item("Islam","IT soft","C++_",R.drawable.u));
        items.add(new item("Mardy","Leo Tech","C++_",R.drawable.v));
        items.add(new item("Luna","Traner","Python",R.drawable.w));
        items.add(new item("Pirina","Motijhil","Production",R.drawable.x));
        items.add(new item("Binoy","Politechnic","EEE",R.drawable.y));
        items.add(new item("Joti","Biti Company","Quality Checker",R.drawable.z));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new myAdapter(getApplicationContext(),items));


    }
}