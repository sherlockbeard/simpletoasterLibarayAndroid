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
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toastlayout, null);
        View rootView = view.findViewById(R.id.ToastView);
        TextView textView = rootView.findViewById(R.id.message);
        textView.setText(message);
        toast.setView(view);
        toast.show();

    }
}
