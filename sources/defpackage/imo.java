package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* renamed from: imo  reason: default package */
/* loaded from: classes.dex */
public abstract class imo {
    public final Context k;
    protected final imn m;
    public View n;
    protected View o;
    private final View.OnLayoutChangeListener a = new huw(this, 2);
    public final ino l = ino.L();

    public imo(Context context, imn imnVar) {
        this.k = context;
        this.m = imnVar;
    }

    public abstract int a();

    protected abstract View b(View view);

    public void d(View view) {
        View view2 = this.n;
        if (view2 == null) {
            return;
        }
        this.o = view;
        if (e()) {
            gqa.a(this.k).l(a());
        }
        view2.setLayoutDirection(jav.b(this.k));
        i(view2, view);
        if (!k()) {
            return;
        }
        view.setVisibility(4);
    }

    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(View view) {
        this.m.c(view, null, true);
    }

    protected void i(View view, View view2) {
        this.m.e(view, view2, 614, 0, 0, null);
    }

    protected boolean k() {
        return true;
    }

    public final void l(View view) {
        this.n = b(view);
    }

    public final void m() {
        View view = this.n;
        if (view != null) {
            h(view);
            this.n = null;
        }
        View view2 = this.o;
        if (view2 != null) {
            view2.setVisibility(0);
            this.o.removeOnLayoutChangeListener(this.a);
            this.o = null;
        }
    }

    public final boolean n() {
        View view = this.n;
        return view != null && this.m.f(view);
    }
}
