package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hde  reason: default package */
/* loaded from: classes.dex */
public final class hde extends hda {
    static final int a = 103145;

    public hde(int i, int i2) {
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
        if (!(obj instanceof hde)) {
            return false;
        }
        return super.equals(obj) && this.g == ((hde) obj).g;
    }

    @Override // defpackage.hda
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode())});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.g("id", this.g);
        return S.toString();
    }
}
