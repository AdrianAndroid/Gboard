package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: fkg  reason: default package */
/* loaded from: classes.dex */
public final class fkg extends fkc {
    private final fjr a;

    public fkg(fjr fjrVar) {
        this.a = fjrVar;
    }

    @Override // defpackage.fkc
    public final void a(long j, int i, int i2, byte[] bArr) {
        this.a.f(j, i, i2, bArr);
    }

    @Override // defpackage.fkc
    public final byte[] b(long j, int i, byte[] bArr) {
        this.a.e(j, i, bArr);
        return new byte[0];
    }

    @Override // defpackage.fkc
    public final byte[] c(long j, int i) {
        throw new IllegalStateException();
    }

    @Override // defpackage.fkc
    public final Bundle d(long j) {
        throw new IllegalStateException();
    }

    @Override // defpackage.fkc
    public final void e(long j, Bundle bundle) {
        this.a.h(j, bundle);
    }
}
