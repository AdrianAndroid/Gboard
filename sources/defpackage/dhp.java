package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dhp  reason: default package */
/* loaded from: classes.dex */
public final class dhp extends dhq {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private dhp(android.content.Context r13, defpackage.dhd r14) {
        /*
            r12 = this;
            r0 = 9
            mks r0 = defpackage.gxo.a(r0)
            bze r9 = defpackage.bzd.a(r13)
            dpt r8 = new dpt
            r10 = 1
            r8.<init>(r13, r10)
            dhj r11 = new dhj
            hhl r6 = defpackage.dho.c
            hhl r7 = defpackage.dho.d
            r1 = r11
            r2 = r9
            r3 = r13
            r4 = r0
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14 = 2
            hhl[] r14 = new defpackage.hhl[r14]
            r1 = 0
            hhl r2 = r11.c
            r14[r1] = r2
            hhl r1 = r11.d
            r14[r10] = r1
            defpackage.hhq.p(r11, r14)
            irt r14 = r11.f
            gyc r1 = defpackage.gyc.b
            r14.e(r1)
            hhl r14 = defpackage.dho.a
            java.lang.Object r14 = r14.c()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            ltg r1 = defpackage.dhq.a
            ltv r1 = r1.b()
            ltd r1 = (defpackage.ltd) r1
            r2 = 47
            java.lang.String r3 = "HandwritingSuperpacksManagerBase.java"
            java.lang.String r4 = "com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacksManagerBase"
            java.lang.String r5 = "isPreloadingEnabled"
            ltv r1 = r1.k(r4, r5, r2, r3)
            ltd r1 = (defpackage.ltd) r1
            java.lang.String r2 = "isPreloadingEnabled = %b"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r14)
            r1.w(r2, r3)
            if (r14 == 0) goto L67
            dhe r14 = new dhe
            r14.<init>(r9, r13, r0)
            goto L68
        L67:
            r14 = 0
        L68:
            r12.<init>(r11, r14)
            dhj r13 = r12.c
            r13.e()
            dhe r13 = r12.d
            if (r13 == 0) goto L77
            r13.e()
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhp.<init>(android.content.Context, dhd):void");
    }

    public static dhp a(Context context) {
        dhp dhpVar = b;
        if (dhpVar == null) {
            synchronized (dhp.class) {
                dhpVar = b;
                if (dhpVar == null) {
                    dhpVar = new dhp(context.getApplicationContext(), dhd.a);
                    b = dhpVar;
                }
            }
        }
        return dhpVar;
    }
}
