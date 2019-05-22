package com.example.sams_mac.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

public class AlertDialogFragment1 extends DialogFragment {
        @NonNull
        @Override
        public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
            Context context = getActivity();
            Bundle bundle = getArguments();
            int message = bundle.getInt("message_key");
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(getString(R.string.error_title))
                    .setMessage(message);
            builder.setPositiveButton(getString(R.string.error_button_ok_text),null);

            return builder.create();
        }
    }

