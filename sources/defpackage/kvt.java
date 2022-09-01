package defpackage;

import android.util.Property;

/* compiled from: PG */
/* renamed from: kvt  reason: default package */
/* loaded from: classes.dex */
final class kvt extends Property {
    public kvt(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = kvv.a;
        return Float.valueOf(((kvv) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        kvv kvvVar = (kvv) obj;
        float floatValue = ((Float) obj2).floatValue();
        kvvVar.g = floatValue;
        int i = (int) (5400.0f * floatValue);
        float[] fArr = kvvVar.k;
        float f = floatValue * 1520.0f;
        fArr[0] = (-20.0f) + f;
        fArr[1] = f;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = kvv.a[i2];
            float[] fArr2 = kvvVar.k;
            fArr2[1] = fArr2[1] + (kvvVar.d.getInterpolation(kvv.f(i, i3, 667)) * 250.0f);
            int i4 = kvv.b[i2];
            float[] fArr3 = kvvVar.k;
            fArr3[0] = fArr3[0] + (kvvVar.d.getInterpolation(kvv.f(i, i4, 667)) * 250.0f);
        }
        float[] fArr4 = kvvVar.k;
        float f2 = fArr4[0];
        fArr4[0] = (f2 + ((fArr4[1] - f2) * kvvVar.h)) / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
        int i5 = 0;
        while (true) {
            if (i5 >= 4) {
                break;
            }
            float f3 = kvv.f(i, kvv.c[i5], 333);
            if (f3 >= 0.0f && f3 <= 1.0f) {
                int i6 = kvvVar.f;
                int[] iArr = kvvVar.e.c;
                int length = iArr.length;
                int i7 = (i5 + i6) % length;
                int e = kxc.e(iArr[i7], kvvVar.j.h);
                int e2 = kxc.e(kvvVar.e.c[(i7 + 1) % length], kvvVar.j.h);
                float interpolation = kvvVar.d.getInterpolation(f3);
                int[] iArr2 = kvvVar.l;
                Integer valueOf = Integer.valueOf(e);
                Integer valueOf2 = Integer.valueOf(e2);
                int intValue = valueOf.intValue();
                float f4 = ((intValue >> 24) & 255) / 255.0f;
                int intValue2 = valueOf2.intValue();
                float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
                iArr2[0] = Integer.valueOf((Math.round((f4 + (((((intValue2 >> 24) & 255) / 255.0f) - f4) * interpolation)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow + ((((float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d)) - pow) * interpolation), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(pow2 + ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * interpolation), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + (interpolation * (((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3)), 0.45454545454545453d)) * 255.0f)).intValue();
                break;
            }
            i5++;
        }
        kvvVar.j.invalidateSelf();
    }
}
