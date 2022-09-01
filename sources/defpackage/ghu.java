package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* renamed from: ghu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ghu implements TypeEvaluator {
    private final /* synthetic */ int c;
    public static final ghu b = new ghu(1);
    public static final /* synthetic */ ghu a = new ghu(0);

    private /* synthetic */ ghu(int i) {
        this.c = i;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        if (this.c == 0) {
            Float f2 = (Float) obj;
            return Float.valueOf(f2.floatValue() + (f * (((Float) obj2).floatValue() - f2.floatValue())));
        }
        int intValue = ((Integer) obj).intValue();
        float f3 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        double pow4 = Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        double pow5 = Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        double pow6 = Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        return Integer.valueOf((Math.round((f3 + (f * ((((intValue2 >> 24) & 255) / 255.0f) - f3))) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow + ((((float) pow4) - pow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(pow2 + ((((float) pow5) - pow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + ((((float) pow6) - pow3) * f), 0.45454545454545453d)) * 255.0f));
    }
}
