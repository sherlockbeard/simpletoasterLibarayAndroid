package com.example.toastinglibaray;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RandomToasterMessage {


    public static void s(Context c, String message){

        Toast toast = Toast.makeText(c, message, Toast.LENGTH_SHORT);
        View toastView = toast.getView();
        toastView.setBackgroundColor(Color.BLUE);
        TextView textView = (TextView) toastView.findViewById(android.R.id.message);
        textView.setTextColor(Color.GRAY);
        toast.show();
    }
}
