package com.example.asproclaud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.chromium.base.task.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class home extends AppCompatActivity {

    private static final String NAME = "Александр";
    private static final String POST = "Стажер";
    private static final String ICON = "Иконка";
    public static final String URL_SERVER_JSON = "https://bx17827.rdock.ru/index.php";
    TextView jsonText = findViewById(R.id.json);


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ListView listView = (ListView) findViewById(R.id.lv);


//        URL json = null;
//        try {
//            json = new URL(URL_SERVER_JSON);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//
//        String response = null;
//        try {
//            response = getUrlJSon(json);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        jsonText.setText(response);


        ArrayList<HashMap<String, Object>> commandList = new ArrayList<>();

        HashMap<String, Object> hashMap;

        hashMap = new HashMap<>();
        hashMap.put(NAME, "Лилия");
        hashMap.put(POST, "Директор");
        hashMap.put(ICON, R.drawable.ic_launcher_foreground);
        commandList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(NAME, "Григорий");
        hashMap.put(POST, "Стажер");
        hashMap.put(ICON, R.drawable.ic_launcher_foreground);
        commandList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(NAME, "Аннастасия");
        hashMap.put(POST, "Менеджер");
        hashMap.put(ICON, R.drawable.ic_launcher_foreground);
        commandList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(NAME, "Полина");
        hashMap.put(POST, "Секретарь");
        hashMap.put(ICON, R.drawable.ic_launcher_foreground);
        commandList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(NAME, "Ксения");
        hashMap.put(POST, "Бухгалтер");
        hashMap.put(ICON, R.drawable.ic_launcher_foreground);
        commandList.add(hashMap);

        SimpleAdapter adapter = new SimpleAdapter(this, commandList, R.layout.list_view, new String[]{NAME,POST,ICON}, new int[]{R.id.textview_name, R.id.textview_post, R.id.imageview_icon});

        listView.setAdapter(adapter);


    }

}