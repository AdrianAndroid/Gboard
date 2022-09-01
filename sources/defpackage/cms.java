package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

/* compiled from: PG */
/* renamed from: cms  reason: default package */
/* loaded from: classes.dex */
final class cms extends Animation {
    private final ProgressBar a;
    private final float b;
    private final float c;

    public cms(ProgressBar progressBar, float f, float f2) {
        this.a = progressBar;
        this.b = f;
        this.c = f2;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        float f2 = this.b;
        float f3 = f2 + ((this.c - f2) * f);
        ProgressBar progressBar = this.a;
        if (progressBar != null) {
            progressBar.setProgress((int) f3);
        }
    }
}
