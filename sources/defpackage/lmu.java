package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lmu  reason: default package */
/* loaded from: classes.dex */
public final class lmu implements Serializable, lri {
    public static final lmu a = new lmu(llp.q(), llp.q());
    private static final long serialVersionUID = 0;
    public final transient llp b;
    public final transient llp c;

    public lmu(llp llpVar, llp llpVar2) {
        this.b = llpVar;
        this.c = llpVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.lri
    /* renamed from: a */
    public final llw b() {
        return this.b.isEmpty() ? lrq.b : new lnj(new lrs(this.b, lrh.d()), this.c);
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
        return lre.p(b());
    }

    Object writeReplace() {
        return new lmt(b());
    }
}
