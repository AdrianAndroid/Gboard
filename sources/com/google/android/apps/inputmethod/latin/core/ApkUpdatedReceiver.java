package com.google.android.apps.inputmethod.latin.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ApkUpdatedReceiver extends BroadcastReceiver {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/latin/core/ApkUpdatedReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/latin/core/ApkUpdatedReceiver", "onReceive", 18, "ApkUpdatedReceiver.java")).t("onReceive()");
        cby.a(context).e();
        new cqy(context).a();
    }
}
