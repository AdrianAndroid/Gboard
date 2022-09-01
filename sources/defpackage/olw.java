package defpackage;

/* compiled from: PG */
/* renamed from: olw  reason: default package */
/* loaded from: classes2.dex */
public final class olw extends olv {
    public static final olw d = new olw(1, 0);

    public olw(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.olv
    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.olv
    public final boolean equals(Object obj) {
        if (obj instanceof olw) {
            if (b() && ((olw) obj).b()) {
                return true;
            }
            olw olwVar = (olw) obj;
            return this.a == olwVar.a && this.b == olwVar.b;
        }
        return false;
    }

    @Override // defpackage.olv
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.olv
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
