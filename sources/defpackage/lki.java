package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: lki  reason: default package */
/* loaded from: classes.dex */
final class lki extends lkk {
    static final lkk e(int i) {
        return i < 0 ? lkk.c : i > 0 ? lkk.d : lkk.b;
    }

    @Override // defpackage.lkk
    public final int a() {
        return 0;
    }

    @Override // defpackage.lkk
    public final lkk b(int i, int i2) {
        return e(mhq.h(i, i2));
    }

    @Override // defpackage.lkk
    public final lkk c(Comparable comparable, Comparable comparable2) {
        return e(comparable.compareTo(comparable2));
    }

    @Override // defpackage.lkk
    public final lkk d(Object obj, Object obj2, Comparator comparator) {
        return e(comparator.compare(obj, obj2));
    }
}
