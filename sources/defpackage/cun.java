package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: cun  reason: default package */
/* loaded from: classes.dex */
public final class cun implements ijg {
    public final int a;
    public final int b;

    public cun(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cun cunVar = (cun) obj;
            if (this.a == cunVar.a && this.b == cunVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.f("numSuccessfulLoads", this.a);
        S.f("numFailedLoads", this.b);
        return S.toString();
    }
}
