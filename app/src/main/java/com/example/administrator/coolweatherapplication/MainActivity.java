package com.example.administrator.coolweatherapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.coolweatherapplication.db.Provice;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private String[] province = {"北京市", "上海市", "天津市", "重庆市", "河北省", "江苏省", "山东省", "浙江省", "广东省", "陕西省", "山西省"};
    private String[] city1 = {"东城区", "西城区", "海淀区", "朝阳区", "丰台区"};
    private String[] city5 = {"济南", "青岛", "淄博", "枣庄", "东营"};
    private String[] city2 = {"杭州", "宁波", "温州", "嘉兴", "湖州", "台州"};
    private String[] city3 = {"广州", "深圳", "惠州", "珠海", "汕头", "潮州"};
    private String[] city4 = {"西安", "宝鸡", "咸阳", "渭南", "延安"};
    private ArrayAdapter<String> adapter = null;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1, province);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String p=getIntent().getStringExtra("p");
                String data[]=null;
                if ("北京市".equals(p)){
                    data=city1;

                }
                else if("浙江省".equals(p)){
                    data=city2;

                }else if("山东省".equals(p)){
                    data=city5;

                }else if("广东省".equals(p)){
                    data=city3;

                }else if("陕西省".equals(p)){
                    data=city4;

                }
                ArrayAdapter adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,MainActivity.this.city1);
                listView.setAdapter(adapter);
            }
        });
    }}