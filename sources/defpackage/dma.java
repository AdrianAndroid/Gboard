package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: dma  reason: default package */
/* loaded from: classes.dex */
public final class dma implements dls {
    public Context a;
    public hsk b;
    public EditorInfo c;
    private final hsw d = new dlx(this);
    private final hst e = new dly(this);
    private final hsh f = new dlz(this);

    public dma() {
        ltg ltgVar = dmc.a;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.a = context;
        mjl mjlVar = mjl.a;
        this.d.e(mjlVar);
        this.e.g(mjlVar);
        this.f.d(gyc.b);
        ieh.j().u(new dlv(context));
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.b = null;
        this.c = null;
        this.d.f();
        this.e.h();
        this.f.e();
        ieh.j().x(dlv.class);
    }
}
