package defpackage;

import android.os.Build;
import java.util.ArrayDeque;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: ldh  reason: default package */
/* loaded from: classes.dex */
public final class ldh {
    public static final WeakHashMap a = new WeakHashMap();
    private static final ThreadLocal b = new ldf();

    static {
        new ArrayDeque();
        new ArrayDeque();
    }

    public static lcq a(String str) {
        return b(str, ldi.a);
    }

    public static lcq b(String str, ldi ldiVar) {
        return c(str, ldiVar, lcr.a, true);
    }

    public static lcq c(String str, ldi ldiVar, lcs lcsVar, boolean z) {
        lcx f;
        jdg.u(ldiVar);
        lcx d = d();
        if (d == null) {
            f = new lco(str, lcsVar, z);
        } else if (d instanceof lck) {
            f = ((lck) d).d(str, lcsVar, z);
        } else {
            f = d.f(str, lcsVar);
        }
        f(f);
        return new lcq(f);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [lcx, java.lang.Object] */
    static lcx d() {
        return ((odv) b.get()).c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lcx e() {
        lcx d = d();
        return d == null ? new lcn() : d;
    }

    public static lcx f(lcx lcxVar) {
        return m((odv) b.get(), lcxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fc, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a1, code lost:
        r15 = r6.c.d;
        r4 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ad, code lost:
        if (r15.containsKey(r4) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00af, code lost:
        r6.c.d.put(r4, new defpackage.lcu(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bb, code lost:
        if (r14 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
        r14.c = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ca, code lost:
        if (r14 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cc, code lost:
        r14.c = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d0, code lost:
        r6.d = r7;
        r6.e++;
        r6.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cb, code lost:
        if (r6.c(r12, r13, r14, (r14 + r13) - r12) != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(defpackage.lcx r16) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldh.g(lcx):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [lcx, java.lang.Object] */
    public static void h(lcx lcxVar) {
        jdg.u(lcxVar);
        odv odvVar = (odv) b.get();
        ?? r1 = odvVar.c;
        jdg.O(r1, "Tried to end span %s, but there was no active span", lcxVar.b());
        jdg.L(lcxVar == r1, "Tried to end span %s, but that span is not the current span. The current span is %s.", lcxVar.b(), r1.b());
        m(odvVar, r1.a());
    }

    private static void i(String str) {
        if (str.length() > 127) {
            str.substring(0, 127);
        }
    }

    private static void j(lcx lcxVar) {
        if (lcxVar.a() != null) {
            j(lcxVar.a());
        }
        i(lcxVar.b());
    }

    private static void k(lcx lcxVar) {
        if (lcxVar.a() != null) {
            k(lcxVar.a());
        }
    }

    private static void l(lcx lcxVar, lcx lcxVar2) {
        if (lcxVar != null) {
            if (lcxVar2 != null) {
                if (lcxVar.a() == lcxVar2) {
                    return;
                }
                if (lcxVar == lcxVar2.a()) {
                    i(lcxVar2.b());
                    return;
                }
            }
            k(lcxVar);
        }
        if (lcxVar2 != null) {
            j(lcxVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lcx, java.lang.Object] */
    private static lcx m(odv odvVar, lcx lcxVar) {
        boolean equals;
        ?? r0 = odvVar.c;
        if (r0 == lcxVar) {
            return lcxVar;
        }
        if (r0 == 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                equals = ldg.a();
            } else {
                equals = "true".equals(koi.a());
            }
            odvVar.b = equals;
        }
        if (odvVar.b) {
            l(r0, lcxVar);
        }
        odvVar.c = lcxVar;
        Object obj = odvVar.a;
        return r0;
    }
}
