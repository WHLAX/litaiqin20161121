package com.bwie.litaiqin20161121;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Request;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private String Url = "http://japi.juhe.cn/joke/content/list.from?key=%20874ed931559ba07aade103eee279bb37%20&page=2&pagesize=10&sort=asc&time=1418745237";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_view);

        //设置布局管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        getHttpData();

        //设置Item增加、移除动画
        //mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        //添加分割线
        // mRecyclerView.addItemDecoration(new DividerItemDecoration(
        //getActivity(), DividerItemDecoration.HORIZONTAL_LIST));

    }

    public void getHttpData() {
        OkHttp.getAsync(Url, new OkHttp.DataCallBack() {


            @Override
            public void requestFailure(Request request, IOException e) {

            }

            @Override
            public void requestSuccess(String result) throws Exception {
                String json = result;
                jiexi(json);

            }


        });
    }

    private void jiexi(String json) {
        Gson gson = new Gson();
        DataBean_1 dataBean_1 = gson.fromJson(json, DataBean_1.class);
        DataBean_1.ResultBean result = dataBean_1.getResult();
        final List<DataBean_1.ResultBean.DataBean> data = result.getData();
        //设置adapter
        mRecyclerView.setAdapter(new HomeAdapter(data));
        mRecyclerView.addOnItemTouchListener(new RecyclerViewClickListener(this, mRecyclerView,
                new RecyclerViewClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(SecondActivity.this, "点击" + data.get(position).getContent(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemLongClick(View view, int position) {
                        Toast.makeText(SecondActivity.this, "长按 ", Toast.LENGTH_SHORT).show();
                    }
                }));
    }

    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
        List<DataBean_1.ResultBean.DataBean> datalist;

        public HomeAdapter(List<DataBean_1.ResultBean.DataBean> datalist) {
            this.datalist = datalist;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                    SecondActivity.this).inflate(R.layout.item, parent,
                    false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.tv_context.setText(datalist.get(position).getContent());
            holder.tv_time.setText(datalist.get(position).getUpdatetime());
        }

        @Override
        public int getItemCount() {
            return datalist.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            TextView tv_context, tv_time;

            public MyViewHolder(View view) {
                super(view);
                tv_context = (TextView) view.findViewById(R.id.tv_context);
                tv_time = (TextView) view.findViewById(R.id.tv_time);
            }
        }
    }

}
