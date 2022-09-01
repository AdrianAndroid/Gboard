package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mjk */
/* loaded from: classes.dex */
public final class mjk extends mis {
    private mjj c;

    public mjk(llg llgVar, boolean z, Executor executor, mix mixVar) {
        super(llgVar, z, false);
        this.c = new mjh(this, mixVar, executor);
        r();
    }

    public static /* synthetic */ void t(mjk mjkVar) {
        mjkVar.c = null;
    }

    @Override // defpackage.mis
    public final void f(int i, Object obj) {
    }

    @Override // defpackage.mik
    protected final void l() {
        mjj mjjVar = this.c;
        if (mjjVar != null) {
            mjjVar.h();
        }
    }

    @Override // defpackage.mis
    public final void q() {
        mjj mjjVar = this.c;
        if (mjjVar != null) {
            mjjVar.f();
        }
    }

    @Override // defpackage.mis
    public final void s(mir mirVar) {
        super.s(mirVar);
        if (mirVar == mir.OUTPUT_FUTURE_DONE) {
            this.c = null;
        }
    }

    public mjk(llg llgVar, boolean z, Executor executor, Callable callable) {
        super(llgVar, z, false);
        this.c = new mji(this, callable, executor);
        r();
    }
}
