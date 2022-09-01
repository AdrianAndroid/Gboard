package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: hjo  reason: default package */
/* loaded from: classes.dex */
public final class hjo implements auw {
    public final aze b;
    public final iil c;

    public hjo() {
    }

    public hjo(aze azeVar, iil iilVar) {
        this.b = azeVar;
        if (iilVar != null) {
            this.c = iilVar;
            return;
        }
        throw new NullPointerException("Null networkRequestFeature");
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof hjo) {
            return this.b.equals(((hjo) obj).b);
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("url", this.b.c());
        S.b("featureName", this.c.u);
        return S.toString();
    }
}
