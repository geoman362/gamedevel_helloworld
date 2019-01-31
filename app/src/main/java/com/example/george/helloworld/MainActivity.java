package com.example.george.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    private String greeting;
    Random pickALangauge = new Random();
    private String chineseGreeting = "您好";
    private String spanishGreeting = "Hola!";
    private String arabicGreeting = " السلام عليكم";
    private String hindiGreeting = "नमस्ते";
    private String portugeseGreeting = "Olá";
    private String russianGreeting = "Здравствуйте!";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        tv=new TextView(this);
        tv=(TextView)findViewById(R.id.textView);

        greeting = "Hello World";
        tv.setText(greeting);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "More languages!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                int lang = pickALangauge.nextInt((5) + 1);
                if(lang == 0){
                    tv.setText(chineseGreeting);
                }
                else if(lang == 1){
                    tv.setText(spanishGreeting);
                }
                else if(lang == 2){
                    tv.setText(spanishGreeting);
                }
                else if(lang == 3){
                    tv.setText(arabicGreeting);
                }
                else if(lang == 4){
                    tv.setText(hindiGreeting);
                }
                else if(lang == 5){
                    tv.setText(portugeseGreeting);
                }
                else{
                    tv.setText(russianGreeting);
                }
                
            }
        });
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
