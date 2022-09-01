package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.style.SuggestionSpan;

/* compiled from: PG */
/* renamed from: ezc  reason: default package */
/* loaded from: classes.dex */
public final class ezc extends BroadcastReceiver {
    private static final lug e = hin.a;
    public final Context a;
    public SuggestionSpan b;
    public boolean c = false;
    public opu d;

    public ezc(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.text.style.SUGGESTION_PICKED".equals(intent.getAction())) {
            if (this.b == null || intent.getIntExtra("hashcode", 0) != this.b.hashCode()) {
                ((luc) ((luc) e.c()).k("com/google/android/apps/inputmethod/libs/translate/SuggestionSpanLocalBroadCastReceiver", "onReceive", 75, "SuggestionSpanLocalBroadCastReceiver.java")).t("SuggestionSpan out of dated. Discarded.");
                return;
            }
            intent.getStringExtra("before");
            intent.getStringExtra("after");
            opu opuVar = this.d;
            if (opuVar == null) {
                return;
            }
            Object obj = opuVar.a;
            ezx ezxVar = (ezx) obj;
            if (ezxVar.e == null || !((dbn) obj).h) {
                return;
            }
            ezxVar.u(2);
        }
    }
}
