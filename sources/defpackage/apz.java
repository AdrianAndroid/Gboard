package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* renamed from: apz  reason: default package */
/* loaded from: classes.dex */
public final class apz implements apr {
    public final Path.FillType a;
    public final String b;
    public final apd c;
    public final apg d;
    public final boolean e;
    private final boolean f;

    public apz(String str, boolean z, Path.FillType fillType, apd apdVar, apg apgVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = apdVar;
        this.d = apgVar;
        this.e = z2;
    }

    @Override // defpackage.apr
    public final anl a(amy amyVar, aqf aqfVar) {
        return new anp(amyVar, aqfVar, this);
    }

    public final String toString() {
        boolean z = this.f;
        return "ShapeFill{color=, fillEnabled=" + z + "}";
    }
}
