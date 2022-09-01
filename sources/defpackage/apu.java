package defpackage;

/* compiled from: PG */
/* renamed from: apu  reason: default package */
/* loaded from: classes.dex */
public final class apu implements apr {
    public final boolean a;
    public final int b;

    public apu(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.apr
    public final anl a(amy amyVar, aqf aqfVar) {
        if (!amyVar.i) {
            asa.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new anu(this);
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE";
        return "MergePaths{mode=" + str + "}";
    }
}
