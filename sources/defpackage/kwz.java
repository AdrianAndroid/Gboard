package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kwz  reason: default package */
/* loaded from: classes.dex */
public final class kwz implements kxa {
    private final kxa a;
    private final float b;

    public kwz(float f, kxa kxaVar) {
        while (kxaVar instanceof kwz) {
            kxaVar = ((kwz) kxaVar).a;
            f += ((kwz) kxaVar).b;
        }
        this.a = kxaVar;
        this.b = f;
    }

    @Override // defpackage.kxa
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwz)) {
            return false;
        }
        kwz kwzVar = (kwz) obj;
        return this.a.equals(kwzVar.a) && this.b == kwzVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
