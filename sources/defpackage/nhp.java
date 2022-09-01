package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nhp  reason: default package */
/* loaded from: classes2.dex */
public final class nhp {
    public static final ndb a;
    public static final ndb b;
    public static final ndb c;
    private static final Class d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        d = cls;
        a = Y(false);
        b = Y(true);
        c = new ndb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + (size * Cnew.ab(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(Object obj, Object obj2) {
        nfd N = ndb.N(obj2);
        if (!N.h()) {
            nfd O = ndb.O(obj);
            for (int i = 0; i < N.b.a(); i++) {
                O.f(N.b.f(i));
            }
            for (Map.Entry entry : N.b.c()) {
                O.f(entry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C(Object obj, Object obj2, long j) {
        nih.u(obj, j, ndb.K(nih.h(obj, j), nih.h(obj2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void D(Object obj, Object obj2) {
        nia z = ndb.z(obj);
        nia z2 = ndb.z(obj2);
        if (!z2.equals(nia.a)) {
            int i = z.b + z2.b;
            int[] copyOf = Arrays.copyOf(z.c, i);
            System.arraycopy(z2.c, 0, copyOf, z.b, z2.b);
            Object[] copyOf2 = Arrays.copyOf(z.d, i);
            System.arraycopy(z2.d, 0, copyOf2, z.b, z2.b);
            z = new nia(i, copyOf, copyOf2, true);
        }
        ndb.A(obj, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object E(int i, int i2, Object obj) {
        if (obj == null) {
            obj = nia.b();
        }
        ndb.y(obj, i, i2);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object F(int i, List list, nfq nfqVar, Object obj) {
        if (nfqVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (nfqVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = E(i, intValue, obj);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!nfqVar.a(intValue2)) {
                    obj = E(i, intValue2, obj);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static void G(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).l(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void H(int i, List list, mlu mluVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((Cnew) mluVar.a).m(i, (nem) list.get(i2));
        }
    }

    public static void I(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).an(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).ao(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public static void J(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += Cnew.N(((Integer) list.get(i4)).intValue());
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).t(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void L(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void M(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).ap(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).aq(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public static void N(int i, List list, mlu mluVar, nho nhoVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            mluVar.m(i, list.get(i2), nhoVar);
        }
    }

    public static void O(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += Cnew.N(((Integer) list.get(i4)).intValue());
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).t(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void P(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += Cnew.af(((Long) list.get(i4)).longValue());
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void Q(int i, List list, mlu mluVar, nho nhoVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            mluVar.p(i, list.get(i2), nhoVar);
        }
    }

    public static void R(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void S(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void T(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).as(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += Cnew.W(((Integer) list.get(i4)).intValue());
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).at(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void U(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).au(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += Cnew.Y(((Long) list.get(i4)).longValue());
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).av(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void V(int i, List list, mlu mluVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ngl)) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).y(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        ngl nglVar = (ngl) list;
        while (i2 < list.size()) {
            Object f = nglVar.f(i2);
            if (f instanceof String) {
                ((Cnew) mluVar.a).y(i, (String) f);
            } else {
                ((Cnew) mluVar.a).m(i, (nem) f);
            }
            i2++;
        }
    }

    public static void W(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += Cnew.ad(((Integer) list.get(i4)).intValue());
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void X(int i, List list, mlu mluVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((Cnew) mluVar.a).D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((Cnew) mluVar.a).A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += Cnew.af(((Long) list.get(i4)).longValue());
        }
        ((Cnew) mluVar.a).C(i3);
        while (i2 < list.size()) {
            ((Cnew) mluVar.a).E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    private static ndb Y(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (ndb) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int ab = size * Cnew.ab(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            ab += Cnew.I((nem) list.get(i2));
        }
        return ab;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nfn) {
            nfn nfnVar = (nfn) list;
            i = 0;
            while (i2 < size) {
                i += Cnew.N(nfnVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Cnew.N(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, List list, nho nhoVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += Cnew.K(i, (ngz) list.get(i3), nhoVar);
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nfn) {
            nfn nfnVar = (nfn) list;
            i = 0;
            while (i2 < size) {
                i += Cnew.N(nfnVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Cnew.N(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ngp) {
            ngp ngpVar = (ngp) list;
            i = 0;
            while (i2 < size) {
                i += Cnew.af(ngpVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Cnew.af(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i, Object obj, nho nhoVar) {
        if (obj instanceof ngj) {
            return Cnew.P(i, (ngj) obj);
        }
        return Cnew.ab(i) + Cnew.T((ngz) obj, nhoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i, List list, nho nhoVar) {
        int T;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int ab = Cnew.ab(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof ngj) {
                T = Cnew.Q((ngj) obj);
            } else {
                T = Cnew.T((ngz) obj, nhoVar);
            }
            ab += T;
        }
        return ab;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nfn) {
            nfn nfnVar = (nfn) list;
            i = 0;
            while (i2 < size) {
                i += Cnew.W(nfnVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Cnew.W(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ngp) {
            ngp ngpVar = (ngp) list;
            i = 0;
            while (i2 < size) {
                i += Cnew.Y(ngpVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Cnew.Y(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i, List list) {
        int aa;
        int aa2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int ab = Cnew.ab(i) * size;
        if (list instanceof ngl) {
            ngl nglVar = (ngl) list;
            while (i2 < size) {
                Object f = nglVar.f(i2);
                if (f instanceof nem) {
                    aa2 = Cnew.I((nem) f);
                } else {
                    aa2 = Cnew.aa((String) f);
                }
                ab += aa2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof nem) {
                    aa = Cnew.I((nem) obj);
                } else {
                    aa = Cnew.aa((String) obj);
                }
                ab += aa;
                i2++;
            }
        }
        return ab;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nfn) {
            nfn nfnVar = (nfn) list;
            i = 0;
            while (i2 < size) {
                i += Cnew.ad(nfnVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Cnew.ad(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ngp) {
            ngp ngpVar = (ngp) list;
            i = 0;
            while (i2 < size) {
                i += Cnew.af(ngpVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += Cnew.af(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void p(Class cls) {
        Class cls2;
        if (nfm.class.isAssignableFrom(cls) || (cls2 = d) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * Cnew.aw(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * Cnew.ab(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * Cnew.ay(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * Cnew.az(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * Cnew.ab(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return h(list) + (list.size() * Cnew.ab(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + (size * Cnew.ab(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + (size * Cnew.ab(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + (size * Cnew.ab(i));
    }
}
