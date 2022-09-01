package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: aoi  reason: default package */
/* loaded from: classes.dex */
public final class aoi extends aom {
    public aoi(List list) {
        super(list);
    }

    @Override // defpackage.aoh
    public final /* bridge */ /* synthetic */ Object f(asi asiVar, float f) {
        return Integer.valueOf(l(asiVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(asi asiVar, float f) {
        Object obj = asiVar.b;
        if (obj == null || asiVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) asiVar.c).intValue();
        asj asjVar = this.d;
        if (asjVar != null) {
            float f2 = asiVar.g;
            asiVar.h.floatValue();
            c();
            Integer num = (Integer) asjVar.a();
            if (num != null) {
                return num.intValue();
            }
        }
        return xm.d(asc.b(f, 0.0f, 1.0f), intValue, intValue2);
    }
}
