package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fmw  reason: default package */
/* loaded from: classes.dex */
public final class fmw extends gco {
    final /* synthetic */ fmx a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmw(fmx fmxVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = fmxVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            int e = this.a.e(this.b);
            if (!fnn.g(e)) {
                return;
            }
            fmx fmxVar = this.a;
            Context context = this.b;
            fmxVar.c(context, e, fmxVar.h(context, e, "n"));
            return;
        }
        int i = message.what;
        Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
    }
}
