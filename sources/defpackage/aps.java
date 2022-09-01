package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* renamed from: aps  reason: default package */
/* loaded from: classes.dex */
public final class aps implements apr {
    public final Path.FillType a;
    public final apf b;
    public final apg c;
    public final api d;
    public final api e;
    public final String f;
    public final boolean g;
    public final int h;

    public aps(String str, int i, Path.FillType fillType, apf apfVar, apg apgVar, api apiVar, api apiVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = apfVar;
        this.c = apgVar;
        this.d = apiVar;
        this.e = apiVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.apr
    public final anl a(amy amyVar, aqf aqfVar) {
        return new anq(amyVar, aqfVar, this);
    }
}
