package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lmx  reason: default package */
/* loaded from: classes.dex */
public class lmx extends llf {
    Object[] d;
    private int e;

    public lmx() {
        super(4);
    }

    @Override // defpackage.llf
    /* renamed from: h */
    public final void d(Object obj) {
        jdg.u(obj);
        if (this.d != null) {
            int e = lmz.e(this.b);
            Object[] objArr = this.d;
            if (e <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.d.length - 1;
                int hashCode = obj.hashCode();
                int G = jez.G(hashCode);
                while (true) {
                    int i = G & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return;
                        }
                        G = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        super.c(obj);
                        return;
                    }
                }
            }
        }
        this.d = null;
        super.c(obj);
    }

    public final void i(Object... objArr) {
        if (this.d == null) {
            super.e(objArr);
            return;
        }
        for (Object obj : objArr) {
            d(obj);
        }
    }

    public final void j(Iterable iterable) {
        jdg.u(iterable);
        if (this.d != null) {
            for (Object obj : iterable) {
                d(obj);
            }
            return;
        }
        super.f(iterable);
    }

    public final void k(lmx lmxVar) {
        if (this.d == null) {
            b(lmxVar.a, lmxVar.b);
            return;
        }
        for (int i = 0; i < lmxVar.b; i++) {
            d(Objects.requireNonNull(lmxVar.a[i]));
        }
    }

    public lmx(int i) {
        super(i);
        this.d = new Object[lmz.e(i)];
    }

    public lmz g() {
        lmz i;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 == 1) {
                return lmz.r(Objects.requireNonNull(this.a[0]));
            }
            if (this.d == null || lmz.e(i2) != this.d.length) {
                i = lmz.i(this.b, this.a);
                this.b = i.size();
            } else {
                int i3 = this.b;
                Object[] objArr = this.a;
                if (lmz.x(i3, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i3);
                }
                int i4 = this.e;
                Object[] objArr2 = this.d;
                i = new lrr(objArr, i4, objArr2, objArr2.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return i;
        }
        return lrr.a;
    }
}
