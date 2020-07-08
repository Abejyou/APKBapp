package com.example.apkbapp2.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LoginViewModel() {
        System.out.println( "TESTE VIEW MODEL" );
        mText = new MutableLiveData<>();
        mText.setValue( "This is login fragment" );
    }

    public LiveData<String> getText() {
        return mText;
    }
}