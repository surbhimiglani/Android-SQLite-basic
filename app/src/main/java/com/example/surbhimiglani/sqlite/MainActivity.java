package com.example.surbhimiglani.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    MyDBM dbM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);
        textView=(TextView) findViewById(R.id.textView);
        dbM=new MyDBM(this,null,null,1);
        printDatabase();
    }

    public void addict(View view){
        Products productName=new Products(editText.getText().toString());
        dbM.addProduct(productName);
        printDatabase();
    }

    public void decline(View view){
        String input=editText.getText().toString();
        dbM.delProduct(input);
        printDatabase();
    }


    public void printDatabase(){
        String dbString=dbM.databaseToString();
        textView.setText(dbString);
        editText.setText("");
    }
}
