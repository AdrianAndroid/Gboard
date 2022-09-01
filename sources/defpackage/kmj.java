package defpackage;

import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* compiled from: PG */
/* renamed from: kmj */
/* loaded from: classes.dex */
public final class kmj {
    public static final kmj a = new kmj();

    private kmj() {
    }

    public static final float a(float[] fArr) {
        oll.e(fArr, "<this>");
        float f = 0.0f;
        for (float f2 : fArr) {
            if (f2 < 0.0f) {
                throw new IllegalStateException("Check failed.");
            }
            f += f2;
        }
        return f;
    }

    public static final float b(float f, float f2, float f3, float f4, float f5) {
        if (f3 != f2) {
            return f4 + (((f - f2) / (f3 - f2)) * (f5 - f4));
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final ghn c(AssistantP6GlowView assistantP6GlowView) {
        oll.e(assistantP6GlowView, "view");
        return new kmh(assistantP6GlowView);
    }

    public static final ght d(float[]... fArr) {
        float[][] fArr2 = fArr;
        int length = fArr2.length;
        for (int i = 0; i < length; i++) {
            if (fArr[i].length != fArr[0].length) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        int length2 = fArr2.length;
        float[][] fArr3 = new float[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            float[] fArr4 = fArr[i2];
            oll.e(fArr4, "<this>");
            float a2 = a(fArr4);
            if (a2 > 0.0f) {
                int length3 = fArr4.length;
                float[] fArr5 = new float[length3];
                for (int i3 = 0; i3 < length3; i3++) {
                    fArr5[i3] = fArr4[i3] / a2;
                }
                fArr3[i2] = fArr5;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return new kmi(fArr, fArr3);
    }

    public static final float[] e(float f, float f2, float[] fArr) {
        if (f >= 0.0f) {
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            float f3 = f + f2;
            if (f3 <= 100.0f) {
                float f4 = (100.0f - f3) / 100.0f;
                float a2 = a(fArr) * (1.0f - f4);
                return new float[]{(f / f3) * a2, fArr[0] * f4, fArr[1] * f4, fArr[2] * f4, fArr[3] * f4, (f2 / f3) * a2};
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static /* synthetic */ float[] f(float f) {
        return e(f, f, new float[]{1.0f, 1.0f, 1.0f, 1.0f});
    }
}
