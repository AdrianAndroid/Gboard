package defpackage;

import android.net.Uri;
import com.google.android.inputmethod.latin.R;
import j$.util.Collection$EL;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dxs  reason: default package */
/* loaded from: classes.dex */
public final class dxs {
    public final Object a;
    public final Object b;

    public dxs(byy byyVar, dhu dhuVar) {
        this.a = byyVar;
        this.b = dhuVar;
    }

    public dxs(ihq ihqVar, mkr mkrVar) {
        this.a = ihqVar;
        this.b = mkrVar;
    }

    public dxs(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public dxs(byte[] bArr, byte[] bArr2) {
        this.a = btn.a(R.raw.f147470_resource_name_obfuscated_res_0x7f130064);
        this.b = btn.b(R.raw.f147490_resource_name_obfuscated_res_0x7f130066);
    }

    public static djc t() {
        return new djc();
    }

    public static dxs u() {
        return t().g();
    }

    private final char v(int i) {
        return ((char[]) this.a)[i + i];
    }

    private final char w(int i) {
        return ((char[]) this.a)[i + i + 1];
    }

    private final int x() {
        return ((char[]) this.a).length >> 1;
    }

    public final boolean a() {
        return ((fgw) ((AtomicReference) this.b).get()).d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final int b() {
        return this.b.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final int c() {
        return this.a.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final int d(int i) {
        if (i >= this.a.size()) {
            return -1;
        }
        return ((Integer) this.a.get(i)).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final int e(int i) {
        if (i >= this.b.size()) {
            return -1;
        }
        return ((Integer) this.b.get(i)).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    public final void f() {
        this.b.clear();
        this.a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    public final void g(int i, int i2) {
        if (i < this.a.size()) {
            if (((Integer) this.a.get(i)).intValue() != i2) {
                throw new lgj("The candidate finish index should be unchanged.");
            }
        } else if (this.a.size() != i) {
            throw new lgj("The candidate finish index list size should be equal to the page number.");
        } else {
            this.a.add(Integer.valueOf(i2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    public final void h(int i, int i2) {
        if (i < this.b.size()) {
            if (((Integer) this.b.get(i)).intValue() != i2) {
                throw new lgj("The candidate start index should be unchanged.");
            }
        } else if (this.b.size() != i) {
            throw new lgj("The candidate start index list size should be equal to the page number.");
        } else {
            this.b.add(Integer.valueOf(i2));
        }
    }

    public final hiz i(cyw cywVar) {
        return hiz.k(((ihq) this.a).c(cywVar.n()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final hiz j(cyw cywVar) {
        return i(cywVar).u(cuv.r, this.b);
    }

    public final hja k(cyu cyuVar) {
        return hjg.f(new cjq(this, cyuVar, 6, (byte[]) null, (byte[]) null));
    }

    public final void l(Uri uri) {
        Object obj = this.a;
        iig a = iih.a();
        a.h(uri);
        a.g();
        a.e(iil.a);
        a.f(2);
        hiz.k(((ihq) obj).c(a.a()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final chh m(Uri uri) {
        return this.b.contains(uri) ? chh.PENDING : chh.DONE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection, java.lang.Object] */
    public final void n(Object obj, chg chgVar) {
        this.a.put(obj, chgVar);
        Collection$EL.stream(this.b).forEach(new chf(chgVar, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    public final void o(cqp cqpVar) {
        Uri d = cqpVar.d();
        if (this.b.remove(d)) {
            Collection$EL.stream(this.a.values()).forEach(new chf(d, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void p(Object obj) {
        this.a.remove(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    public final void q(cqp cqpVar) {
        Uri d = cqpVar.d();
        if (this.b.add(d)) {
            Collection$EL.stream(this.a.values()).forEach(new chf(d, 0));
        }
    }

    public final char r(char c) {
        int x = x() - 1;
        int i = 0;
        while (i <= x) {
            int i2 = (i + x) >> 1;
            char v = v(i2);
            if (v < c) {
                i = i2 + 1;
            } else if (v <= c) {
                return w(i2);
            } else {
                x = i2 - 1;
            }
        }
        return c;
    }

    public final char s(char c) {
        int x = x() - 1;
        int i = 0;
        while (i <= x) {
            int i2 = (i + x) >> 1;
            short s = ((short[]) this.b)[i2];
            char w = w(s);
            if (w < c) {
                i = i2 + 1;
            } else if (w <= c) {
                return v(s);
            } else {
                x = i2 - 1;
            }
        }
        return c;
    }

    public dxs(byte[] bArr) {
        this.b = new qq();
        this.a = new qo();
    }

    public dxs() {
        this.b = lre.A();
        this.a = lre.A();
    }

    public dxs(dup dupVar) {
        this.b = new AtomicReference(fgw.f);
        this.a = dupVar;
    }
}
