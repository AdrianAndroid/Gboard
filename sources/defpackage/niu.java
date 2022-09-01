package defpackage;

/* compiled from: PG */
/* renamed from: niu  reason: default package */
/* loaded from: classes2.dex */
public final class niu {
    static {
        nfh t = nhy.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nhy nhyVar = (nhy) t.b;
        nhyVar.a = -62135596800L;
        nhyVar.b = 0;
        nhy nhyVar2 = (nhy) t.cz();
        nfh t2 = nhy.c.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nhy nhyVar3 = (nhy) t2.b;
        nhyVar3.a = 253402300799L;
        nhyVar3.b = 999999999;
        nhy nhyVar4 = (nhy) t2.cz();
        nfh t3 = nhy.c.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        nhy nhyVar5 = (nhy) t3.b;
        nhyVar5.a = 0L;
        nhyVar5.b = 0;
        nhy nhyVar6 = (nhy) t3.cz();
        new nit();
    }

    public static long a(nhy nhyVar) {
        e(nhyVar);
        return mhq.t(mhq.u(nhyVar.a), nhyVar.b / 1000000);
    }

    public static nhy b(long j) {
        long j2 = j / 1000;
        int i = (int) ((j % 1000) * 1000000);
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = mhq.t(j2, i / 1000000000);
            i %= 1000000000;
        }
        long j3 = j2;
        if (i < 0) {
            i += 1000000000;
            long j4 = j3 - 1;
            boolean z = true;
            boolean z2 = (1 ^ j3) >= 0;
            if ((j3 ^ j4) < 0) {
                z = false;
            }
            mhq.r(z2 | z, "checkedSubtract", j3, 1L);
            j3 = j4;
        }
        nfh t = nhy.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nhy nhyVar = (nhy) t.b;
        nhyVar.a = j3;
        nhyVar.b = i;
        nhy nhyVar2 = (nhy) t.cz();
        e(nhyVar2);
        return nhyVar2;
    }

    public static boolean c(nhy nhyVar) {
        return d(nhyVar.a, nhyVar.b);
    }

    public static boolean d(long j, int i) {
        return j >= -62135596800L && j <= 253402300799L && i >= 0 && i < 1000000000;
    }

    public static void e(nhy nhyVar) {
        long j = nhyVar.a;
        int i = nhyVar.b;
        if (d(j, i)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
    }
}
