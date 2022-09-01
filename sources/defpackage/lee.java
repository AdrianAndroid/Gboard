package defpackage;

/* compiled from: PG */
/* renamed from: lee  reason: default package */
/* loaded from: classes.dex */
public final class lee extends lec {
    public final char a;

    public lee(char c) {
        this.a = c;
    }

    @Override // defpackage.lek
    public final boolean b(char c) {
        return c == this.a;
    }

    public final String toString() {
        return "CharMatcher.is('" + lek.i(this.a) + "')";
    }
}
