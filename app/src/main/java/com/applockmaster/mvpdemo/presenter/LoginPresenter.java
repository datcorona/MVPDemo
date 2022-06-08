package com.applockmaster.mvpdemo.presenter;

import com.applockmaster.mvpdemo.model.LoginRepository;
import com.applockmaster.mvpdemo.model.OnResultCallback;
import com.applockmaster.mvpdemo.view.LoginView;

public class LoginPresenter implements OnResultCallback {
    private final LoginRepository respon;
    private LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
        respon = new LoginRepository(this);
    }

    @Override
    public void loginSuccess() {
        view.onLoginSuccess();
    }

    @Override
    public void loginFail(String msg) {
        view.onLoginFail(msg);
    }

    public void login(String user, String pass) {
        respon.login(user,pass);
    }
}
