package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: oux  reason: default package */
/* loaded from: classes2.dex */
public final class oux extends ovr {
    public ovr a;

    public oux(ovr ovrVar) {
        oll.e(ovrVar, "delegate");
        this.a = ovrVar;
    }

    @Override // defpackage.ovr
    public final ovr f(long j, TimeUnit timeUnit) {
        oll.e(timeUnit, "unit");
        return this.a.f(j, timeUnit);
    }

    @Override // defpackage.ovr
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.ovr
    public final boolean h() {
        return this.a.h();
    }

    @Override // defpackage.ovr
    public final long j() {
        return this.a.j();
    }

    @Override // defpackage.ovr
    public final ovr k() {
        return this.a.k();
    }

    @Override // defpackage.ovr
    public final ovr l() {
        return this.a.l();
    }

    @Override // defpackage.ovr
    public final ovr m(long j) {
        return this.a.m(j);
    }

    @Override // defpackage.ovr
    public final long n() {
        return this.a.n();
    }
}
