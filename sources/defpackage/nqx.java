package defpackage;

import android.content.Context;
import android.util.Base64;

/* compiled from: PG */
/* renamed from: nqx  reason: default package */
/* loaded from: classes2.dex */
public final class nqx implements nqw {
    public static final kky a;
    public static final kky b;
    public static final kky c;
    public static final kky d;

    static {
        klc e = new klc("com.google.android.libraries.performance.primes").f(llp.r("CLIENT_LOGGING_PROD")).d().e();
        a = e.b("25", false);
        try {
            b = e.c("40", (kfn) nfm.w(kfn.d, Base64.decode("Ci1jb20uZ29vZ2xlLmFuZHJvaWQucHJpbWVzLWphbmstJVBBQ0tBR0VfTkFNRSUSIwgCEh9KPCVFVkVOVF9OQU1FJT4jbWlzc2VkQXBwRnJhbWVzEh8IAxIbSjwlRVZFTlRfTkFNRSU+I3RvdGFsRnJhbWVzEiYIBRIiSjwlRVZFTlRfTkFNRSU+I21heEZyYW1lVGltZU1pbGxpcw", 3)), kla.g);
            try {
                c = e.c("13", (oor) nfm.w(oor.d, Base64.decode("EAAYAg", 3)), kla.h);
                d = e.b("45351799", false);
            } catch (Exception e2) {
                throw new AssertionError(e2);
            }
        } catch (Exception e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.nqw
    public final kfn a(Context context) {
        return (kfn) b.b(context);
    }

    @Override // defpackage.nqw
    public final oor b(Context context) {
        return (oor) c.b(context);
    }

    @Override // defpackage.nqw
    public final boolean c(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.nqw
    public final boolean d(Context context) {
        return ((Boolean) d.b(context)).booleanValue();
    }
}
