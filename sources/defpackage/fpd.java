package defpackage;

/* compiled from: PG */
/* renamed from: fpd  reason: default package */
/* loaded from: classes.dex */
public final class fpd extends fox {
    public final qq e = new qq();
    private final fpj g;

    public fpd(fpq fpqVar, fpj fpjVar) {
        super(fpqVar, fmx.a);
        this.g = fpjVar;
        this.f.c("ConnectionlessLifecycleHelper", this);
    }

    private final void m() {
        if (!this.e.isEmpty()) {
            this.g.f(this);
        }
    }

    @Override // defpackage.fox
    protected final void e(fmt fmtVar, int i) {
        this.g.d(fmtVar, i);
    }

    @Override // defpackage.fox
    protected final void f() {
        this.g.e();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        m();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        this.a = true;
        m();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        this.a = false;
        fpj fpjVar = this.g;
        synchronized (fpj.c) {
            if (fpjVar.k == this) {
                fpjVar.k = null;
                fpjVar.l.clear();
            }
        }
    }
}
