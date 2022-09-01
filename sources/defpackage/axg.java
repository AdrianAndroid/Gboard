package defpackage;

/* compiled from: PG */
/* renamed from: axg  reason: default package */
/* loaded from: classes.dex */
public final class axg implements axh, bgo {
    private static final xx a = bgq.b(20, new ayj(1));
    private axh b;
    private boolean c;
    private boolean d;
    private final jrr e = jrr.d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static axg d(axh axhVar) {
        axg axgVar = (axg) a.a();
        ce.m(axgVar);
        axgVar.d = false;
        axgVar.c = true;
        axgVar.b = axhVar;
        return axgVar;
    }

    @Override // defpackage.axh
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.axh
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.axh
    public final Object c() {
        return this.b.c();
    }

    @Override // defpackage.axh
    public final synchronized void e() {
        this.e.c();
        this.d = true;
        if (!this.c) {
            this.b.e();
            this.b = null;
            a.b(this);
        }
    }

    @Override // defpackage.bgo
    public final jrr f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g() {
        this.e.c();
        if (this.c) {
            this.c = false;
            if (!this.d) {
                return;
            }
            e();
            return;
        }
        throw new IllegalStateException("Already unlocked");
    }
}
