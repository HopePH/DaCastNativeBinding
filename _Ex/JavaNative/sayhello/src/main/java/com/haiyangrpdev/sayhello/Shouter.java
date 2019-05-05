package com.haiyangrpdev.sayhello;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

public class Shouter {

    private Context _context;

    public Shouter() {}

    public Shouter(Context context){
        _context = context;
    }

    public void ShoutHello(boolean isToast){

        if (isToast)
            Toast.makeText(_context,"Put here the toast of Java Lib soon",Toast.LENGTH_SHORT).show();
        else {
            AlertDialog alertDialog = new AlertDialog.Builder(_context).create();
            alertDialog.setTitle("Alert");
            alertDialog.setMessage("Alert message to be shown");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }
    }
}
