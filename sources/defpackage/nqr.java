package defpackage;

import android.content.Context;
import android.util.Base64;

/* compiled from: PG */
/* renamed from: nqr  reason: default package */
/* loaded from: classes2.dex */
public final class nqr implements nqq {
    public static final kky a;

    static {
        klc e = new klc("com.google.android.libraries.performance.primes").f(llp.r("CLIENT_LOGGING_PROD")).d().e();
        try {
            a = e.c("15", (oor) nfm.w(oor.d, Base64.decode("EAAYAg", 3)), kla.e);
            try {
                kec kecVar = (kec) nfm.w(kec.a, Base64.decode("CAASABgAIAAoADAAOABAAA", 3));
                try {
                    kec kecVar2 = (kec) nfm.w(kec.a, Base64.decode("CAASABgAIAAoADAAOABAAA", 3));
                } catch (Exception e2) {
                    throw new AssertionError(e2);
                }
            } catch (Exception e3) {
                throw new AssertionError(e3);
            }
        } catch (Exception e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // defpackage.nqq
    public final oor a(Context context) {
        return (oor) a.b(context);
    }
}
