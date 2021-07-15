package com.mmp.plansgrid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String valuetype[] = {"Gold ", "Silver", "Platinum"};
    String time[]={"12 \nmonths","6 \n months","1 \n week"};
    String amountpayable[]={"Rs 3650","Rs 2500","Rs 4200"};

    String provalue[] = {"Pro Gold","Pro Platinum"};
    String protime[]={"6 months","12 months"};
    String proamount[]={"Rs 15000","Rs 200000"};

//    String
    RecyclerView recyclerViewbasic,recyclerViewpro;
    AdapterPlansBasic mAdapter,mAdapter1;
//    AdapterPlansPro mAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerViewbasic = findViewById(R.id.rvBasicPlan);
        recyclerViewpro=findViewById(R.id.rvProPlan);

        recyclerViewpro.setHasFixedSize(true);
        recyclerViewbasic.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManagerbasic = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView.LayoutManager layoutManagerpro = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

//        if (layoutManager instanceof LinearLayoutManager) {
//            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(2, 0);
//        } else {
//            recyclerViewbasic.smoothScrollToPosition(0);
//        }


        recyclerViewbasic.setLayoutManager(layoutManagerbasic);
        recyclerViewpro.setLayoutManager(layoutManagerpro);

        ArrayList<String> valueType = new ArrayList<>();
        valueType.add(valuetype[0]);
        valueType.add(valuetype[1]);
        valueType.add(valuetype[2]);


        ArrayList<String> timeperiod = new ArrayList<>();

        timeperiod.add(time[0]);
        timeperiod.add(time[1]);
        timeperiod.add(time[2]);

        ArrayList<String> price = new ArrayList<>();
        price.add(amountpayable[0]);
        price.add(amountpayable[1]);
        price.add(amountpayable[2]);



        ArrayList<String> pricepro = new ArrayList<>();
        pricepro.add(proamount[0]);
        pricepro.add(proamount[1]);

        ArrayList<String> valuetypepro = new ArrayList<>();
        valuetypepro.add(provalue[0]);
        valuetypepro.add(provalue[1]);

        ArrayList<String> proTime = new ArrayList<>();
        proTime.add(protime[0]);
        proTime.add(protime[1]);








        mAdapter = new AdapterPlansBasic(valueType,timeperiod,price, this);
        mAdapter1 = new AdapterPlansBasic(valuetypepro,proTime,pricepro, this);

        recyclerViewbasic.setAdapter(mAdapter);
        recyclerViewpro.setAdapter(mAdapter1);
    }
}