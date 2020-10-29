package com.bartalus.mvp;

class LoginImpl implements MyLogin {

    private Presenter presenter;

    public LoginImpl(Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public Login createModel(String name, String pass) {
        return new Login(name, pass);
    }
}
