package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: neh  reason: default package */
/* loaded from: classes2.dex */
public final class neh extends nek {
    private static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    public neh(byte[] bArr, int i, int i2) {
        super(bArr);
        q(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.nek, defpackage.nem
    public final byte a(int i) {
        B(i, this.e);
        return this.a[this.d + i];
    }

    @Override // defpackage.nek, defpackage.nem
    public final byte b(int i) {
        return this.a[this.d + i];
    }

    @Override // defpackage.nek
    protected final int c() {
        return this.d;
    }

    @Override // defpackage.nek, defpackage.nem
    public final int d() {
        return this.e;
    }

    @Override // defpackage.nek, defpackage.nem
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.d + i, bArr, i2, i3);
    }

    Object writeReplace() {
        return nem.y(D());
    }
}
