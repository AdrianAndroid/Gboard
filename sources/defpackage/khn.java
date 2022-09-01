package defpackage;

import java.util.Random;

/* compiled from: PG */
/* renamed from: khn  reason: default package */
/* loaded from: classes.dex */
public final class khn {
    public final float a;
    public final Random b;

    public khn(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        jdg.w(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }
}
