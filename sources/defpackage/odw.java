package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: odw  reason: default package */
/* loaded from: classes2.dex */
public final class odw implements Runnable {
    final Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public odw(hs hsVar, hr hrVar, int i) {
        this.c = i;
        this.b = hsVar;
        this.a = hrVar;
    }

    public odw(oec oecVar, odv odvVar, int i) {
        this.c = i;
        this.b = oecVar;
        this.a = odvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gk gkVar;
        if (this.c == 0) {
            ((oec) this.b).f.execute(new obv(this, 10));
            return;
        }
        gm gmVar = ((hs) this.b).c;
        if (gmVar != null && (gkVar = gmVar.b) != null) {
            gkVar.L(gmVar);
        }
        View view = (View) ((hs) this.b).f;
        if (view != null && view.getWindowToken() != null && ((gx) this.a).h()) {
            ((hs) this.b).i = (hr) this.a;
        }
        ((hs) this.b).k = null;
    }
}
