package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lfi  reason: default package */
/* loaded from: classes.dex */
public final class lfi implements Serializable, lfe {
    private static final long serialVersionUID = 0;
    private final Class a;

    public lfi(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        return this.a.isInstance(obj);
    }

    @Override // defpackage.lfe
    public final boolean equals(Object obj) {
        if (obj instanceof lfi) {
            Class cls = ((lfi) obj).a;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.instanceOf(" + this.a.getName() + ")";
    }
}
