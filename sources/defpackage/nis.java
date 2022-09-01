package defpackage;

/* compiled from: PG */
/* renamed from: nis  reason: default package */
/* loaded from: classes2.dex */
public final class nis {
    static {
        nfh t = ney.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ney neyVar = (ney) t.b;
        neyVar.a = -315576000000L;
        neyVar.b = -999999999;
        ney neyVar2 = (ney) t.cz();
        nfh t2 = ney.c.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ney neyVar3 = (ney) t2.b;
        neyVar3.a = 315576000000L;
        neyVar3.b = 999999999;
        ney neyVar4 = (ney) t2.cz();
        nfh t3 = ney.c.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        ney neyVar5 = (ney) t3.b;
        neyVar5.a = 0L;
        neyVar5.b = 0;
        ney neyVar6 = (ney) t3.cz();
    }

    public static long a(ney neyVar) {
        e(neyVar);
        return mhq.t(mhq.u(neyVar.a), neyVar.b / 1000000);
    }

    public static ney b(long j) {
        return d(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static ney c(long j) {
        return d(j / 1000000000, (int) (j % 1000000000));
    }

    static ney d(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = mhq.t(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        nfh t = ney.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ney neyVar = (ney) t.b;
        neyVar.a = j;
        neyVar.b = i;
        ney neyVar2 = (ney) t.cz();
        e(neyVar2);
        return neyVar2;
    }

    public static void e(ney neyVar) {
        long j = neyVar.a;
        int i = neyVar.b;
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return;
            }
            if (j <= 0 && i <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
