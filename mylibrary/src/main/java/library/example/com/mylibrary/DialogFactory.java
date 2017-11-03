package library.example.com.mylibrary;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;

/**
 * Created by harsh on 06/10/2017.
 */

public class DialogFactory {
    public static Dialog showNeutralButtonDialog(Context context, String title, String message, String buttonText) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setNeutralButton(buttonText, null);
        return alertDialog.create();
    }
}
