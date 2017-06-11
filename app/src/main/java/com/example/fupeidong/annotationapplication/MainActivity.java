package com.example.fupeidong.annotationapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.annotation_api.ViewInjector;
import com.example.cls.BindView;
import com.example.cls.MyAnnotation;

@MyAnnotation("hello annotation")
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_txt)
    TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewInjector.inJectView(this);
        mTv.setText("annotation text");
    }
}
