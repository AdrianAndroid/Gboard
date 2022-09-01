package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fdi  reason: default package */
/* loaded from: classes.dex */
public final class fdi extends nob implements AutoCloseable {
    public final boolean a;
    public int c;
    private final int e = 256000;
    public final List b = new ArrayList();

    public fdi(boolean z) {
        this.a = z;
    }

    @Override // defpackage.nob, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (this.a && read > 0) {
            byte[] bArr2 = new byte[read];
            System.arraycopy(bArr, i, bArr2, 0, read);
            synchronized (this.b) {
                while (this.c >= this.e) {
                    this.c -= ((byte[]) this.b.remove(0)).length;
                }
                this.b.add(bArr2);
                this.c += read;
            }
        }
        return read;
    }
}
