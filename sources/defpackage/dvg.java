package defpackage;

/* compiled from: PG */
/* renamed from: dvg  reason: default package */
/* loaded from: classes.dex */
final class dvg implements oin {
    private final oin a;
    private boolean b = false;

    public dvg(oin oinVar) {
        this.a = oinVar;
    }

    @Override // defpackage.oin
    public final synchronized void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
    }

    @Override // defpackage.oin
    public final synchronized void b(Throwable th) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.b(th);
    }

    @Override // defpackage.oin
    public final synchronized void c(Object obj) {
        if (this.b) {
            return;
        }
        this.a.c(obj);
    }
}
