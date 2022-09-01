package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.CrossProfileApps;
import android.os.UserHandle;
import android.util.Base64;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jez  reason: default package */
/* loaded from: classes.dex */
public class jez {
    private static volatile fjh a;

    public static String A(jit jitVar) {
        StringBuilder sb = new StringBuilder(jitVar.d);
        sb.append("|");
        int h = ker.h(jitVar.e);
        if (h == 0) {
            h = 1;
        }
        sb.append(h - 1);
        return sb.toString();
    }

    public static String B(jit jitVar) {
        String str;
        StringBuilder sb = new StringBuilder(jitVar.b);
        sb.append("|");
        sb.append(jitVar.c);
        sb.append("|");
        sb.append(jitVar.d);
        sb.append("|");
        int h = ker.h(jitVar.e);
        if (h == 0) {
            h = 1;
        }
        sb.append(h - 1);
        sb.append("|");
        if ((jitVar.a & 16) != 0) {
            noi noiVar = jitVar.f;
            if (noiVar == null) {
                noiVar = noi.b;
            }
            str = u(noiVar);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public static jit C(String str, Context context) {
        nfh nfhVar;
        List k = lfy.e("|").k(str);
        jkr jkrVar = jkr.NEW_FILE_KEY;
        int ordinal = kki.x(context).ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (k.size() != 2) {
                    throw new jms("Bad-format serializedFileKey = s".concat(String.valueOf(str)));
                }
                nfhVar = jit.g.t();
                String str2 = (String) k.get(0);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jit jitVar = (jit) nfhVar.b;
                str2.getClass();
                jitVar.a |= 4;
                jitVar.d = str2;
                int h = ker.h(Integer.parseInt((String) k.get(1)));
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jit jitVar2 = (jit) nfhVar.b;
                int i = h - 1;
                if (h == 0) {
                    throw null;
                }
                jitVar2.e = i;
                jitVar2.a |= 8;
            } else if (k.size() != 4) {
                throw new jms("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
            } else {
                nfhVar = jit.g.t();
                String str3 = (String) k.get(0);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jit jitVar3 = (jit) nfhVar.b;
                str3.getClass();
                jitVar3.a |= 1;
                jitVar3.b = str3;
                int parseInt = Integer.parseInt((String) k.get(1));
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jit jitVar4 = (jit) nfhVar.b;
                jitVar4.a |= 2;
                jitVar4.c = parseInt;
                String str4 = (String) k.get(2);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jit jitVar5 = (jit) nfhVar.b;
                str4.getClass();
                jitVar5.a |= 4;
                jitVar5.d = str4;
                int h2 = ker.h(Integer.parseInt((String) k.get(3)));
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jit jitVar6 = (jit) nfhVar.b;
                int i2 = h2 - 1;
                if (h2 == 0) {
                    throw null;
                }
                jitVar6.e = i2;
                jitVar6.a |= 8;
            }
        } else if (k.size() != 5) {
            throw new jms("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
        } else {
            nfh t = jit.g.t();
            String str5 = (String) k.get(0);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            jit jitVar7 = (jit) t.b;
            str5.getClass();
            jitVar7.a |= 1;
            jitVar7.b = str5;
            int parseInt2 = Integer.parseInt((String) k.get(1));
            if (t.c) {
                t.cD();
                t.c = false;
            }
            jit jitVar8 = (jit) t.b;
            jitVar8.a |= 2;
            jitVar8.c = parseInt2;
            String str6 = (String) k.get(2);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            jit jitVar9 = (jit) t.b;
            str6.getClass();
            jitVar9.a |= 4;
            jitVar9.d = str6;
            int h3 = ker.h(Integer.parseInt((String) k.get(3)));
            if (t.c) {
                t.cD();
                t.c = false;
            }
            jit jitVar10 = (jit) t.b;
            int i3 = h3 - 1;
            if (h3 == 0) {
                throw null;
            }
            jitVar10.e = i3;
            jitVar10.a |= 8;
            if (k.get(4) != null && !((String) k.get(4)).isEmpty()) {
                try {
                    noi noiVar = (noi) r((String) k.get(4), (nhf) noi.b.N(7));
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    jit jitVar11 = (jit) t.b;
                    noiVar.getClass();
                    jitVar11.f = noiVar;
                    jitVar11.a |= 16;
                } catch (ngd e) {
                    throw new jms("Failed to deserialize key:".concat(String.valueOf(str)), e);
                }
            }
            nfhVar = t;
        }
        return (jit) nfhVar.cz();
    }

    public static String D(jit jitVar, Context context) {
        jkr jkrVar = jkr.NEW_FILE_KEY;
        int ordinal = kki.x(context).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return B(jitVar);
            }
            if (ordinal == 2) {
                return A(jitVar);
            }
            return z(jitVar);
        }
        return z(jitVar);
    }

