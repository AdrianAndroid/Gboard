package defpackage;

import com.google.android.keyboard.client.delight5.Decoder;

/* compiled from: PG */
/* renamed from: ccn  reason: default package */
/* loaded from: classes.dex */
public final class ccn {
    static {
        lug.i(Decoder.TAG);
    }

    public static int a(iay iayVar) {
        if (iayVar == null) {
            return 0;
        }
        Object obj = iayVar.e;
        if (obj instanceof String) {
            String str = (String) obj;
            if (Character.codePointCount(str, 0, str.length()) == 1) {
                return Character.codePointAt((String) iayVar.e, 0);
            }
        } else {
            int i = iayVar.c;
            if (i == 66) {
                return 10;
            }
            if (i == 67) {
                return 8;
            }
        }
        return 0;
    }

    public static mwj b(hfd hfdVar, boolean z, long j, float f, float f2, int i, boolean z2, boolean z3) {
        boolean z4 = hfdVar.p == 6 && z3;
        iay iayVar = hfdVar.b[0];
        int a = a(iayVar);
        String c = c(iayVar);
        if (a == 0) {
            if (c == null) {
                return null;
            }
            a = 0;
        }
        iay iayVar2 = hfdVar.b[0];
        nfh t = mwj.t.t();
        float f3 = hfdVar.l;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mwj mwjVar = (mwj) t.b;
        int i2 = mwjVar.a | 4;
        mwjVar.a = i2;
        mwjVar.d = f3;
        float f4 = hfdVar.m;
        int i3 = i2 | 8;
        mwjVar.a = i3;
        mwjVar.e = f4;
        long j2 = hfdVar.h;
        mwjVar.a = i3 | 16;
        mwjVar.f = (int) j2;
        mwj mwjVar2 = (mwj) t.b;
        mwjVar2.b = 0;
        int i4 = mwjVar2.a | 1;
        mwjVar2.a = i4;
        int i5 = iayVar2.c;
        int i6 = i4 | 32;
        mwjVar2.a = i6;
        mwjVar2.g = i5;
        int i7 = i6 | 512;
        mwjVar2.a = i7;
        mwjVar2.j = z;
        int i8 = hfdVar.j;
        int i9 = i7 | 1024;
        mwjVar2.a = i9;
        mwjVar2.k = i8;
        int i10 = i9 | 262144;
        mwjVar2.a = i10;
        mwjVar2.s = false;
        Object obj = iayVar2.e;
        if (obj instanceof String) {
            String str = (String) obj;
            str.getClass();
            mwjVar2.a = i10 | 256;
            mwjVar2.i = str;
        }
        ici[] iciVarArr = hfdVar.q;
        if (iciVarArr != null) {
            for (ici iciVar : iciVarArr) {
                nfh t2 = mwh.g.t();
                float f5 = iciVar.a;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mwh mwhVar = (mwh) t2.b;
                int i11 = mwhVar.a | 1;
                mwhVar.a = i11;
                mwhVar.b = f5;
                float f6 = iciVar.b;
                int i12 = i11 | 2;
                mwhVar.a = i12;
                mwhVar.c = f6;
                float f7 = iciVar.d;
                int i13 = i12 | 8;
                mwhVar.a = i13;
                mwhVar.e = f7;
                float f8 = iciVar.c;
                int i14 = i13 | 4;
                mwhVar.a = i14;
                mwhVar.d = f8;
                int i15 = iciVar.e;
                mwhVar.a = i14 | 16;
                mwhVar.f = i15;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mwj mwjVar3 = (mwj) t.b;
                mwh mwhVar2 = (mwh) t2.cz();
                mwhVar2.getClass();
                nga ngaVar = mwjVar3.r;
                if (!ngaVar.c()) {
                    mwjVar3.r = nfm.H(ngaVar);
                }
                mwjVar3.r.add(mwhVar2);
            }
        }
        long j3 = hfdVar.i;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mwj mwjVar4 = (mwj) t.b;
        mwjVar4.a |= 8192;
        mwjVar4.m = j3;
        mwj mwjVar5 = (mwj) t.cz();
        nfh nfhVar = (nfh) mwjVar5.N(5);
        nfhVar.cG(mwjVar5);
        if (c != null) {
            a = iayVar.c;
        }
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mwj mwjVar6 = (mwj) nfhVar.b;
        mwjVar6.a |= 32;
        mwjVar6.g = a;
        boolean z5 = iayVar.d == iax.COMMIT;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mwj mwjVar7 = (mwj) nfhVar.b;
        int i16 = mwjVar7.a | 4096;
        mwjVar7.a = i16;
        mwjVar7.l = z5;
        int i17 = 32768 | i16;
        mwjVar7.a = i17;
        mwjVar7.o = f;
        int i18 = i17 | 65536;
        mwjVar7.a = i18;
        mwjVar7.p = f2;
        int i19 = i18 | 64;
        mwjVar7.a = i19;
        mwjVar7.h = i;
        int i20 = i19 | 131072;
        mwjVar7.a = i20;
        mwjVar7.q = z2;
        if (c != null) {
            i20 |= 256;
            mwjVar7.a = i20;
            mwjVar7.i = c;
        } else if (!z4) {
            i20 &= -257;
            mwjVar7.a = i20;
            mwjVar7.i = mwj.t.i;
        }
        mwjVar7.a = i20 | 16384;
        mwjVar7.n = j;
        if (!Float.isNaN(mwjVar7.d) && !Float.isNaN(((mwj) nfhVar.b).e) && !Float.isNaN(((mwj) nfhVar.b).o) && !Float.isNaN(((mwj) nfhVar.b).p) && ((Boolean) cas.z.c()).booleanValue()) {
            float f9 = ((mwj) nfhVar.b).o;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mwj mwjVar8 = (mwj) nfhVar.b;
            int i21 = mwjVar8.a | 4;
            mwjVar8.a = i21;
            mwjVar8.d = f9;
            float f10 = mwjVar8.p;
            mwjVar8.a = i21 | 8;
            mwjVar8.e = f10;
        }
        if (iayVar.c == -10139) {
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mwj mwjVar9 = (mwj) nfhVar.b;
            mwjVar9.a |= 262144;
            mwjVar9.s = true;
        }
        if (z4) {
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mwj mwjVar10 = (mwj) nfhVar.b;
            int i22 = mwjVar10.a | 4;
            mwjVar10.a = i22;
            mwjVar10.d = -1.0f;
            mwjVar10.a = i22 | 8;
            mwjVar10.e = -1.0f;
        }
        long j4 = hfdVar.i;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mwj mwjVar11 = (mwj) nfhVar.b;
        mwjVar11.a |= 8192;
        mwjVar11.m = j4;
        return (mwj) nfhVar.cz();
    }

    public static String c(iay iayVar) {
        if (iayVar != null) {
            Object obj = iayVar.e;
            if (obj instanceof String) {
                String str = (String) obj;
                if (Character.codePointCount(str, 0, str.length()) != 1) {
                    return str;
                }
            }
        }
        return null;
    }
}
