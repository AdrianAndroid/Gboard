package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* renamed from: bdf  reason: default package */
/* loaded from: classes.dex */
public final class bdf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bdf(bde bdeVar, bbk bbkVar, int i) {
        this.c = i;
        this.b = bdeVar;
        this.a = bbkVar;
    }

    public bdf(bdg bdgVar, View view, int i) {
        this.c = i;
        this.b = bdgVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.c == 0) {
            bgj.k(new bw(this, (ViewTreeObserver.OnDrawListener) this, 18));
            return;
        }
        ((bde) this.b).a = true;
        Object obj = this.a;
        bgj.j();
        if (((bbk) obj).d.get()) {
            return;
        }
        bgj.k(new att(this, 5, null));
    }
}
