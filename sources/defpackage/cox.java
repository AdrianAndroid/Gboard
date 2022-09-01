package defpackage;

/* compiled from: PG */
/* renamed from: cox  reason: default package */
/* loaded from: classes.dex */
public final class cox {
    public static final cox a = new cox(cow.START, -1);
    public final cow b;
    public final int c;

    private cox(cow cowVar, int i) {
        this.b = cowVar;
        this.c = i;
    }

    public static cox a(int i) {
        return new cox(cow.END, i);
    }

    public static cox b(int i) {
        return new cox(cow.MIDDLE, i);
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("group", this.b);
        S.f("index", this.c);
        return S.toString();
    }
}
