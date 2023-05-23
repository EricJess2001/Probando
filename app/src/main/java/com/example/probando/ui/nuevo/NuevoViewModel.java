package com.example.probando.ui.nuevo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NuevoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NuevoViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
