package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iuk  reason: default package */
/* loaded from: classes.dex */
public final class iuk implements itt {
    public static final /* synthetic */ int a = 0;
    private static final mxr b = mxr.l;
    private final Context c;
    private final ixi d;
    private final iur e;
    private myh f;

    public iuk(Context context, ixi ixiVar) {
        this.c = context;
        this.d = ixiVar;
        this.e = new iur(context);
    }

    @Override // defpackage.itt
    public final llp a() {
        oxp oxpVar;
        myh myhVar = this.f;
        if (myhVar != null) {
            nfh t = oxr.b.t();
            mxr mxrVar = b;
            String str = mxrVar.i;
            nfh t2 = oxp.c.t();
            nfh t3 = oxn.b.t();
            t3.eP(nem.w(Build.MANUFACTURER));
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            oxp oxpVar2 = (oxp) t2.b;
            oxn oxnVar = (oxn) t3.cz();
            oxnVar.getClass();
            oxpVar2.b = oxnVar;
            oxpVar2.a = 1;
            t.eQ(str, (oxp) t2.cz());
            String str2 = mxrVar.h;
            nfh t4 = oxp.c.t();
            nfh t5 = oxn.b.t();
            t5.eP(nem.w(Build.MODEL));
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            oxp oxpVar3 = (oxp) t4.b;
            oxn oxnVar2 = (oxn) t5.cz();
            oxnVar2.getClass();
            oxpVar3.b = oxnVar2;
            oxpVar3.a = 1;
            t.eQ(str2, (oxp) t4.cz());
            irp b2 = irp.b();
            String Y = jdg.Y(lfd.d(b2 == null ? null : b2.a));
            String Y2 = jdg.Y(lfd.d(b2 == null ? null : b2.b));
            String str3 = mxrVar.j;
            nfh t6 = oxp.c.t();
            nfh t7 = oxn.b.t();
            t7.eP(nem.w(Y));
            if (t6.c) {
                t6.cD();
                t6.c = false;
            }
            oxp oxpVar4 = (oxp) t6.b;
            oxn oxnVar3 = (oxn) t7.cz();
            oxnVar3.getClass();
            oxpVar4.b = oxnVar3;
            oxpVar4.a = 1;
            t.eQ(str3, (oxp) t6.cz());
            String str4 = mxrVar.k;
            nfh t8 = oxp.c.t();
            nfh t9 = oxn.b.t();
            t9.eP(nem.w(Y2));
            if (t8.c) {
                t8.cD();
                t8.c = false;
            }
            oxp oxpVar5 = (oxp) t8.b;
            oxn oxnVar4 = (oxn) t9.cz();
            oxnVar4.getClass();
            oxpVar5.b = oxnVar4;
            oxpVar5.a = 1;
            t.eQ(str4, (oxp) t8.cz());
            String str5 = mxrVar.a;
            nfh t10 = oxp.c.t();
            nfh t11 = oxt.b.t();
            t11.eS(jam.e(this.c));
            if (t10.c) {
                t10.cD();
                t10.c = false;
            }
            oxp oxpVar6 = (oxp) t10.b;
            oxt oxtVar = (oxt) t11.cz();
            oxtVar.getClass();
            oxpVar6.b = oxtVar;
            oxpVar6.a = 3;
            t.eQ(str5, (oxp) t10.cz());
            String str6 = mxrVar.b;
            nfh t12 = oxp.c.t();
            nfh t13 = oxn.b.t();
            t13.eO(lre.H(Arrays.asList(jam.G()), hwy.p));
            if (t12.c) {
                t12.cD();
                t12.c = false;
            }
            oxp oxpVar7 = (oxp) t12.b;
            oxn oxnVar5 = (oxn) t13.cz();
            oxnVar5.getClass();
            oxpVar7.b = oxnVar5;
            oxpVar7.a = 1;
            t.eQ(str6, (oxp) t12.cz());
            ArrayList arrayList = new ArrayList();
            llp b3 = hqr.b();
            int size = b3.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((hqt) b3.get(i)).h());
            }
            mxr mxrVar2 = b;
            String str7 = mxrVar2.c;
            nfh t14 = oxp.c.t();
            nfh t15 = oxn.b.t();
            t15.eO(lre.H(arrayList, hwy.q));
            if (t14.c) {
                t14.cD();
                t14.c = false;
            }
            oxp oxpVar8 = (oxp) t14.b;
            oxn oxnVar6 = (oxn) t15.cz();
            oxnVar6.getClass();
            oxpVar8.b = oxnVar6;
            oxpVar8.a = 1;
            t.eQ(str7, (oxp) t14.cz());
            String str8 = mxrVar2.g;
            Context context = this.c;
            ixi ixiVar = this.d;
            lmz p = lmz.p(arrayList);
            lmz p2 = lmz.p(new nfu(myhVar.c, myh.d));
            if (p2.isEmpty()) {
                oxpVar = oxp.c;
            } else {
                llp b4 = iuj.b(context, ixiVar, p, p2, ieh.j());
                if (b4.isEmpty()) {
                    oxpVar = oxp.c;
                } else {
                    nfh t16 = oxp.c.t();
                    nfh t17 = oxn.b.t();
                    t17.eO(lre.H(b4, hwy.r));
                    oxn oxnVar7 = (oxn) t17.cz();
                    if (t16.c) {
                        t16.cD();
                        t16.c = false;
                    }
                    oxp oxpVar9 = (oxp) t16.b;
                    oxnVar7.getClass();
                    oxpVar9.b = oxnVar7;
                    oxpVar9.a = 1;
                    oxpVar = (oxp) t16.cz();
                }
            }
            t.eQ(str8, oxpVar);
            String str9 = mxrVar2.d;
            nfh t18 = oxp.c.t();
            nfh t19 = oxt.b.t();
            t19.eS(this.d.b(iuy.j, myc.h, this.e));
            if (t18.c) {
                t18.cD();
                t18.c = false;
            }
            oxp oxpVar10 = (oxp) t18.b;
            oxt oxtVar2 = (oxt) t19.cz();
            oxtVar2.getClass();
            oxpVar10.b = oxtVar2;
            oxpVar10.a = 3;
            t.eQ(str9, (oxp) t18.cz());
            for (myf myfVar : myhVar.a) {
                String concat = String.valueOf(b.e).concat(String.valueOf(myfVar.a));
                nfh t20 = oxp.c.t();
                nfh t21 = oxt.b.t();
                ixi ixiVar2 = this.d;
                iuy iuyVar = iuy.j;
                myc mycVar = myfVar.b;
                if (mycVar == null) {
                    mycVar = myc.h;
                }
                t21.eS(ixiVar2.b(iuyVar, mycVar, this.e));
                if (t20.c) {
                    t20.cD();
                    t20.c = false;
                }
                oxp oxpVar11 = (oxp) t20.b;
                oxt oxtVar3 = (oxt) t21.cz();
                oxtVar3.getClass();
                oxpVar11.b = oxtVar3;
                oxpVar11.a = 3;
                t.eQ(concat, (oxp) t20.cz());
            }
            for (myg mygVar : myhVar.b) {
                String concat2 = String.valueOf(b.f).concat(String.valueOf(mygVar.a));
                nfh t22 = oxp.c.t();
                nfh t23 = oxs.b.t();
                ixi ixiVar3 = this.d;
                iuy iuyVar2 = iuy.j;
                myc mycVar2 = mygVar.c;
                if (mycVar2 == null) {
                    mycVar2 = myc.h;
                }
                t23.eR((float) ixiVar3.a(iuyVar2, mycVar2, this.e, mygVar.b));
                if (t22.c) {
                    t22.cD();
                    t22.c = false;
                }
                oxp oxpVar12 = (oxp) t22.b;
                oxs oxsVar = (oxs) t23.cz();
                oxsVar.getClass();
                oxpVar12.b = oxsVar;
                oxpVar12.a = 2;
                t.eQ(concat2, (oxp) t22.cz());
            }
            nfh t24 = oxo.b.t();
            if (t24.c) {
                t24.cD();
                t24.c = false;
            }
            oxr oxrVar = (oxr) t.cz();
            oxrVar.getClass();
            ((oxo) t24.b).a = oxrVar;
            llp r = llp.r(new jls((byte[]) null, ((oxo) t24.cz()).q()));
            this.f = null;
            return r;
        }
        return llp.q();
    }

    @Override // defpackage.itt
    public final void b(int i) {
    }

    @Override // defpackage.itt
    public final void c(String str, byte[] bArr, byte[] bArr2) {
        this.f = null;
        try {
            nem nemVar = ((ndy) nfm.z(ndy.c, bArr, nfb.b())).b;
            nfb b2 = nfb.b();
            myh myhVar = myh.e;
            ner l = nemVar.l();
            nfm nfmVar = (nfm) myhVar.N(4);
            try {
                try {
                    try {
                        try {
                            nho b3 = nhh.a.b(nfmVar);
                            b3.h(nfmVar, nes.p(l), b2);
                            b3.f(nfmVar);
                            try {
                                l.z(0);
                                nfm.O(nfmVar);
                                this.f = (myh) nfmVar;
                            } catch (ngd e) {
                                throw e;
                            }
                        } catch (ngd e2) {
                            if (e2.a) {
                                throw new ngd(e2);
                            }
                        }
                    } catch (IOException e3) {
                        if (e3.getCause() instanceof ngd) {
                            throw ((ngd) e3.getCause());
                        }
                        throw new ngd(e3);
                    }
                } catch (nhz e4) {
                    throw e4.a();
                }
            } catch (RuntimeException e5) {
                if (e5.getCause() instanceof ngd) {
                    throw ((ngd) e5.getCause());
                }
                throw e5;
            }
        } catch (ngd e6) {
            throw new IllegalArgumentException("Failed to parse criteria", e6);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f = null;
    }
}
