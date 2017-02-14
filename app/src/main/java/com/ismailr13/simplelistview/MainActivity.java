package com.ismailr13.simplelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] pancasila = new String[]{
            "KETUHANAN YANG MAHA ESA",
            "KEMANUSIAAN YANG ADIL DAN BERADAB",
            "PERSATUAN INDONESIA",
            "KERAKYATAN YANG DIPIMPIN OLEH HIKMAT KEBIJAKSANAAN DALAM PERMUSYAWARATAN / PERWAKILAN",
            "KEADILAN SOSIAL BAGI SELURUH RAKYAT INDONESIA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItem = (ListView)findViewById(R.id.lv_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, pancasila);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int a = i + 1;
                Toast.makeText(MainActivity.this, a + " " + pancasila[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}
