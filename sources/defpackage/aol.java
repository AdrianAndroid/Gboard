package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: aol  reason: default package */
/* loaded from: classes.dex */
public final class aol extends aom {
    public aol(List list) {
        super(list);
    }

    @Override // defpackage.aoh
    public final /* bridge */ /* synthetic */ Object f(asi asiVar, float f) {
        return Integer.valueOf(k(asiVar, f));
    }

    public final int k(asi asiVar, float f) {
        if (asiVar.b == null || asiVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        asj asjVar = this.d;
        if (asjVar != null) {
            float f2 = asiVar.g;
            asiVar.h.floatValue();
            Integer num = (Integer) asiVar.b;
            Integer num2 = (Integer) asiVar.c;
            c();
            Integer num3 = (Integer) asjVar.a();
            if (num3 != null) {
                return num3.intValue();
            }
        }
        int i = asiVar.k;
        if (i == 784923401) {
            i = ((Integer) asiVar.b).intValue();
            asiVar.k = i;
        }
        int i2 = asiVar.l;
        if (i2 == 784923401) {
            i2 = ((Integer) asiVar.c).intValue();
            asiVar.l = i2;
        }
        return asc.e(i, i2, f);
    }
}
