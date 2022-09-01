package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: PG */
/* renamed from: kuj  reason: default package */
/* loaded from: classes.dex */
final class kuj implements TypeEvaluator {
    final FloatEvaluator a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.a.evaluate(f, (Number) ((Float) obj), (Number) ((Float) obj2)).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
