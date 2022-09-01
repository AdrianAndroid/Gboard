package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: nrd  reason: default package */
/* loaded from: classes2.dex */
public final class nrd implements nrc {
    public static final kky a;
    public static final kky b;

    static {
        klc e = new klc("com.google.android.libraries.performance.primes").f(llp.r("CLIENT_LOGGING_PROD")).d().e();
        a = e.b("45359255", false);
        b = e.b("36", true);
    }

    @Override // defpackage.nrc
    public final boolean a(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.nrc
    public final boolean b(Context context) {
        return ((Boolean) b.b(context)).booleanValue();
    }
}
