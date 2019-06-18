package cn.edu.gdpt.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main2Activity extends AppCompatActivity {
    //笔记网络获取问题
    //犯的错误，直接在什么上面的网站上拿到api结果，他不给数据
    //易源接口
    private TextView tv_sumBoxOffice;
    private ListView lv;
    private List<Map<String,Object>> namesList=new ArrayList<>();
    String realTimeBoxOffice;
    private TextView sumBoxOffice;
    private TextView boxOffice;
    private TextView percent;
    private TextView name;
    private TextView rank;
    private TextView showDay;
    private String TAG = null;
    private List<String> boxOffices = new ArrayList<>();
    private List<String> boxPercents = new ArrayList<>();
    private List<String> names = new ArrayList<>();
    private List<String> ranks = new ArrayList<>();
    private List<String> showDays = new ArrayList<>();
    private List<String> sumBoxOffices = new ArrayList<>();
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                String json = (String) msg.obj;
                Log.d(TAG, "我得到的json:" + json);
                Gson gson = new Gson();
                bean2 bean2 = gson.fromJson(json, bean2.class);
                realTimeBoxOffice = bean2.getShowapi_res_body().getRealTimeRank().getRealTimeBoxOffice();
                for (int i = 0; i < 10; i++) {
                    String boxOffice = bean2.getShowapi_res_body().getRealTimeRank().getMovieRank().get(i).getBoxOffice();
                    String boxPercent = bean2.getShowapi_res_body().getRealTimeRank().getMovieRank().get(i).getBoxPercent();
                    String name = bean2.getShowapi_res_body().getRealTimeRank().getMovieRank().get(i).getName();
                    String rank = bean2.getShowapi_res_body().getRealTimeRank().getMovieRank().get(i).getRank();
                    String showDay = bean2.getShowapi_res_body().getRealTimeRank().getMovieRank().get(i).getShowDay();
                    String sumBoxOffice = bean2.getShowapi_res_body().getRealTimeRank().getMovieRank().get(i).getSumBoxOffice();
                    boxOffices.add(boxOffice);
                    boxPercents.add(boxPercent);
                    names.add(name);
                    ranks.add(rank);
                    showDays.add(showDay);
                    sumBoxOffices.add(sumBoxOffice);
                }
                tv_sumBoxOffice.setText(realTimeBoxOffice);
                for (int i=0;i<10;i++){
                    Map<String,Object> map=new HashMap<>();
                    map.put("name"+i,names.get(i));
                    namesList.add(map);
                }
                SimpleAdapter simpleAdapter=new SimpleAdapter(Main2Activity.this,namesList,R.layout.item_lv_name,
                        new String[]{}
                        ,new int[]{});
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        getjson();


    }

    private void getjson() {
        new Thread() {
            @Override
            public void run() {
                super.run();
                OkHttpClient okHttpClient = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://route.showapi.com/1821-1?showapi_appid=97930&showapi_timestamp=20190617092632&showapi_sign=9756795fe56241b2bedfb89cb8bcc1b9")
                        .build();
                Call call = okHttpClient.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Toast.makeText(Main2Activity.this, "请求失败", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        String string = response.body().string();
                        Message message = handler.obtainMessage();
                        message.what = 1;
                        message.obj = string;
                        handler.sendMessage(message);
                    }
                });
            }
        }.start();
    }

    private void initView() {

        tv_sumBoxOffice = (TextView) findViewById(R.id.tv_sumBoxOffice);
        lv = (ListView) findViewById(R.id.lv);
    }
}
