package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: lxo  reason: default package */
/* loaded from: classes.dex */
abstract class lxo extends lxn {
    private final ByteBuffer a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* JADX INFO: Access modifiers changed from: protected */
    public lxo() {
        jdg.v(true);
    }

    private final void h() {
        this.a.flip();
        while (this.a.remaining() >= 16) {
            f(this.a);
        }
        this.a.compact();
    }

    private final void i() {
        if (this.a.remaining() < 8) {
            h();
        }
    }

    @Override // defpackage.lxn
    public final void a(char c) {
        this.a.putChar(c);
        i();
    }

    protected abstract lxt c();

    @Override // defpackage.lxn, defpackage.lxv
    public final void d(byte[] bArr, int i) {
        ByteBuffer order = ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN);
        if (order.remaining() <= this.a.remaining()) {
            this.a.put(order);
            i();
            return;
        }
        int position = 16 - this.a.position();
        for (int i2 = 0; i2 < position; i2++) {
            this.a.put(order.get());
        }
        h();
        while (order.remaining() >= 16) {
            f(order);
        }
        this.a.put(order);
    }

    protected abstract void f(ByteBuffer byteBuffer);

    protected void g(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.lxv
    public final lxt k() {
        h();
        this.a.flip();
        if (this.a.remaining() > 0) {
            g(this.a);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.limit());
        }
        return c();
    }
}
