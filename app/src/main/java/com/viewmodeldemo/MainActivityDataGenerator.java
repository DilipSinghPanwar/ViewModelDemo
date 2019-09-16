package com.viewmodeldemo;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

public class MainActivityDataGenerator extends ViewModel {

    private String TAG = this.getClass().getSimpleName();
    private String myRandomNumber;

    public String getNumber() {
        Log.d(TAG, "getNumber() called");
        if (myRandomNumber == null) {
            generateNumber();
        }
        return myRandomNumber;
    }

    public String generateNumber() {
        Log.d(TAG, "generateNumber() called");
        Random random = new Random();
        myRandomNumber = String.format("%02d", random.nextInt(100));
        Log.d(TAG, "Generated Password : " + myRandomNumber);
        return myRandomNumber;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(TAG, "onCleared() called");
    }

}