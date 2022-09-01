package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: hjr  reason: default package */
/* loaded from: classes.dex */
public class hjr extends bfb implements Animatable, bfo {
    private boolean b;
    private boolean c;
    public int d;
    private gyz e;

    public hjr(ImageView imageView) {
        this(imageView, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void v(Drawable drawable, boolean z) {
        if (!(drawable instanceof Animatable)) {
            return;
        }
        Animatable animatable = (Animatable) drawable;
        if (z) {
            if (animatable.isRunning()) {
                return;
            }
            animatable.start();
        } else if (!animatable.isRunning()) {
        } else {
            animatable.stop();
        }
    }

    @Override // defpackage.bfh
    public void a(Drawable drawable) {
        this.c = true;
        k(drawable);
        this.c = false;
        this.d = 5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfb
    public void b(Drawable drawable) {
        this.c = true;
        v(drawable, false);
        k(null);
        this.c = false;
        this.d = 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfb
    public void i(Drawable drawable) {
        this.c = true;
        k(drawable);
        this.c = false;
        this.d = 3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b;
    }

    @Override // defpackage.bfo
    public final Drawable j() {
        return ((ImageView) this.a).getDrawable();
    }

    @Override // defpackage.bfo
    public final void k(Drawable drawable) {
        s();
        ((ImageView) this.a).setImageDrawable(drawable);
        v(drawable, this.b);
    }

    @Override // defpackage.bfh
    /* renamed from: l */
    public void c(Drawable drawable, bfp bfpVar) {
        this.c = true;
        if (bfpVar == null || !bfpVar.a(drawable, this)) {
            k(drawable);
        }
        this.c = false;
        this.d = 4;
    }

    public final Context q() {
        return ((ImageView) this.a).getContext();
    }

    public final void r() {
        if (d() != null) {
            hjq.a(q()).l(this);
        } else if (((ImageView) this.a).getDrawable() == null) {
        } else {
            k(null);
        }
    }

    public final void s() {
        v(((ImageView) this.a).getDrawable(), false);
        if (this.c || d() == null) {
            return;
        }
        hjq.a(q()).l(this);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.b = true;
        v(((ImageView) this.a).getDrawable(), true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.b = false;
        v(((ImageView) this.a).getDrawable(), false);
    }

    public final void t(int i) {
        u(i, false);
    }

    public final void u(int i, boolean z) {
        if (z) {
            if (this.e == null) {
                this.e = hjg.n(q());
            }
            k(this.e.b(i));
            return;
        }
        s();
        ((ImageView) this.a).setImageResource(i);
    }

    public hjr(ImageView imageView, boolean z) {
        super(imageView);
        this.d = 1;
        this.c = false;
        this.b = z;
    }
}
