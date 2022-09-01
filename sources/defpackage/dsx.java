package defpackage;

/* compiled from: PG */
/* renamed from: dsx  reason: default package */
/* loaded from: classes.dex */
public final class dsx {
    public static final dsx a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final llw h;

    static {
        dsw a2 = a();
        a2.b(false);
        a2.h(false);
        a2.g(false);
        a2.e(false);
        a2.c(false);
        a2.f(lrq.b);
        a2.d(false);
        a = a2.a();
    }

    public dsx() {
    }

    public dsx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, llw llwVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = llwVar;
    }

    public static dsw a() {
        return new dsw();
    }

    public final boolean b() {
        return this.c && this.g && this.d;
    }

    public final boolean c() {
        return !this.d && this.e;
    }

    public final boolean d() {
        return this.c && this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsx) {
            dsx dsxVar = (dsx) obj;
            if (this.b == dsxVar.b && this.c == dsxVar.c && this.d == dsxVar.d && this.e == dsxVar.e && this.f == dsxVar.f && this.g == dsxVar.g && lre.z(this.h, dsxVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = this.f;
        boolean z6 = this.g;
        String valueOf = String.valueOf(this.h);
        return "NgaState{connected=" + z + ", keyboardVisible=" + z2 + ", dictationEligible=" + z3 + ", currentFieldEligibilityUpToDate=" + z4 + ", dictating=" + z5 + ", keyboardTypeSupported=" + z6 + ", eligibilityByLanguageTag=" + valueOf + "}";
    }
}
