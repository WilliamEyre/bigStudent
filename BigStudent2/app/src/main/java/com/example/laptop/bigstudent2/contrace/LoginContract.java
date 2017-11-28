package com.example.laptop.bigstudent2.contrace;

import com.example.laptop.bigstudent2.base.BaseModel;
import com.example.laptop.bigstudent2.base.BasePresenter;
import com.example.laptop.bigstudent2.base.BaseView;

/**
 * Created by Laptop on 2017/11/28.
 */
public interface LoginContract {

    interface View extends BaseView {
        void show(String url);
    }

    interface Model extends BaseModel {
        void getModle(String url,CallBacks callBacks);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

        @Override
        public void onStart() {

        }
        public abstract void Loginas(String url);
        
    }
}