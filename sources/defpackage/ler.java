package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: ler  reason: default package */
/* loaded from: classes.dex */
public final class ler implements Serializable, leq {
    private static final long serialVersionUID = 0;
    private final Object a;

    public ler(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        return this.a;
    }

    @Override // defpackage.leq
    public final boolean equals(Object obj) {
        if (obj instanceof ler) {
            return jdg.W(this.a, ((ler) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Functions.constant(" + this.a + ")";
    }
}
