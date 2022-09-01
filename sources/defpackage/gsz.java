package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gsz  reason: default package */
/* loaded from: classes.dex */
public final class gsz {
    public static final Property a = new gsw(Float.class);
    public ObjectAnimator b;
    public ObjectAnimator c;
    public View e;
    public mko i;
    public final opu k;
    public int d = -1;
    public int f = -1;
    public int g = -1;
    public boolean h = true;
    public final Animator.AnimatorListener j = new gsx(this);
    private final Animator.AnimatorListener l = new gsy(this);

    public gsz(opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.k = opuVar;
    }

    public final void a() {
        if (this.d >= 0) {
            this.d = -1;
            c();
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.b.cancel();
        }
        ObjectAnimator objectAnimator2 = this.c;
        if (objectAnimator2 == null || !objectAnimator2.isStarted()) {
            return;
        }
        this.c.cancel();
    }

    public final void b(int i) {
        ObjectAnimator objectAnimator;
        View view;
        if (!this.h) {
            return;
        }
        if (this.d == i) {
            this.d = -1;
            c();
        } else if (this.f != i || (objectAnimator = this.b) == null || (view = (View) objectAnimator.getTarget()) == null) {
        } else {
            if (this.c == null) {
                ObjectAnimator objectAnimator2 = (ObjectAnimator) AnimatorInflater.loadAnimator(view.getContext(), R.animator.f350_resource_name_obfuscated_res_0x7f020001);
                this.c = objectAnimator2;
                objectAnimator2.setProperty(a);
                this.c.addListener(this.l);
            }
            this.c.setTarget(view);
            ObjectAnimator objectAnimator3 = this.c;
            if (objectAnimator3.isRunning()) {
                objectAnimator3.cancel();
            }
            this.g = i;
            this.b.cancel();
            objectAnimator3.start();
        }
    }

    public final void c() {
        mko mkoVar = this.i;
        if (mkoVar != null) {
            mkoVar.cancel(true);
            this.i = null;
        }
        View view = this.e;
        if (view != null) {
            this.k.r(view);
            this.e = null;
        }
    }
}
