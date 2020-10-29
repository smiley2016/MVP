package com.bartalus.mvp;

public class PresenterImpl implements Presenter {

    private MyView view;
    private MyLogin login;

    public PresenterImpl(MyView view){
        this.view = view;
    }

    @Override
    public void editText(String text) {
        String editedText = text + " szia";
        view.showText(editedText);
    }

    @Override
    public void handleLogin(String name, String pass) {
//        login = new LoginImpl(this);
//        Login model = login.createModel(name, pass);
        Login login = new Login(name, pass);

        //to do


        view.showNextActivity();
    }
}
