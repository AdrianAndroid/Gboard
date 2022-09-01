package defpackage;

import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* renamed from: kol  reason: default package */
/* loaded from: classes.dex */
public final class kol extends kpf {
    private final List a;

    public kol(OutputStream outputStream, List list) {
        super(outputStream);
        this.a = list;
        kqn.d(true, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (kpw kpwVar : this.a) {
            try {
                kpwVar.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        for (kpw kpwVar : this.a) {
            kpwVar.a(1);
        }
    }

    @Override // defpackage.kpf, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.out.write(bArr);
        for (kpw kpwVar : this.a) {
            kpwVar.a(bArr.length);
        }
    }

    @Override // defpackage.kpf, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        for (kpw kpwVar : this.a) {
            kpwVar.a(i2);
        }
    }
}
