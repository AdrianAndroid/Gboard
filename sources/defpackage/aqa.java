package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: aqa  reason: default package */
/* loaded from: classes.dex */
public final class aqa implements apr {
    public final String a;
    public final List b;
    public final boolean c;

    public aqa(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.apr
    public final anl a(amy amyVar, aqf aqfVar) {
        return new anm(amyVar, aqfVar, this);
    }

    public final String toString() {
        String str = this.a;
        String arrays = Arrays.toString(this.b.toArray());
        return "ShapeGroup{name='" + str + "' Shapes: " + arrays + "}";
    }
}
