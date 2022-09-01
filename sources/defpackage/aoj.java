package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: aoj  reason: default package */
/* loaded from: classes.dex */
public final class aoj extends aom {
    public aoj(List list) {
        super(list);
    }

    @Override // defpackage.aoh
    public final /* bridge */ /* synthetic */ Object f(asi asiVar, float f) {
        return Float.valueOf(l(asiVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(asi asiVar, float f) {
        if (asiVar.b == null || asiVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        asj asjVar = this.d;
        if (asjVar != null) {
            float f2 = asiVar.g;
            asiVar.h.floatValue();
            Float f3 = (Float) asiVar.b;
            Float f4 = (Float) asiVar.c;
            c();
            Float f5 = (Float) asjVar.a();
            if (f5 != null) {
                return f5.floatValue();
            }
        }
        float f6 = asiVar.i;
        if (f6 == -3987645.8f) {
            f6 = ((Float) asiVar.b).floatValue();
            asiVar.i = f6;
        }
        float f7 = asiVar.j;
        if (f7 == -3987645.8f) {
            f7 = ((Float) asiVar.c).floatValue();
            asiVar.j = f7;
        }
        return asc.c(f6, f7, f);
    }
}
