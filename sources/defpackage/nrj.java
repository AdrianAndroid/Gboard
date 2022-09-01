package defpackage;

import android.content.Context;
import android.util.Base64;

/* compiled from: PG */
/* renamed from: nrj  reason: default package */
/* loaded from: classes2.dex */
public final class nrj implements nri {
    public static final kky a;
    public static final kky b;
    public static final kky c;

    static {
        klc e = new klc("com.google.android.libraries.performance.primes").f(llp.r("CLIENT_LOGGING_PROD")).d().e();
        a = e.b("3", false);
        b = e.a("45357887", 1L);
        try {
            c = e.c("19", (oor) nfm.w(oor.d, Base64.decode("EAAYAg", 3)), kla.k);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.nri
    public final long a(Context context) {
        return ((Long) b.b(context)).longValue();
    }

    @Override // defpackage.nri
    public final oor b(Context context) {
        return (oor) c.b(context);
    }

    @Override // defpackage.nri
    public final boolean c(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }
}
