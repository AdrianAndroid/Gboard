package defpackage;

import android.content.Context;
import android.util.Base64;

/* compiled from: PG */
/* renamed from: nqo  reason: default package */
/* loaded from: classes2.dex */
public final class nqo implements nqn {
    public static final kky a;

    static {
        klc e = new klc("com.google.android.libraries.performance.primes").f(llp.r("CLIENT_LOGGING_PROD")).d().e();
        try {
            a = e.c("16", (oor) nfm.w(oor.d, Base64.decode("EAAYAg", 3)), kla.d);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.nqn
    public final oor a(Context context) {
        return (oor) a.b(context);
    }
}
