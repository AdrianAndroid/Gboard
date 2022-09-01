package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: oyh  reason: default package */
/* loaded from: classes2.dex */
public final class oyh extends InputStream implements InputStreamRetargetInterface {
    private DataInputStream a;
    private oyy b;
    private int c = 0;
    private boolean d = false;
    private boolean e = true;
    private boolean f = true;
    private boolean g = false;
    private IOException h = null;
    private final byte[] i = new byte[1];
    private oze j = new oze((byte[]) null);
    private ozc k;

    public oyh(InputStream inputStream, int i) {
        inputStream.getClass();
        this.a = new DataInputStream(inputStream);
        this.b = new oyy(a(i));
    }

    public static int a(int i) {
        if (i < 4096 || i > 2147483632) {
            throw new IllegalArgumentException("Unsupported dictionary size " + i);
        }
        return (i + 15) & (-16);
    }

    private final void b() {
        if (this.b != null) {
            this.b = null;
            Object obj = this.j.d;
            this.j = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        DataInputStream dataInputStream = this.a;
        if (dataInputStream != null) {
            IOException iOException = this.h;
            if (iOException != null) {
                throw iOException;
            }
            return this.d ? this.c : Math.min(this.c, dataInputStream.available());
        }
        throw new oyo("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a != null) {
            b();
            try {
                this.a.close();
            } finally {
                this.a = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.i, 0, 1) == -1) {
            return -1;
        }
        return this.i[0] & 255;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b A[Catch: IOException -> 0x03ad, TryCatch #0 {IOException -> 0x03ad, blocks: (B:21:0x0027, B:23:0x0031, B:25:0x0039, B:26:0x010b, B:36:0x0047, B:41:0x006b, B:43:0x0088, B:45:0x0092, B:47:0x00a1, B:48:0x00c9, B:50:0x00d0, B:52:0x00d6, B:54:0x00ec, B:55:0x00f1, B:57:0x00f2, B:58:0x00f7, B:60:0x00b0, B:61:0x00b5, B:63:0x00b6, B:64:0x00bb, B:65:0x00bc, B:69:0x00c4, B:71:0x00f8, B:72:0x00fd, B:74:0x0100, B:76:0x0113, B:77:0x0118, B:79:0x004c, B:80:0x0051, B:81:0x0052, B:82:0x0119, B:84:0x0123, B:86:0x0140, B:87:0x0369, B:89:0x0375, B:90:0x037a, B:92:0x038d, B:94:0x0398, B:96:0x039c, B:102:0x03a3, B:103:0x03a8, B:108:0x0144, B:110:0x014e, B:111:0x0154, B:115:0x0162, B:117:0x016a, B:119:0x017f, B:122:0x01ab, B:126:0x01e7, B:128:0x01fc, B:129:0x01fe, B:131:0x0204, B:137:0x0213, B:138:0x0218, B:139:0x01bd, B:140:0x01ca, B:145:0x0220, B:147:0x0230, B:150:0x0239, B:152:0x0259, B:153:0x025b, B:155:0x0264, B:158:0x0351, B:160:0x026a, B:162:0x027c, B:163:0x028d, B:164:0x0292, B:167:0x02b0, B:169:0x02c7, B:171:0x02d8, B:173:0x02e8, B:176:0x02f3, B:179:0x0341, B:182:0x0349, B:183:0x02fc, B:185:0x030a, B:186:0x0338, B:187:0x0312, B:189:0x0320, B:190:0x0331, B:191:0x0327, B:193:0x0364, B:194:0x015d, B:195:0x0151), top: B:20:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Type inference failed for: r13v19, types: [oyy] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v46 */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyh.read(byte[], int, int):int");
    }
}
