package defpackage;

/* compiled from: PG */
/* renamed from: lfm  reason: default package */
/* loaded from: classes.dex */
public final class lfm extends lfb {
    private static final long serialVersionUID = 0;
    public final Object a;

    public lfm(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.lfb
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.lfb
    public final Object b(lgb lgbVar) {
        jdg.u(lgbVar);
        return this.a;
    }

    @Override // defpackage.lfb
    public final Object c(Object obj) {
        jdg.Q(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override // defpackage.lfb
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.lfb
    public final boolean e() {
        return true;
    }

    @Override // defpackage.lfb
    public final boolean equals(Object obj) {
        if (obj instanceof lfm) {
            return this.a.equals(((lfm) obj).a);
        }
        return false;
    }

    @Override // defpackage.lfb
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a + ")";
    }
}
