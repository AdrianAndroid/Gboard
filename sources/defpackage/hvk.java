package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.widgets.KeyboardHolder;

/* compiled from: PG */
/* renamed from: hvk  reason: default package */
/* loaded from: classes.dex */
public abstract class hvk {
    protected final Context b;
    protected final ino c;
    public final hvj d;
    protected final gqa e;
    public final hvx f;
    public View g;

    public hvk(Context context, hvj hvjVar, hvx hvxVar) {
        this.b = context;
        this.c = ino.M(context);
        this.e = gqa.a(context);
        this.d = hvjVar;
        this.f = hvxVar;
    }

    protected abstract int a();

    protected abstract int b();

    public void c() {
        if (this.g != null) {
            f();
        }
        int a = a();
        if (a != 0) {
            this.e.j(a);
        }
    }

    public void e() {
        int b = b();
        if (b != 0) {
            this.e.j(b);
        }
    }

    public void f() {
        Drawable background;
        hvx hvxVar = this.f;
        View view = hvxVar.k;
        if (view == null) {
            return;
        }
        View rootView = view.getRootView();
        hvxVar.d();
        rootView.getWidth();
        rootView.getHeight();
        View view2 = hvxVar.k;
        if (view2 != null && (background = view2.getBackground()) != null) {
            background.setAlpha(hvxVar.g.p().d());
        }
        View view3 = hvxVar.r;
        if (view3 instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view3;
            frameLayout.removeAllViews();
            int b = hvxVar.g.p().b();
            if (b != 0) {
                LayoutInflater.from(hvxVar.f).inflate(b, (ViewGroup) frameLayout, true);
            }
        }
        if (hvxVar.o != null) {
            ViewOutlineProvider r = hvxVar.g.p().r();
            if (r != hvxVar.o.getOutlineProvider()) {
                hvxVar.o.setOutlineProvider(r);
                hvxVar.o.setClipToOutline(true);
            }
            View view4 = hvxVar.n;
            if (view4 != null && r != view4.getOutlineProvider()) {
                hvxVar.n.setOutlineProvider(r);
                hvxVar.n.setClipToOutline(true);
            }
        }
        KeyboardHolder keyboardHolder = hvxVar.o;
        if (keyboardHolder != null) {
            keyboardHolder.setElevation(hvxVar.c());
            View view5 = hvxVar.n;
            if (view5 != null) {
                view5.setElevation(hvxVar.c());
            }
        }
        View view6 = hvxVar.q;
        if (view6 != null) {
            view6.setVisibility(8);
        }
        if (hvxVar.g.p().u() && hvxVar.k != null) {
            hvxVar.q = hvxVar.g.p().v() ? (View) hvxVar.v.a() : (View) hvxVar.w.a();
        }
        hvxVar.j();
        hvxVar.l();
        if (hvxVar.p != null) {
            int i = 0;
            boolean z = ((Boolean) hwq.m.c()).booleanValue() && hvxVar.g.p().t();
            View view7 = hvxVar.p;
            if (true != z) {
                i = 4;
            }
            view7.setVisibility(i);
            View view8 = hvxVar.k;
            if (view8 != null) {
                view8.setTranslationZ(z ? -view8.getElevation() : 0.0f);
            }
        }
        hvxVar.o();
        hvxVar.m();
        KeyboardViewHolder keyboardViewHolder = hvxVar.m;
        if (keyboardViewHolder == null) {
            return;
        }
        keyboardViewHolder.k = hvxVar.g.p().c();
    }

    public void h() {
    }

    public void i() {
        int a = a();
        if (a != 0) {
            this.e.h(a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract hun m();
}
