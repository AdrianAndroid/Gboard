package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: lox  reason: default package */
/* loaded from: classes.dex */
public final class lox {
    boolean a;
    int b = -1;
    int c = -1;
    lpn d;
    lpn e;
    lep f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lpn c() {
        return (lpn) jdg.U(this.d, lpn.STRONG);
    }

    final lpn d() {
        return (lpn) jdg.U(this.e, lpn.STRONG);
    }

    public final ConcurrentMap e() {
        if (!this.a) {
            return new ConcurrentHashMap(b(), 0.75f, a());
        }
        int i = lqc.k;
        if (c() != lpn.STRONG || d() != lpn.STRONG) {
            if (c() != lpn.STRONG || d() != lpn.WEAK) {
                if (c() != lpn.WEAK || d() != lpn.STRONG) {
                    if (c() != lpn.WEAK || d() != lpn.WEAK) {
                        throw new AssertionError();
                    }
                    return new lqc(this, lpp.d);
                }
                return new lqc(this, lpp.c);
            }
            return new lqc(this, lpp.a);
        }
        return new lqc(this, lpp.b);
    }

    public final void f(lpn lpnVar) {
        lpn lpnVar2 = this.d;
        jdg.J(lpnVar2 == null, "Key strength was already set to %s", lpnVar2);
        jdg.u(lpnVar);
        this.d = lpnVar;
        if (lpnVar != lpn.STRONG) {
            this.a = true;
        }
    }

    public final String toString() {
        lfa S = jdg.S(this);
        int i = this.b;
        if (i != -1) {
            S.f("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            S.f("concurrencyLevel", i2);
        }
        lpn lpnVar = this.d;
        if (lpnVar != null) {
            S.b("keyStrength", jdg.X(lpnVar.toString()));
        }
        lpn lpnVar2 = this.e;
        if (lpnVar2 != null) {
            S.b("valueStrength", jdg.X(lpnVar2.toString()));
        }
        if (this.f != null) {
            S.a("keyEquivalence");
        }
        return S.toString();
    }
}
