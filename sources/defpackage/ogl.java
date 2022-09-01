package defpackage;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ogl  reason: default package */
/* loaded from: classes2.dex */
public final class ogl extends nxs {
    private final our a;

    public ogl(our ourVar) {
        this.a = ourVar;
    }

    @Override // defpackage.nxs, defpackage.odg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.y();
    }

    @Override // defpackage.odg
    public final int e() {
        try {
            return this.a.d() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // defpackage.odg
    public final int f() {
        return (int) this.a.b;
    }

    @Override // defpackage.odg
    public final odg g(int i) {
        our ourVar = new our();
        ourVar.ik(this.a, i);
        return new ogl(ourVar);
    }

    @Override // defpackage.odg
    public final void i(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.odg
    public final void j(OutputStream outputStream, int i) {
        our ourVar = this.a;
        long j = i;
        oll.e(outputStream, "out");
        oli.f(ourVar.b, 0L, j);
        ovk ovkVar = ourVar.a;
        while (j > 0) {
            oll.b(ovkVar);
            int min = (int) Math.min(j, ovkVar.c - ovkVar.b);
            outputStream.write(ovkVar.a, ovkVar.b, min);
            int i2 = ovkVar.b + min;
            ovkVar.b = i2;
            long j2 = min;
            ourVar.b -= j2;
            j -= j2;
            if (i2 == ovkVar.c) {
                ovk a = ovkVar.a();
                ourVar.a = a;
                ovl.b(ovkVar);
                ovkVar = a;
            }
        }
    }

    @Override // defpackage.odg
    public final void k(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int e = this.a.e(bArr, i, i2);
            if (e == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i2 + " bytes");
            }
            i2 -= e;
            i += e;
        }
    }

    @Override // defpackage.odg
    public final void l(int i) {
        try {
            this.a.B(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
