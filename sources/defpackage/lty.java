package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lty  reason: default package */
/* loaded from: classes.dex */
public class lty {
    public final String a;
    public final boolean b;
    public final long c;
    private final Class d;
    private final boolean e;

    /* JADX INFO: Access modifiers changed from: protected */
    public lty(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static lty c(String str, Class cls) {
        return new lty(str, cls, false, false);
    }

    protected void a(Iterator it, ltx ltxVar) {
        while (it.hasNext()) {
            b(it.next(), ltxVar);
        }
    }

    protected void b(Object obj, ltx ltxVar) {
        ltxVar.a(this.a, obj);
    }

    public final Object d(Object obj) {
        return this.d.cast(obj);
    }

    public final void e(Object obj, ltx ltxVar) {
        if (!this.e || lvl.a() <= 20) {
            b(obj, ltxVar);
        } else {
            ltxVar.a(this.a, obj);
        }
    }

    public final void f(Iterator it, ltx ltxVar) {
        if (this.b) {
            if (!this.e || lvl.a() <= 20) {
                a(it, ltxVar);
                return;
            }
            while (it.hasNext()) {
                ltxVar.a(this.a, it.next());
            }
            return;
        }
        throw new IllegalStateException("non repeating key");
    }

    public final String toString() {
        return getClass().getName() + "/" + this.a + "[" + this.d.getName() + "]";
    }

    private lty(String str, Class cls, boolean z, boolean z2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        if (lxj.d(str.charAt(0))) {
            for (int i = 1; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!lxj.d(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                    throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                }
            }
            this.a = str;
            this.d = cls;
            this.b = z;
            this.e = z2;
            int identityHashCode = System.identityHashCode(this);
            long j = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                j |= 1 << (identityHashCode & 63);
                identityHashCode >>>= 6;
            }
            this.c = j;
            return;
        }
        throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
    }
}
