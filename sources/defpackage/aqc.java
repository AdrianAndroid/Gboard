package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: aqc  reason: default package */
/* loaded from: classes.dex */
public final class aqc implements apr {
    public final String a;
    public final ape b;
    public final List c;
    public final apd d;
    public final apg e;
    public final ape f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public aqc(String str, ape apeVar, List list, apd apdVar, apg apgVar, ape apeVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = apeVar;
        this.c = list;
        this.d = apdVar;
        this.e = apgVar;
        this.f = apeVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.apr
    public final anl a(amy amyVar, aqf aqfVar) {
        return new aoa(amyVar, aqfVar, this);
    }
}
