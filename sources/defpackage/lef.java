package defpackage;

/* compiled from: PG */
/* renamed from: lef  reason: default package */
/* loaded from: classes.dex */
public final class lef extends lec {
    private final char a;
    private final char b;

    public lef(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.lek
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + lek.i(this.a) + lek.i(this.b) + "\")";
    }
}
