package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kui  reason: default package */
/* loaded from: classes.dex */
public final class kui implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;
    final /* synthetic */ Matrix h;
    final /* synthetic */ kup i;

    public kui(kup kupVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.i = kupVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.i.B.setAlpha(krt.b(this.a, this.b, 0.0f, 0.2f, floatValue));
        this.i.B.setScaleX(krt.a(this.c, this.d, floatValue));
        this.i.B.setScaleY(krt.a(this.e, this.d, floatValue));
        kup kupVar = this.i;
        float f = this.f;
        float f2 = this.g;
        kupVar.y = krt.a(f, f2, floatValue);
        kupVar.d(krt.a(f, f2, floatValue), this.h);
        this.i.B.setImageMatrix(this.h);
    }
}
