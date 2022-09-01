package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* renamed from: lrc  reason: default package */
/* loaded from: classes.dex */
public abstract class lrc implements Comparator {
    public static lrc b(Comparator comparator) {
        if (comparator instanceof lrc) {
            return (lrc) comparator;
        }
        return new lkh(comparator);
    }

    public lrc a() {
        return new lru(this);
    }

    public final lrc c() {
        return d(lqh.KEY);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public final lrc d(leq leqVar) {
        return new ljo(leqVar, this);
    }

    public final List e(Iterable iterable) {
        Object[] aj = lre.aj(iterable);
        Arrays.sort(aj, this);
        return lre.B(Arrays.asList(aj));
    }
}
