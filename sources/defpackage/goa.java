package defpackage;

/* compiled from: PG */
/* renamed from: goa  reason: default package */
/* loaded from: classes.dex */
final class goa extends gnz {
    private final goc b;
    private final mpa c;
    private final String d;
    private final bmc e;
    private final blq f;
    private final gnx g;

    public goa(goc gocVar, mpa mpaVar, String str, bmc bmcVar, blq blqVar, gnx gnxVar) {
        super("PairHttpDown");
        this.b = gocVar;
        this.c = mpaVar;
        this.d = str;
        this.e = bmcVar;
        this.f = blqVar;
        this.g = gnxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x001b, code lost:
        r7.g.b(new defpackage.bna(65548));
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[Catch: all -> 0x004d, TryCatch #5 {all -> 0x004d, blocks: (B:3:0x0002, B:29:0x0052, B:32:0x0094, B:35:0x0081, B:38:0x0089), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(defpackage.blw r8) {
        /*
            r7 = this;
            r0 = 3
            r1 = 0
            gov r2 = new gov     // Catch: java.lang.Throwable -> L4d java.lang.IndexOutOfBoundsException -> L4f java.io.IOException -> L51
            java.io.InputStream r8 = defpackage.bma.a(r8)     // Catch: java.lang.Throwable -> L4d java.lang.IndexOutOfBoundsException -> L4f java.io.IOException -> L51
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L4d java.lang.IndexOutOfBoundsException -> L4f java.io.IOException -> L51
        Lb:
            r7.a()     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            nkt r8 = r2.a()     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            goc r1 = r7.b     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            r3 = 2
            boolean r1 = r1.d(r3)     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            if (r1 != 0) goto L29
            gnx r8 = r7.g     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            bna r1 = new bna     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            r3 = 65548(0x1000c, float:9.1852E-41)
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            r8.b(r1)     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            goto L41
        L29:
            gnx r1 = r7.g     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            r1.d(r8)     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            int r8 = r8.a     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            int r1 = defpackage.ndb.ab(r8)     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            if (r1 != 0) goto L37
            goto L39
        L37:
            if (r1 == r0) goto L41
        L39:
            int r8 = defpackage.ndb.ab(r8)     // Catch: java.lang.Throwable -> L45 java.lang.IndexOutOfBoundsException -> L48 java.io.IOException -> L4a
            if (r8 == 0) goto Lb
            if (r8 != r3) goto Lb
        L41:
            defpackage.lyz.a(r2)
            return
        L45:
            r8 = move-exception
            r1 = r2
            goto La2
        L48:
            r8 = move-exception
            goto L4b
        L4a:
            r8 = move-exception
        L4b:
            r1 = r2
            goto L52
        L4d:
            r8 = move-exception
            goto La2
        L4f:
            r8 = move-exception
            goto L52
        L51:
            r8 = move-exception
        L52:
            r7.a()     // Catch: java.lang.Throwable -> L4d
            ltg r2 = defpackage.goc.a     // Catch: java.lang.Throwable -> L4d
            ltv r2 = r2.d()     // Catch: java.lang.Throwable -> L4d
            ltd r2 = (defpackage.ltd) r2     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = "com/google/android/libraries/gsa/s3/PairHttpConnection$Download"
            java.lang.String r4 = "runDownloadLoop"
            java.lang.String r5 = "PairHttpConnection.java"
            r6 = 867(0x363, float:1.215E-42)
            ltv r2 = r2.k(r3, r4, r6, r5)     // Catch: java.lang.Throwable -> L4d
            ltd r2 = (defpackage.ltd) r2     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = "[Download] exception - exit %s"
            java.lang.String r4 = r8.getMessage()     // Catch: java.lang.Throwable -> L4d
            r2.w(r3, r4)     // Catch: java.lang.Throwable -> L4d
            goc r2 = r7.b     // Catch: java.lang.Throwable -> L4d
            r2.d(r0)     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r8 instanceof java.io.EOFException     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L81
            r0 = 65573(0x10025, float:9.1887E-41)
            goto L94
        L81:
            boolean r0 = r8 instanceof java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L89
            r0 = 65574(0x10026, float:9.1889E-41)
            goto L94
        L89:
            boolean r0 = r8 instanceof defpackage.ngd     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L91
            r0 = 65575(0x10027, float:9.189E-41)
            goto L94
        L91:
            r0 = 65550(0x1000e, float:9.1855E-41)
        L94:
            gnx r2 = r7.g     // Catch: java.lang.Throwable -> L4d
            bna r3 = new bna     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r8, r0)     // Catch: java.lang.Throwable -> L4d
            r2.b(r3)     // Catch: java.lang.Throwable -> L4d
            defpackage.lyz.a(r1)
            return
        La2:
            defpackage.lyz.a(r1)
            goto La7
        La6:
            throw r8
        La7:
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goa.b(blw):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc A[Catch: bna -> 0x00d3, all -> 0x00fa, TRY_ENTER, TRY_LEAVE, TryCatch #7 {bna -> 0x00d3, blocks: (B:15:0x00bc, B:22:0x00d5), top: B:13:0x00ba, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5 A[Catch: bna -> 0x00d3, all -> 0x00fa, TRY_ENTER, TRY_LEAVE, TryCatch #7 {bna -> 0x00d3, blocks: (B:15:0x00bc, B:22:0x00d5), top: B:13:0x00ba, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    @Override // defpackage.gnz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goa.e():void");
    }
}
