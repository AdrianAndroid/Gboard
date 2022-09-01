package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: fxc  reason: default package */
/* loaded from: classes.dex */
public final class fxc implements jnp {
    public static final fxc a = new fxc();
    private final long b = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    private fxc() {
    }

    @Override // defpackage.jnp
    public final long a() {
        return this.b + SystemClock.elapsedRealtime();
    }

    @Override // defpackage.jnp
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
