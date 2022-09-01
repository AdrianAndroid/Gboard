package defpackage;

import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;

/* compiled from: PG */
/* renamed from: eee  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eee implements hiu {
    public final /* synthetic */ cqp a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lfb c;
    public final /* synthetic */ String d;
    public final /* synthetic */ mba e;
    public final /* synthetic */ AbstractSearchResultKeyboard f;
    private final /* synthetic */ int g;

    public /* synthetic */ eee(GifKeyboardM2 gifKeyboardM2, cqp cqpVar, String str, lfb lfbVar, String str2, mba mbaVar, int i) {
        this.g = i;
        this.f = gifKeyboardM2;
        this.a = cqpVar;
        this.b = str;
        this.c = lfbVar;
        this.d = str2;
        this.e = mbaVar;
    }

    public /* synthetic */ eee(GifKeyboardTablet gifKeyboardTablet, cqp cqpVar, String str, lfb lfbVar, String str2, mba mbaVar, int i) {
        this.g = i;
        this.f = gifKeyboardTablet;
        this.a = cqpVar;
        this.b = str;
        this.c = lfbVar;
        this.d = str2;
        this.e = mbaVar;
    }

    @Override // defpackage.hiu
    public final void a(Object obj) {
        if (this.g == 0) {
            AbstractSearchResultKeyboard abstractSearchResultKeyboard = this.f;
            cqp cqpVar = this.a;
            String str = this.b;
            lfb lfbVar = this.c;
            String str2 = this.d;
            mba mbaVar = this.e;
            crc crcVar = (crc) obj;
            GifKeyboardTablet gifKeyboardTablet = (GifKeyboardTablet) abstractSearchResultKeyboard;
            gifKeyboardTablet.n.o(cqpVar);
            ieh j = ieh.j();
            ctd ctdVar = ctd.IMAGE_SHARE;
            Object[] objArr = new Object[2];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 2;
            mbcVar.a |= 1;
            int P = GifKeyboardTablet.P(str, lfbVar);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = P - 1;
            mbcVar2.a = 2 | mbcVar2.a;
            mbs b = crcVar.b();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            b.getClass();
            mbcVar3.h = b;
            mbcVar3.a |= 128;
            String d = lfd.d(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar4 = (mbc) t.b;
            mbcVar4.a |= 1024;
            mbcVar4.j = d;
            int a = cte.a(gifKeyboardTablet.k);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar5 = (mbc) t.b;
            mbcVar5.d = a - 1;
            mbcVar5.a |= 4;
            nfh t2 = mbb.g.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbb mbbVar = (mbb) t2.b;
            str2.getClass();
            int i = mbbVar.a | 1;
            mbbVar.a = i;
            mbbVar.b = str2;
            mbbVar.e = mbaVar.e;
            mbbVar.a = i | 8;
            mbb mbbVar2 = (mbb) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar6 = (mbc) t.b;
            mbbVar2.getClass();
            mbcVar6.e = mbbVar2;
            mbcVar6.a |= 8;
            objArr[0] = t.cz();
            objArr[1] = crcVar;
            j.e(ctdVar, objArr);
            int i2 = crcVar.b;
            crcVar.c();
            String str3 = crcVar.c.packageName;
            return;
        }
        AbstractSearchResultKeyboard abstractSearchResultKeyboard2 = this.f;
        cqp cqpVar2 = this.a;
        String str4 = this.b;
        lfb lfbVar2 = this.c;
        String str5 = this.d;
        mba mbaVar2 = this.e;
        crc crcVar2 = (crc) obj;
        GifKeyboardM2 gifKeyboardM2 = (GifKeyboardM2) abstractSearchResultKeyboard2;
        gifKeyboardM2.n.o(cqpVar2);
        ieh j2 = ieh.j();
        ctd ctdVar2 = ctd.IMAGE_SHARE;
        Object[] objArr2 = new Object[2];
        nfh t3 = mbc.p.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar7 = (mbc) t3.b;
        mbcVar7.b = 2;
        mbcVar7.a |= 1;
        int Q = GifKeyboardM2.Q(str4, lfbVar2);
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar8 = (mbc) t3.b;
        mbcVar8.c = Q - 1;
        mbcVar8.a = 2 | mbcVar8.a;
        mbs b2 = crcVar2.b();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar9 = (mbc) t3.b;
        b2.getClass();
        mbcVar9.h = b2;
        mbcVar9.a |= 128;
        String d2 = lfd.d(str4);
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar10 = (mbc) t3.b;
        mbcVar10.a |= 1024;
        mbcVar10.j = d2;
        int a2 = cte.a(gifKeyboardM2.l);
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar11 = (mbc) t3.b;
        mbcVar11.d = a2 - 1;
        mbcVar11.a |= 4;
        nfh t4 = mbb.g.t();
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        mbb mbbVar3 = (mbb) t4.b;
        str5.getClass();
        int i3 = mbbVar3.a | 1;
        mbbVar3.a = i3;
        mbbVar3.b = str5;
        mbbVar3.e = mbaVar2.e;
        mbbVar3.a = i3 | 8;
        mbb mbbVar4 = (mbb) t4.cz();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar12 = (mbc) t3.b;
        mbbVar4.getClass();
        mbcVar12.e = mbbVar4;
        mbcVar12.a |= 8;
        objArr2[0] = t3.cz();
        objArr2[1] = crcVar2;
        j2.e(ctdVar2, objArr2);
        int i4 = crcVar2.b;
        crcVar2.c();
        String str6 = crcVar2.c.packageName;
    }
}
