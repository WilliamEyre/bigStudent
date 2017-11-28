package com.example.laptop.bigstudent2.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.laptop.bigstudent2.app.App;
import com.example.laptop.bigstudent2.utils.Tutils;

/**
 * Created by Laptop on 2017/11/28.
 */
public abstract class BaseActivity <P extends BasePresenter,M extends BaseModel> extends AppCompatActivity {
    public P mPresenter;
    public M mModle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        App.baseActivity = this;
        mPresenter = Tutils.getT(this,0);
        mModle = Tutils.getT(this,1);
        if (this instanceof BaseView){
            mPresenter.setMV(mModle,this);
        }
        initView();

    }
    public abstract void initView();
    protected abstract int getLayoutId();
}
