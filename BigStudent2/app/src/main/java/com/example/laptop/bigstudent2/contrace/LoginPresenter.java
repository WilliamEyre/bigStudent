package com.example.laptop.bigstudent2.contrace;

/**
* Created by TMVPHelper on 2017/11/28
*/
public class LoginPresenter extends LoginContract.Presenter{

    @Override
    public void Loginas(String url) {
        baseModle.getModle(url, new CallBacks() {

            @Override
            public void succ(String url) {
                baseView.show(url);
            }
        });
    }
}