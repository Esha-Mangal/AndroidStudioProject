package com.example.navigation2.ui.chats;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChatsViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public ChatsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is chats fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
