package com.bob.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_feature_1;
    private Button btn_feature_2;
    private Button btn_feature_4;

    private Button btn_feature_11;
    private Button btn_feature_12;

    private Button btn_feature_21;
    private Button btn_feature_22;
    private Button btn_feature_13;
    private Button btn_feature_14;
    private Button btn_feature_15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_feature_1 = (Button) findViewById(R.id.btn_feature_1);
        btn_feature_2 = (Button) findViewById(R.id.btn_feature_2);
        btn_feature_4 = (Button) findViewById(R.id.btn_feature_4);

        btn_feature_11 = (Button) findViewById(R.id.btn_feature_11);
        btn_feature_12 = (Button) findViewById(R.id.btn_feature_12);
        btn_feature_13 = (Button) findViewById(R.id.btn_feature_13);
        btn_feature_14 = (Button) findViewById(R.id.btn_feature_14);
        btn_feature_15 = (Button) findViewById(R.id.btn_feature_15);
        btn_feature_22 = (Button) findViewById(R.id.btn_feature_22);
    }

    /**
     * feature-1
     * display HelloWorld
     * @param view
     */
    public void feature1(View view) {
        if (btn_feature_1.getText().toString().equals("功能1")) {
            btn_feature_1.setText(R.string.feature_1_dis);
        } else {
            btn_feature_1.setText(R.string.feature_1);
        }
    }

    /**
     * feature-2
     * display HelloAndroid
     * @param view
     */
    public void feature2(View view) {
        if (btn_feature_2.getText().toString().equals("功能2")) {
            btn_feature_2.setText(R.string.feature_2_dis);
        } else {
            btn_feature_2.setText(R.string.feature_2);
        }
    }


    /**
     * feature-4
     * display Hello
     * @param view
     */
    public void feature4(View view) {
        btn_feature_4.setText(R.string.feature_4_dis);
    }

    /**
     * feature-11分支 新建
     * @param view
     */
    public void feature11(View view) {
        if(btn_feature_11.getText().toString().equals("功能11")){
            btn_feature_11.setText("Hello World");
        }
        else{
            btn_feature_11.setText("功能11");
        }
    }

    public void feature12(View view) {
        if(btn_feature_12.getText().toString().equals("功能12")){
            btn_feature_12.setText("Hello World");
        }
        else{
            btn_feature_12.setText("功能12");
        }
    }


    public void feature13(View view) {
        if(btn_feature_13.getText().toString().equals("功能13")){
            btn_feature_13.setText("Hello World");
        }
        else{
            btn_feature_13.setText("功能13");
        }
    }

    public void feature14(View view) {
        if(btn_feature_14.getText().toString().equals("功能14")){
            btn_feature_14.setText("Hello World");
        }
        else{
            btn_feature_14.setText("功能14");
        }
    }


    public void feature15(View view) {
        if(btn_feature_15.getText().toString().equals("功能15")){
            btn_feature_15.setText("Hello World");
        }
        else{
            btn_feature_15.setText("功能15");
        }
    }
    public void feature22(View view) {
        if(btn_feature_22.getText().toString().equals("功能22")){
            btn_feature_22.setText("Hello World");
        }
        else{
            btn_feature_22.setText("功能22");
        }
    }
}
