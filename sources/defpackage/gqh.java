package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: gqh  reason: default package */
/* loaded from: classes.dex */
public final class gqh {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final llp f;
    public final gqg g;
    public final gqf h;
    public final llw i;
    public final doi j;

    public gqh() {
    }

    public gqh(String str, int i, int i2, int i3, boolean z, llp llpVar, gqg gqgVar, gqf gqfVar, doi doiVar, llw llwVar, byte[] bArr) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = llpVar;
        this.g = gqgVar;
        this.h = gqfVar;
        this.j = doiVar;
        this.i = llwVar;
    }

    public static gqe a() {
        gqe gqeVar = new gqe();
        gqeVar.j();
        return gqeVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    private final void h(boolean z) {
        doi doiVar = this.j;
        if (doiVar != null) {
            Object obj = doiVar.b;
            ?? r0 = doiVar.a;
            if (!z) {
                return;
            }
            ((cmr) obj).b.set(true);
            r0.run();
        }
    }

    public final ial b() {
        llp llpVar = this.f;
        if (llpVar == null) {
            return null;
        }
        int size = llpVar.size();
        int i = 0;
        while (i < size) {
            ial ialVar = (ial) llpVar.get(i);
            i++;
            if (ialVar.c.equals(iah.PRESS)) {
                return ialVar;
            }
        }
        return null;
    }

    public final Object c(String str) {
        llw llwVar = this.i;
        if (llwVar != null) {
            return llwVar.get(str);
        }
        return null;
    }

    public final void d() {
        gqf gqfVar = this.h;
        if (gqfVar != null) {
            gqfVar.a();
        }
    }

    public final void e(View view) {
        gqg gqgVar = this.g;
        if (gqgVar != null) {
            gqgVar.a(view);
        }
    }

    public final boolean equals(Object obj) {
        llp llpVar;
        gqg gqgVar;
        gqf gqfVar;
        doi doiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqh) {
            gqh gqhVar = (gqh) obj;
            if (this.a.equals(gqhVar.a) && this.b == gqhVar.b && this.c == gqhVar.c && this.d == gqhVar.d && this.e == gqhVar.e && ((llpVar = this.f) != null ? lre.I(llpVar, gqhVar.f) : gqhVar.f == null) && ((gqgVar = this.g) != null ? gqgVar.equals(gqhVar.g) : gqhVar.g == null) && ((gqfVar = this.h) != null ? gqfVar.equals(gqhVar.h) : gqhVar.h == null) && ((doiVar = this.j) != null ? doiVar.equals(gqhVar.j) : gqhVar.j == null)) {
                llw llwVar = this.i;
                llw llwVar2 = gqhVar.i;
                if (llwVar != null ? llwVar.equals(llwVar2) : llwVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        h(false);
    }

    public final void g() {
        h(true);
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        llp llpVar = this.f;
        int i = 0;
        int hashCode2 = (hashCode ^ (llpVar == null ? 0 : llpVar.hashCode())) * 1000003;
        gqg gqgVar = this.g;
        int hashCode3 = (hashCode2 ^ (gqgVar == null ? 0 : gqgVar.hashCode())) * 1000003;
        gqf gqfVar = this.h;
        int hashCode4 = (hashCode3 ^ (gqfVar == null ? 0 : gqfVar.hashCode())) * 1000003;
        doi doiVar = this.j;
        int hashCode5 = (hashCode4 ^ (doiVar == null ? 0 : doiVar.hashCode())) * 1000003;
        llw llwVar = this.i;
        if (llwVar != null) {
            i = llwVar.hashCode();
        }
        return hashCode5 ^ i;
    }

    public final String toString() {
        return this.a;
    }
}
