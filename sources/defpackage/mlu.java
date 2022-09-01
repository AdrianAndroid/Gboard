package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* renamed from: mlu  reason: default package */
/* loaded from: classes.dex */
public final class mlu {
    public final Object a;

    public mlu(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public mlu(mnm mnmVar) {
        Bundle bundle;
        if (mnmVar.d == 0) {
            mnmVar.d = System.currentTimeMillis();
        }
        this.a = mnmVar;
        Bundle bundle2 = new Bundle();
        mnmVar.a();
        Bundle bundle3 = mnmVar.a().getBundle("scionData");
        if (bundle3 == null || (bundle = bundle3.getBundle("_cmp")) == null) {
            return;
        }
        msc.k("medium", "utm_medium", bundle, bundle2);
        msc.k("source", "utm_source", bundle, bundle2);
        msc.k("campaign", "utm_campaign", bundle, bundle2);
    }

    private mlu(nik nikVar, Object obj, nik nikVar2, Object obj2) {
        this.a = new ngt(nikVar, obj, nikVar2, obj2);
    }

    public static int d(ngt ngtVar, Object obj, Object obj2) {
        return nfd.a((nik) ngtVar.c, 1, obj) + nfd.a((nik) ngtVar.d, 2, obj2);
    }

    public static void e(Cnew cnew, ngt ngtVar, Object obj, Object obj2) {
        nfd.g(cnew, (nik) ngtVar.c, 1, obj);
        nfd.g(cnew, (nik) ngtVar.d, 2, obj2);
    }

    public static mlu y(nik nikVar, Object obj, nik nikVar2, Object obj2) {
        return new mlu(nikVar, obj, nikVar2, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized void A(oqo oqoVar) {
        this.a.add(oqoVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized boolean B(oqo oqoVar) {
        return this.a.contains(oqoVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    public final String C(String str) {
        int size = this.a.size();
        do {
            size -= 2;
            if (size < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase((String) this.a.get(size)));
        return (String) this.a.get(size + 1);
    }

    public final opx D() {
        return new opx(this, null, null);
    }

    public final void E(String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            F(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else if (str.startsWith(":")) {
            F("", str.substring(1));
        } else {
            F("", str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    public final void F(String str, String str2) {
        this.a.add(str);
        this.a.add(str2.trim());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, java.lang.Object] */
    public final void G(String str) {
        int i = 0;
        while (i < this.a.size()) {
            if (str.equalsIgnoreCase((String) this.a.get(i))) {
                this.a.remove(i);
                this.a.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final void H(String str, String str2) {
        opx.f(str);
        opx.g(str2, str);
        G(str);
        F(str, str2);
    }

    public final void I(String str, String str2) {
        opx.f(str);
        opx.g(str2, str);
        F(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public final Object a(mlt mltVar) {
        try {
            return mltVar.call();
        } catch (Throwable th) {
            this.a.uncaughtException(Thread.currentThread(), th);
            throw new mls(th);
        }
    }

    public final void b(Runnable runnable) {
        a(new jor(runnable, 3));
    }

    public final Uri c() {
        String str = ((mnm) this.a).b;
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    public final void f(int i, boolean z) {
        ((Cnew) this.a).l(i, z);
    }

    public final void g(int i, nem nemVar) {
        ((Cnew) this.a).m(i, nemVar);
    }

    public final void h(int i, double d) {
        ((Cnew) this.a).an(i, d);
    }

    public final void i(int i, int i2) {
        ((Cnew) this.a).s(i, i2);
    }

    public final void j(int i, int i2) {
        ((Cnew) this.a).o(i, i2);
    }

    public final void k(int i, long j) {
        ((Cnew) this.a).q(i, j);
    }

    public final void l(int i, float f) {
        ((Cnew) this.a).ap(i, f);
    }

    public final void m(int i, Object obj, nho nhoVar) {
        Cnew cnew = (Cnew) this.a;
        cnew.A(i, 3);
        nhoVar.l((ngz) obj, cnew.f);
        cnew.A(i, 4);
    }

    public final void n(int i, int i2) {
        ((Cnew) this.a).s(i, i2);
    }

    public final void o(int i, long j) {
        ((Cnew) this.a).D(i, j);
    }

    public final void p(int i, Object obj, nho nhoVar) {
        ((Cnew) this.a).u(i, (ngz) obj, nhoVar);
    }

    public final void q(int i, Object obj) {
        if (obj instanceof nem) {
            ((Cnew) this.a).x(i, (nem) obj);
            return;
        }
        ((Cnew) this.a).w(i, (ngz) obj);
    }

    public final void r(int i, int i2) {
        ((Cnew) this.a).o(i, i2);
    }

    public final void s(int i, long j) {
        ((Cnew) this.a).q(i, j);
    }

    public final void t(int i, int i2) {
        ((Cnew) this.a).as(i, i2);
    }

    public final void u(int i, long j) {
        ((Cnew) this.a).au(i, j);
    }

    public final void v(int i, String str) {
        ((Cnew) this.a).y(i, str);
    }

    public final void w(int i, int i2) {
        ((Cnew) this.a).B(i, i2);
    }

    public final void x(int i, long j) {
        ((Cnew) this.a).D(i, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized void z(oqo oqoVar) {
        this.a.remove(oqoVar);
    }

    public mlu(Cnew cnew) {
        ngb.i(cnew, "output");
        this.a = cnew;
        cnew.f = this;
    }

    public mlu(byte[] bArr) {
        this.a = new ArrayList(20);
    }

    public mlu() {
        this.a = new LinkedHashSet();
    }
}
