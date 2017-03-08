package com.toshihiro.geometryphotos;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Admin on 02-Feb-17.
 */
public class MyDialog {

    public void myDialog(Context context,
                         String strTitle,
                         String strMesage,
                         int iconLogo
    ) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(iconLogo);
        builder.setTitle(strTitle);
        builder.setMessage(strMesage);
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();

            }
        });

        builder.show();
    }
}
