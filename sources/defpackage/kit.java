package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: kit  reason: default package */
/* loaded from: classes.dex */
public final class kit {
    private static final lfy d = lfy.c('/').b();
    static final kis a = new kir(1);
    static final kis b = new kir(0);
    static final kis c = new kir(2);

    public static oos a(oos oosVar) {
        nfh nfhVar = (nfh) oosVar.N(5);
        nfhVar.cG(oosVar);
        b(a, nfhVar);
        ond ondVar = ((oos) nfhVar.b).i;
        if (ondVar == null) {
            ondVar = ond.c;
        }
        if ((ondVar.a & 1) != 0) {
            ond ondVar2 = ((oos) nfhVar.b).i;
            if (ondVar2 == null) {
                ondVar2 = ond.c;
            }
            onc oncVar = ondVar2.b;
            if (oncVar == null) {
                oncVar = onc.k;
            }
            nfh nfhVar2 = (nfh) oncVar.N(5);
            nfhVar2.cG(oncVar);
            b(b, nfhVar2);
            ond ondVar3 = ((oos) nfhVar.b).i;
            if (ondVar3 == null) {
                ondVar3 = ond.c;
            }
            nfh nfhVar3 = (nfh) ondVar3.N(5);
            nfhVar3.cG(ondVar3);
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            ond ondVar4 = (ond) nfhVar3.b;
            onc oncVar2 = (onc) nfhVar2.cz();
            oncVar2.getClass();
            ondVar4.b = oncVar2;
            ondVar4.a |= 1;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            oos oosVar2 = (oos) nfhVar.b;
            ond ondVar5 = (ond) nfhVar3.cz();
            ondVar5.getClass();
            oosVar2.i = ondVar5;
            oosVar2.a |= 256;
        }
        oog oogVar = ((oos) nfhVar.b).g;
        if (oogVar == null) {
            oogVar = oog.j;
        }
        if ((oogVar.a & 256) != 0) {
            oog oogVar2 = ((oos) nfhVar.b).g;
            if (oogVar2 == null) {
                oogVar2 = oog.j;
            }
            mgx mgxVar = oogVar2.h;
            if (mgxVar == null) {
                mgxVar = mgx.f;
            }
            nfh nfhVar4 = (nfh) mgxVar.N(5);
            nfhVar4.cG(mgxVar);
            mgu mguVar = ((mgx) nfhVar4.b).d;
            if (mguVar == null) {
                mguVar = mgu.f;
            }
            nfh nfhVar5 = (nfh) mguVar.N(5);
            nfhVar5.cG(mguVar);
            String str = ((mgu) nfhVar5.b).c;
            if (!str.isEmpty()) {
                long longValue = mln.a(str).longValue();
                if (nfhVar5.c) {
                    nfhVar5.cD();
                    nfhVar5.c = false;
                }
                mgu mguVar2 = (mgu) nfhVar5.b;
                int i = mguVar2.a | 4;
                mguVar2.a = i;
                mguVar2.d = longValue;
                mguVar2.a = i & (-3);
                mguVar2.c = mgu.f.c;
            }
            mgu mguVar3 = (mgu) nfhVar5.cz();
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            mgx mgxVar2 = (mgx) nfhVar4.b;
            mguVar3.getClass();
            mgxVar2.d = mguVar3;
            mgxVar2.a |= 1;
            List<mgu> unmodifiableList = Collections.unmodifiableList(mgxVar2.e);
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            ((mgx) nfhVar4.b).e = mgx.G();
            for (mgu mguVar4 : unmodifiableList) {
                nfh nfhVar6 = (nfh) mguVar4.N(5);
                nfhVar6.cG(mguVar4);
                String str2 = ((mgu) nfhVar6.b).c;
                if (!str2.isEmpty()) {
                    long longValue2 = mln.a(str2).longValue();
                    if (nfhVar6.c) {
                        nfhVar6.cD();
                        nfhVar6.c = false;
                    }
                    mgu mguVar5 = (mgu) nfhVar6.b;
                    int i2 = mguVar5.a | 4;
                    mguVar5.a = i2;
                    mguVar5.d = longValue2;
                    mguVar5.a = i2 & (-3);
                    mguVar5.c = mgu.f.c;
                }
                mgu mguVar6 = (mgu) nfhVar6.cz();
                if (nfhVar4.c) {
                    nfhVar4.cD();
                    nfhVar4.c = false;
                }
                mgx mgxVar3 = (mgx) nfhVar4.b;
                mguVar6.getClass();
                mgxVar3.b();
                mgxVar3.e.add(mguVar6);
            }
            oog oogVar3 = ((oos) nfhVar.b).g;
            if (oogVar3 == null) {
                oogVar3 = oog.j;
            }
            nfh nfhVar7 = (nfh) oogVar3.N(5);
            nfhVar7.cG(oogVar3);
            mgx mgxVar4 = (mgx) nfhVar4.cz();
            if (nfhVar7.c) {
                nfhVar7.cD();
                nfhVar7.c = false;
            }
            oog oogVar4 = (oog) nfhVar7.b;
            mgxVar4.getClass();
            oogVar4.h = mgxVar4;
            oogVar4.a |= 256;
            oog oogVar5 = (oog) nfhVar7.cz();
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            oos oosVar3 = (oos) nfhVar.b;
            oogVar5.getClass();
            oosVar3.g = oogVar5;
            oosVar3.a |= 64;
        }
        oon oonVar = ((oos) nfhVar.b).h;
        if (oonVar == null) {
            oonVar = oon.k;
        }
        if (oonVar.j.size() != 0) {
            oon oonVar2 = ((oos) nfhVar.b).h;
            if (oonVar2 == null) {
                oonVar2 = oon.k;
            }
            nfh nfhVar8 = (nfh) oonVar2.N(5);
            nfhVar8.cG(oonVar2);
            for (int i3 = 0; i3 < ((oon) nfhVar8.b).j.size(); i3++) {
                oom oomVar = (oom) ((oon) nfhVar8.b).j.get(i3);
                nfh nfhVar9 = (nfh) oomVar.N(5);
                nfhVar9.cG(oomVar);
                if (!((oom) nfhVar9.b).b.isEmpty()) {
                    if (nfhVar9.c) {
                        nfhVar9.cD();
                        nfhVar9.c = false;
                    }
                    ((oom) nfhVar9.b).c = oom.E();
                    List c2 = c(((oom) nfhVar9.b).b);
                    if (nfhVar9.c) {
                        nfhVar9.cD();
                        nfhVar9.c = false;
                    }
                    oom oomVar2 = (oom) nfhVar9.b;
                    nfv nfvVar = oomVar2.c;
                    if (!nfvVar.c()) {
                        oomVar2.c = nfm.F(nfvVar);
                    }
                    ndt.cs(c2, oomVar2.c);
                }
                if (nfhVar9.c) {
                    nfhVar9.cD();
                    nfhVar9.c = false;
                }
                oom oomVar3 = (oom) nfhVar9.b;
                oomVar3.a &= -2;
                oomVar3.b = oom.f.b;
                if (nfhVar8.c) {
                    nfhVar8.cD();
                    nfhVar8.c = false;
                }
                oon oonVar3 = (oon) nfhVar8.b;
                oom oomVar4 = (oom) nfhVar9.cz();
                oomVar4.getClass();
                oonVar3.c();
                oonVar3.j.set(i3, oomVar4);
            }
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            oos oosVar4 = (oos) nfhVar.b;
            oon oonVar4 = (oon) nfhVar8.cz();
            oonVar4.getClass();
            oosVar4.h = oonVar4;
            oosVar4.a |= 128;
        }
        onw onwVar = ((oos) nfhVar.b).f;
        if (onwVar == null) {
            onwVar = onw.b;
        }
        if (onwVar.a.size() != 0) {
            onw onwVar2 = ((oos) nfhVar.b).f;
            if (onwVar2 == null) {
                onwVar2 = onw.b;
            }
            nfh nfhVar10 = (nfh) onwVar2.N(5);
            nfhVar10.cG(onwVar2);
            for (int i4 = 0; i4 < ((onw) nfhVar10.b).a.size(); i4++) {
                onv onvVar = (onv) ((onw) nfhVar10.b).a.get(i4);
                nfh nfhVar11 = (nfh) onvVar.N(5);
                nfhVar11.cG(onvVar);
                if (!((onv) nfhVar11.b).r.isEmpty()) {
                    if (nfhVar11.c) {
                        nfhVar11.cD();
                        nfhVar11.c = false;
                    }
                    ((onv) nfhVar11.b).s = onv.E();
                    List c3 = c(((onv) nfhVar11.b).r);
                    if (nfhVar11.c) {
                        nfhVar11.cD();
                        nfhVar11.c = false;
                    }
                    onv onvVar2 = (onv) nfhVar11.b;
                    nfv nfvVar2 = onvVar2.s;
                    if (!nfvVar2.c()) {
                        onvVar2.s = nfm.F(nfvVar2);
                    }
                    ndt.cs(c3, onvVar2.s);
                }
                if (nfhVar11.c) {
                    nfhVar11.cD();
                    nfhVar11.c = false;
                }
                onv onvVar3 = (onv) nfhVar11.b;
                onvVar3.a &= -524289;
                onvVar3.r = onv.u.r;
                if (nfhVar10.c) {
                    nfhVar10.cD();
                    nfhVar10.c = false;
                }
                onw onwVar3 = (onw) nfhVar10.b;
                onv onvVar4 = (onv) nfhVar11.cz();
                onvVar4.getClass();
                onwVar3.c();
                onwVar3.a.set(i4, onvVar4);
            }
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            oos oosVar5 = (oos) nfhVar.b;
            onw onwVar4 = (onw) nfhVar10.cz();
            onwVar4.getClass();
            oosVar5.f = onwVar4;
            oosVar5.a |= 32;
        }
        onx onxVar = ((oos) nfhVar.b).k;
        if (onxVar == null) {
            onxVar = onx.b;
        }
        if (onxVar.a.size() != 0) {
            onx onxVar2 = ((oos) nfhVar.b).k;
            if (onxVar2 == null) {
                onxVar2 = onx.b;
            }
            nfh nfhVar12 = (nfh) onxVar2.N(5);
            nfhVar12.cG(onxVar2);
            for (int i5 = 0; i5 < ((onx) nfhVar12.b).a.size(); i5++) {
                ony onyVar = (ony) ((onx) nfhVar12.b).a.get(i5);
                nfh nfhVar13 = (nfh) onyVar.N(5);
                nfhVar13.cG(onyVar);
                b(c, nfhVar13);
                if (nfhVar12.c) {
                    nfhVar12.cD();
                    nfhVar12.c = false;
                }
                onx onxVar3 = (onx) nfhVar12.b;
                ony onyVar2 = (ony) nfhVar13.cz();
                onyVar2.getClass();
                nga ngaVar = onxVar3.a;
                if (!ngaVar.c()) {
                    onxVar3.a = nfm.H(ngaVar);
                }
                onxVar3.a.set(i5, onyVar2);
            }
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            oos oosVar6 = (oos) nfhVar.b;
            onx onxVar4 = (onx) nfhVar12.cz();
            onxVar4.getClass();
            oosVar6.k = onxVar4;
            oosVar6.a |= 4096;
        }
        return (oos) nfhVar.cz();
    }

    static void b(kis kisVar, ngy ngyVar) {
        String a2 = kisVar.a(ngyVar);
        String b2 = kisVar.b(ngyVar);
        if (!TextUtils.isEmpty(a2) || TextUtils.isEmpty(b2)) {
            kisVar.c(ngyVar, null);
        } else {
            kisVar.c(ngyVar, mln.a(b2));
        }
        kisVar.d(ngyVar);
    }

    private static List c(String str) {
        return lre.H(d.k(str), jky.p);
    }
}
