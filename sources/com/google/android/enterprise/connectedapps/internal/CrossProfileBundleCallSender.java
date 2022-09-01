package com.google.android.enterprise.connectedapps.internal;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CrossProfileBundleCallSender extends fkc {
    private final fju a;
    private final long b;
    private final int c;
    private final fjr d;

    public CrossProfileBundleCallSender(fju fjuVar, long j, int i, fjr fjrVar) {
        this.a = fjuVar;
        this.b = j;
        this.c = i;
        this.d = fjrVar;
    }

    @Override // defpackage.fkc
    public final void a(long j, int i, int i2, byte[] bArr) {
        this.a.e(j, i, i2, bArr);
    }

    @Override // defpackage.fkc
    public final byte[] b(long j, int i, byte[] bArr) {
        return this.a.f(j, i, this.b, this.c, bArr, this.d);
    }

    @Override // defpackage.fkc
    public final byte[] c(long j, int i) {
        return this.a.g(j, i);
    }

    @Override // defpackage.fkc
    public final Bundle d(long j) {
        return this.a.h(j);
    }

    @Override // defpackage.fkc
    public final void e(long j, Bundle bundle) {
        this.a.i(j, bundle);
    }

    @Override // defpackage.fkc
    public /* bridge */ /* synthetic */ Bundle makeBundleCall(Bundle bundle) {
        return super.makeBundleCall(bundle);
    }
}
