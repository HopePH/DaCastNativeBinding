package com.haiyangrpdev.sayhello;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.widget.Toast;
import static android.support.v4.util.Preconditions.checkNotNull;

public class Shouter {

    private final Context _context;
    private String _message;

    @SuppressLint("RestrictedApi")
    public Shouter(@NonNull Context context) {
        //chito. must to throw error so the xamarin will know the error, handle this in xamarin catch
        checkNotNull(context, "context == null");
        this._context = context;
    }

    public void ShoutHello(boolean isToast) {
        try {
            if (this._context != null) {
                if (isToast)
                    try {
                        Toast.makeText(this._context, "This toast is from java code!", Toast.LENGTH_SHORT).show();
                    }
                    catch (RuntimeException re){
                        if (!re.getMessage().contains("not mocked")) throw re;
                    }
                else {
                    try {
                        AlertDialog alertDialog = new AlertDialog.Builder(this._context).create();
                        alertDialog.setTitle("Alert");
                        alertDialog.setMessage("This alert is from java code!");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                    }
                    catch (RuntimeException re){
                        if (!re.getMessage().contains("not mocked")) throw re;
                    }
                }
            }

            this._message = "Toast success!";
        } catch (Exception e) {
            this._message = e.getMessage();
        }
    }

    public String getMessage() {
        return this._message;
    }
}
