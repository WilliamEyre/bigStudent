package com.example.laptop.bigstudent2.contrace;

import com.example.laptop.bigstudent2.app.App;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Laptop on 2017/11/28.
 */
public class LoginModel implements LoginContract.Model{
    private static LoginModel loginModel;
    private OkHttpClient okHttpClient;
    public static LoginModel getLoginModel(){
        if (loginModel == null) {
            synchronized (LoginModel.class){
                loginModel = new LoginModel();
            }
        }
        return loginModel;
    }

    public LoginModel() {
        okHttpClient = new OkHttpClient();
    }
    @Override
    public void getModle(String url, final CallBacks callBacks) {
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                final String name = response.body().string();
                App.baseActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callBacks.succ(name);
                    }
                });
            }
        });
    }
}
