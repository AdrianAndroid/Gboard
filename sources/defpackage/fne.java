package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: fne  reason: default package */
/* loaded from: classes.dex */
abstract class fne extends fri {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b = a;

    public fne(byte[] bArr) {
        super(bArr);
    }

    protected abstract byte[] b();

    @Override // defpackage.fri
    public final byte[] hF() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.b.get();
            if (bArr == null) {
                bArr = b();
                this.b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
