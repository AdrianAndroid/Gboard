package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* renamed from: kvv  reason: default package */
/* loaded from: classes.dex */
public final class kvv extends kwd {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property m = new kvt(Float.class);
    private static final Property n = new kvu(Float.class);
    public final kvp e;
    public float g;
    public float h;
    private ObjectAnimator o;
    private ObjectAnimator p;
    public int f = 0;
    ajz i = null;
    public final afi d = new afi();

    public kvv(kvw kvwVar) {
        super(1);
        this.e = kvwVar;
    }

    @Override // defpackage.kwd
    public final void a() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.kwd
    public final void b(ajz ajzVar) {
        this.i = ajzVar;
    }

    @Override // defpackage.kwd
    public final void c() {
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.p.start();
        } else {
            a();
        }
    }

    @Override // defpackage.kwd
    public final void d() {
        if (this.o == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, m, 0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.setDuration(5400L);
            this.o.setInterpolator(null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new kvr(this));
        }
        if (this.p == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.p = ofFloat2;
            ofFloat2.setDuration(333L);
            this.p.setInterpolator(this.d);
            this.p.addListener(new kvs(this));
        }
        this.f = 0;
        this.l[0] = kxc.e(this.e.c[0], this.j.h);
        this.h = 0.0f;
        this.o.start();
    }

    @Override // defpackage.kwd
    public final void e() {
        this.i = null;
    }
}
