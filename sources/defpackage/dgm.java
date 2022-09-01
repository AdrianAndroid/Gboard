package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingOverlayView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dgm  reason: default package */
/* loaded from: classes.dex */
public class dgm implements dgg {
    private final int b;
    private volatile int c;
    private final float d;
    private long e;
    public boolean a = false;
    private boolean f = false;

    public dgm(int i, float f) {
        this.b = i;
        this.c = i;
        this.d = f;
    }

    @Override // defpackage.dgg
    public final ArrayList a() {
        return null;
    }

    @Override // defpackage.dgg
    public final void b() {
        this.e = 0L;
        this.f = false;
    }

    @Override // defpackage.dgg
    public final void c(float f, gpq gpqVar, HandwritingOverlayView handwritingOverlayView, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f || currentTimeMillis - this.e <= this.c) {
            return;
        }
        l(gpqVar, handwritingOverlayView);
    }

    @Override // defpackage.dgg
    public final void d() {
    }

    @Override // defpackage.dgg
    public final void e(gpq gpqVar) {
        this.e = System.currentTimeMillis();
        this.f = false;
    }

    @Override // defpackage.dgg
    public final void f(int i) {
    }

    @Override // defpackage.dgg
    public final void g(int[] iArr, gpq gpqVar, llp llpVar) {
        this.f = true;
    }

    @Override // defpackage.dgg
    public final boolean h() {
        return !this.f || System.currentTimeMillis() - this.e < ((long) this.c);
    }

    @Override // defpackage.dgg
    public final boolean i() {
        return !this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float j(float f, float f2) {
        return (-f2) * f;
    }

    protected float k(gpq gpqVar, int i, float f) {
        return new gpf(gpqVar).c() - (i * f);
    }

    protected void l(gpq gpqVar, final HandwritingOverlayView handwritingOverlayView) {
        this.a = true;
        final float k = k(gpqVar, handwritingOverlayView.getWidth(), this.d);
        handwritingOverlayView.g(Bitmap.createBitmap(handwritingOverlayView.c));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(handwritingOverlayView.f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dgl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ImageView imageView;
                dgm dgmVar = dgm.this;
                float f = k;
                HandwritingOverlayView handwritingOverlayView2 = handwritingOverlayView;
                float j = dgmVar.j(f, valueAnimator.getAnimatedFraction());
                if (handwritingOverlayView2 == null || (imageView = handwritingOverlayView2.a) == null) {
                    return;
                }
                imageView.setTranslationX(j);
            }
        });
        ofFloat.addListener(new hto(this, 1));
        ofFloat.start();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        double d = true != z ? 1.0d : 3.0d;
        double d2 = this.b;
        Double.isNaN(d2);
        this.c = (int) (d * d2);
    }
}
