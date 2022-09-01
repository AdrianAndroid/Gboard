package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: egn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class egn implements hiu {
    public final /* synthetic */ cqp a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ mba e;
    public final /* synthetic */ hfl f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ egn(egm egmVar, cqp cqpVar, int i, String str, String str2, mba mbaVar, hfl hflVar, int i2) {
        this.h = i2;
        this.g = egmVar;
        this.a = cqpVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = mbaVar;
        this.f = hflVar;
    }

    public /* synthetic */ egn(egp egpVar, cqp cqpVar, int i, String str, String str2, mba mbaVar, hfl hflVar, int i2) {
        this.h = i2;
        this.g = egpVar;
        this.a = cqpVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = mbaVar;
        this.f = hflVar;
    }

    @Override // defpackage.hiu
    public final void a(Object obj) {
        int i;
        int i2;
        char c;
        int i3;
        View x;
        cuj a;
        int i4;
        char c2;
        int i5;
        View x2;
        cuj a2;
        if (this.h != 0) {
            Object obj2 = this.g;
            cqp cqpVar = this.a;
            int i6 = this.b;
            String str = this.c;
            String str2 = this.d;
            mba mbaVar = this.e;
            hfl hflVar = this.f;
            crc crcVar = (crc) obj;
            egm egmVar = (egm) obj2;
            egmVar.l.o(cqpVar);
            if (egmVar.a.fq() && egmVar.k == 3 && egmVar.b.a() != 0 && (x2 = egmVar.b.x(0)) != null && (a2 = egm.c(x2).a()) != null) {
                a2.G(egmVar.h());
            }
            idk idkVar = egmVar.d;
            ctd ctdVar = ctd.IMAGE_SHARE;
            Object[] objArr = new Object[2];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 4;
            mbcVar.a |= 1;
            int i7 = egmVar.k;
            if (i7 == 3) {
                if (i6 == 0) {
                    i6 = 0;
                    i5 = 5;
                } else {
                    i5 = 2;
                }
                i4 = i5;
            } else {
                i4 = i7 == 4 ? 3 : 1;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = i4 - 1;
            mbcVar2.a |= 2;
            mbs b = crcVar.b();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            b.getClass();
            mbcVar3.h = b;
            int i8 = mbcVar3.a | 128;
            mbcVar3.a = i8;
            str.getClass();
            mbcVar3.a = i8 | 1024;
            mbcVar3.j = str;
            nfh t2 = mbb.g.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbb mbbVar = (mbb) t2.b;
            str2.getClass();
            int i9 = mbbVar.a | 1;
            mbbVar.a = i9;
            mbbVar.b = str2;
            mbbVar.e = mbaVar.e;
            int i10 = i9 | 8;
            mbbVar.a = i10;
            mbbVar.a = i10 | 4;
            mbbVar.d = i6;
            mbb mbbVar2 = (mbb) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar4 = (mbc) t.b;
            mbbVar2.getClass();
            mbcVar4.e = mbbVar2;
            mbcVar4.a |= 8;
            int a3 = cte.a(hflVar);
            if (t.c) {
                t.cD();
                c2 = 0;
                t.c = false;
            } else {
                c2 = 0;
            }
            mbc mbcVar5 = (mbc) t.b;
            mbcVar5.d = a3 - 1;
            mbcVar5.a |= 4;
            objArr[c2] = t.cz();
            objArr[1] = crcVar;
            idkVar.e(ctdVar, objArr);
            return;
        }
        Object obj3 = this.g;
        cqp cqpVar2 = this.a;
        int i11 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        mba mbaVar2 = this.e;
        hfl hflVar2 = this.f;
        crc crcVar2 = (crc) obj;
        egp egpVar = (egp) obj3;
        egpVar.q.o(cqpVar2);
        if (egpVar.a.fq() && egpVar.p == 3 && egpVar.b.a() != 1 && (x = egpVar.b.x(1)) != null && (a = egp.c(x).a()) != null) {
            a.G(egpVar.h());
        }
        idk idkVar2 = egpVar.d;
        ctd ctdVar2 = ctd.IMAGE_SHARE;
        Object[] objArr2 = new Object[2];
        nfh t3 = mbc.p.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar6 = (mbc) t3.b;
        mbcVar6.b = 4;
        mbcVar6.a |= 1;
        int i12 = egpVar.p;
        if (i12 == 3) {
            if (i11 == 1) {
                i11 = 1;
                i3 = 5;
            } else {
                i3 = 2;
            }
            i = i11;
            i2 = i3;
        } else if (i12 == 4) {
            i = i11;
            i2 = 3;
        } else {
            i = i11;
            i2 = 1;
        }
        mbc mbcVar7 = (mbc) t3.b;
        mbcVar7.c = i2 - 1;
        mbcVar7.a |= 2;
        mbs b2 = crcVar2.b();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar8 = (mbc) t3.b;
        b2.getClass();
        mbcVar8.h = b2;
        int i13 = mbcVar8.a | 128;
        mbcVar8.a = i13;
        str3.getClass();
        mbcVar8.a = i13 | 1024;
        mbcVar8.j = str3;
        nfh t4 = mbb.g.t();
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        mbb mbbVar3 = (mbb) t4.b;
        str4.getClass();
        int i14 = mbbVar3.a | 1;
        mbbVar3.a = i14;
        mbbVar3.b = str4;
        mbbVar3.e = mbaVar2.e;
        int i15 = i14 | 8;
        mbbVar3.a = i15;
        mbbVar3.a = i15 | 4;
        mbbVar3.d = i;
        mbb mbbVar4 = (mbb) t4.cz();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar9 = (mbc) t3.b;
        mbbVar4.getClass();
        mbcVar9.e = mbbVar4;
        mbcVar9.a |= 8;
        int a4 = cte.a(hflVar2);
        if (t3.c) {
            t3.cD();
            c = 0;
            t3.c = false;
        } else {
            c = 0;
        }
        mbc mbcVar10 = (mbc) t3.b;
        mbcVar10.d = a4 - 1;
        mbcVar10.a |= 4;
        objArr2[c] = t3.cz();
        objArr2[1] = crcVar2;
        idkVar2.e(ctdVar2, objArr2);
    }
}
