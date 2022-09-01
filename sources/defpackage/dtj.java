package defpackage;

import j$.util.function.Supplier;

/* compiled from: PG */
/* renamed from: dtj  reason: default package */
/* loaded from: classes.dex */
public final class dtj {
    public final Runnable a;
    public long b;
    public long c = Long.MIN_VALUE;
    public final gjz d;
    private final Supplier e;

    public dtj(gjz gjzVar, Runnable runnable, Supplier supplier, byte[] bArr) {
        this.d = gjzVar;
        this.a = runnable;
        this.e = supplier;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j) {
        if (((dsx) this.e.get()).f) {
            return;
        }
        long j2 = this.b + 1;
        this.b = j2;
        kki.i(new dti(this, j2, 0), j);
    }
}
