package com.example.tiago.eemplo1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class StartActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);

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

    @Override
    protected void onResume(){
        super.onResume();
        java.lang.CharSequence mensagem = "";

        TextView nome = (TextView)findViewById(R.id.edxNome);
        mensagem = nome.getText();

        TextView nomeTxt = (TextView)findViewById(R.id.txvMensagem);

        mensagem = "aplicação resumida";
        nomeTxt.setText(mensagem);
    }

    public void btnClickName(View teste){

        java.lang.CharSequence mensagem = "";

        TextView nome = (TextView)findViewById(R.id.edxNome);
        mensagem = nome.getText();

        TextView nomeTxt = (TextView)findViewById(R.id.txvMensagem);

        nomeTxt.setText(mensagem);
    }
}
