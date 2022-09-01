package defpackage;

import android.util.Property;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kwl  reason: default package */
/* loaded from: classes.dex */
final class kwl extends Property {
    public kwl(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = kwm.a;
        return Float.valueOf(((kwm) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        kwm kwmVar = (kwm) obj;
        float floatValue = ((Float) obj2).floatValue();
        kwmVar.g = floatValue;
        int i = (int) (floatValue * 1800.0f);
        for (int i2 = 0; i2 < 4; i2++) {
            kwmVar.k[i2] = Math.max(0.0f, Math.min(1.0f, kwmVar.c[i2].getInterpolation(kwm.f(i, kwm.b[i2], kwm.a[i2]))));
        }
        if (kwmVar.f) {
            Arrays.fill(kwmVar.l, kxc.e(kwmVar.d.c[kwmVar.e], kwmVar.j.h));
            kwmVar.f = false;
        }
        kwmVar.j.invalidateSelf();
    }
}
