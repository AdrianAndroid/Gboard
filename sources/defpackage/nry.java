package defpackage;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: nry  reason: default package */
/* loaded from: classes2.dex */
public final class nry {
    public static final nry a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        c = identityHashMap;
        a = new nry(identityHashMap);
    }

    public nry(IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public static nrw a() {
        return new nrw(a);
    }

    public final nrw b() {
        return new nrw(this);
    }

    public final Object c(nrx nrxVar) {
        return this.b.get(nrxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L5c
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L5c
        L12:
            nry r7 = (defpackage.nry) r7
            java.util.IdentityHashMap r2 = r6.b
            int r2 = r2.size()
            java.util.IdentityHashMap r3 = r7.b
            int r3 = r3.size()
            if (r2 == r3) goto L23
            return r1
        L23:
            java.util.IdentityHashMap r2 = r6.b
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.IdentityHashMap r4 = r7.b
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L46
            return r1
        L46:
            java.lang.Object r4 = r3.getValue()
            java.util.IdentityHashMap r5 = r7.b
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = defpackage.jdg.W(r4, r3)
            if (r3 != 0) goto L2d
            return r1
        L5b:
            return r0
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nry.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.b.toString();
    }
}
