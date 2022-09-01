package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: awi  reason: default package */
/* loaded from: classes.dex */
final class awi implements auw {
    private final auw b;
    private final auw c;

    public awi(auw auwVar, auw auwVar2) {
        this.b = auwVar;
        this.c = auwVar2;
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof awi) {
            awi awiVar = (awi) obj;
            if (this.b.equals(awiVar.b) && this.c.equals(awiVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return "DataCacheKey{sourceKey=" + valueOf + ", signature=" + valueOf2 + "}";
    }
}
