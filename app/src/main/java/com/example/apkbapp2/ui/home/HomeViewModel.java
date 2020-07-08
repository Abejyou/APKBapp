package com.example.apkbapp2.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue( "\"Todos, sem exceção, sejam felizes\" \n" +
                "Lema Eterno: \"Ser Alegre com o Sol e ter a serenidade do Luar\" \n" +
                "Espírito do Grupo: \"Uma por todas e todas por uma\" \n" +
                "Missão: \"Transmitir a paz e a esperança através da música\" \n" +
                "Objetivo do Grupo: \"Criação de autênticos valores humanos\" " );
    }

    public LiveData<String> getText() {
        return mText;
    }
}