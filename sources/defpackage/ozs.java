package defpackage;

/* compiled from: PG */
/* renamed from: ozs  reason: default package */
/* loaded from: classes2.dex */
public abstract class ozs implements ozu {
    private final pbk a = new pbk();

    public abstract void b(Object obj);

    public final void c(ozu ozuVar) {
        this.a.a(ozuVar);
    }

    @Override // defpackage.ozu
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.a.b;
    }

    public abstract void il(Throwable th);
}
