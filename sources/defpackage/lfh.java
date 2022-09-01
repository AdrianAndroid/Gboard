package defpackage;

import java.io.Serializable;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: lfh  reason: default package */
/* loaded from: classes.dex */
public final class lfh implements Serializable, lfe {
    private static final long serialVersionUID = 0;
    private final Collection a;

    public lfh(Collection collection) {
        jdg.u(collection);
        this.a = collection;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        try {
            return this.a.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // defpackage.lfe
    public final boolean equals(Object obj) {
        if (obj instanceof lfh) {
            return this.a.equals(((lfh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.in(" + this.a + ")";
    }
}
