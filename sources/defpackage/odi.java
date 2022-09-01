package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: PG */
/* renamed from: odi  reason: default package */
/* loaded from: classes2.dex */
final class odi extends nxs {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public odi(byte[] bArr, int i, int i2) {
        boolean z = true;
        jdg.w(i >= 0, "offset must be >= 0");
        jdg.w(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        jdg.w(i3 > 0 ? false : z, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.nxs, defpackage.odg
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.nxs, defpackage.odg
    public final void c() {
        int i = this.d;
        if (i != -1) {
            this.a = i;
            return;
        }
        throw new InvalidMarkException();
    }

    @Override // defpackage.nxs, defpackage.odg
    public final boolean d() {
        return true;
    }

    @Override // defpackage.odg
    public final int e() {
        a(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    @Override // defpackage.odg
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.odg
    public final /* bridge */ /* synthetic */ odg g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new odi(this.c, i2, i);
    }

    @Override // defpackage.odg
    public final void i(ByteBuffer byteBuffer) {
        jdg.Q(byteBuffer, "dest");
        int remaining = byteBuffer.remaining();
        a(remaining);
        byteBuffer.put(this.c, this.a, remaining);
        this.a += remaining;
    }

    @Override // defpackage.odg
    public final void j(OutputStream outputStream, int i) {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.odg
    public final void k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.odg
    public final void l(int i) {
        a(i);
        this.a += i;
    }
}
