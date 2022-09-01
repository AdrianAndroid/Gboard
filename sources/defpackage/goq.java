package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: goq  reason: default package */
/* loaded from: classes.dex */
final class goq extends InputStream implements InputStreamRetargetInterface {
    private gor a;
    private final int b;

    public goq(gor gorVar, int i) {
        this.a = gorVar;
        this.b = i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        gor gorVar = this.a;
        if (gorVar != null) {
            gorVar.b(this.b);
            this.a = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002d, code lost:
        r4 = r4 - r6;
        r5 = r11 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0030, code lost:
        if (r4 < r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0032, code lost:
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0035, code lost:
        r0.a(r6, r9, r10 + r3, r4);
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int read(byte[] r9, int r10, int r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            gor r0 = r8.a     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L71
            int r1 = r8.b     // Catch: java.lang.Throwable -> L7c
            r2 = 0
            r3 = 0
            r4 = 0
        La:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L7c
            int[] r5 = r0.l     // Catch: java.lang.Throwable -> L6e
            r5 = r5[r1]     // Catch: java.lang.Throwable -> L6e
        Lf:
            blb r5 = r0.k     // Catch: java.lang.Throwable -> L6e
            if (r5 != 0) goto L6d
            int[] r5 = r0.l     // Catch: java.lang.Throwable -> L6e
            r6 = r5[r1]     // Catch: java.lang.Throwable -> L6e
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != r7) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            r11 = 0
            goto L40
        L1f:
            if (r4 == 0) goto L24
            int r6 = r6 + r4
            r5[r1] = r6     // Catch: java.lang.Throwable -> L6e
        L24:
            if (r3 != r11) goto L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            goto L40
        L28:
            int r4 = r0.i     // Catch: java.lang.Throwable -> L6e
            if (r4 == r6) goto L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            int r4 = r4 - r6
            int r5 = r11 - r3
            if (r4 < r5) goto L33
            r4 = r5
        L33:
            int r5 = r10 + r3
            r0.a(r6, r9, r5, r4)     // Catch: java.lang.Throwable -> L7c
            int r3 = r3 + r4
            goto La
        L3a:
            boolean r4 = r0.j     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            r11 = r3
        L40:
            monitor-exit(r8)
            if (r11 != 0) goto L45
            r9 = -1
            return r9
        L45:
            return r11
        L46:
            r0.wait()     // Catch: java.lang.InterruptedException -> L4b java.lang.Throwable -> L6e
            r4 = 0
            goto Lf
        L4b:
            r9 = move-exception
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L6e
            r10.interrupt()     // Catch: java.lang.Throwable -> L6e
            blb r10 = new blb     // Catch: java.lang.Throwable -> L6e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r11.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "Interrupted waiting for buffers: "
            r11.append(r2)     // Catch: java.lang.Throwable -> L6e
            r11.append(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L6e
            r1 = 393236(0x60014, float:5.51041E-40)
            r10.<init>(r11, r9, r1)     // Catch: java.lang.Throwable -> L6e
            throw r10     // Catch: java.lang.Throwable -> L6e
        L6d:
            throw r5     // Catch: java.lang.Throwable -> L6e
        L6e:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r9     // Catch: java.lang.Throwable -> L7c
        L71:
            blb r9 = new blb     // Catch: java.lang.Throwable -> L7c
            java.lang.String r10 = "Secondary Tee stream closed."
            r11 = 393239(0x60017, float:5.51045E-40)
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L7c
            throw r9     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            monitor-exit(r8)
            goto L80
        L7f:
            throw r9
        L80:
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goq.read(byte[], int, int):int");
    }
}
