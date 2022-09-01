package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: hln  reason: default package */
/* loaded from: classes.dex */
public final class hln {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final CharSequence d;
    public final hlm e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final Object j;
    public final Object k;
    public final boolean l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final hll r;
    public final int s;

    public hln(hlk hlkVar) {
        this.a = hlkVar.a;
        this.b = hlkVar.b;
        this.c = hlkVar.c;
        this.d = hlkVar.d;
        this.e = hlkVar.e;
        this.s = hlkVar.s;
        this.f = hlkVar.f;
        this.g = hlkVar.g;
        this.h = hlkVar.h;
        this.i = hlkVar.i;
        this.j = hlkVar.j;
        this.k = hlkVar.k;
        this.l = hlkVar.l;
        this.m = hlkVar.m;
        this.n = hlkVar.n;
        this.o = hlkVar.o;
        this.p = hlkVar.p;
        this.q = hlkVar.q;
        this.r = hlkVar.r;
    }

    public static hlk a() {
        return new hlk();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hln)) {
            return false;
        }
        hln hlnVar = (hln) obj;
        return this.e == hlnVar.e && this.s == hlnVar.s && this.f == hlnVar.f && this.g == hlnVar.g && this.h == hlnVar.h && this.i == hlnVar.i && TextUtils.equals(this.a, hlnVar.a) && TextUtils.equals(this.b, hlnVar.b) && TextUtils.equals(this.c, hlnVar.c) && TextUtils.equals(this.d, hlnVar.d) && jdg.W(this.j, hlnVar.j) && jdg.W(this.k, hlnVar.k) && this.l == hlnVar.l && this.m == hlnVar.m && this.n == hlnVar.n && this.o == hlnVar.o && this.p == hlnVar.p && this.q == hlnVar.q && jdg.W(this.r, hlnVar.r);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.h;
        int i2 = this.i;
        boolean z = this.g;
        return "Candidate : text = '" + valueOf + "' : rank = " + i + " : position = " + i2 + " : autoCorrection = " + z;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int i = 0;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) + 527) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence3 = this.d;
        int hashCode4 = (((hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31) + this.e.hashCode()) * 31;
        int i2 = this.s;
        if (i2 != 0) {
            int i3 = (((((((((hashCode4 + i2) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + this.h) * 31) + this.i) * 31;
            Object obj = this.j;
            int hashCode5 = (i3 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.k;
            int hashCode6 = (((((((((((((hashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31) + (this.l ? 1 : 0)) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31;
            hll hllVar = this.r;
            if (hllVar != null) {
                i = hllVar.hashCode();
            }
            return hashCode6 + i;
        }
        throw null;
    }
}
