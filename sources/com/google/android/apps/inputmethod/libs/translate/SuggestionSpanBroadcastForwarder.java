package com.google.android.apps.inputmethod.libs.translate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SuggestionSpanBroadcastForwarder extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.text.style.SUGGESTION_PICKED".equals(intent.getAction())) {
            ahh.a(context).d(intent);
        }
    }
}
