package uga.cs.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, Service.class);







        Bundle data = new Bundle();
        data.putString("data", "DongYu");
        intent.putExtras(data);
        startService(intent);
    }
}
