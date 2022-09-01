package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: egb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class egb implements hiu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ egb(egf egfVar, AtomicReference atomicReference, hiz hizVar, hiz hizVar2, hiz hizVar3, int i) {
        this.f = i;
        this.a = egfVar;
        this.b = atomicReference;
        this.c = hizVar;
        this.d = hizVar2;
        this.e = hizVar3;
    }

    public /* synthetic */ egb(egj egjVar, AtomicReference atomicReference, hiz hizVar, hiz hizVar2, hiz hizVar3, int i) {
        this.f = i;
        this.a = egjVar;
        this.b = atomicReference;
        this.c = hizVar;
        this.d = hizVar2;
        this.e = hizVar3;
    }

    public /* synthetic */ egb(ehp ehpVar, cqp cqpVar, ehn ehnVar, String str, hfl hflVar, int i) {
        this.f = i;
        this.d = ehpVar;
        this.a = cqpVar;
        this.c = ehnVar;
        this.b = str;
        this.e = hflVar;
    }

    public /* synthetic */ egb(eis eisVar, cqp cqpVar, eip eipVar, String str, hfl hflVar, int i) {
        this.f = i;
        this.d = eisVar;
        this.a = cqpVar;
        this.c = eipVar;
        this.b = str;
        this.e = hflVar;
    }

    @Override // defpackage.hiu
    public final void a(Object obj) {
        View x;
        cuj a;
        View x2;
        cuj a2;
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.a;
            Throwable th = (Throwable) obj;
            egf egfVar = (egf) obj2;
            egfVar.g((AtomicReference) this.b, (hiz) this.c, (hiz) this.d, (hiz) this.e);
        } else if (i == 1) {
            Object obj3 = this.a;
            Void r15 = (Void) obj;
            egf egfVar2 = (egf) obj3;
            egfVar2.g((AtomicReference) this.b, (hiz) this.c, (hiz) this.d, (hiz) this.e);
        } else if (i == 2) {
            Object obj4 = this.a;
            Void r152 = (Void) obj;
            egj egjVar = (egj) obj4;
            egjVar.f((AtomicReference) this.b, (hiz) this.c, (hiz) this.d, (hiz) this.e);
        } else if (i == 3) {
            Object obj5 = this.a;
            Throwable th2 = (Throwable) obj;
            egj egjVar2 = (egj) obj5;
            egjVar2.f((AtomicReference) this.b, (hiz) this.c, (hiz) this.d, (hiz) this.e);
        } else if (i != 4) {
            Object obj6 = this.d;
            Object obj7 = this.a;
            Object obj8 = this.c;
            Object obj9 = this.b;
            Object obj10 = this.e;
            crc crcVar = (crc) obj;
            eis eisVar = (eis) obj6;
            eisVar.y.o((cqp) obj7);
            if (eisVar.f.fq() && eisVar.l == eir.MY_PACKS && eisVar.p != 2 && (x2 = eisVar.c.x(Integer.valueOf(ehi.g(2)))) != null && (a2 = eis.h(x2).a()) != null) {
                a2.G(eisVar.j());
            }
            idk idkVar = eisVar.i;
            ctd ctdVar = ctd.IMAGE_SHARE;
            Object[] objArr = new Object[2];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 3;
            int i2 = mbcVar.a | 1;
            mbcVar.a = i2;
            eip eipVar = (eip) obj8;
            mbcVar.c = eipVar.b - 1;
            mbcVar.a = 2 | i2;
            mbs b = crcVar.b();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            b.getClass();
            mbcVar2.h = b;
            int i3 = mbcVar2.a | 128;
            mbcVar2.a = i3;
            obj9.getClass();
            mbcVar2.a = i3 | 1024;
            mbcVar2.j = (String) obj9;
            nfh t2 = mbb.g.t();
            String str = eipVar.a;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbb mbbVar = (mbb) t2.b;
            mbbVar.a |= 1;
            mbbVar.b = str;
            mbb mbbVar2 = (mbb) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbbVar2.getClass();
            mbcVar3.e = mbbVar2;
            mbcVar3.a |= 8;
            int a3 = cte.a((hfl) obj10);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar4 = (mbc) t.b;
            mbcVar4.d = a3 - 1;
            mbcVar4.a |= 4;
            objArr[0] = t.cz();
            objArr[1] = crcVar;
            idkVar.e(ctdVar, objArr);
        } else {
            Object obj11 = this.d;
            Object obj12 = this.a;
            Object obj13 = this.c;
            Object obj14 = this.b;
            Object obj15 = this.e;
            crc crcVar2 = (crc) obj;
            ehp ehpVar = (ehp) obj11;
            ehpVar.v.o((cqp) obj12);
            if (ehpVar.f.fq() && ehpVar.m == eho.MY_PACKS && ehpVar.g.k != 2 && (x = ehpVar.c.x(Integer.valueOf(ehi.g(2)))) != null && (a = ehp.c(x).a()) != null) {
                a.G(ehpVar.f());
            }
            idk idkVar2 = ehpVar.j;
            ctd ctdVar2 = ctd.IMAGE_SHARE;
            Object[] objArr2 = new Object[2];
            nfh t3 = mbc.p.t();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar5 = (mbc) t3.b;
            mbcVar5.b = 3;
            int i4 = mbcVar5.a | 1;
            mbcVar5.a = i4;
            ehn ehnVar = (ehn) obj13;
            mbcVar5.c = ehnVar.b - 1;
            mbcVar5.a = 2 | i4;
            mbs b2 = crcVar2.b();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar6 = (mbc) t3.b;
            b2.getClass();
            mbcVar6.h = b2;
            int i5 = mbcVar6.a | 128;
            mbcVar6.a = i5;
            obj14.getClass();
            mbcVar6.a = i5 | 1024;
            mbcVar6.j = (String) obj14;
            nfh t4 = mbb.g.t();
            String str2 = ehnVar.a;
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mbb mbbVar3 = (mbb) t4.b;
            mbbVar3.a |= 1;
            mbbVar3.b = str2;
            mbb mbbVar4 = (mbb) t4.cz();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar7 = (mbc) t3.b;
            mbbVar4.getClass();
            mbcVar7.e = mbbVar4;
            mbcVar7.a |= 8;
            int a4 = cte.a((hfl) obj15);
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbc mbcVar8 = (mbc) t3.b;
            mbcVar8.d = a4 - 1;
            mbcVar8.a |= 4;
            objArr2[0] = t3.cz();
            objArr2[1] = crcVar2;
            idkVar2.e(ctdVar2, objArr2);
        }
    }
}
