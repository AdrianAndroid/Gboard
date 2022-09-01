package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lfj  reason: default package */
/* loaded from: classes.dex */
public final class lfj implements Serializable, lfe {
    private static final long serialVersionUID = 0;
    private final Object a;

    public lfj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.lfe
    public final boolean equals(Object obj) {
        if (obj instanceof lfj) {
            return this.a.equals(((lfj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.equalTo(" + this.a + ")";
    }
}
