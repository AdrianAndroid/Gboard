package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: oyp  reason: default package */
/* loaded from: classes2.dex */
public final class oyp extends InputStream implements InputStreamRetargetInterface {
    private final oxv a;
    private InputStream c;
    private oyk d;
    private boolean f = false;
    private IOException g = null;
    private final byte[] h = new byte[1];
    private final int b = -1;
    private final boolean e = true;

    public oyp(InputStream inputStream) {
        oxv oxvVar = oxv.a;
        this.a = oxvVar;
        this.c = inputStream;
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        this.d = new oyk(inputStream, -1, true, bArr, oxvVar);
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.c != null) {
            IOException iOException = this.g;
            if (iOException == null) {
                oyk oykVar = this.d;
                if (oykVar != null) {
                    return oykVar.available();
                }
                return 0;
            }
            throw iOException;
        }
        throw new oyo("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c != null) {
            oyk oykVar = this.d;
            if (oykVar != null) {
                oykVar.a(false);
                this.d = null;
            }
            try {
                this.c.close();
            } finally {
                this.c = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.h, 0, 1) == -1) {
            return -1;
        }
        return this.h[0] & 255;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0038 A[Catch: IOException -> 0x0085, TryCatch #0 {IOException -> 0x0085, blocks: (B:20:0x001f, B:22:0x0023, B:23:0x002e, B:51:0x0035, B:37:0x0063, B:25:0x0038, B:27:0x0040, B:29:0x0044, B:31:0x0049, B:34:0x004d, B:36:0x0053, B:44:0x006b, B:45:0x0072, B:52:0x0073, B:62:0x007b, B:57:0x0081), top: B:19:0x001f, inners: #1 }] */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            if (r13 < 0) goto L97
            if (r14 < 0) goto L97
            int r0 = r13 + r14
            if (r0 < 0) goto L97
            int r1 = r12.length
            if (r0 > r1) goto L97
            r0 = 0
            if (r14 != 0) goto Lf
            return r0
        Lf:
            java.io.InputStream r1 = r11.c
            if (r1 == 0) goto L8f
            java.io.IOException r1 = r11.g
            if (r1 != 0) goto L8e
            boolean r1 = r11.f
            r2 = -1
            if (r1 != 0) goto L8d
            r1 = 0
        L1d:
            if (r14 <= 0) goto L8c
            oyk r3 = r11.d     // Catch: java.io.IOException -> L85
            if (r3 != 0) goto L73
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.io.IOException -> L85
            java.io.InputStream r4 = r11.c     // Catch: java.io.IOException -> L85
            r3.<init>(r4)     // Catch: java.io.IOException -> L85
            r4 = 12
            byte[] r9 = new byte[r4]     // Catch: java.io.IOException -> L85
        L2e:
            r4 = 1
            int r5 = r3.read(r9, r0, r4)     // Catch: java.io.IOException -> L85
            if (r5 != r2) goto L38
            r11.f = r4     // Catch: java.io.IOException -> L85
            goto L63
        L38:
            r5 = 3
            r3.readFully(r9, r4, r5)     // Catch: java.io.IOException -> L85
            r6 = r9[r0]     // Catch: java.io.IOException -> L85
            if (r6 != 0) goto L4d
            r4 = r9[r4]     // Catch: java.io.IOException -> L85
            if (r4 != 0) goto L4d
            r4 = 2
            r4 = r9[r4]     // Catch: java.io.IOException -> L85
            if (r4 != 0) goto L4d
            r4 = r9[r5]     // Catch: java.io.IOException -> L85
            if (r4 == 0) goto L2e
        L4d:
            r4 = 4
            r5 = 8
            r3.readFully(r9, r4, r5)     // Catch: java.io.IOException -> L85
            oyk r3 = new oyk     // Catch: defpackage.oyn -> L6b java.io.IOException -> L85
            java.io.InputStream r6 = r11.c     // Catch: defpackage.oyn -> L6b java.io.IOException -> L85
            int r7 = r11.b     // Catch: defpackage.oyn -> L6b java.io.IOException -> L85
            boolean r8 = r11.e     // Catch: defpackage.oyn -> L6b java.io.IOException -> L85
            oxv r10 = r11.a     // Catch: defpackage.oyn -> L6b java.io.IOException -> L85
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: defpackage.oyn -> L6b java.io.IOException -> L85
            r11.d = r3     // Catch: defpackage.oyn -> L6b java.io.IOException -> L85
        L63:
            boolean r3 = r11.f     // Catch: java.io.IOException -> L85
            if (r3 == 0) goto L73
            if (r1 != 0) goto L6a
            return r2
        L6a:
            return r1
        L6b:
            oxz r12 = new oxz     // Catch: java.io.IOException -> L85
            java.lang.String r13 = "Garbage after a valid XZ Stream"
            r12.<init>(r13)     // Catch: java.io.IOException -> L85
            throw r12     // Catch: java.io.IOException -> L85
        L73:
            oyk r3 = r11.d     // Catch: java.io.IOException -> L85
            int r3 = r3.read(r12, r13, r14)     // Catch: java.io.IOException -> L85
            if (r3 <= 0) goto L7f
            int r1 = r1 + r3
            int r13 = r13 + r3
            int r14 = r14 - r3
            goto L1d
        L7f:
            if (r3 != r2) goto L1d
            r3 = 0
            r11.d = r3     // Catch: java.io.IOException -> L85
            goto L1d
        L85:
            r12 = move-exception
            r11.g = r12
            if (r1 == 0) goto L8b
            goto L8c
        L8b:
            throw r12
        L8c:
            return r1
        L8d:
            return r2
        L8e:
            throw r1
        L8f:
            oyo r12 = new oyo
            java.lang.String r13 = "Stream closed"
            r12.<init>(r13)
            throw r12
        L97:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException
            r12.<init>()
            goto L9e
        L9d:
            throw r12
        L9e:
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyp.read(byte[], int, int):int");
    }
}
