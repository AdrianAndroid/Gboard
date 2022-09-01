package com.google.android.libraries.inputmethod.workprofile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CanInteractAcrossProfilesBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (jez.i(context)) {
            return;
        }
        SharedPreferences.Editor edit = ino.L().J().edit();
        if (!(edit instanceof jel)) {
            return;
        }
        ((jel) edit).c();
    }
}
