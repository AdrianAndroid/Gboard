package defpackage;

/* compiled from: PG */
/* renamed from: hxg  reason: default package */
/* loaded from: classes.dex */
final class hxg {
    final hwv a;
    final boolean b;

    public hxg(hwv hwvVar, boolean z) {
        this.a = hwvVar;
        this.b = z;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        return "ShownPriority{priority=" + valueOf + ", shownByDescendant=" + z + "}";
    }
}
