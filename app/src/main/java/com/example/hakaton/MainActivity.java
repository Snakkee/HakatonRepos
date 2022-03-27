package com.example.hakaton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hakaton.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ToolBar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case(android.R.id.home):{
                finish();
            }
            case(R.id.login):{
                Intent intent= new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
            case(R.id.hist):{

            }
            case(R.id.fam):{

            }
            case(R.id.add):{

            }
            case(R.id.adv):{

            }
            case(R.id.stat):{

            }
        }

        return true;
    }
}