package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* renamed from: ghv  reason: default package */
/* loaded from: classes.dex */
public final class ghv implements ght {
    final /* synthetic */ float a;
    private final TypeEvaluator b = ghu.a;

    public ghv(float f) {
        this.a = f;
    }

    @Override // defpackage.ght
    public final /* bridge */ /* synthetic */ Object a(float f) {
        return (Float) this.b.evaluate(f, Float.valueOf(0.0f), Float.valueOf(this.a));
    }
}
