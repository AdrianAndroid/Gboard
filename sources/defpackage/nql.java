package defpackage;

import android.content.Context;
import android.util.Base64;

/* compiled from: PG */
/* renamed from: nql  reason: default package */
/* loaded from: classes2.dex */
public final class nql implements nqk {
    public static final kky a;
    public static final kky b;

    static {
        klc e = new klc("com.google.android.libraries.performance.primes").f(llp.r("CLIENT_LOGGING_PROD")).d().e();
        a = e.b("45352228", true);
        try {
            b = e.c("45352241", (ona) nfm.w(ona.b, Base64.decode("CAYIBAgFCAM", 3)), kla.c);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.nqk
    public final ona a(Context context) {
        return (ona) b.b(context);
    }

    @Override // defpackage.nqk
    public final boolean b(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }
}
