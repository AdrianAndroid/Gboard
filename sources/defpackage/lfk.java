package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lfk  reason: default package */
/* loaded from: classes.dex */
public final class lfk implements Serializable, lfe {
    private static final long serialVersionUID = 0;
    final lfe a;

    public lfk(lfe lfeVar) {
        this.a = lfeVar;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        return !this.a.a(obj);
    }

    @Override // defpackage.lfe
    public final boolean equals(Object obj) {
        if (obj instanceof lfk) {
            return this.a.equals(((lfk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-1);
    }

    public final String toString() {
        return "Predicates.not(" + this.a + ")";
    }
}
