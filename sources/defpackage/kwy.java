package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kwy  reason: default package */
/* loaded from: classes.dex */
public final class kwy implements kxa {
    private final float a;

    public kwy(float f) {
        this.a = f;
    }

    @Override // defpackage.kxa
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwy) && this.a == ((kwy) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
