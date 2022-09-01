package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: gmi  reason: default package */
/* loaded from: classes.dex */
public final class gmi {
    public final Object a;
    public Object b;
    public Object c;

    public gmi(ghn ghnVar) {
        this.a = ghnVar;
    }

    public gmi(imn imnVar) {
        this.a = imnVar;
    }

    public gmi(lrh lrhVar) {
        this.a = lrhVar;
    }

    public gmi(byte[] bArr) {
        this.a = llp.e();
        this.b = cuv.a;
        this.c = cuv.c;
    }

    public static gmi f(lrh lrhVar) {
        return new gmi(lrhVar);
    }

    public static void g(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [mko, java.lang.Object] */
    public final synchronized mko a(lgb lgbVar) {
        if (this.c == null) {
            this.c = lgbVar.a();
        }
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [mko, java.lang.Object] */
    public final synchronized mko b(lgb lgbVar) {
        if (this.b == null) {
            this.b = lgbVar.a();
        }
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final synchronized void c(blh blhVar) {
        this.a.add(blhVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ght, java.lang.Object] */
    public final ght d() {
        boolean z = true;
        jdg.w(true, "can not set both evaluator and constantValue");
        if (this.b == null) {
            z = false;
        }
        jdg.w(z, "Either evaluator or constantValue has to be provided");
        ?? r0 = this.b;
        jdg.u(r0);
        final float floatValue = ((Float) ((lrh) this.a).j()).floatValue();
        final float floatValue2 = ((Float) ((lrh) this.a).k()).floatValue();
        return new ght(new Interpolator() { // from class: ghy
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = floatValue;
                float f3 = floatValue2;
                if (f <= f2) {
                    return 0.0f;
                }
                if (f < f3) {
                    return (f - f2) / (f3 - f2);
                }
                return 1.0f;
            }
        }, r0, null) { // from class: ghx
            public final /* synthetic */ Interpolator a;
            public final /* synthetic */ ght b;

            /* JADX WARN: Type inference failed for: r0v1, types: [android.view.animation.Interpolator, java.lang.Object] */
            @Override // defpackage.ght
            public final Object a(float f) {
                gmi gmiVar = gmi.this;
                Interpolator interpolator = this.a;
                ght ghtVar = this.b;
                float interpolation = interpolator.getInterpolation(f);
                ?? r02 = gmiVar.c;
                if (r02 != 0) {
                    interpolation = r02.getInterpolation(interpolation);
                }
                return ghtVar.a(interpolation);
            }
        };
    }

    public final void e(Interpolator interpolator) {
        jdg.Q(interpolator, "interpolator can not be null");
        this.c = interpolator;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ghn] */
    public final ghr h() {
        return new ghr(new oir(), this.a, new ghs(this, 0, null), null, null, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, imn] */
    public final void i(int i, View view, View.OnClickListener onClickListener) {
        this.c = view;
        if (onClickListener != null) {
            View a = this.a.a(i);
            this.b = a;
            a.setOnClickListener(onClickListener);
            ((View) this.b).setEnabled(true);
        }
    }

    public final void j() {
        k();
        this.b = null;
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, imn] */
    public final void k() {
        Object obj = this.b;
        if (obj != null) {
            ((View) obj).clearAnimation();
            this.a.c((View) this.b, null, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, imn] */
    public final void l() {
        Object obj = this.b;
        if (obj != null) {
            View view = (View) obj;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams == null) {
                return;
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Object obj2 = this.c;
            if (obj2 == null) {
                return;
            }
            View view2 = (View) obj2;
            view2.getWindowVisibleDisplayFrame(rect2);
            jdy.j(view2, rect);
            marginLayoutParams.height = rect.top - rect2.top;
            view.setLayoutParams(marginLayoutParams);
            this.a.e(view, view2, 1024, 0, 0, null);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [leq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [leq, java.lang.Object] */
    public final cuw m() {
        llp g = ((llk) this.a).g();
        if (!g.isEmpty()) {
            return new cux(g, this.b, this.c);
        }
        throw new IllegalStateException("no factories provided");
    }

    public final void n(int i, leq leqVar) {
        ((llk) this.a).h(new krm(i, leqVar));
    }

    public final void o() {
        this.b = new cuv(3);
    }

    public gmi() {
        this.a = lre.F();
    }
}
