package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.accesspoint.impl.ExpandAccessPointsHintView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: gsh  reason: default package */
/* loaded from: classes.dex */
public final class gsh {
    public final Context a;
    public final imn b;
    public final grg c;
    public final gqa e;
    public ExpandAccessPointsHintView i;
    public gsf j;
    public Animator k;
    public Runnable n;
    public Runnable o;
    public View.OnAttachStateChangeListener p;
    private final Runnable r;
    private Runnable s;
    public final int[] f = new int[2];
    public final int[] g = new int[2];
    public final int[] h = new int[2];
    private final int[] q = new int[2];
    public final gsg l = new gsg(this);
    public final gsg m = new gsg(this);
    public final gqe d = gqh.a();

    public gsh(Context context, imn imnVar, Runnable runnable) {
        gsc gscVar = gsc.a;
        this.a = context;
        this.b = imnVar;
        grg grgVar = new grg(gscVar, imnVar);
        this.c = grgVar;
        grgVar.a = R.layout.f144340_resource_name_obfuscated_res_0x7f0e04d5;
        this.e = gqa.a(context);
        this.r = runnable;
    }

    public final llp a(String str, int i) {
        llk llkVar = new llk();
        for (int i2 = 0; i2 < i; i2++) {
            gqe gqeVar = this.d;
            gqeVar.j();
            gqeVar.i(str + i2);
            gqeVar.f(R.drawable.f47420_resource_name_obfuscated_res_0x7f0801e1);
            llkVar.h(this.d.a());
        }
        return llkVar.g();
    }

    public final void b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        Animator animator = this.k;
        if (animator != null && animator.isStarted()) {
            this.k.cancel();
        }
        this.c.a();
        ExpandAccessPointsHintView expandAccessPointsHintView = this.i;
        if (expandAccessPointsHintView != null && (onAttachStateChangeListener = this.p) != null) {
            expandAccessPointsHintView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        ExpandAccessPointsHintView expandAccessPointsHintView2 = this.i;
        if (expandAccessPointsHintView2 != null) {
            Runnable runnable = this.o;
            if (runnable != null) {
                expandAccessPointsHintView2.removeCallbacks(runnable);
                this.o = null;
            }
            Runnable runnable2 = this.s;
            if (runnable2 != null) {
                this.i.removeCallbacks(runnable2);
                this.s = null;
            }
            Runnable runnable3 = this.n;
            if (runnable3 != null) {
                this.i.removeCallbacks(runnable3);
                this.n = null;
            }
        }
        this.b.c(this.i, null, true);
        this.i = null;
        this.j = null;
        this.r.run();
    }

    public final void c(int i, float f, float f2) {
        gsf gsfVar = this.j;
        SoftKeyboardView softKeyboardView = gsfVar != null ? gsfVar.c : null;
        if (softKeyboardView == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, i, f, f2, 1.0f, 1.0f, 0, 1.0f, 1.0f, 4098, 0);
        if (this.e.e) {
            softKeyboardView.dispatchHoverEvent(obtain);
        } else {
            softKeyboardView.dispatchTouchEvent(obtain);
        }
    }

    public final void d() {
        this.s = null;
        gsf gsfVar = this.j;
        if (gsfVar == null || this.i == null) {
            return;
        }
        gsfVar.e = gsf.a(gsfVar.d);
        gsf gsfVar2 = this.j;
        gqw gqwVar = gsfVar2.b;
        gqz gqzVar = gsfVar2.d;
        SoftKeyboardView softKeyboardView = gsfVar2.c;
        View view = gsfVar2.a;
        View n = gqzVar.n(gsfVar2.e.a);
        if (n == null) {
            return;
        }
        if (n.getWidth() == 0 || n.getHeight() == 0) {
            e(0);
            return;
        }
        View m = gqwVar.m(2);
        View m2 = gqwVar.m(1);
        if (m == null || m2 == null) {
            return;
        }
        this.f[0] = n.getWidth() / 2;
        this.f[1] = n.getHeight() / 2;
        this.g[0] = m.getWidth() / 2;
        this.g[1] = m.getHeight();
        this.h[0] = m2.getWidth() / 2;
        this.h[1] = m2.getHeight();
        int[] iArr = this.q;
        iArr[0] = 0;
        iArr[1] = 0;
        jdy.m(this.f, n, softKeyboardView);
        jdy.m(this.g, m, softKeyboardView);
        jdy.m(this.h, m2, softKeyboardView);
        jdy.m(this.q, softKeyboardView, this.i);
        view.setX((this.f[0] - (view.getWidth() / 2.0f)) + this.q[0]);
        view.setY(this.f[1] + this.q[1]);
        view.setVisibility(0);
        ExpandAccessPointsHintView expandAccessPointsHintView = this.i;
        if (expandAccessPointsHintView == null) {
            return;
        }
        if (this.n == null) {
            this.n = new fqa(this, 11);
        }
        expandAccessPointsHintView.postDelayed(this.n, 500L);
    }

    public final void e(int i) {
        ExpandAccessPointsHintView expandAccessPointsHintView = this.i;
        if (expandAccessPointsHintView == null) {
            return;
        }
        if (this.s == null) {
            this.s = new fqa(this, 13);
        }
        if (i > 0) {
            expandAccessPointsHintView.postDelayed(this.s, i);
        } else {
            expandAccessPointsHintView.post(this.s);
        }
    }
}
