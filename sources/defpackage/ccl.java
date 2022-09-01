package defpackage;

/* compiled from: PG */
/* renamed from: ccl  reason: default package */
/* loaded from: classes.dex */
final class ccl implements cce {
    @Override // defpackage.cce
    public final int a(mse mseVar, int i) {
        int b = msc.b(mseVar.c);
        if (b != 0 && b == 2) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.cce
    public final int b() {
        throw new IllegalStateException("End position is not available");
    }

    @Override // defpackage.cce
    public final int c() {
        throw new IllegalStateException("Should not take this one");
    }

    @Override // defpackage.cce
    public final void d() {
    }

    @Override // defpackage.cce
    public final boolean e() {
        return false;
    }

    @Override // defpackage.cce
    public final boolean f(int i) {
        return true;
    }
}