    public static lmu E(List list) {
        Collections.sort(list, lrh.d().c());
        llk llkVar = new llk(list.size());
        llk llkVar2 = new llk(list.size());
        for (int i = 0; i < list.size(); i++) {
            lrh lrhVar = (lrh) ((Map.Entry) list.get(i)).getKey();
            if (i > 0) {
                lrh lrhVar2 = (lrh) ((Map.Entry) list.get(i - 1)).getKey();
                if (lrhVar.p(lrhVar2) && !lrhVar.h(lrhVar2).q()) {
                    throw new IllegalArgumentException("Overlapping ranges: range " + lrhVar2 + " overlaps with entry " + lrhVar);
                }
            }
            llkVar.h(lrhVar);
            llkVar2.h(((Map.Entry) list.get(i)).getValue());
        }
        return new lmu(llkVar.g(), llkVar2.g());
    }

    public static void F(lrh lrhVar, Object obj, List list) {
        jdg.u(lrhVar);
        jdg.u(obj);
        jdg.A(!lrhVar.q(), "Range must not be empty, but was %s", lrhVar);
        list.add(lre.u(lrhVar, obj));
    }

    public static int G(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int H(Object obj) {
        return G(obj == null ? 0 : obj.hashCode());
    }

    public static int I(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > highestOneBit) {
            int i2 = highestOneBit + highestOneBit;
            if (i2 <= 0) {
                return 1073741824;
            }
            return i2;
        }
        return highestOneBit;
    }

    public static int J(int i, int i2) {
        return i & (i2 ^ (-1));
    }

    public static int K(int i, int i2, int i3) {
        return (i & (i3 ^ (-1))) | (i2 & i3);
    }

