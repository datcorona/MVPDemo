package com.applockmaster.mvpdemo.model;

public interface OnResultCallback {
    void loginSuccess();

    void loginFail(String msg);
}
