package com.example.learning;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText txtA;
    EditText txtB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textView);
        System.out.println(textView.getText());

        txtA = (EditText)findViewById(R.id.txtA);
        txtB = (EditText)findViewById(R.id.txtB);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        float n1 = 6;
        float n2 = 4;

        Operacoes operacoes = new Operacoes(n1, n2); //utiliza as variáveis para declara uma instância da classe Main
        //nome da instância com letra minúscula, nome da classe com letra maiúscula
        System.out.println(operacoes.soma());
        System.out.println(operacoes.subtracao());
        System.out.println(operacoes.multiplicacao());
        System.out.println(operacoes.divisao());
    }

    public void onSoma(View view){
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        Operacoes operacoes = new Operacoes(a, b);
        textView.setText(String.valueOf(operacoes.soma()));
    }

    public void onSub(View view){
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        Operacoes operacoes = new Operacoes(a, b);
        textView.setText(String.valueOf(operacoes.subtracao()));
    }

    public void onMulti(View view){
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        Operacoes operacoes = new Operacoes(a, b);
        textView.setText(String.valueOf(operacoes.multiplicacao()));
    }

    public void onDiv(View view){
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        Operacoes operacoes = new Operacoes(a, b);
        textView.setText(String.valueOf(operacoes.divisao()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
