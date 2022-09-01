package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: PG */
/* renamed from: ffb  reason: default package */
/* loaded from: classes.dex */
public final class ffb {
    public static volatile fay a;
    public static volatile fay b;
    public static volatile fay c;

    public static int a(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 0;
                }
            }
            return i2;
        }
        return 3;
    }

    public static int b(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    return i != 3 ? 0 : 2;
                }
            }
            return i2;
        }
        return 4;
    }

    public static int c(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int d(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static long e(byte[] bArr) {
        int length = bArr.length;
        int i = 37;
        if (length <= 32) {
            if (length > 16) {
                long j = (length + length) - 7286425919675154353L;
                long v = v(bArr, 0) * (-5435081209227447693L);
                long v2 = v(bArr, 8);
                long v3 = v(bArr, length - 8) * j;
                return u((v(bArr, length - 16) * (-7286425919675154353L)) + Long.rotateRight(v + v2, 43) + Long.rotateRight(v3, 30), v + Long.rotateRight(v2 - 7286425919675154353L, 18) + v3, j);
            } else if (length >= 8) {
                long j2 = (length + length) - 7286425919675154353L;
                long v4 = v(bArr, 0) - 7286425919675154353L;
                long v5 = v(bArr, length - 8);
                return u((Long.rotateRight(v5, 37) * j2) + v4, (Long.rotateRight(v4, 25) + v5) * j2, j2);
            } else if (length >= 4) {
                return u(length + ((t(bArr, 0) & 4294967295L) << 3), t(bArr, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            } else {
                if (length <= 0) {
                    return -7286425919675154353L;
                }
                return (-7286425919675154353L) * w((((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr[length - 1] & 255) << 2)) * (-4348849565147123417L)));
            }
        } else if (length <= 64) {
            long j3 = (length + length) - 7286425919675154353L;
            long v6 = v(bArr, 0) * (-7286425919675154353L);
            long v7 = v(bArr, 8);
            long v8 = v(bArr, length - 8) * j3;
            long rotateRight = Long.rotateRight(v6 + v7, 43) + Long.rotateRight(v8, 30) + (v(bArr, length - 16) * (-7286425919675154353L));
            long rotateRight2 = Long.rotateRight(v7 - 7286425919675154353L, 18);
            long v9 = v(bArr, 16) * j3;
            long v10 = v(bArr, 24);
            long v11 = (rotateRight + v(bArr, length - 32)) * j3;
            return u(Long.rotateRight(v9 + v10, 43) + Long.rotateRight(v11, 30) + ((u(rotateRight, v6 + rotateRight2 + v8, j3) + v(bArr, length - 24)) * j3), v9 + Long.rotateRight(v10 + v6, 18) + v11, j3);
        } else {
            long w = w(-7956866745689871395L) * (-7286425919675154353L);
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long v12 = v(bArr, 0) + 95310865018149119L;
            int i2 = length - 1;
            int i3 = (i2 >> 6) * 64;
            int i4 = i2 & 63;
            int i5 = (i3 + i4) - 63;
            long j4 = 2480279821605975764L;
            int i6 = 0;
            while (true) {
                long rotateRight3 = Long.rotateRight(v12 + j4 + jArr[0] + v(bArr, i6 + 8), i);
                long[] jArr3 = jArr;
                long rotateRight4 = Long.rotateRight(j4 + jArr[1] + v(bArr, i6 + 48), 42);
                long j5 = (rotateRight3 * (-5435081209227447693L)) ^ jArr2[1];
                long v13 = (rotateRight4 * (-5435081209227447693L)) + jArr3[0] + v(bArr, i6 + 40);
                long rotateRight5 = Long.rotateRight(w + jArr2[0], 33) * (-5435081209227447693L);
                int i7 = i4;
                x(bArr, i6, jArr3[1] * (-5435081209227447693L), j5 + jArr2[0], jArr3);
                x(bArr, i6 + 32, rotateRight5 + jArr2[1], v(bArr, i6 + 16) + v13, jArr2);
                int i8 = i6 + 64;
                if (i8 == i3) {
                    long j6 = j5 & 255;
                    long j7 = (-5435081209227447693L) + j6 + j6;
                    long j8 = jArr2[0] + i7;
                    long j9 = jArr3[0] + j8;
                    jArr3[0] = j9;
                    jArr2[0] = j8 + j9;
                    long rotateRight6 = Long.rotateRight(rotateRight5 + v13 + j9 + v(bArr, i5 + 8), 37);
                    long rotateRight7 = Long.rotateRight(v13 + jArr3[1] + v(bArr, i5 + 48), 42);
                    long j10 = (rotateRight6 * j7) ^ (jArr2[1] * 9);
                    long v14 = (rotateRight7 * j7) + (jArr3[0] * 9) + v(bArr, i5 + 40);
                    long rotateRight8 = Long.rotateRight(j5 + jArr2[0], 33) * j7;
                    x(bArr, i5, jArr3[1] * j7, j10 + jArr2[0], jArr3);
                    x(bArr, i5 + 32, rotateRight8 + jArr2[1], v(bArr, i5 + 16) + v14, jArr2);
                    return u(u(jArr3[0], jArr2[0], j7) + (w(v14) * (-4348849565147123417L)) + j10, u(jArr3[1], jArr2[1], j7) + rotateRight8, j7);
                }
                i6 = i8;
                w = j5;
                v12 = rotateRight5;
                i4 = i7;
                j4 = v13;
                jArr = jArr3;
                i = 37;
            }
        }
    }

    public static final long f(long j) {
        return TimeZone.getDefault().getOffset(j) / 1000;
    }

    public static int g(int i) {
        return i - 2;
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            return i != 2 ? 0 : 4;
        }
        return 2;
    }

    public static cma i(Context context, mkr mkrVar) {
        crt crtVar = new crt(mkrVar);
        djc t = dxs.t();
        t.b = mkrVar;
        return new cmb(crtVar, t.g(), cri.b(context, "recent_gifs_shared"), mkrVar, null, null);
    }

    public static final llp j(List list, List list2) {
        llk e = llp.e();
        e.j(lre.ab(list, cli.c));
        e.j(lre.Z(list2, new cjm(list, 5)));
        return e.g();
    }

    public static ckm k(Context context) {
        return new ckn(context);
    }

    public static String l(String str) {
        return "cek:".concat(String.valueOf(str));
    }

    public static void m(Context context, byy byyVar, String str) {
        gzc gzcVar = gzc.b;
        List arrayList = new ArrayList(byyVar.a());
        for (juc jucVar : byyVar.g()) {
            byz c2 = byyVar.c(jucVar.i());
            Locale g = cei.g(jucVar);
            if (g != null) {
                nfh t = gzf.j.t();
                String j = jucVar.j();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                gzf gzfVar = (gzf) t.b;
                gzfVar.a |= 1;
                gzfVar.b = j;
                String languageTag = g.toLanguageTag();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                gzf gzfVar2 = (gzf) t.b;
                languageTag.getClass();
                gzfVar2.a |= 2;
                gzfVar2.c = languageTag;
                String j2 = jucVar.j();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                gzf gzfVar3 = (gzf) t.b;
                gzfVar3.a |= 128;
                gzfVar3.i = j2;
                String absolutePath = c2.b().getAbsolutePath();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                gzf gzfVar4 = (gzf) t.b;
                absolutePath.getClass();
                gzfVar4.a |= 4;
                gzfVar4.d = absolutePath;
                int intValue = cei.f(jucVar).intValue();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                gzf gzfVar5 = (gzf) t.b;
                gzfVar5.a |= 32;
                gzfVar5.g = intValue;
                String b2 = jucVar.n().b("appName", "");
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                gzf gzfVar6 = (gzf) t.b;
                b2.getClass();
                gzfVar6.a |= 64;
                gzfVar6.h = b2;
                arrayList.add((gzf) t.cz());
            }
        }
        List b3 = gzcVar.b(str);
        ArrayList arrayList2 = new ArrayList();
        lta listIterator = ((llp) b3).listIterator();
        while (listIterator.hasNext()) {
            gzf gzfVar7 = (gzf) listIterator.next();
            if (TextUtils.equals(str, gzfVar7.i) && !arrayList.contains(gzfVar7)) {
                arrayList2.add(gzfVar7);
            }
        }
        gzcVar.a(context, arrayList, arrayList2);
    }

    public static Locale n(String str) {
        jav f = jav.f(str.replace('_', '-'));
        if (f == null) {
            return null;
        }
        return f.q();
    }

    public static Map o(String str) {
        HashMap hashMap = new HashMap();
        if (str.isEmpty()) {
            return hashMap;
        }
        for (String str2 : lfy.c(',').i(str)) {
            List k = lfy.c('|').k(str2);
            if (k.size() == 2 && !((String) k.get(0)).isEmpty() && !((String) k.get(1)).isEmpty()) {
                hashMap.put(jav.f((String) k.get(0)), jav.f((String) k.get(1)));
            }
        }
        return hashMap;
    }

    public static Map p(String str) {
        HashMap hashMap = new HashMap();
        if (str.isEmpty()) {
            return hashMap;
        }
        for (String str2 : lfy.c(',').i(str)) {
            List k = lfy.c('|').k(str2);
            if (k.size() == 2 && !((String) k.get(0)).isEmpty() && !((String) k.get(1)).isEmpty()) {
                Locale n = n((String) k.get(0));
                Locale n2 = n((String) k.get(1));
                if (n != null && n2 != null) {
                    hashMap.put(n, n2);
                }
            }
        }
        return hashMap;
    }

    public static bxd q() {
        bxe bxeVar = (bxe) igr.d(guw.a()).a(bxe.class);
        if (bxeVar == null) {
            return bxd.a;
        }
        bwz bwzVar = bxeVar.b;
        if (!bwzVar.b.getAndSet(true)) {
            bxb bxbVar = bwzVar.a;
            bxbVar.c.set(new opu(bwzVar));
            bxbVar.a.g(bxbVar.b);
        }
        return bxeVar;
    }

    public static int r(bxd bxdVar) {
        if (!bxdVar.e()) {
            return 1;
        }
        return bxdVar.c().isEmpty() ? 2 : 3;
    }

    private static int t(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static long u(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long v(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    private static long w(long j) {
        return j ^ (j >>> 47);
    }

    private static void x(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long v = v(bArr, i);
        long v2 = v(bArr, i + 8);
        long v3 = v(bArr, i + 16);
        long v4 = v(bArr, i + 24);
        long j3 = j + v;
        long rotateRight = Long.rotateRight(j2 + j3 + v4, 21);
        long j4 = v2 + j3 + v3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + v4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }
}
