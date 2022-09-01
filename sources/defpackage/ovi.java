package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ovi  reason: default package */
/* loaded from: classes2.dex */
public final class ovi extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ovi(our ourVar, int i) {
        this.b = i;
        this.a = ourVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != 0) {
            return;
        }
        ((ovj) this.a).close();
    }

    public ovi(ovj ovjVar, int i) {
        this.b = i;
        this.a = ovjVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        long min;
        if (this.b == 0) {
            ovj ovjVar = (ovj) this.a;
            if (ovjVar.c) {
                throw new IOException("closed");
            }
            min = Math.min(ovjVar.b.b, 2147483647L);
        } else {
            min = Math.min(((our) this.a).b, 2147483647L);
        }
        return (int) min;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return this.b != 0 ? DesugarInputStream.transferTo(this, outputStream) : DesugarInputStream.transferTo(this, outputStream);
    }

    public final String toString() {
        if (this.b == 0) {
            Object obj = this.a;
            new StringBuilder().append(obj);
            return obj.toString().concat(".inputStream()");
        }
        Object obj2 = this.a;
        new StringBuilder().append(obj2);
        return obj2.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream
    public final int read() {
        byte d;
        if (this.b != 0) {
            our ourVar = (our) this.a;
            if (ourVar.b <= 0) {
                return -1;
            }
            d = ourVar.d();
        } else {
            ovj ovjVar = (ovj) this.a;
            if (!ovjVar.c) {
                our ourVar2 = ovjVar.b;
                if (ourVar2.b == 0 && ovjVar.a.b(ourVar2, 8192L) == -1) {
                    return -1;
                }
                d = ((ovj) this.a).b.d();
            } else {
                throw new IOException("closed");
            }
        }
        return d & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.b == 0) {
            oll.e(bArr, "data");
            if (((ovj) this.a).c) {
                throw new IOException("closed");
            }
            oli.f(bArr.length, i, i2);
            ovj ovjVar = (ovj) this.a;
            our ourVar = ovjVar.b;
            if (ourVar.b != 0 || ovjVar.a.b(ourVar, 8192L) != -1) {
                return ((ovj) this.a).b.e(bArr, i, i2);
            }
            return -1;
        }
        oll.e(bArr, "sink");
        return ((our) this.a).e(bArr, i, i2);
    }
}
