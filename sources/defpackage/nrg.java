package defpackage;

import android.content.Context;
import android.util.Base64;

/* compiled from: PG */
/* renamed from: nrg  reason: default package */
/* loaded from: classes2.dex */
public final class nrg implements nrf {
    public static final kky a;

    static {
        klc e = new klc("com.google.android.libraries.performance.primes").f(llp.r("CLIENT_LOGGING_PROD")).d().e();
        try {
            a = e.c("12", (oor) nfm.w(oor.d, Base64.decode("EAAYAg", 3)), kla.j);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.nrf
    public final oor a(Context context) {
        return (oor) a.b(context);
    }
}
