package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* renamed from: qu  reason: default package */
/* loaded from: classes2.dex */
public class qu {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final im g;
    private final aqq h;

    public qu() {
        this(6);
    }

    public static int d(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    protected static final void e(Object obj, Object obj2) {
        oll.e(obj, "key");
        oll.e(obj2, "oldValue");
    }

    private final int f(Object obj, Object obj2) {
        int a = a(obj, obj2);
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    protected int a(Object obj, Object obj2) {
        oll.e(obj, "key");
        oll.e(obj2, "value");
        return 1;
    }

    public final Object b(Object obj) {
        synchronized (this.g) {
            Object obj2 = ((LinkedHashMap) this.h.a).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "value"
            defpackage.oll.e(r7, r0)
            im r0 = r5.g
            monitor-enter(r0)
            int r1 = r5.c     // Catch: java.lang.Throwable -> Lc5
            int r1 = r1 + 1
            r5.c = r1     // Catch: java.lang.Throwable -> Lc5
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lc5
            int r2 = r5.f(r6, r7)     // Catch: java.lang.Throwable -> Lc5
            int r1 = r1 + r2
            r5.b = r1     // Catch: java.lang.Throwable -> Lc5
            aqq r1 = r5.h     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r7 = r1.p(r6, r7)     // Catch: java.lang.Throwable -> Lc5
            if (r7 == 0) goto L28
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lc5
            int r2 = r5.f(r6, r7)     // Catch: java.lang.Throwable -> Lc5
            int r1 = r1 - r2
            r5.b = r1     // Catch: java.lang.Throwable -> Lc5
        L28:
            monitor-exit(r0)
            if (r7 == 0) goto L2e
            e(r6, r7)
        L2e:
            int r6 = r5.a
        L30:
            im r0 = r5.g
            monitor-enter(r0)
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lc2
            if (r1 < 0) goto Lba
            aqq r1 = r5.h     // Catch: java.lang.Throwable -> Lc2
            boolean r1 = r1.q()     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L43
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lc2
            if (r1 != 0) goto Lba
        L43:
            int r1 = r5.b     // Catch: java.lang.Throwable -> Lc2
            if (r1 <= r6) goto Lb8
            aqq r1 = r5.h     // Catch: java.lang.Throwable -> Lc2
            boolean r1 = r1.q()     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L50
            goto Lb8
        L50:
            aqq r1 = r5.h     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> Lc2
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> Lc2
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "map.entries"
            defpackage.oll.d(r1, r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "<this>"
            defpackage.oll.e(r1, r2)     // Catch: java.lang.Throwable -> Lc2
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> Lc2
            r3 = 0
            if (r2 == 0) goto L78
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lc2
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lc2
            if (r2 == 0) goto L72
            goto L87
        L72:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> Lc2
            goto L87
        L78:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc2
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r2 != 0) goto L83
            goto L87
        L83:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lc2
        L87:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lc2
            if (r3 != 0) goto L8d
            monitor-exit(r0)
            goto Lb9
        L8d:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> Lc2
            aqq r3 = r5.h     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "key"
            defpackage.oll.e(r1, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r3 = r3.a     // Catch: java.lang.Throwable -> Lc2
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> Lc2
            r3.remove(r1)     // Catch: java.lang.Throwable -> Lc2
            int r3 = r5.b     // Catch: java.lang.Throwable -> Lc2
            int r4 = r5.f(r1, r2)     // Catch: java.lang.Throwable -> Lc2
            int r3 = r3 - r4
            r5.b = r3     // Catch: java.lang.Throwable -> Lc2
            int r3 = r5.d     // Catch: java.lang.Throwable -> Lc2
            int r3 = r3 + 1
            r5.d = r3     // Catch: java.lang.Throwable -> Lc2
            monitor-exit(r0)
            e(r1, r2)
            goto L30
        Lb8:
            monitor-exit(r0)
        Lb9:
            return r7
        Lba:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc2
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lc2
            throw r7     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        Lc5:
            r6 = move-exception
            monitor-exit(r0)
            goto Lc9
        Lc8:
            throw r6
        Lc9:
            goto Lc8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu.c(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        String str;
        synchronized (this.g) {
            int i = this.e;
            int i2 = this.f + i;
            str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    public qu(int i) {
        this.a = i;
        this.h = new aqq((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.g = new im();
    }
}
