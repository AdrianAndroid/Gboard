package defpackage;

/* compiled from: PG */
/* renamed from: mlb  reason: default package */
/* loaded from: classes.dex */
final class mlb implements Runnable {
    Runnable a;
    final /* synthetic */ mlc b;

    public mlb(mlc mlcVar) {
        this.b = mlcVar;
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
        int i = this.b.d;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE"));
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        r2 = r2 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        r10.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        r10.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        defpackage.mlc.a.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + r10.a, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        r10.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0038, code lost:
        if (r2 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003a, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 0
        L3:
            mlc r3 = r10.b     // Catch: java.lang.Throwable -> L52
            java.util.Deque r3 = r3.b     // Catch: java.lang.Throwable -> L52
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L25
            mlc r1 = r10.b     // Catch: java.lang.Throwable -> L7c
            int r4 = r1.d     // Catch: java.lang.Throwable -> L7c
            r5 = 4
            if (r4 != r5) goto L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L41
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L89
            r1.interrupt()     // Catch: java.lang.Error -> L89
            return
        L1c:
            long r6 = r1.c     // Catch: java.lang.Throwable -> L7c
            r8 = 1
            long r6 = r6 + r8
            r1.c = r6     // Catch: java.lang.Throwable -> L7c
            r1.d = r5     // Catch: java.lang.Throwable -> L7c
        L25:
            mlc r1 = r10.b     // Catch: java.lang.Throwable -> L7c
            java.util.Deque r1 = r1.b     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L7c
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L7c
            r10.a = r1     // Catch: java.lang.Throwable -> L7c
            if (r1 != 0) goto L42
            mlc r1 = r10.b     // Catch: java.lang.Throwable -> L7c
            r1.d = r0     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L41
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L89
            r1.interrupt()     // Catch: java.lang.Error -> L89
        L41:
            return
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            boolean r1 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L52
            r2 = r2 | r1
            r1 = 0
            java.lang.Runnable r3 = r10.a     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L56
            r3.run()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L56
            r10.a = r1     // Catch: java.lang.Throwable -> L52
        L50:
            r1 = 1
            goto L3
        L52:
            r1 = move-exception
            goto L7f
        L54:
            r3 = move-exception
            goto L79
        L56:
            r3 = move-exception
            r9 = r3
            java.util.logging.Logger r4 = defpackage.mlc.a     // Catch: java.lang.Throwable -> L54
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r3.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = "Exception while executing runnable "
            r3.append(r6)     // Catch: java.lang.Throwable -> L54
            java.lang.Runnable r6 = r10.a     // Catch: java.lang.Throwable -> L54
            r3.append(r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r7 = "workOnQueue"
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L54
            r4.logp(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L54
            r10.a = r1     // Catch: java.lang.Throwable -> L52
            goto L50
        L79:
            r10.a = r1     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L52
        L7c:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            throw r1     // Catch: java.lang.Throwable -> L52
        L7f:
            if (r2 == 0) goto L88
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L89
            r2.interrupt()     // Catch: java.lang.Error -> L89
        L88:
            throw r1     // Catch: java.lang.Error -> L89
        L89:
            r1 = move-exception
            mlc r2 = r10.b
            java.util.Deque r2 = r2.b
            monitor-enter(r2)
            mlc r3 = r10.b     // Catch: java.lang.Throwable -> L95
            r3.d = r0     // Catch: java.lang.Throwable -> L95
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L95
            throw r1
        L95:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L95
            goto L99
        L98:
            throw r0
        L99:
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlb.run():void");
    }
}
