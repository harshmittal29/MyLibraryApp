package myapp.example.com.libraryappexample;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import library.example.com.myapplication.DialogFactory;


public class MainActivity extends AppCompatActivity {

    private String TAG = "MAINACTIVITY";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextView)(findViewById(R.id.button)));
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                DialogFactory.showNeutralButtonDialog(MainActivity.this, "Dialog", "This session is awesome", "Ok").show();
                DialogFactory.showNeutralButtonDialog(MainActivity.this, "Dialog", "This session is awesome", "Ok").show();
            }
        });

        Log.d(TAG, "onCreate " + Thread.currentThread().getName());
//        for(int i=0;i<5;i++){
//            new MyAsyncTask().execute( i+"");
//        }
//        new MyAsyncTask().execute();

        Warehouse warehouse = new Warehouse();
        Random random = new Random();
        for(int i = 0;i<1000;++i){
            InventoryItem item = new InventoryItem();
            item.setId(random.nextInt(1000));
            item.setName("Item " + i);
            warehouse.addItem(item);
        }

        for(int i = 0;i<warehouse.getInventoryList().size();++i){
            InventoryItem item = warehouse.getInventoryList().get(i);
            if(item.getId() % 2 != 2){
                warehouse.removeItem(item);
            }
        }
    }

    public class MyAsyncTask extends AsyncTask<String, Void, String>
    {


        public MyAsyncTask(){
            Log.d(TAG, "MyAsyncTask() " + Thread.currentThread().getName());
        }

        @Override
        protected String doInBackground(String... s) {
            Log.d(TAG, "doInBackground " + Thread.currentThread().getName());
            return "Harsh";
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(TAG, "onPreExecute() " + Thread.currentThread().getName());
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            Log.d(TAG, "onPostExecute() " + Thread.currentThread().getName());
            tv.setText(s);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
