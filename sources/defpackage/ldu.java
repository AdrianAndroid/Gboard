package defpackage;

/* compiled from: PG */
/* renamed from: ldu  reason: default package */
/* loaded from: classes.dex */
public final class ldu extends lfb {
    public static final ldu a = new ldu();
    private static final long serialVersionUID = 0;

    private ldu() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.lfb
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.lfb
    public final Object b(lgb lgbVar) {
        Object a2 = lgbVar.a();
        jdg.Q(a2, "use Optional.orNull() instead of a Supplier that returns null");
        return a2;
    }

    @Override // defpackage.lfb
    public final Object c(Object obj) {
        jdg.Q(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    @Override // defpackage.lfb
    public final Object d() {
        return null;
    }

    @Override // defpackage.lfb
    public final boolean e() {
        return false;
    }

    @Override // defpackage.lfb
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.lfb
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
