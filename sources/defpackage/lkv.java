package defpackage;

/* compiled from: PG */
/* renamed from: lkv  reason: default package */
/* loaded from: classes.dex */
public abstract class lkv implements Iterable {
    private final lfb a = ldu.a;

    public static lkv a(Iterable iterable, Iterable iterable2, Iterable iterable3) {
        return b(iterable, iterable2, iterable3);
    }

    public static lkv b(Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            jdg.u(iterable);
        }
        return new lku(iterableArr);
    }

    public final String toString() {
        this.a.c(this);
        return lre.ae(this);
    }
}
