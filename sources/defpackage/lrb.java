package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lrb  reason: default package */
/* loaded from: classes.dex */
public final class lrb extends lrc implements Serializable {
    public static final lrb a = new lrb();
    private static final long serialVersionUID = 0;

    private lrb() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.lrc
    public final lrc a() {
        return lrt.a;
    }

    @Override // defpackage.lrc, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        jdg.u(comparable);
        jdg.u(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
