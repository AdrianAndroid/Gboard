package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: bfd  reason: default package */
/* loaded from: classes.dex */
public abstract class bfd extends bfj implements bfo {
    private Animatable c;

    public bfd(ImageView imageView) {
        super(imageView);
    }

    private final void l(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    private final void p(Object obj) {
        i(obj);
        l(obj);
    }

    @Override // defpackage.bey, defpackage.bfh
    public final void a(Drawable drawable) {
        p(null);
        k(drawable);
    }

    @Override // defpackage.bfh
    public final void c(Object obj, bfp bfpVar) {
        if (bfpVar == null || !bfpVar.a(obj, this)) {
            p(obj);
        } else {
            l(obj);
        }
    }

    @Override // defpackage.bey, defpackage.bfh
    public final void f(Drawable drawable) {
        p(null);
        k(drawable);
    }

    @Override // defpackage.bey, defpackage.bfh
    public final void fg(Drawable drawable) {
        this.b.d();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        k(drawable);
    }

    protected abstract void i(Object obj);

    @Override // defpackage.bfo
    public final Drawable j() {
        return ((ImageView) this.a).getDrawable();
    }

    @Override // defpackage.bfo
    public final void k(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.bey, defpackage.bdj
    public final void n() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.bey, defpackage.bdj
    public final void o() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
