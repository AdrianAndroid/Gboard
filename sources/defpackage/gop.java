package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: gop  reason: default package */
/* loaded from: classes.dex */
final class gop extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ gor a;

    public gop(gor gorVar) {
        this.a = gorVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ltg.b.l(lub.FULL);
        this.a.b(0);
        gor gorVar = this.a;
        try {
            gorVar.b.close();
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) gor.a.c()).i(e)).k("com/google/android/libraries/gsa/s3/lib/Tee", "close", (char) 466, "Tee.java")).t("IOException closing audio track");
        }
        synchronized (gorVar) {
            gorVar.j = true;
            gorVar.notifyAll();
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

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c9, code lost:
        if (r6 != r10) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00cb, code lost:
        r7 = r2.g.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
        if (r6 >= r7) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d0, code lost:
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d7, code lost:
        if ((r7 - r11) < r2.c) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00da, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00db, code lost:
        defpackage.jdg.v(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00de, code lost:
        r7 = defpackage.lyp.a(r2.b, r2.g, r11, r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e8, code lost:
        r6 = r6 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0103, code lost:
        r6 = r6 - r10;
        r9 = r0 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0106, code lost:
        if (r6 < r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0108, code lost:
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00eb, code lost:
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ec, code lost:
        r2.k = new defpackage.blb(r0, 393237);
        r2.notifyAll();
        r0 = r2.k;
        defpackage.jdg.u(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00fe, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00d2, code lost:
        r11 = r6 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0102, code lost:
        r7 = -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gop.read(byte[], int, int):int");
    }
}
