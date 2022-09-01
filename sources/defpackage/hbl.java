package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hbl  reason: default package */
/* loaded from: classes.dex */
public final class hbl extends hda {
    static final int a = 103090;
    final String b = "";

    public hbl(int i, int i2) {
        super(b(a, i, i2));
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
        if (!(obj instanceof hbl)) {
            return false;
        }
        hbl hblVar = (hbl) obj;
        return super.equals(obj) && this.g == hblVar.g && this.b.equals(hblVar.b);
    }

    @Override // defpackage.hda
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.b});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.g("id", this.g);
        S.b("categoryName", this.b);
        return S.toString();
    }
}
