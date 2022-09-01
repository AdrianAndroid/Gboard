package defpackage;

import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: num  reason: default package */
/* loaded from: classes2.dex */
public final class num {
    public static final Logger a = Logger.getLogger(num.class.getName());
    public static final nui b = new oan(1);
    static final lyk c = lyk.d.f();
    public Object[] d;
    public int e;

    public num() {
    }

    public num(int i, Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }

    private final int i() {
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void j(int i) {
        Object[] objArr = new Object[i];
        if (!l()) {
            System.arraycopy(this.d, 0, objArr, 0, a());
        }
        this.d = objArr;
    }

    private final void k(int i, byte[] bArr) {
        this.d[i + i] = bArr;
    }

    private final boolean l() {
        return this.e == 0;
    }

    public final int a() {
        int i = this.e;
        return i + i;
    }

    public final Object b(nuj nujVar) {
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(nujVar.b, g(i)));
        Object c2 = c(i);
        if (c2 instanceof byte[]) {
            return nujVar.a((byte[]) c2);
        }
        nxo nxoVar = (nxo) c2;
        throw null;
    }

    public final Object c(int i) {
        return this.d[i + i + 1];
    }

    public final void d(nuj nujVar) {
        if (!l()) {
            int i = 0;
            for (int i2 = 0; i2 < this.e; i2++) {
                if (!Arrays.equals(nujVar.b, g(i2))) {
                    k(i, g(i2));
                    Object c2 = c(i2);
                    if (this.d instanceof byte[][]) {
                        j(i());
                    }
                    this.d[i + i + 1] = c2;
                    i++;
                }
            }
            Arrays.fill(this.d, i + i, a(), (Object) null);
            this.e = i;
        }
    }

    public final void e(num numVar) {
        if (numVar.l()) {
            return;
        }
        int i = i() - a();
        if (l() || i < numVar.a()) {
            j(a() + numVar.a());
        }
        System.arraycopy(numVar.d, 0, this.d, a(), numVar.a());
        this.e += numVar.e;
    }

    public final void f(nuj nujVar, Object obj) {
        jdg.Q(nujVar, "key");
        jdg.Q(obj, "value");
        if (a() == 0 || a() == i()) {
            int a2 = a();
            j(Math.max(a2 + a2, 8));
        }
        k(this.e, nujVar.b);
        int i = this.e;
        this.d[i + i + 1] = nujVar.b(obj);
        this.e++;
    }

    public final byte[] g(int i) {
        return (byte[]) this.d[i + i];
    }

    public final byte[] h(int i) {
        Object c2 = c(i);
        if (c2 instanceof byte[]) {
            return (byte[]) c2;
        }
        nxo nxoVar = (nxo) c2;
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(g(i), lel.a);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(c.i(h(i)));
            } else {
                sb.append(new String(h(i), lel.a));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
