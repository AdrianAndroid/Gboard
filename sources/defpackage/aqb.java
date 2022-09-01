package defpackage;

/* compiled from: PG */
/* renamed from: aqb  reason: default package */
/* loaded from: classes.dex */
public final class aqb implements apr {
    public final apk a;
    public final boolean b;
    private final String c;
    private final int d;

    public aqb(String str, int i, apk apkVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = apkVar;
        this.b = z;
    }

    @Override // defpackage.apr
    public final anl a(amy amyVar, aqf aqfVar) {
        return new anz(amyVar, aqfVar, this);
    }

    public final String toString() {
        String str = this.c;
        int i = this.d;
        return "ShapePath{name=" + str + ", index=" + i + "}";
    }
}
