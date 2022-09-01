package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmmgesture.HmmGestureDecoder;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fgi  reason: default package */
/* loaded from: classes.dex */
public final class fgi extends dkk {
    private boolean g;

    public fgi(Context context, hlu hluVar, ino inoVar) {
        super(context, hluVar, inoVar);
    }

    private static mrm k(mrm mrmVar, int i) {
        int[] iArr;
        nfh t = mrm.p.t();
        float f = mrmVar.e;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrm mrmVar2 = (mrm) t.b;
        int i2 = mrmVar2.a | 8;
        mrmVar2.a = i2;
        mrmVar2.e = f;
        float f2 = mrmVar.d;
        int i3 = i2 | 4;
        mrmVar2.a = i3;
        mrmVar2.d = f2;
        float f3 = mrmVar.c;
        int i4 = i3 | 2;
        mrmVar2.a = i4;
        mrmVar2.c = f3;
        float f4 = mrmVar.b;
        mrmVar2.a = i4 | 1;
        mrmVar2.b = f4;
        ArrayList A = lre.A();
        for (mrl mrlVar : mrmVar.f) {
            iay[] a = fgl.a(mrlVar.c);
            if (a != null) {
                iArr = new int[a.length];
                for (int i5 = 0; i5 < a.length; i5++) {
                    iArr[i5] = ((String) a[i5].e).charAt(0);
                }
            } else {
                iArr = null;
            }
            if (iArr != null && iArr.length > i) {
                nfh t2 = mrl.j.t();
                int i6 = iArr[i];
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mrl mrlVar2 = (mrl) t2.b;
                int i7 = mrlVar2.a | 2;
                mrlVar2.a = i7;
                mrlVar2.c = i6;
                float f5 = mrlVar.f;
                int i8 = i7 | 16;
                mrlVar2.a = i8;
                mrlVar2.f = f5;
                float f6 = mrlVar.g;
                int i9 = i8 | 32;
                mrlVar2.a = i9;
                mrlVar2.g = f6;
                float f7 = mrlVar.h;
                int i10 = i9 | 64;
                mrlVar2.a = i10;
                mrlVar2.h = f7;
                float f8 = mrlVar.i;
                mrlVar2.a = i10 | 128;
                mrlVar2.i = f8;
                A.add((mrl) t2.cz());
            }
        }
        t.dQ(A);
        return (mrm) t.cz();
    }

    @Override // defpackage.dkk
    protected final HmmGestureDecoder a() {
        return fgk.h(this.d).c(true != this.g ? "zh_hant_zhuyin_40key_without_english" : "zh_hant_zhuyin_40key_with_english");
    }

    @Override // defpackage.dkk
    public final void c() {
        this.g = this.e.aj(R.string.f160500_resource_name_obfuscated_res_0x7f14064f);
        super.c();
    }

    @Override // defpackage.dkk
    protected final void g(HmmGestureDecoder hmmGestureDecoder, mrm mrmVar) {
        hmmGestureDecoder.c(69, k(mrmVar, 0));
        if (this.g) {
            hmmGestureDecoder.c(0, k(mrmVar, 1));
        }
    }

    @Override // defpackage.dkk
    protected final boolean i(ino inoVar) {
        return inoVar.aj(R.string.f160830_resource_name_obfuscated_res_0x7f140673);
    }

    @Override // defpackage.dkk
    protected final boolean j(ino inoVar) {
        return inoVar.aj(R.string.f160880_resource_name_obfuscated_res_0x7f140678);
    }
}
