package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* renamed from: iby  reason: default package */
/* loaded from: classes.dex */
public final class iby {
    public static final long A;
    public static final long B;
    public static final long C;
    public static final long D;
    public static final long E;
    public static final long F;
    public static final long G;
    public static final long H;
    public static final long I;
    public static final long J;
    public static final llp K;
    private static final long[] Q;
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final long v;
    public static final long w;
    public static final long x;
    public static final long y;
    public static final long z;
    private static final ltg L = ltg.j("com/google/android/libraries/inputmethod/metadata/KeyboardState");
    private static final ReentrantReadWriteLock M = new ReentrantReadWriteLock();
    private static final Map N = lre.q();
    private static final qs O = new qs();
    private static final ArrayList P = lre.A();
    private static volatile boolean R = false;
    private static final lfy S = lfy.e("+");

    static {
        ibx ibxVar = new ibx(4, 19);
        a = ibxVar.a();
        b = ibxVar.a();
        c = ibxVar.a();
        d = ibxVar.a();
        e = ibxVar.a();
        long j2 = ibxVar.c;
        f = j2;
        ibx ibxVar2 = new ibx(5, 23);
        g = ibxVar2.a();
        h = ibxVar2.a();
        i = ibxVar2.a();
        j = ibxVar2.a();
        k = ibxVar2.a();
        l = ibxVar2.a();
        m = ibxVar2.a();
        long j3 = ibxVar2.c;
        n = j3;
        ibx ibxVar3 = new ibx(6, 28);
        long a2 = ibxVar3.a();
        p = a2;
        long a3 = ibxVar3.a();
        q = a3;
        long a4 = ibxVar3.a();
        r = a4;
        long a5 = ibxVar3.a();
        s = a5;
        long a6 = ibxVar3.a();
        t = a6;
        long a7 = ibxVar3.a();
        u = a7;
        long a8 = ibxVar3.a();
        v = a8;
        long a9 = ibxVar3.a();
        w = a9;
        long a10 = ibxVar3.a();
        x = a10;
        long a11 = ibxVar3.a();
        y = a11;
        long a12 = ibxVar3.a();
        z = a12;
        long a13 = ibxVar3.a();
        A = a13;
        long a14 = ibxVar3.a();
        B = a14;
        long a15 = ibxVar3.a();
        C = a15;
        long a16 = ibxVar3.a();
        D = a16;
        long a17 = ibxVar3.a();
        E = a17;
        long a18 = ibxVar3.a();
        F = a18;
        long a19 = ibxVar3.a();
        G = a19;
        long a20 = ibxVar3.a();
        H = a20;
        long a21 = ibxVar3.a();
        I = a21;
        long j4 = ibxVar3.c;
        o = j4;
        J = j4;
        K = llp.x(Long.valueOf(a2), Long.valueOf(a3), Long.valueOf(a4), Long.valueOf(a5), Long.valueOf(a6), Long.valueOf(a7), Long.valueOf(a8), Long.valueOf(a9), Long.valueOf(a10), Long.valueOf(a11), Long.valueOf(a12), Long.valueOf(a13), Long.valueOf(a14), Long.valueOf(a15), Long.valueOf(a16), Long.valueOf(a17), Long.valueOf(a18), Long.valueOf(a19), Long.valueOf(a20), Long.valueOf(a21));
        Q = new long[]{j2, j3, j4};
    }

    public static long a(String str) {
        g();
        if (!TextUtils.isEmpty(str)) {
            M.readLock().lock();
            try {
                long j2 = 0;
                for (String str2 : S.i(str.toUpperCase(Locale.US))) {
                    Long l2 = (Long) N.get(str2);
                    if (l2 != null) {
                        j2 |= l2.longValue();
                    }
                }
                M.readLock().unlock();
                if (j2 != 0) {
                    return j2;
                }
                ((ltd) ((ltd) L.c()).k("com/google/android/libraries/inputmethod/metadata/KeyboardState", "getStateFromString", 565, "KeyboardState.java")).w("Undefined Keyboard State: %s", str);
                return 0L;
            } catch (Throwable th) {
                M.readLock().unlock();
                throw th;
            }
        }
        return 0L;
    }

