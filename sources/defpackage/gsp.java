package defpackage;

import android.animation.FloatEvaluator;
import com.google.android.libraries.inputmethod.accesspoint.widget.AccessPointBackgroundView;

/* compiled from: PG */
/* renamed from: gsp  reason: default package */
/* loaded from: classes.dex */
public final class gsp extends FloatEvaluator {
    final /* synthetic */ float a;
    final /* synthetic */ AccessPointBackgroundView b;

    public gsp(AccessPointBackgroundView accessPointBackgroundView, float f) {
        this.b = accessPointBackgroundView;
        this.a = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Number number, Number number2) {
        return super.evaluate(f, (Number) 1, (Number) Float.valueOf(this.b.isActivated() ? this.a : 0.0f));
    }
}
