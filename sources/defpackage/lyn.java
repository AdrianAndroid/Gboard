package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: lyn  reason: default package */
/* loaded from: classes.dex */
final class lyn extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        jdg.u(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        jdg.u(bArr);
        jdg.E(i, i2 + i, bArr.length);
    }
}
