package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lrt  reason: default package */
/* loaded from: classes.dex */
public final class lrt extends lrc implements Serializable {
    public static final lrt a = new lrt();
    private static final long serialVersionUID = 0;

    private lrt() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.lrc
    public final lrc a() {
        return lrb.a;
    }

    @Override // defpackage.lrc, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        jdg.u(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
