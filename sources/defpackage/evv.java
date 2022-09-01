package defpackage;

/* compiled from: PG */
/* renamed from: evv  reason: default package */
/* loaded from: classes.dex */
public final class evv implements leq {
    private final leq a;
    private volatile Object b;

    public evv(leq leqVar) {
        this.a = leqVar;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        Object obj2 = this.b;
        if (obj2 == null) {
            synchronized (this) {
                obj2 = this.b;
                if (obj2 == null) {
                    Object a = this.a.a(obj);
                    this.b = a;
                    obj2 = a;
                }
            }
        }
        return obj2;
    }
}
