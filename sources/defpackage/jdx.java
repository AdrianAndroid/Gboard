package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: jdx  reason: default package */
/* loaded from: classes.dex */
public final class jdx {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;

    public final void a(View view) {
        this.a = view.getScaleX();
        this.b = view.getScaleY();
        this.c = view.getPivotX();
        this.d = view.getPivotY();
        this.e = view.getTranslationX();
        this.f = view.getTranslationY();
        this.g = view.getAlpha();
    }

    public final void b(View view) {
        view.setScaleX(this.a);
        view.setScaleY(this.b);
        view.setPivotX(this.c);
        view.setPivotY(this.d);
        view.setTranslationX(this.e);
        view.setTranslationY(this.f);
        view.setAlpha(this.g);
    }
}
