package com.tsgforce.muktangan.utils;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class CommonUtility {

    /**
     * Return true if the @param is null
     * @param string
     * @return
     */
    public static boolean isEmpty(String string){
        return string.equals("");
    }

    public static void showDialog(View mProgressBar){
        mProgressBar.setVisibility(View.VISIBLE);

    }

    public static void hideDialog(View mProgressBar){
        if(mProgressBar.getVisibility() == View.VISIBLE){
            mProgressBar.setVisibility(View.INVISIBLE);
        }
    }

    public static void hideSoftKeyboard(AppCompatActivity appCompatActivity){
        appCompatActivity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
}
