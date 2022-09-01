package defpackage;

/* compiled from: PG */
/* renamed from: nvc  reason: default package */
/* loaded from: classes2.dex */
abstract class nvc extends nsd {
    @Override // defpackage.nsd
    public void b(String str, Throwable th) {
        f().b(str, th);
    }

    @Override // defpackage.nsd
    public final void c() {
        f().c();
    }

    @Override // defpackage.nsd
    public final void d(int i) {
        f().d(i);
    }

    protected abstract nsd f();

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("delegate", f());
        return S.toString();
    }
}
