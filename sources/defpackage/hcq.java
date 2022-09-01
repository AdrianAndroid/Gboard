package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hcq  reason: default package */
/* loaded from: classes.dex */
public final class hcq extends hda {
    static final int a = 103126;
    final int b;
    final int c;
    public final String d;
    final String[] e;
    public final boolean f;

    public hcq(int i, int i2, String str, String[] strArr, boolean z) {
        super(b(a, i, i2));
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = strArr;
        this.f = z;
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
        if (!(obj instanceof hcq)) {
            return false;
        }
        hcq hcqVar = (hcq) obj;
        return super.equals(obj) && this.b == hcqVar.b && this.c == hcqVar.c && this.d.equals(hcqVar.d) && Arrays.equals(this.e, hcqVar.e) && this.f == hcqVar.f;
    }

    @Override // defpackage.hda
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.e)), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.g("id", this.g);
        S.f("categoryIndex", this.b);
        S.f("idInCategory", this.c);
        S.b("primary", this.d);
        S.b("secondaries", this.e);
        S.h("useStickyVariant", this.f);
        return S.toString();
    }
}
