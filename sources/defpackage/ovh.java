package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ovh  reason: default package */
/* loaded from: classes2.dex */
public final class ovh implements ous {
    public final ovn a;
    public final our b = new our();
    public boolean c;

    public ovh(ovn ovnVar) {
        oll.e(ovnVar, "sink");
        this.a = ovnVar;
    }

    @Override // defpackage.ous
    public final void T() {
        if (!this.c) {
            long g = this.b.g();
            if (g <= 0) {
                return;
            }
            this.a.ik(this.b, g);
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ovn
    public final ovr a() {
        return this.a.a();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ovn
    public final void close() {
        Throwable th;
        if (!this.c) {
            try {
                our ourVar = this.b;
                long j = ourVar.b;
                th = null;
                if (j > 0) {
                    this.a.ik(ourVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // defpackage.ous, defpackage.ovn, java.io.Flushable
    public final void flush() {
        if (!this.c) {
            our ourVar = this.b;
            long j = ourVar.b;
            if (j > 0) {
                this.a.ik(ourVar, j);
            }
            this.a.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final String toString() {
        ovn ovnVar = this.a;
        return "buffer(" + ovnVar + ")";
    }

    @Override // defpackage.ous
    public final void J(byte[] bArr) {
        oll.e(bArr, "source");
        if (!this.c) {
            this.b.U(bArr);
            T();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ous
    public final void L(byte[] bArr, int i, int i2) {
        oll.e(bArr, "source");
        if (!this.c) {
            this.b.L(bArr, i, i2);
            T();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ous
    public final void P(int i) {
        if (!this.c) {
            this.b.O(i);
            T();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ous
    public final void X(int i) {
        if (!this.c) {
            this.b.N(i);
            T();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ous
    public final void Z(long j) {
        if (!this.c) {
            this.b.Y(j);
            T();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ous
    public final void aa(String str) {
        oll.e(str, "string");
        if (!this.c) {
            this.b.W(str);
            T();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ovn
    public final void ik(our ourVar, long j) {
        oll.e(ourVar, "source");
        if (!this.c) {
            this.b.ik(ourVar, j);
            T();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        oll.e(byteBuffer, "source");
        if (!this.c) {
            int write = this.b.write(byteBuffer);
            T();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ous
    public final void Q(int i) {
        if (!this.c) {
            our ourVar = this.b;
            ovk v = ourVar.v(2);
            byte[] bArr = v.a;
            int i2 = v.c;
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >>> 8) & 255);
            bArr[i3] = (byte) (i & 255);
            v.c = i3 + 1;
            ourVar.b += 2;
            T();
            return;
        }
        throw new IllegalStateException("closed");
    }
}
