package defpackage;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: ldd  reason: default package */
/* loaded from: classes.dex */
public final class ldd {
    public static final /* synthetic */ int a = 0;

    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static leq a(leq leqVar) {
        return new ldc(ldh.e(), leqVar);
    }

    public static mix b(mix mixVar) {
        jdg.u(mixVar);
        return new mjr(ldh.e(), mixVar, 1);
    }

    public static miy c(miy miyVar) {
        return new mjb(ldh.e(), miyVar, 1);
    }

    public static mjc d(final mjc mjcVar) {
        final lcx e = ldh.e();
        return new mjc() { // from class: lcz
            @Override // defpackage.mjc
            public final mjf a(kdg kdgVar, Object obj) {
                lcx lcxVar = lcx.this;
                mjc mjcVar2 = mjcVar;
                int i = ldd.a;
                lcx f = ldh.f(lcxVar);
                try {
                    return mjcVar2.a(kdgVar, obj);
                } finally {
                    ldh.f(f);
                }
            }
        };
    }

    public static mka e(mka mkaVar) {
        return new ldb(ldh.e(), mkaVar);
    }

    public static Runnable f(Runnable runnable) {
        return new lda(ldh.e(), runnable);
    }

    public static Callable g(Callable callable) {
        return new mja(ldh.e(), callable, 1);
    }
}
