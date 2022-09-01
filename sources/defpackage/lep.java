package defpackage;

/* compiled from: PG */
/* renamed from: lep  reason: default package */
/* loaded from: classes.dex */
public abstract class lep {
    protected abstract int a(Object obj);

    protected abstract boolean b(Object obj, Object obj2);

    public final int c(Object obj) {
        if (obj == null) {
            return 0;
        }
        return a(obj);
    }

    public final boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return b(obj, obj2);
        }
        return false;
    }
}
