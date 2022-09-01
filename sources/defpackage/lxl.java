package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: lxl  reason: default package */
/* loaded from: classes.dex */
public abstract class lxl extends lxn {
    public final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // defpackage.lxn
    public final void a(char c) {
        this.a.putChar(c);
        b(2);
    }

    public final void b(int i) {
        try {
            c(this.a.array(), i);
        } finally {
            this.a.clear();
        }
    }

    protected void c(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.lxn, defpackage.lxv
    public final void d(byte[] bArr, int i) {
        jdg.E(0, i, bArr.length);
        c(bArr, i);
    }
}
