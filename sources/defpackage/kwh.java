package defpackage;

import android.util.Property;

/* compiled from: PG */
/* renamed from: kwh  reason: default package */
/* loaded from: classes.dex */
final class kwh extends Property {
    public kwh(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = kwi.f;
        return Float.valueOf(((kwi) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        kwi kwiVar = (kwi) obj;
        float floatValue = ((Float) obj2).floatValue();
        kwiVar.e = floatValue;
        float[] fArr = kwiVar.k;
        fArr[0] = 0.0f;
        float f = kwi.f((int) (floatValue * 333.0f), 0, 667);
        float interpolation = kwiVar.a.getInterpolation(f);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = kwiVar.k;
        float interpolation2 = kwiVar.a.getInterpolation(f + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        float[] fArr3 = kwiVar.k;
        fArr3[5] = 1.0f;
        if (kwiVar.d && fArr3[3] < 1.0f) {
            int[] iArr = kwiVar.l;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = kxc.e(kwiVar.b.c[kwiVar.c], kwiVar.j.h);
            kwiVar.d = false;
        }
        kwiVar.j.invalidateSelf();
    }
}
