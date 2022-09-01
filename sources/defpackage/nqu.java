package defpackage;

import android.content.Context;
import android.util.Base64;

/* compiled from: PG */
/* renamed from: nqu  reason: default package */
/* loaded from: classes2.dex */
public final class nqu implements nqt {
    public static final kky a;

    static {
        klc e = new klc("com.google.android.libraries.performance.primes").f(llp.r("CLIENT_LOGGING_PROD")).d().e();
        try {
            oor oorVar = (oor) nfm.w(oor.d, Base64.decode("EAAYAg", 3));
            try {
                a = e.c("45371370", (kej) nfm.w(kej.c, Base64.decode("CAAQAA", 3)), kla.f);
            } catch (Exception e2) {
                throw new AssertionError(e2);
            }
        } catch (Exception e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.nqt
    public final kej a(Context context) {
        return (kej) a.b(context);
    }
}
