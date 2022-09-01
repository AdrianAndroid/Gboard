package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: blz  reason: default package */
/* loaded from: classes.dex */
final class blz extends InputStream implements InputStreamRetargetInterface {
    private final byte[] a = new byte[1];
    private final odv b;

    public blz(blw blwVar) {
        this.b = new odv(blwVar);
    }

    @Override // java.io.InputStream
    public final int available() {
        odv odvVar = this.b;
        if (!odvVar.b) {
            Object obj = odvVar.c;
            if (obj != null) {
                return ((blj) obj).a();
            }
            return 0;
        }
        throw new blb(262191);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, blw] */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        odv odvVar = this.b;
        if (odvVar.b) {
            return;
        }
        Object obj = odvVar.c;
        if (obj != null) {
            ((blj) obj).b();
            odvVar.c = null;
        }
        odvVar.a.c();
        odvVar.b = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.a, 0, 1) == 1) {
            return this.a[0] & 255;
        }
        return -1;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, blw] */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            odv r0 = r4.b
            boolean r1 = r0.b
            if (r1 != 0) goto L9d
            java.lang.Object r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L26
            blj r1 = (defpackage.blj) r1
            int r3 = r1.c
            if (r3 != r2) goto L23
            int r1 = r1.a()
            if (r1 <= 0) goto L18
            goto L23
        L18:
            java.lang.Object r1 = r0.c
            blj r1 = (defpackage.blj) r1
            r1.b()
            r1 = 0
            r0.c = r1
            goto L26
        L23:
            java.lang.Object r0 = r0.c
            goto L36
        L26:
            java.lang.Object r1 = r0.a     // Catch: java.util.concurrent.ExecutionException -> L82 java.lang.InterruptedException -> L93
            mko r1 = r1.b()     // Catch: java.util.concurrent.ExecutionException -> L82 java.lang.InterruptedException -> L93
            java.lang.Object r1 = defpackage.bvq.g(r1)     // Catch: java.util.concurrent.ExecutionException -> L82 java.lang.InterruptedException -> L93
            blj r1 = (defpackage.blj) r1     // Catch: java.util.concurrent.ExecutionException -> L82 java.lang.InterruptedException -> L93
            r0.c = r1     // Catch: java.util.concurrent.ExecutionException -> L82 java.lang.InterruptedException -> L93
            java.lang.Object r0 = r0.c
        L36:
            r1 = r0
            blj r1 = (defpackage.blj) r1
            int r3 = r1.c
            if (r3 == r2) goto L5c
            r5 = 2
            if (r3 == r5) goto L59
            r5 = 3
            if (r3 != r5) goto L45
            r5 = -1
            goto L7e
        L45:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unexpected chunk type: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            blb r5 = r1.e
            throw r5
        L5c:
            java.lang.Object r1 = r1.b
            monitor-enter(r1)
            r3 = r0
            blj r3 = (defpackage.blj) r3     // Catch: java.lang.Throwable -> L7f
            java.nio.ByteBuffer r3 = r3.d     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L67
            goto L68
        L67:
            r2 = 0
        L68:
            java.lang.String r3 = "Chunk already released."
            defpackage.jdg.G(r2, r3)     // Catch: java.lang.Throwable -> L7f
            blj r0 = (defpackage.blj) r0     // Catch: java.lang.Throwable -> L7f
            java.nio.ByteBuffer r0 = r0.d     // Catch: java.lang.Throwable -> L7f
            int r2 = r0.remaining()     // Catch: java.lang.Throwable -> L7f
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L7f
            r0.get(r5, r6, r7)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            r5 = r7
        L7e:
            return r5
        L7f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            throw r5
        L82:
            r5 = move-exception
            java.lang.Throwable r6 = r5.getCause()
            if (r6 == 0) goto L8a
            r5 = r6
        L8a:
            defpackage.lgf.f(r5)
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L93:
            r5 = move-exception
            blb r6 = new blb
            r7 = 262192(0x40030, float:3.67409E-40)
            r6.<init>(r5, r7)
            throw r6
        L9d:
            blb r5 = new blb
            r6 = 262191(0x4002f, float:3.67408E-40)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blz.read(byte[], int, int):int");
    }
}
