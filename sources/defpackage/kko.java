package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: kko  reason: default package */
/* loaded from: classes.dex */
public final class kko {
    public static final kjv a = kjv.a();
    private static final kqv b = new kqv(kkg.b);
    private static final Object c = new Object();
    private static volatile kqi d = null;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r5 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.File r7) {
        /*
            boolean r0 = r7.isDirectory()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L23
            java.io.File[] r0 = r7.listFiles()
            int r3 = r0.length
            r4 = 0
            r5 = 1
        Lf:
            if (r4 >= r3) goto L21
            r6 = r0[r4]
            if (r5 == 0) goto L1d
            boolean r5 = a(r6)
            if (r5 == 0) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            int r4 = r4 + 1
            goto Lf
        L21:
            if (r5 == 0) goto L2a
        L23:
            boolean r7 = r7.delete()
            if (r7 == 0) goto L2a
            return r2
        L2a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kko.a(java.io.File):boolean");
    }

    public static kqr b(kjj kjjVar) {
        kqg a2 = kqh.a();
        kor a3 = kos.a(kjjVar.c);
        a3.d("phenotype");
        a3.e("all_accounts.pb");
        a2.f(a3.a());
        a2.e(kkg.b);
        a2.d(b);
        a2.c();
        kqh a4 = a2.a();
        kqi kqiVar = d;
        if (kqiVar == null) {
            synchronized (c) {
                kqiVar = d;
                if (kqiVar == null) {
                    kqw kqwVar = kqw.a;
                    HashMap hashMap = new HashMap();
                    mks e = kjjVar.e();
                    kcq g = kjjVar.g();
                    kqn.b(kqo.a, hashMap);
                    kqi i = kqn.i(e, g, hashMap, kqwVar);
                    d = i;
                    kqiVar = i;
                }
            }
        }
        return kqiVar.a(a4);
    }
}
