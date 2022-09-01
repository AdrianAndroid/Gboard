package defpackage;

/* compiled from: PG */
/* renamed from: lze  reason: default package */
/* loaded from: classes.dex */
class lze extends lzf {
    final int a;

    public lze(int i) {
        jdg.C(i > 0, "%s (%s) must be > 0", "numAttempts", i);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lze) && this.a == ((lze) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.lzf
    public final boolean ih(int i) {
        jdg.C(i >= 0, "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }
}
