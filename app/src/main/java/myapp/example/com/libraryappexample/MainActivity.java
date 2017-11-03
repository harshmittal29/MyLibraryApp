package myapp.example.com.libraryappexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import library.example.com.myapplication.DialogFactory;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextView)(findViewById(R.id.button)));
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFactory.showNeutralButtonDialog(MainActivity.this, "Dialog", "This session is awesome", "Ok").show();
            }
        });
    }

}
