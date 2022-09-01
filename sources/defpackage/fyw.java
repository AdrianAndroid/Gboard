package defpackage;

import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;

/* compiled from: PG */
/* renamed from: fyw  reason: default package */
/* loaded from: classes.dex */
public final class fyw extends fyj {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ joc d;
    final /* synthetic */ byte[] e;
    final /* synthetic */ fyk f;
    final /* synthetic */ InAppTrainingServiceImpl g;
    final /* synthetic */ int h;

    public fyw(InAppTrainingServiceImpl inAppTrainingServiceImpl, String str, String str2, String str3, int i, joc jocVar, byte[] bArr, fyk fykVar) {
        this.g = inAppTrainingServiceImpl;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.h = i;
        this.d = jocVar;
        this.e = bArr;
        this.f = fykVar;
    }

    @Override // defpackage.fyk
    public final void e(byte[] bArr, int i) {
        int i2;
        String str;
        fyk fykVar;
        final byte[] bArr2;
        final int i3;
        boolean z;
        String str2;
        InAppTrainingServiceImpl inAppTrainingServiceImpl = this.g;
        String str3 = this.a;
        String str4 = this.b;
        String str5 = this.c;
        int i4 = this.h;
        joc jocVar = this.d;
        byte[] bArr3 = this.e;
        fyk fykVar2 = this.f;
        synchronized (inAppTrainingServiceImpl.d) {
            int i5 = inAppTrainingServiceImpl.l + 1;
            inAppTrainingServiceImpl.l = i5;
            if (i == 0) {
                inAppTrainingServiceImpl.m = bArr;
                i2 = 0;
            } else {
                i2 = i;
            }
            if (i2 == 0) {
                if (i5 >= inAppTrainingServiceImpl.i.o()) {
                    i2 = 0;
                } else {
                    bArr2 = bArr;
                    str = str5;
                    fykVar = fykVar2;
                    z = false;
                    i3 = 0;
                }
            }
            fwo fwoVar = inAppTrainingServiceImpl.g;
            nfh t = mfx.h.t();
            nfh t2 = mgi.g.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mgi mgiVar = (mgi) t2.b;
            str3.getClass();
            mgiVar.a |= 32;
            mgiVar.f = str3;
            nfh t3 = mgf.c.t();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mgf mgfVar = (mgf) t3.b;
            str4.getClass();
            str = str5;
            mgfVar.a |= 1;
            mgfVar.b = str4;
            mgf mgfVar2 = (mgf) t3.cz();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mgi mgiVar2 = (mgi) t2.b;
            mgfVar2.getClass();
            mgiVar2.c = mgfVar2;
            mgiVar2.b = 1;
            nfh t4 = mgd.c.t();
            int i6 = i2;
            long j = inAppTrainingServiceImpl.l;
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mgd mgdVar = (mgd) t4.b;
            fykVar = fykVar2;
            mgdVar.a |= 1;
            mgdVar.b = j;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mgi mgiVar3 = (mgi) t2.b;
            mgd mgdVar2 = (mgd) t4.cz();
            mgdVar2.getClass();
            mgiVar3.e = mgdVar2;
            mgiVar3.d = 6;
            mgi mgiVar4 = (mgi) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mfx mfxVar = (mfx) t.b;
            mgiVar4.getClass();
            mfxVar.g = mgiVar4;
            mfxVar.a |= 8192;
            fwoVar.h((mfx) t.cz());
            bArr2 = inAppTrainingServiceImpl.m;
            if (bArr2 == null) {
                bArr2 = bArr;
            }
            inAppTrainingServiceImpl.l = 0;
            inAppTrainingServiceImpl.m = null;
            i3 = i6;
            z = true;
        }
        if (!z) {
            try {
                str2 = ((mzh) nfm.z(mzh.d, bArr, nfb.b())).a;
            } catch (ngd e) {
                InAppTrainingServiceImpl.a.f(e, "Couldn't parse TaskRetry");
                str2 = str;
            }
            inAppTrainingServiceImpl.h(str3, str4, str2, i4, jocVar, bArr3, fykVar);
            return;
        }
        final fyk fykVar3 = fykVar;
        InAppTrainingServiceImpl.i(new fyx() { // from class: fyu
            @Override // defpackage.fyx
            public final void a() {
                fyk fykVar4 = fyk.this;
                byte[] bArr4 = bArr2;
                int i7 = i3;
                jns jnsVar = InAppTrainingServiceImpl.a;
                fykVar4.e(bArr4, i7);
            }
        });
    }
}
