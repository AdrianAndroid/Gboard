package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: lsv  reason: default package */
/* loaded from: classes.dex */
public final class lsv implements lri {
    public final lrh a;
    final /* synthetic */ lsw b;

    public lsv(lsw lswVar, lrh lrhVar) {
        this.b = lswVar;
        this.a = lrhVar;
    }

    @Override // defpackage.lri
    public final Map b() {
        return new lsu(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lri) {
            return b().equals(((lri) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }
}
