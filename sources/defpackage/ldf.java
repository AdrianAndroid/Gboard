package defpackage;

/* compiled from: PG */
/* renamed from: ldf  reason: default package */
/* loaded from: classes.dex */
final class ldf extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        kki.l();
        odv odvVar = new odv((short[]) null);
        Thread currentThread = Thread.currentThread();
        synchronized (ldh.a) {
            ldh.a.put(currentThread, odvVar);
        }
        return odvVar;
    }
}
