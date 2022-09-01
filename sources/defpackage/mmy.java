package defpackage;

/* compiled from: PG */
/* renamed from: mmy  reason: default package */
/* loaded from: classes2.dex */
public final class mmy {
    public final boolean a;
    private final Class b;

    public mmy(Class cls, boolean z) {
        this.b = cls;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mmy) {
            mmy mmyVar = (mmy) obj;
            if (mmyVar.b.equals(this.b) && mmyVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
