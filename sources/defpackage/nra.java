package defpackage;

import android.content.Context;
import android.util.Base64;

/* compiled from: PG */
/* renamed from: nra  reason: default package */
/* loaded from: classes2.dex */
public final class nra implements nqz {
    public static final kky a;

    static {
        klc e = new klc("com.google.android.libraries.performance.primes").f(llp.r("CLIENT_LOGGING_PROD")).d().e();
        try {
            a = e.c("8", (oor) nfm.w(oor.d, Base64.decode("EOgHGAQ", 3)), kla.i);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.nqz
    public final oor a(Context context) {
        return (oor) a.b(context);
    }
}
