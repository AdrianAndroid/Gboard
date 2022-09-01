package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: img  reason: default package */
/* loaded from: classes.dex */
public final class img {
    public ilm a;
    public ilm b;
    public AnimatorSet c;
    public final TimeInterpolator d = new PathInterpolator(0.4f, 0.0f, 0.6f, 1.0f);
    public final TimeInterpolator e = new PathInterpolator(1.0f, 0.0f, 0.2f, 1.0f);
    public AnimatorListenerAdapter f;
    final /* synthetic */ imh g;

    public img(imh imhVar) {
        this.g = imhVar;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
