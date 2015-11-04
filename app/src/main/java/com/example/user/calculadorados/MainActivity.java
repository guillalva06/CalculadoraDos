package com.example.user.calculadorados;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sumar(View view){
        EditText editOne = (EditText)findViewById(R.id.numero_uno);
        int numOne = Integer.parseInt(editOne.getText().toString());
        EditText editTwo = (EditText)findViewById(R.id.numero_dos);
        int numTwo = Integer.parseInt(editTwo.getText().toString());
        Intent i = new Intent(getApplicationContext(),SumActivity.class);
        i.putExtra("NUMERO_UNO",numOne);
        i.putExtra("NUMERO_DOS",numTwo);
        startActivity(i);
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
