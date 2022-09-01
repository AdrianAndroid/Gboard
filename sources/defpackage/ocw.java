package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ocw  reason: default package */
/* loaded from: classes2.dex */
final class ocw extends OutputStream {
    final /* synthetic */ ocy a;

    public ocw(ocy ocyVar) {
        this.a = ocyVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.d(bArr, i, i2);
    }
}
