package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hcs  reason: default package */
/* loaded from: classes.dex */
public final class hcs extends hda {
    static final int a = 103128;
    static final hcs b = new hcs(-1, -1, "");
    final String c;

    public hcs(int i, int i2, String str) {
        super(b(a, i, i2));
        this.c = str;
    }

    @Override // defpackage.hda
    public final int a() {
        return a;
    }

    @Override // defpackage.hda
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcs)) {
            return false;
        }
        hcs hcsVar = (hcs) obj;
        return super.equals(obj) && this.g == hcsVar.g && this.c.equals(hcsVar.c);
    }

    @Override // defpackage.hda
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.g("id", this.g);
        S.b("description", this.c);
        return S.toString();
    }
}
