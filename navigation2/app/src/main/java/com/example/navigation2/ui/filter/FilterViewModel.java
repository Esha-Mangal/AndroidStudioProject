package com.example.navigation2.ui.filter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FilterViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public FilterViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is filter fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
