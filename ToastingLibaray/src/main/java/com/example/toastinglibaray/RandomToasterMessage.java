package com.example.toastinglibaray;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RandomToasterMessage {


    public static final int TEXT_TOAST_LAYOUT = R.layout.toastlayout;

    public static void s(Context c, String message){

        Toast toast = new Toast(c);
        toast.setDuration(Toast.LENGTH_LONG);
        View view = LayoutInflater.from(c).inflate(TEXT_TOAST_LAYOUT, null);
        TextView textView = view.findViewById(R.id.message);
        textView.setText(message);
        toast.setView(view);
        toast.show();

    }
}
