package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oum  reason: default package */
/* loaded from: classes2.dex */
public final class oum extends Thread {
    public oum() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
        L0:
            java.lang.Class<oup> r0 = defpackage.oup.class
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
            oup r1 = defpackage.oup.d     // Catch: java.lang.Throwable -> L6a
            defpackage.oll.b(r1)     // Catch: java.lang.Throwable -> L6a
            oup r1 = r1.f     // Catch: java.lang.Throwable -> L6a
            r2 = 0
            if (r1 != 0) goto L2f
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6a
            java.lang.Class<oup> r1 = defpackage.oup.class
            long r5 = defpackage.oup.b     // Catch: java.lang.Throwable -> L6a
            r1.wait(r5)     // Catch: java.lang.Throwable -> L6a
            oup r1 = defpackage.oup.d     // Catch: java.lang.Throwable -> L6a
            defpackage.oll.b(r1)     // Catch: java.lang.Throwable -> L6a
            oup r1 = r1.f     // Catch: java.lang.Throwable -> L6a
            if (r1 != 0) goto L4e
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6a
            long r5 = r5 - r3
            long r3 = defpackage.oup.c     // Catch: java.lang.Throwable -> L6a
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 < 0) goto L4e
            oup r1 = defpackage.oup.d     // Catch: java.lang.Throwable -> L6a
            goto L5b
        L2f:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6a
            long r3 = r1.c(r3)     // Catch: java.lang.Throwable -> L6a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L50
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r3 / r5
            java.lang.Long.signum(r7)
            long r5 = r5 * r7
            long r3 = r3 - r5
            int r1 = (int) r3
            java.lang.Class<oup> r3 = defpackage.oup.class
            r3.wait(r7, r1)     // Catch: java.lang.Throwable -> L6a
        L4e:
            r1 = r2
            goto L5b
        L50:
            oup r3 = defpackage.oup.d     // Catch: java.lang.Throwable -> L6a
            defpackage.oll.b(r3)     // Catch: java.lang.Throwable -> L6a
            oup r4 = r1.f     // Catch: java.lang.Throwable -> L6a
            r3.f = r4     // Catch: java.lang.Throwable -> L6a
            r1.f = r2     // Catch: java.lang.Throwable -> L6a
        L5b:
            oup r3 = defpackage.oup.d     // Catch: java.lang.Throwable -> L6a
            if (r1 != r3) goto L63
            defpackage.oup.d = r2     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
            return
        L63:
            monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
            if (r1 == 0) goto L0
            r1.a()     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L6a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
            goto L6e
        L6d:
            throw r1
        L6e:
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oum.run():void");
    }
}