    public static long b(long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 |= j3;
        }
        return j2;
    }

    public static boolean c(long j2, long j3) {
        if (j2 != j3 && j2 != 0 && j3 != 0) {
            long[] jArr = Q;
            int length = jArr.length;
            for (int i2 = 0; i2 < 3; i2++) {
                long j4 = jArr[i2];
                long j5 = j4 & j2;
                long j6 = j4 & j3;
                if (j5 != 0 && j6 != 0 && j5 != j6) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long[] d(String str, lfy lfyVar) {
        if (TextUtils.isEmpty(str)) {
            return gvw.d;
        }
        if (lfyVar == null) {
            return new long[]{a(str)};
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : lfyVar.i(str)) {
            arrayList.add(Long.valueOf(a(str2)));
        }
        hgw.e(arrayList, 0L);
        return arrayList.isEmpty() ? gvw.d : mhq.f(arrayList);
    }

    public static void e(String str, long j2) {
        ReentrantReadWriteLock reentrantReadWriteLock = M;
        reentrantReadWriteLock.writeLock().lock();
        try {
            Map map = N;
            Long valueOf = Long.valueOf(j2);
            map.put(str, valueOf);
            O.j(j2, str);
            if ((j2 & ((-1) + j2)) != 0) {
                P.add(valueOf);
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            M.writeLock().unlock();
            throw th;
        }
    }

    public static String f(long j2) {
        g();
        StringBuilder sb = new StringBuilder();
        if (j2 != 0) {
            long j3 = 49152 & j2;
            long j4 = j2 & (-49153);
            M.readLock().lock();
            try {
                boolean z2 = true;
                for (Long l2 : lre.G(P)) {
                    long longValue = l2.longValue();
                    if ((longValue & j4) == longValue) {
                        z2 = h(sb, longValue, z2);
                    }
                }
                while (j4 != 0) {
                    long j5 = ((-1) + j4) & j4;
                    z2 = h(sb, j4 ^ j5, z2);
                    j4 = j5;
                }
                if (j3 != 0) {
                    h(sb, j3, z2);
                }
            } finally {
                M.readLock().unlock();
            }
        }
        return sb.toString();
    }

    private static void g() {
        if (!R) {
            ReentrantReadWriteLock reentrantReadWriteLock = M;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (!R) {
                    e("NORMAL", 0L);
                    e("SHIFT", 1L);
                    e("SHIFT_LOCK_MASK", 2L);
                    e("SHIFT_LOCK", 3L);
                    e("ALT", 4L);
                    e("CTRL", 8L);
                    e("META", 16L);
                    e("META_KEY_COMBO_MASK", 32L);
                    e("SHIFT_COMBO", 33L);
                    e("MANUAL_SHIFT_MASK", 64L);
                    e("MANUAL_SHIFT", 65L);
                    e("LOCK_KEYBOARD", 128L);
                    e("CANDIDATE_HIGHLIGHTED", 256L);
                    e("COMPOSING", 512L);
                    e("MORE_CANDIDATES_SHOWN", 1024L);
                    e("SHOW_LANGUAGE_SWITCH_KEY", 2048L);
                    e("FIRST_PAGE", 4096L);
                    e("LAST_PAGE", 8192L);
                    e("DISABLED_MICROPHONE", 16384L);
                    e("EMPTY_MICROPHONE", 32768L);
                    e("NO_MICROPHONE", 49152L);
                    e("MULTI_LINE", 65536L);
                    e("IME_FLAG_NAVIGATE_PREVIOUS", 131072L);
                    e("IME_FLAG_NAVIGATE_NEXT", 262144L);
                    e("INPUT_TYPE_URI", a);
                    e("INPUT_TYPE_EMAIL_ADDRESS", b);
                    e("INPUT_TYPE_DATE", c);
                    e("INPUT_TYPE_TIME", d);
                    e("INPUT_TYPE_SHORT_MESSAGE", e);
                    e("IME_ACTION_NONE", g);
                    e("IME_ACTION_GO", h);
                    e("IME_ACTION_SEARCH", i);
                    e("IME_ACTION_SEND", j);
                    e("IME_ACTION_NEXT", k);
                    e("IME_ACTION_DONE", l);
                    e("IME_ACTION_PREVIOUS", m);
                    e("ALL_SUB_CATEGORY", o);
                    e("SUB_CATEGORY_1", p);
                    e("SUB_CATEGORY_2", q);
                    e("SUB_CATEGORY_3", r);
                    e("SUB_CATEGORY_4", s);
                    e("SUB_CATEGORY_5", t);
                    e("SUB_CATEGORY_6", u);
                    e("SUB_CATEGORY_7", v);
                    e("SUB_CATEGORY_8", w);
                    e("SUB_CATEGORY_9", x);
                    e("SUB_CATEGORY_10", y);
                    e("SUB_CATEGORY_11", z);
                    e("SUB_CATEGORY_12", A);
                    e("SUB_CATEGORY_13", B);
                    e("SUB_CATEGORY_14", C);
                    e("SUB_CATEGORY_15", D);
                    e("SUB_CATEGORY_16", E);
                    e("SUB_CATEGORY_17", F);
                    e("SUB_CATEGORY_18", G);
                    e("SUB_CATEGORY_19", H);
                    e("SUB_CATEGORY_20", I);
                    e("EMOJI_AVAILABLE", 17179869184L);
                    e("NO_SETTINGS_KEY", 34359738368L);
                    e("SHOW_ONE_HANDED_MODE_SWITCH", 68719476736L);
                    e("FULL_SCREEN_MODE", 137438953472L);
                    e("SHOW_EMOJI_SWITCH_KEY", 274877906944L);
                    e("EDITOR_EMPTY", 549755813888L);
                    e("EMOTICON_AVAILABLE", 1099511627776L);
                    e("SMART_DICTATION_AVAILABLE", 2199023255552L);
                    e("NO_IME_PICKER", 4398046511104L);
                    e("AUTO_CAPS_MASK", 8796093022208L);
                    e("AUTO_CAPS", 8796093022209L);
                    e("CAPS_LOCK_MASK", 17592186044416L);
                    e("CAPS_LOCK", 17592186044419L);
                    R = true;
                }
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                M.writeLock().unlock();
                throw th;
            }
        }
    }

    private static boolean h(StringBuilder sb, long j2, boolean z2) {
        String str = (String) O.d(j2);
        if (str != null) {
            if (!z2) {
                sb.append(",");
            }
            sb.append(str);
            return false;
        }
        return z2;
    }
}
