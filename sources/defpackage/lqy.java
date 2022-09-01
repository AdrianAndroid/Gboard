package defpackage;

/* compiled from: PG */
/* renamed from: lqy  reason: default package */
/* loaded from: classes.dex */
abstract class lqy implements lqw {
    public final boolean equals(Object obj) {
        if (obj instanceof lqw) {
            lqw lqwVar = (lqw) obj;
            if (a() == lqwVar.a() && jdg.W(b(), lqwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object b = b();
        return (b == null ? 0 : b.hashCode()) ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(b());
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }
}
