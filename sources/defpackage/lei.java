package defpackage;

/* compiled from: PG */
/* renamed from: lei  reason: default package */
/* loaded from: classes.dex */
final class lei extends lek {
    final lek a;
    final lek b;

    public lei(lek lekVar, lek lekVar2) {
        this.a = lekVar;
        this.b = lekVar2;
    }

    @Override // defpackage.lek
    public final boolean b(char c) {
        return this.a.b(c) || this.b.b(c);
    }

    public final String toString() {
        return "CharMatcher.or(" + this.a + ", " + this.b + ")";
    }
}
