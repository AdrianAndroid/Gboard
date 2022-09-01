package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: mhq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mhq {
    public static int b(byte b) {
        return b & 255;
    }

    public static int c(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j <= j2 ? 0 : 1;
    }

    public static int d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int e(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static long[] f(Collection collection) {
        if (collection instanceof mhi) {
            mhi mhiVar = (mhi) collection;
            return Arrays.copyOfRange(mhiVar.a, mhiVar.b, mhiVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            jdg.u(obj);
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }

    public static Long g(String str) {
        jdg.u(str);
        if (str.isEmpty()) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        if (charAt == '-') {
            i = 1;
        }
        if (i == str.length()) {
            return null;
        }
        int i2 = i + 1;
        int a = mhh.a(str.charAt(i));
        if (a < 0 || a >= 10) {
            return null;
        }
        long j = -a;
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            int a2 = mhh.a(str.charAt(i2));
            if (a2 < 0 || a2 >= 10) {
                return null;
            }
            long j2 = j * 10;
            long j3 = a2;
            if (j2 < Long.MIN_VALUE + j3) {
                return null;
            }
            j = j2 - j3;
            i2 = i3;
        }
        if (charAt == '-') {
            return Long.valueOf(j);
        }
        if (j != Long.MIN_VALUE) {
            return Long.valueOf(-j);
        }
        return null;
    }

    public static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i <= i2 ? 0 : 1;
    }

    public static int i(int i, int i2, int i3) {
        jdg.B(true, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int j(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int k(int... iArr) {
        jdg.v(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static int l(int... iArr) {
        jdg.v(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int m(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j >= -2147483648L) {
            return (int) j;
        }
        return Integer.MIN_VALUE;
    }

    public static List n(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new mhg(iArr, 0, length);
    }

    public static boolean o(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int[] p(Collection collection) {
        if (collection instanceof mhg) {
            mhg mhgVar = (mhg) collection;
            return Arrays.copyOfRange(mhgVar.a, mhgVar.b, mhgVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            jdg.u(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static float[] q(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            jdg.u(obj);
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    public static void r(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    public static void s(boolean z) {
        if (z) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }

    public static long t(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j ^ j2) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        r(z2 | z, "checkedAdd", j, j2);
        return j3;
    }

    public static long u(long j) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros((-1) ^ j) + Long.numberOfLeadingZeros(1000L) + Long.numberOfLeadingZeros(-1001L);
        if (numberOfLeadingZeros > 65) {
            return j * 1000;
        }
        r(numberOfLeadingZeros >= 64, "checkedMultiply", j, 1000L);
        r(true, "checkedMultiply", j, 1000L);
        long j2 = j * 1000;
        r(j == 0 || j2 / j == 1000, "checkedMultiply", j, 1000L);
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (((r7 == java.math.RoundingMode.HALF_EVEN ? 1 : 0) & (r0 & 1)) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r2 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r1 > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r5 > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r5 < 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int v(int r5, int r6, java.math.RoundingMode r7) {
        /*
            defpackage.jdg.u(r7)
            if (r6 == 0) goto L54
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = defpackage.mhc.a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L53;
                case 3: goto L48;
                case 4: goto L4e;
                case 5: goto L45;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L42
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L4c
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            r6 = r6 & r7
            if (r6 == 0) goto L4b
            goto L4c
        L42:
            if (r1 <= 0) goto L4b
            goto L4c
        L45:
            if (r5 <= 0) goto L4b
            goto L4c
        L48:
            if (r5 >= 0) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L53
        L4e:
            int r0 = r0 + r5
            return r0
        L50:
            s(r4)
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhq.v(int, int, java.math.RoundingMode):int");
    }

    public static int w(int i, int i2) {
        return m(i + i2);
    }
}
