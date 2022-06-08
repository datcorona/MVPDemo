package com.applockmaster.mvpdemo.model;

public class LoginRepository {
    private OnResultCallback callback;

    public LoginRepository(OnResultCallback callback) {
        this.callback = callback;
    }

    public void login(String user, String pass) {
        //xử lý login ở đây
        if (user.isEmpty() || pass.isEmpty()) {
            callback.loginFail("Không được để trống");
            return;
        }
        if (user.length() < 6) {
            callback.loginFail("Username k hợp lệ");
            return;
        }
        if (pass.length() < 6) {
            callback.loginFail("Pass k hợp lệ");
            return;
        }
        callback.loginSuccess();
    }
}