    public static int L(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    public static int M(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int H = H(obj);
        int i4 = H & i;
        int N = N(obj3, i4);
        if (N == 0) {
            return -1;
        }
        int J = J(H, i);
        int i5 = -1;
        while (true) {
            i2 = N - 1;
            i3 = iArr[i2];
            if (J(i3, i) != J || !jdg.W(obj, objArr[i2]) || (objArr2 != null && !jdg.W(obj2, objArr2[i2]))) {
                int i6 = i3 & i;
                if (i6 == 0) {
                    return -1;
                }
                i5 = i2;
                N = i6;
            }
        }
        int i7 = i3 & i;
        if (i5 == -1) {
            R(obj3, i4, i7);
        } else {
            iArr[i5] = K(iArr[i5], i7, i);
        }
        return i2;
    }

    public static int N(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static int O(int i) {
        return Math.max(4, I(i + 1));
    }

    public static Object P(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
        } else if (i <= 256) {
            return new byte[i];
        } else {
            return i <= 65536 ? new short[i] : new int[i];
        }
    }

    public static void Q(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static void R(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static Collection S(Collection collection, leq leqVar) {
        return new ljt(collection, leqVar);
    }

    public static boolean T(Collection collection, Object obj) {
        jdg.u(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static void U(Object obj, Object obj2) {
        if (obj == null) {
            new StringBuilder("null key in entry: null=").append(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 != null) {
        } else {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    public static void V(boolean z) {
        jdg.G(z, "no calls to next() since the last call to remove()");
    }

    public static void W(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static Object X(Object obj) {
        Object[] objArr = new Object[0];
        if (obj != null) {
            return obj;
        }
        throw new lgj(jdg.p("expected a non-null reference", objArr));
    }

    public static void Y(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new lgj(jdg.p(str, obj));
    }

    public static fjh a(Context context) {
        if (a == null) {
            synchronized (jez.class) {
                if (a == null) {
                    Context applicationContext = context.getApplicationContext();
                    nzv nzvVar = new nzv();
                    nzvVar.a = "com.google.android.enterprise.connectedapps.CrossProfileConnector_Service";
                    nzvVar.b = fjx.DEFAULT;
                    nzvVar.c = applicationContext;
                    a = new fje(nzvVar, null, null, null);
                }
            }
        }
        return a;
    }

    public static mko b(Context context, String str, boolean z) {
        mko c = jco.c(a(context)).c(str, z);
        jfb.c(c, jfc.FETCH_FILE, str);
        return mio.g(c, iuu.n, mjl.a);
    }

    public static void c(Context context, String str) {
        if (e(context)) {
            jfb.c(jco.c(a(context)).b(str), jfc.DELETE_FILE, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(boolean z) {
        hhy j = hhq.j();
        ((hhz) j).a.c(hie.OVERRIDE, ((hhr) jey.a).a, z, null, null);
    }

    public static boolean e(Context context) {
        return g(context) && a(context).f().s();
    }

    public static boolean f(Context context) {
        return !((CrossProfileApps) context.getSystemService(CrossProfileApps.class)).getTargetUserProfiles().isEmpty();
    }

    public static boolean g(Context context) {
        if (!h() || ((Boolean) jey.b.c()).booleanValue()) {
            return false;
        }
        if (!a(context).e().k()) {
            Boolean bool = (Boolean) jey.a.b(hie.OVERRIDE);
            if (bool == null) {
                bool = (Boolean) jey.a.b(hie.DEFAULT);
            }
            return Boolean.TRUE.equals(bool);
        }
        return ((Boolean) jey.a.c()).booleanValue();
    }

    public static boolean h() {
        return li.d();
    }

    public static boolean i(Context context) {
        return g(context) && a(context).e().l();
    }

    public static void j(Context context, Intent intent, Activity activity) {
        CrossProfileApps crossProfileApps = (CrossProfileApps) context.getSystemService(CrossProfileApps.class);
        List<UserHandle> targetUserProfiles = crossProfileApps.getTargetUserProfiles();
        if (targetUserProfiles.size() == 1) {
            crossProfileApps.startActivity(intent, targetUserProfiles.get(0), activity, gwc.e(context, null));
        }
    }

    public static int m(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int o(int i) {
        if (i != 0) {
            switch (i) {
                case 950:
                    return 951;
                case 951:
                    return 952;
                case 952:
                    return 953;
                default:
                    switch (i) {
                        case 1001:
                            return 1002;
                        case 1002:
                            return 1003;
                        case 1003:
                            return 1004;
                        case 1004:
                            return 1005;
                        case 1005:
                            return 1006;
                        default:
                            return 0;
                    }
            }
        }
        return 1;
    }

    public static jlt p(Iterable iterable) {
        return new jlt(kcu.W(iterable), (byte[]) null);
    }

    public static SharedPreferences q(Context context, String str, lfb lfbVar) {
        return context.getSharedPreferences(t(str, lfbVar), 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ngz, java.lang.Object] */
    public static ngz r(String str, nhf nhfVar) {
        try {
            return nhfVar.h(Base64.decode(str, 3), nfb.a());
        } catch (IllegalArgumentException e) {
            throw new ngd(new IOException(e), null);
        }
    }

    public static ngz s(SharedPreferences sharedPreferences, String str, nhf nhfVar) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return r(string, nhfVar);
        } catch (ngd unused) {
            return null;
        }
    }

    public static String t(String str, lfb lfbVar) {
        return (lfbVar == null || !lfbVar.e()) ? str : str.concat((String) lfbVar.a());
    }

    public static String u(ngz ngzVar) {
        return Base64.encodeToString(ngzVar.q(), 3);
    }

    public static void v(SharedPreferences.Editor editor, String str) {
        editor.remove(str);
    }

    public static void w(SharedPreferences.Editor editor, String str, ngz ngzVar) {
        editor.putString(str, u(ngzVar));
    }

    public static boolean x(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean y(SharedPreferences sharedPreferences, String str, ngz ngzVar) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        w(edit, str, ngzVar);
        return edit.commit();
    }

    public static String z(jit jitVar) {
        StringBuilder sb = new StringBuilder(jitVar.b);
        sb.append("|");
        sb.append(jitVar.c);
        sb.append("|");
        sb.append(jitVar.d);
        sb.append("|");
        int h = ker.h(jitVar.e);
        if (h == 0) {
            h = 1;
        }
        sb.append(h - 1);
        return sb.toString();
    }

    public void k(jgq jgqVar) {
    }

    public void l(double d) {
    }
}
