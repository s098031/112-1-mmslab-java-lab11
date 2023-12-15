package com.example.a112_1_mmslab_java_lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText ed_book,ed_price;
    private Button btn_insert,btn_upgrade,btn_delete,btn_query;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private  ArrayList<String> items=new ArrayList<>();
    private SQLiteDatabase dbrw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_book=findViewById(R.id.ed_book);
        ed_price=findViewById(R.id.ed_price);
        btn_insert=findViewById(R.id.btn_insert);
        btn_upgrade=findViewById(R.id.btn_update);
        btn_delete=findViewById(R.id.btn_delete);
        btn_query=findViewById(R.id.btn_query);
        listView=findViewById(R.id.listView);
        adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_itme_1,items);
        listView.setAdapter(adapter);
        dbrw=new MyDBHelper(this).getWritableDatabase();
    }
    
}