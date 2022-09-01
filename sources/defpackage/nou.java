package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: nou  reason: default package */
/* loaded from: classes2.dex */
final class nou extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ now a;
    private int b;
    private int c;

    public nou(now nowVar, not notVar) {
        this.a = nowVar;
        this.b = nowVar.b(notVar.b + 4);
        this.c = notVar.c;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.c == 0) {
            return -1;
        }
        this.a.a.seek(this.b);
        int read = this.a.a.read();
        this.b = this.a.b(this.b + 1);
        this.c--;
        return read;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        this.a.e(this.b, bArr, i, i2);
        this.b = this.a.b(this.b + i2);
        this.c -= i2;
        return i2;
    }
}
