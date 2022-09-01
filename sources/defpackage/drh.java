package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: drh  reason: default package */
/* loaded from: classes.dex */
public final class drh extends hqq {
    final /* synthetic */ dri a;

    public drh(dri driVar) {
        this.a = driVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        r1 = r1.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [gyg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [gyg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [gyg, java.lang.Object] */
    @Override // defpackage.hqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.llp r8) {
        /*
            r7 = this;
            dri r0 = r7.a
            java.util.Iterator r8 = r8.iterator()
        L6:
            boolean r1 = r8.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L51
            java.lang.Object r1 = r8.next()
            hqt r1 = (defpackage.hqt) r1
            if (r1 == 0) goto L6
            iav r1 = r1.g()
            if (r1 == 0) goto L6
            java.lang.Class<com.google.android.apps.inputmethod.libs.mozc.ime.SimpleJapaneseIme> r4 = com.google.android.apps.inputmethod.libs.mozc.ime.SimpleJapaneseIme.class
            java.lang.String r5 = r1.c     // Catch: java.lang.Throwable -> L2c
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r4.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L6
            r8 = 1
            goto L52
        L2c:
            r2 = move-exception
            lug r3 = defpackage.dri.a
            ltv r3 = r3.c()
            luc r3 = (defpackage.luc) r3
            ltv r2 = r3.i(r2)
            luc r2 = (defpackage.luc) r2
            r3 = 226(0xe2, float:3.17E-43)
            java.lang.String r4 = "MozcInputMethodEntryActivationContentObserver.java"
            java.lang.String r5 = "com/google/android/apps/inputmethod/libs/mozc/ime/MozcInputMethodEntryActivationContentObserver"
            java.lang.String r6 = "isSimpleJapaneseImeEnabled"
            ltv r2 = r2.k(r5, r6, r3, r4)
            luc r2 = (defpackage.luc) r2
            java.lang.String r3 = "The Japanese ime class %s is not found!"
            java.lang.String r1 = r1.c
            r2.w(r3, r1)
            goto L6
        L51:
            r8 = 0
        L52:
            boolean r1 = r0.g
            if (r1 != r8) goto L58
            goto Ld3
        L58:
            r0.g = r8
            if (r8 == 0) goto Ld4
            hhl r8 = defpackage.dqq.f
            java.lang.Object r8 = r8.c()
            java.lang.String r8 = (java.lang.String) r8
            hhl r1 = defpackage.dqq.e
            java.lang.Object r1 = r1.c()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            android.content.Context r4 = r0.b
            drg r5 = new drg
            r5.<init>(r0, r3)
            java.lang.String r3 = "mozcdata"
            defpackage.drp.d(r4, r8, r1, r3, r5)
            hhl r8 = defpackage.dqq.h
            java.lang.Object r8 = r8.c()
            java.lang.String r8 = (java.lang.String) r8
            hhl r1 = defpackage.dqq.g
            java.lang.Object r1 = r1.c()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto La5
            if (r1 == 0) goto La5
            android.content.Context r3 = r0.b
            drg r4 = new drg
            r5 = 2
            r4.<init>(r0, r5)
            java.lang.String r5 = "mozcspellcheckerdata"
            defpackage.drp.d(r3, r8, r1, r5, r4)
        La5:
            lgb r8 = r0.c
            java.lang.Object r8 = r8.a()
            r1 = r8
            drj r1 = (defpackage.drj) r1
            ikj r1 = r1.b
            r1.s(r8)
            boolean r8 = r0.e
            if (r8 != 0) goto Ld3
            lgb r8 = r0.d
            java.lang.Object r8 = r8.a()
            r1 = r8
            dre r1 = (defpackage.dre) r1
            gyk r1 = r1.b
            r1.s(r8)
            r0.e = r2
            android.content.Context r8 = r0.b
            ino r8 = defpackage.ino.M(r8)
            r1 = 2132018867(0x7f1406b3, float:1.9676053E38)
            r8.X(r0, r1)
        Ld3:
            return
        Ld4:
            lgb r8 = r0.c
            java.lang.Object r8 = r8.a()
            r1 = r8
            drj r1 = (defpackage.drj) r1
            ikj r1 = r1.b
            r1.u(r8)
            r0.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drh.a(llp):void");
    }
}
