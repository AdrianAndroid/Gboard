package defpackage;

/* compiled from: PG */
/* renamed from: bxa  reason: default package */
/* loaded from: classes.dex */
final class bxa extends hqi {
    final /* synthetic */ bxb a;

    public bxa(bxb bxbVar) {
        this.a = bxbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r8.b == defpackage.hqe.OTHER) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        r1 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
        if (r8.b == defpackage.hqe.OTHER) goto L22;
     */
    @Override // defpackage.hqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.hpy r8) {
        /*
            r7 = this;
            bxb r0 = r7.a
            int r1 = r0.d
            boolean r2 = r8.h()
            r3 = 1
            if (r2 != 0) goto Ld
        Lb:
            r1 = 1
            goto L49
        Ld:
            boolean r2 = r8.e()
            if (r2 == 0) goto L15
            r1 = 3
            goto L49
        L15:
            boolean r2 = r8.f()
            if (r2 == 0) goto L1d
            r1 = 4
            goto L49
        L1d:
            boolean r2 = r8.g()
            if (r2 != 0) goto L25
            r1 = 5
            goto L49
        L25:
            int r2 = r1 + (-1)
            if (r1 == 0) goto L4d
            r4 = 7
            r5 = 6
            r6 = 2
            switch(r2) {
                case 0: goto L48;
                case 1: goto L49;
                case 2: goto L3a;
                case 3: goto L48;
                case 4: goto L3a;
                case 5: goto L49;
                case 6: goto L30;
                default: goto L2f;
            }
        L2f:
            goto Lb
        L30:
            hqe r1 = r8.b
            hqe r2 = defpackage.hqe.OTHER
            if (r1 != r2) goto L38
        L36:
            r1 = 7
            goto L49
        L38:
            r1 = 6
            goto L49
        L3a:
            hqe r1 = r8.b
            hqe r2 = defpackage.hqe.IME
            if (r1 != r2) goto L41
            goto L48
        L41:
            hqe r1 = r8.b
            hqe r2 = defpackage.hqe.OTHER
            if (r1 != r2) goto L38
            goto L36
        L48:
            r1 = 2
        L49:
            r0.a(r1, r8)
            return
        L4d:
            r8 = 0
            goto L50
        L4f:
            throw r8
        L50:
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxa.a(hpy):void");
    }

    @Override // defpackage.hqi
    public final void c() {
        bxb bxbVar = this.a;
        int i = bxbVar.d;
        int i2 = 7;
        if (i != 7 && i != 5 && i != 3) {
            i2 = 1;
        }
        bxbVar.a(i2, null);
    }
}
