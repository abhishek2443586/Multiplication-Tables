package com.abhipatil.multiplicationtables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void generateTables(View view){
        Button tables = (Button)findViewById( R.id.button );
        EditText number = (EditText)findViewById( R.id.editText );
        ListView myListView = (ListView)findViewById( R.id.List );
        int num = Integer.parseInt( number.getText().toString() );
        number.setText( "" );
        ArrayList<String>timesTableContent = new ArrayList<String>(  );
        for(int i =1;i<=10;i++){
            timesTableContent.add(Integer.toString(   i * num ));
        }
        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,timesTableContent  );
        myListView.setAdapter( arrayAdapter );

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

    }
}
