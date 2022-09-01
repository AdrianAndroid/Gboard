package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: kur  reason: default package */
/* loaded from: classes.dex */
public final class kur extends kup {
    private StateListAnimator E;

    public kur(FloatingActionButton floatingActionButton, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(floatingActionButton, opuVar, null, null, null);
    }

    private final Animator o(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.B, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.B, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    @Override // defpackage.kup
    public final float a() {
        return this.B.getElevation();
    }

    @Override // defpackage.kup
    public final void e(Rect rect) {
        if (this.D.e()) {
            super.e(rect);
        } else if (!n()) {
            int b = (this.u - this.B.b()) / 2;
            rect.set(b, b, b, b);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // defpackage.kup
    public final void f(float f, float f2, float f3) {
        if (this.B.getStateListAnimator() == this.E) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f, o(f, f3));
            stateListAnimator.addState(g, o(f, f2));
            stateListAnimator.addState(h, o(f, f2));
            stateListAnimator.addState(i, o(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.B, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.B, View.TRANSLATION_Z, this.B.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.B, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            stateListAnimator.addState(k, o(0.0f, 0.0f));
            this.E = stateListAnimator;
            this.B.setStateListAnimator(this.E);
        }
        if (l()) {
            j();
        }
    }

    @Override // defpackage.kup
    public final boolean l() {
        return this.D.e() || !n();
    }
}
