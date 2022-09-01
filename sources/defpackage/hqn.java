package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: hqn  reason: default package */
/* loaded from: classes.dex */
public final class hqn implements hqx {
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/inputmethodentry/BundledPrimaryImeDefsProvider");
    public final Context a;
    public volatile hqw b;

    public hqn(Context context) {
        this.a = context;
    }

    @Override // defpackage.hqx
    public final void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.llp b(android.content.Context r22, defpackage.iaw r23, defpackage.jls r24) {
        /*
            r21 = this;
            r1 = r21
            r9 = r23
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            iat r11 = defpackage.iav.a()
            int[] r12 = r9.d
            int[] r13 = r9.f
            int r14 = r12.length
            r0 = 0
            r15 = 0
        L14:
            if (r15 >= r14) goto Lc3
            boolean r0 = java.lang.Thread.interrupted()
            java.lang.String r8 = "BundledPrimaryImeDefsProvider.java"
            java.lang.String r7 = "loadImeDefsInternal"
            java.lang.String r6 = "com/google/android/libraries/inputmethod/inputmethodentry/BundledPrimaryImeDefsProvider"
            if (r0 == 0) goto L46
            ltg r0 = defpackage.hqn.c
            ltv r0 = r0.d()
            ltd r0 = (defpackage.ltd) r0
            r2 = 72
            ltv r0 = r0.k(r6, r7, r2, r8)
            ltd r0 = (defpackage.ltd) r0
            java.lang.String r2 = "The bundled provider is interrupted for %s"
            java.lang.String r3 = r9.a
            r0.w(r2, r3)
            hqw r0 = r1.b
            if (r0 == 0) goto L46
            hqw r0 = r1.b
            hrx r0 = (defpackage.hrx) r0
            r2 = 8
            r0.v(r2)
        L46:
            r5 = r12[r15]
            r0 = r13[r15]
            hqm r4 = new hqm     // Catch: java.io.IOException -> L7f org.xmlpull.v1.XmlPullParserException -> L81
            r16 = 0
            r2 = r4
            r3 = r11
            r17 = r4
            r4 = r24
            r18 = r5
            r5 = r0
            r19 = r6
            r6 = r23
            r9 = r7
            r7 = r10
            r20 = r11
            r11 = r8
            r8 = r16
            r2.<init>(r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L75 org.xmlpull.v1.XmlPullParserException -> L77
            r2 = r22
            r3 = r24
            r0 = r17
            r4 = r18
            defpackage.jfy.f(r2, r4, r3, r0)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L73
            goto Lbb
        L71:
            r0 = move-exception
            goto L8d
        L73:
            r0 = move-exception
            goto L8d
        L75:
            r0 = move-exception
            goto L78
        L77:
            r0 = move-exception
        L78:
            r2 = r22
            r3 = r24
            r4 = r18
            goto L8d
        L7f:
            r0 = move-exception
            goto L82
        L81:
            r0 = move-exception
        L82:
            r2 = r22
            r3 = r24
            r4 = r5
            r19 = r6
            r9 = r7
            r20 = r11
            r11 = r8
        L8d:
            ltg r5 = defpackage.hqn.c
            ltv r5 = r5.c()
            ltd r5 = (defpackage.ltd) r5
            ltv r0 = r5.i(r0)
            ltd r0 = (defpackage.ltd) r0
            r5 = 110(0x6e, float:1.54E-43)
            r6 = r19
            ltv r0 = r0.k(r6, r9, r5, r11)
            ltd r0 = (defpackage.ltd) r0
            java.lang.String r5 = "Failed to load an ime from resource file: %s"
            java.lang.String r4 = defpackage.jbi.j(r4)
            r0.w(r5, r4)
            hqw r0 = r1.b
            if (r0 == 0) goto Lbb
            hqw r0 = r1.b
            hrx r0 = (defpackage.hrx) r0
            r4 = 9
            r0.v(r4)
        Lbb:
            int r15 = r15 + 1
            r9 = r23
            r11 = r20
            goto L14
        Lc3:
            llp r0 = defpackage.llp.o(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqn.b(android.content.Context, iaw, jls):llp");
    }

    @Override // defpackage.hqx
    public final mko c(iaw iawVar, jls jlsVar, mkr mkrVar) {
        return mkrVar.hQ(new cak(this, iawVar, jlsVar, 14, null));
    }
}
