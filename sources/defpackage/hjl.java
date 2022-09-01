package defpackage;

import j$.util.Objects;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: hjl  reason: default package */
/* loaded from: classes.dex */
public final class hjl implements auw {
    private final llp b;

    private hjl(llp llpVar) {
        if (!llpVar.isEmpty()) {
            this.b = llpVar;
            return;
        }
        throw new IllegalArgumentException("Keys is empty");
    }

    public static auw b(Object obj, Object... objArr) {
        if (objArr.length == 0) {
            return new bfu(obj);
        }
        llk f = llp.f(2);
        f.h(new bfu(obj));
        for (int i = 0; i <= 0; i++) {
            f.h(new bfu(objArr[i]));
        }
        return new hjl(f.g());
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        llp llpVar = this.b;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((auw) llpVar.get(i2)).a(messageDigest);
        }
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof hjl) {
            return lre.I(this.b, ((hjl) obj).b);
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return Objects.hashCode(this.b);
    }
}
