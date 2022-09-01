package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: nge  reason: default package */
/* loaded from: classes2.dex */
final class nge extends InputStream implements InputStreamRetargetInterface {
    private Iterator a;
    private ByteBuffer b;
    private int c = 0;
    private int d;
    private int e;
    private boolean f;
    private byte[] g;
    private int h;
    private long i;

    public nge(Iterable iterable) {
        this.a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.c++;
        }
        this.d = -1;
        if (!b()) {
            this.b = ngb.c;
            this.d = 0;
            this.e = 0;
            this.i = 0L;
        }
    }

    private final void a(int i) {
        int i2 = this.e + i;
        this.e = i2;
        if (i2 == this.b.limit()) {
            b();
        }
    }

    private final boolean b() {
        this.d++;
        if (!this.a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.a.next();
        this.b = byteBuffer;
        this.e = byteBuffer.position();
        if (this.b.hasArray()) {
            this.f = true;
            this.g = this.b.array();
            this.h = this.b.arrayOffset();
        } else {
            this.f = false;
            this.i = nih.e(this.b);
            this.g = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte a;
        if (this.d == this.c) {
            return -1;
        }
        if (this.f) {
            a = this.g[this.e + this.h];
            a(1);
        } else {
            a = nih.a(this.e + this.i);
            a(1);
        }
        return a & 255;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.d == this.c) {
            return -1;
        }
        int limit = this.b.limit();
        int i3 = this.e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f) {
            System.arraycopy(this.g, i3 + this.h, bArr, i, i2);
            a(i2);
        } else {
            int position = this.b.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.b.position(this.e);
            this.b.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.b.position(position);
            a(i2);
        }
        return i2;
    }
}
