package com.syntaxerror.toastlib;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {

    public static void showToastShort(Context context, String strMessage){
        Toast.makeText(context,strMessage,Toast.LENGTH_SHORT).show();
    }

    public static void showToastLong(Context context, String strMessage){
        Toast.makeText(context,strMessage,Toast.LENGTH_LONG).show();
    }



}
