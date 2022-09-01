package defpackage;

/* compiled from: PG */
/* renamed from: hkt  reason: default package */
/* loaded from: classes.dex */
public final class hkt {
    public final Runnable a;
    public final Runnable b;
    public final Runnable c;
    public final Runnable d;
    public final Runnable e;
    public final hks f;
    public final long g;
    public final long h;
    public final String i;
    public final long j;
    public final String k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;

    public hkt() {
    }

    public hkt(Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, Runnable runnable5, hks hksVar, long j, long j2, String str, long j3, String str2, int i, int i2, int i3, int i4, boolean z) {
        this.a = runnable;
        this.b = runnable2;
        this.c = runnable3;
        this.d = runnable4;
        this.e = runnable5;
        this.f = hksVar;
        this.g = j;
        this.h = j2;
        this.i = str;
        this.j = j3;
        this.k = str2;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = z;
    }

    public static hkr a() {
        hkr hkrVar = new hkr();
        hkrVar.d(0);
        hkrVar.h = (short) (hkrVar.h | 4);
        hkrVar.b(false);
        hkrVar.g = 1;
        hkrVar.h = (short) (hkrVar.h | 32);
        hkrVar.h(0L);
        hkrVar.h = (short) (hkrVar.h | 256);
        hkrVar.i("");
        hkrVar.c(0);
        hkrVar.g(0);
        hkrVar.f(0L);
        return hkrVar;
    }

    public final hkr b() {
        return new hkr(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hkt) {
            hkt hktVar = (hkt) obj;
            Runnable runnable = this.a;
            if (runnable != null ? runnable.equals(hktVar.a) : hktVar.a == null) {
                Runnable runnable2 = this.b;
                if (runnable2 != null ? runnable2.equals(hktVar.b) : hktVar.b == null) {
                    Runnable runnable3 = this.c;
                    if (runnable3 != null ? runnable3.equals(hktVar.c) : hktVar.c == null) {
                        Runnable runnable4 = this.d;
                        if (runnable4 != null ? runnable4.equals(hktVar.d) : hktVar.d == null) {
                            Runnable runnable5 = this.e;
                            if (runnable5 != null ? runnable5.equals(hktVar.e) : hktVar.e == null) {
                                hks hksVar = this.f;
                                if (hksVar != null ? hksVar.equals(hktVar.f) : hktVar.f == null) {
                                    if (this.g == hktVar.g && this.h == hktVar.h && this.i.equals(hktVar.i) && this.j == hktVar.j && this.k.equals(hktVar.k) && this.l == hktVar.l && this.m == hktVar.m && this.n == hktVar.n && this.o == hktVar.o && this.p == hktVar.p) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        long j = this.g;
        long j2 = this.h;
        String str = this.i;
        long j3 = this.j;
        String str2 = this.k;
        int i = this.l;
        int i2 = this.m;
        int i3 = this.n;
        int i4 = this.o;
        boolean z = this.p;
        return "Notice{postRunnable=" + valueOf + ", removeRunnable=" + valueOf2 + ", contentRunnable=" + valueOf3 + ", dismissRunnable=null, timeoutRunnable=" + valueOf4 + ", displayRunnable=" + valueOf5 + ", ignoreRunnable=null, shouldDisplayCallback=" + valueOf6 + ", creationTime=" + j + ", initialDisplayTime=" + j2 + ", tag=" + str + ", iconId=0, timeout=" + j3 + ", label=" + str2 + ", labelRes=" + i + ", importance=" + i2 + ", timeoutPolicy=" + i3 + ", layoutId=" + i4 + ", isDismissible=false, dismissMessage=null, hasBeenDisplayed=" + z + "}";
    }

    public final int hashCode() {
        Runnable runnable = this.a;
        int i = 0;
        int hashCode = ((runnable == null ? 0 : runnable.hashCode()) ^ 1000003) * 1000003;
        Runnable runnable2 = this.b;
        int hashCode2 = (hashCode ^ (runnable2 == null ? 0 : runnable2.hashCode())) * 1000003;
        Runnable runnable3 = this.c;
        int hashCode3 = (hashCode2 ^ (runnable3 == null ? 0 : runnable3.hashCode())) * (-721379959);
        Runnable runnable4 = this.d;
        int hashCode4 = (hashCode3 ^ (runnable4 == null ? 0 : runnable4.hashCode())) * 1000003;
        Runnable runnable5 = this.e;
        int hashCode5 = (hashCode4 ^ (runnable5 == null ? 0 : runnable5.hashCode())) * (-721379959);
        hks hksVar = this.f;
        if (hksVar != null) {
            i = hksVar.hashCode();
        }
        long j = this.g;
        long j2 = this.h;
        int hashCode6 = this.i.hashCode();
        long j3 = this.j;
        int i2 = 1237;
        int hashCode7 = (((((((((((((((((((((hashCode5 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ hashCode6) * (-721379959)) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.o) * 1000003) ^ 1237) * (-721379959);
        if (true == this.p) {
            i2 = 1231;
        }
        return hashCode7 ^ i2;
    }
}
