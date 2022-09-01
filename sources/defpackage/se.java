package defpackage;

/* compiled from: PG */
/* renamed from: se  reason: default package */
/* loaded from: classes2.dex */
public final class se {
    static final boolean[] a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(sa saVar, rr rrVar, rz rzVar) {
        rzVar.p = -1;
        rzVar.q = -1;
        if (saVar.aq[0] != 2 && rzVar.aq[0] == 4) {
            ry ryVar = rzVar.J;
            int i = ryVar.f;
            int j = saVar.j() - rzVar.L.f;
            ryVar.h = rrVar.b(ryVar);
            ry ryVar2 = rzVar.L;
            ryVar2.h = rrVar.b(ryVar2);
            rrVar.f(rzVar.J.h, i);
            rrVar.f(rzVar.L.h, j);
            rzVar.p = 2;
            rzVar.Z = i;
            int i2 = j - i;
            rzVar.V = i2;
            int i3 = rzVar.ac;
            if (i2 < i3) {
                rzVar.V = i3;
            }
        }
        if (saVar.aq[1] == 2 || rzVar.aq[1] != 4) {
            return;
        }
        ry ryVar3 = rzVar.K;
        int i4 = ryVar3.f;
        int h = saVar.h() - rzVar.M.f;
        ryVar3.h = rrVar.b(ryVar3);
        ry ryVar4 = rzVar.M;
        ryVar4.h = rrVar.b(ryVar4);
        rrVar.f(rzVar.K.h, i4);
        rrVar.f(rzVar.M.h, h);
        if (rzVar.ab > 0 || rzVar.ah == 8) {
            ry ryVar5 = rzVar.N;
            ryVar5.h = rrVar.b(ryVar5);
            rrVar.f(rzVar.N.h, rzVar.ab + i4);
        }
        rzVar.q = 2;
        rzVar.aa = i4;
        int i5 = h - i4;
        rzVar.W = i5;
        int i6 = rzVar.ad;
        if (i5 >= i6) {
            return;
        }
        rzVar.W = i6;
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
