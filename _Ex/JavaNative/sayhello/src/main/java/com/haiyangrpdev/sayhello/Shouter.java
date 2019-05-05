package com.haiyangrpdev.sayhello;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.support.annotation.NonNull;
import android.widget.Toast;
import static android.support.v4.util.Preconditions.checkNotNull;

public class Shouter {

    private final Context _context;

    @SuppressLint("RestrictedApi")
    public Shouter(@NonNull Context context) {
        checkNotNull(context, "context == null");
        this._context = context.getApplicationContext();
    }

    public void ShoutHello(boolean isToast){

        if (isToast)
            Toast.makeText(this._context,"Put here the toast of Java Lib soon",Toast.LENGTH_SHORT).show();
        else {
            AlertDialog alertDialog = new AlertDialog.Builder(this._context).create();
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
