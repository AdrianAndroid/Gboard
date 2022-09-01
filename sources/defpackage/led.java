package defpackage;

/* compiled from: PG */
/* renamed from: led  reason: default package */
/* loaded from: classes.dex */
final class led extends lec {
    private final char a;
    private final char b;

    public led(char c, char c2) {
        jdg.v(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.lek
    public final boolean b(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + lek.i(this.a) + "', '" + lek.i(this.b) + "')";
    }
}
