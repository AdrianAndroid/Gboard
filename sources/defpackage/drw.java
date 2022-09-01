package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: drw  reason: default package */
/* loaded from: classes.dex */
public final class drw implements idm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/mozc/metrics/MozcClearcutMetricsProcessor");
    public static final String b = new Locale("ja", "JP").toString();
    public final idi c;
    long f;
    public int g;
    public nfh h;
    public llp e = llp.q();
    private final idb i = new drx(this);
    public final ino d = ino.L();

    public drw(idi idiVar) {
        this.c = idiVar;
    }

    public static int a(String str) {
        return lfd.d(str).length();
    }

    public static maf b(gfw gfwVar, int i) {
        if (gfwVar == null || (gfwVar.a & 8) == 0) {
            return null;
        }
        nfh t = maf.o.t();
        int a2 = a(gfwVar.c);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar = (maf) t.b;
        int i2 = mafVar.a | 64;
        mafVar.a = i2;
        mafVar.e = a2;
        mafVar.a = i2 | 128;
        mafVar.f = i;
        nfu<gfu> nfuVar = new nfu(gfwVar.e, gfw.f);
        int i3 = 3;
        int i4 = 2;
        if (!nfuVar.isEmpty()) {
            int i5 = 0;
            for (gfu gfuVar : nfuVar) {
                gfu gfuVar2 = gfu.DEFAULT_ATTRIBUTE;
                int ordinal = gfuVar.ordinal();
                if (ordinal == 1) {
                    i5 |= 16;
                } else if (ordinal == 2) {
                    i5 |= 8;
                } else if (ordinal == 3 || ordinal == 4) {
                    i5 |= 2;
                }
            }
            i4 = i5;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar2 = (maf) t.b;
        mafVar2.a |= 1;
        mafVar2.b = i4;
        gft gftVar = gfwVar.d;
        if (gftVar == null) {
            gftVar = gft.c;
        }
        String str = gftVar.b;
        if (!str.startsWith("絵文字")) {
            if (str.startsWith("顔文字")) {
                i3 = 20;
            } else {
                i3 = str.startsWith("部分") ? 10 : 0;
            }
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar3 = (maf) t.b;
        int i6 = mafVar3.a | 8;
        mafVar3.a = i6;
        mafVar3.c = i3;
        int i7 = gfwVar.g;
        if (i7 > 1) {
            mafVar3.a = i6 | 32;
            mafVar3.d = i7;
        }
        return (maf) t.cz();
    }

    public static List c(gfv gfvVar, int i, int i2) {
        maf b2;
        if (gfvVar == null || gfvVar.c.size() == 0) {
            return new ArrayList();
        }
        int size = gfvVar.c.size();
        ArrayList arrayList = new ArrayList(Math.min(i2, size));
        for (int i3 = 0; i3 < size && arrayList.size() < i2; i3++) {
            if (i3 != i && (b2 = b((gfw) gfvVar.c.get(i3), i3)) != null) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    public static final long g() {
        return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE) + 1;
    }

    public final void d(nfh nfhVar, int i) {
        idi idiVar = this.c;
        mde mdeVar = ieo.a().a;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mdeVar.getClass();
        mbhVar.A = mdeVar;
        mbhVar.a |= 536870912;
        mbh mbhVar3 = (mbh) nfhVar.cz();
        idb idbVar = this.i;
        idiVar.f(mbhVar3, i, idbVar.c, idbVar.d);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.i.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return drx.a;
    }
}
