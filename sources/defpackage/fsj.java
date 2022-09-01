package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fsj  reason: default package */
/* loaded from: classes.dex */
public final class fsj {
    private static final fsj a = new fsj();
    private fpp b = null;

    public static fpp b(Context context) {
        return a.a(context);
    }

    public final synchronized fpp a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new fpp(context);
        }
        return this.b;
    }
}
