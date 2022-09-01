package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kxg  reason: default package */
/* loaded from: classes.dex */
public final class kxg implements kxa {
    private final float a;

    public kxg(float f) {
        this.a = f;
    }

    @Override // defpackage.kxa
    public final float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxg) && this.a == ((kxg) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
