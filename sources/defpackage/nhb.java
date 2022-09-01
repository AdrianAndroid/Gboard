package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: nhb  reason: default package */
/* loaded from: classes2.dex */
public final class nhb implements nho {
    private static final int[] a = new int[0];
    private static final Unsafe b = nih.j();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final ngz g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int[] k;
    private final int l;
    private final int m;
    private final ngo n;
    private final ndb o;

    private nhb(int[] iArr, Object[] objArr, int i, int i2, ngz ngzVar, boolean z, int[] iArr2, int i3, int i4, ngo ngoVar, ndb ndbVar, ndb ndbVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = ngzVar instanceof nfm;
        this.j = z;
        boolean z2 = false;
        if (ndbVar2 != null && (ngzVar instanceof nfk)) {
            z2 = true;
        }
        this.h = z2;
        this.k = iArr2;
        this.l = i3;
        this.m = i4;
        this.n = ngoVar;
        this.o = ndbVar;
        this.g = ngzVar;
    }

    private final int A(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int s = s(i4);
            if (i == s) {
                return i4;
            }
            if (i < s) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int B(int i) {
        return (i >>> 20) & 255;
    }

    private final int C(int i) {
        return this.c[i + 1];
    }

    private static long D(int i) {
        return i & 1048575;
    }

    private static long E(Object obj, long j) {
        return ((Long) nih.h(obj, j)).longValue();
    }

    private final nfq F(int i) {
        int i2 = i / 3;
        return (nfq) this.d[i2 + i2 + 1];
    }

    private final nho G(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        nho nhoVar = (nho) this.d[i3];
        if (nhoVar != null) {
            return nhoVar;
        }
        nho a2 = nhh.a.a((Class) this.d[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    private final Object H(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private static Field I(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static List J(Object obj, long j) {
        return (List) nih.h(obj, j);
    }

    private final void K(Object obj, Object obj2, int i) {
        long D = D(C(i));
        if (!R(obj2, i)) {
            return;
        }
        Object h = nih.h(obj, D);
        Object h2 = nih.h(obj2, D);
        if (h != null && h2 != null) {
            nih.u(obj, D, ngb.e(h, h2));
            N(obj, i);
        } else if (h2 == null) {
        } else {
            nih.u(obj, D, h2);
            N(obj, i);
        }
    }

    private final void L(Object obj, Object obj2, int i) {
        int C = C(i);
        int s = s(i);
        long D = D(C);
        if (!U(obj2, s, i)) {
            return;
        }
        Object h = U(obj, s, i) ? nih.h(obj, D) : null;
        Object h2 = nih.h(obj2, D);
        if (h != null && h2 != null) {
            nih.u(obj, D, ngb.e(h, h2));
            O(obj, s, i);
        } else if (h2 == null) {
        } else {
            nih.u(obj, D, h2);
            O(obj, s, i);
        }
    }

    private final void M(Object obj, int i, nhk nhkVar) {
        if (Q(i)) {
            nih.u(obj, D(i), nhkVar.x());
        } else if (this.i) {
            nih.u(obj, D(i), nhkVar.v());
        } else {
            nih.u(obj, D(i), nhkVar.q());
        }
    }

    private final void N(Object obj, int i) {
        int z = z(i);
        long j = 1048575 & z;
        if (j == 1048575) {
            return;
        }
        nih.s(obj, j, (1 << (z >>> 20)) | nih.d(obj, j));
    }

    private final void O(Object obj, int i, int i2) {
        nih.s(obj, z(i2) & 1048575, i);
    }

    private final boolean P(Object obj, Object obj2, int i) {
        return R(obj, i) == R(obj2, i);
    }

    private static boolean Q(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean R(Object obj, int i) {
        int z = z(i);
        long j = 1048575 & z;
        if (j != 1048575) {
            return (nih.d(obj, j) & (1 << (z >>> 20))) != 0;
        }
        int C = C(i);
        long D = D(C);
        switch (B(C)) {
            case 0:
                return Double.doubleToRawLongBits(nih.b(obj, D)) != 0;
            case 1:
                return Float.floatToRawIntBits(nih.c(obj, D)) != 0;
            case 2:
                return nih.f(obj, D) != 0;
            case 3:
                return nih.f(obj, D) != 0;
            case 4:
                return nih.d(obj, D) != 0;
            case 5:
                return nih.f(obj, D) != 0;
            case 6:
                return nih.d(obj, D) != 0;
            case 7:
                return nih.w(obj, D);
            case 8:
                Object h = nih.h(obj, D);
                if (h instanceof String) {
                    return !((String) h).isEmpty();
                } else if (!(h instanceof nem)) {
                    throw new IllegalArgumentException();
                } else {
                    return !nem.b.equals(h);
                }
            case 9:
                return nih.h(obj, D) != null;
            case 10:
                return !nem.b.equals(nih.h(obj, D));
            case 11:
                return nih.d(obj, D) != 0;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return nih.d(obj, D) != 0;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return nih.d(obj, D) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return nih.f(obj, D) != 0;
            case 15:
                return nih.d(obj, D) != 0;
            case 16:
                return nih.f(obj, D) != 0;
            case 17:
                return nih.h(obj, D) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean S(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return R(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean T(Object obj, int i, nho nhoVar) {
        return nhoVar.k(nih.h(obj, D(i)));
    }

    private final boolean U(Object obj, int i, int i2) {
        return nih.d(obj, (long) (z(i2) & 1048575)) == i;
    }

    private static boolean V(Object obj, long j) {
        return ((Boolean) nih.h(obj, j)).booleanValue();
    }

    private static final int W(byte[] bArr, int i, int i2, nik nikVar, Class cls, ndz ndzVar) {
        nik nikVar2 = nik.DOUBLE;
        switch (nikVar.ordinal()) {
            case 0:
                ndzVar.c = Double.valueOf(ndb.c(bArr, i));
                return i + 8;
            case 1:
                ndzVar.c = Float.valueOf(ndb.d(bArr, i));
                return i + 4;
            case 2:
            case 3:
                int q = ndb.q(bArr, i, ndzVar);
                ndzVar.c = Long.valueOf(ndzVar.b);
                return q;
            case 4:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int n = ndb.n(bArr, i, ndzVar);
                ndzVar.c = Integer.valueOf(ndzVar.a);
                return n;
            case 5:
            case 15:
                ndzVar.c = Long.valueOf(ndb.s(bArr, i));
                return i + 8;
            case 6:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ndzVar.c = Integer.valueOf(ndb.f(bArr, i));
                return i + 4;
            case 7:
                int q2 = ndb.q(bArr, i, ndzVar);
                ndzVar.c = Boolean.valueOf(ndzVar.b != 0);
                return q2;
            case 8:
                return ndb.l(bArr, i, ndzVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return ndb.h(nhh.a.a(cls), bArr, i, i2, ndzVar);
            case 11:
                return ndb.e(bArr, i, ndzVar);
            case 16:
                int n2 = ndb.n(bArr, i, ndzVar);
                ndzVar.c = Integer.valueOf(ner.F(ndzVar.a));
                return n2;
            case 17:
                int q3 = ndb.q(bArr, i, ndzVar);
                ndzVar.c = Long.valueOf(ner.G(ndzVar.b));
                return q3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x029d, code lost:
        if (r0 != r32) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x029f, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r2 = r21;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02b3, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e6, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0309, code lost:
        if (r0 != r15) goto L152;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void X(java.lang.Object r30, byte[] r31, int r32, int r33, defpackage.ndz r34) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhb.X(java.lang.Object, byte[], int, int, ndz):void");
    }

    private final Object Y(Object obj, int i, Object obj2) {
        nfq F;
        int s = s(i);
        Object h = nih.h(obj, D(C(i)));
        if (h == null || (F = F(i)) == null) {
            return obj2;
        }
        ngt H = ndb.H(H(i));
        Iterator it = ((ngu) h).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!F.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = nia.b();
                }
                int d = mlu.d(H, entry.getKey(), entry.getValue());
                nem nemVar = nem.b;
                byte[] bArr = new byte[d];
                Cnew ai = Cnew.ai(bArr);
                try {
                    mlu.e(ai, H, entry.getKey(), entry.getValue());
                    ndb.x(obj2, s, ndb.R(ai, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static final int Z(Object obj) {
        return ndb.z(obj).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aa(java.lang.Object r18, defpackage.mlu r19) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhb.aa(java.lang.Object, mlu):void");
    }

    private final void ab(mlu mluVar, int i, Object obj, int i2) {
        if (obj != null) {
            ngt H = ndb.H(H(i2));
            Object obj2 = mluVar.a;
            Iterator it = ((ngu) obj).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ((Cnew) mluVar.a).A(i, 2);
                ((Cnew) mluVar.a).C(mlu.d(H, entry.getKey(), entry.getValue()));
                mlu.e((Cnew) mluVar.a, H, entry.getKey(), entry.getValue());
            }
        }
    }

    private static final void ac(int i, Object obj, mlu mluVar) {
        if (obj instanceof String) {
            mluVar.v(i, (String) obj);
        } else {
            mluVar.g(i, (nem) obj);
        }
    }

    private static final void ad(Object obj, mlu mluVar) {
        ndb.z(obj).e(mluVar);
    }

    static nia d(Object obj) {
        nfm nfmVar = (nfm) obj;
        nia niaVar = nfmVar.cQ;
        if (niaVar == nia.a) {
            nia b2 = nia.b();
            nfmVar.cQ = b2;
            return b2;
        }
        return niaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nhb m(ngw ngwVar, ndb ndbVar, ngo ngoVar, ndb ndbVar2, ndb ndbVar3, ndb ndbVar4) {
        if (ngwVar instanceof nhj) {
            return n((nhj) ngwVar, ngoVar, ndbVar2, ndbVar3, ndbVar4);
        }
        nhx nhxVar = (nhx) ngwVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.nhb n(defpackage.nhj r35, defpackage.ngo r36, defpackage.ndb r37, defpackage.ndb r38, defpackage.ndb r39) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhb.n(nhj, ngo, ndb, ndb, ndb):nhb");
    }

    private static double o(Object obj, long j) {
        return ((Double) nih.h(obj, j)).doubleValue();
    }

    private static float p(Object obj, long j) {
        return ((Float) nih.h(obj, j)).floatValue();
    }

    private final int q(Object obj) {
        int i;
        int ax;
        int e;
        int ab;
        int ad;
        Unsafe unsafe = b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1048575;
        for (int i5 = 0; i5 < this.c.length; i5 += 3) {
            int C = C(i5);
            int s = s(i5);
            int B = B(C);
            if (B <= 17) {
                int i6 = this.c[i5 + 2];
                int i7 = i6 & 1048575;
                i = 1 << (i6 >>> 20);
                if (i7 != i4) {
                    i3 = unsafe.getInt(obj, i7);
                    i4 = i7;
                }
            } else {
                i = 0;
            }
            long D = D(C);
            switch (B) {
                case 0:
                    if ((i3 & i) != 0) {
                        ax = Cnew.ax(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i3 & i) != 0) {
                        ax = Cnew.aA(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i3 & i) != 0) {
                        ax = Cnew.O(s, unsafe.getLong(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i3 & i) != 0) {
                        ax = Cnew.ae(s, unsafe.getLong(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i3 & i) != 0) {
                        ax = Cnew.M(s, unsafe.getInt(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i3 & i) != 0) {
                        ax = Cnew.az(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i3 & i) != 0) {
                        ax = Cnew.ay(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i3 & i) != 0) {
                        ax = Cnew.aw(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i3 & i) != 0) {
                        Object object = unsafe.getObject(obj, D);
                        if (object instanceof nem) {
                            ax = Cnew.H(s, (nem) object);
                        } else {
                            ax = Cnew.Z(s, (String) object);
                        }
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i3 & i) != 0) {
                        ax = nhp.i(s, unsafe.getObject(obj, D), G(i5));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i3 & i) != 0) {
                        ax = Cnew.H(s, (nem) unsafe.getObject(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i3 & i) != 0) {
                        ax = Cnew.ac(s, unsafe.getInt(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if ((i3 & i) != 0) {
                        ax = Cnew.J(s, unsafe.getInt(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if ((i3 & i) != 0) {
                        ax = Cnew.aB(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if ((i3 & i) != 0) {
                        ax = Cnew.aC(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i3 & i) != 0) {
                        ax = Cnew.V(s, unsafe.getInt(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i3 & i) != 0) {
                        ax = Cnew.X(s, unsafe.getLong(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i3 & i) != 0) {
                        ax = Cnew.K(s, (ngz) unsafe.getObject(obj, D), G(i5));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    ax = nhp.u(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 19:
                    ax = nhp.t(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 20:
                    ax = nhp.w(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 21:
                    ax = nhp.A(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 22:
                    ax = nhp.v(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 23:
                    ax = nhp.u(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 24:
                    ax = nhp.t(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 25:
                    ax = nhp.r(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 26:
                    ax = nhp.m(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 27:
                    ax = nhp.j(s, (List) unsafe.getObject(obj, D), G(i5));
                    i2 += ax;
                    break;
                case 28:
                    ax = nhp.b(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 29:
                    ax = nhp.z(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 30:
                    ax = nhp.s(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 31:
                    ax = nhp.t(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 32:
                    ax = nhp.u(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 33:
                    ax = nhp.x(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 34:
                    ax = nhp.y(s, (List) unsafe.getObject(obj, D));
                    i2 += ax;
                    break;
                case 35:
                    e = nhp.e((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    e = nhp.d((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    e = nhp.h((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    e = nhp.o((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    e = nhp.g((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    e = nhp.e((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    e = nhp.d((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    e = nhp.a((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    e = nhp.n((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    e = nhp.c((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e = nhp.d((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    e = nhp.e((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    e = nhp.k((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    e = nhp.l((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i2 += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ax = nhp.f(s, (List) unsafe.getObject(obj, D), G(i5));
                    i2 += ax;
                    break;
                case 50:
                    ax = ndb.I(s, unsafe.getObject(obj, D), H(i5));
                    i2 += ax;
                    break;
                case 51:
                    if (U(obj, s, i5)) {
                        ax = Cnew.ax(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (U(obj, s, i5)) {
                        ax = Cnew.aA(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (U(obj, s, i5)) {
                        ax = Cnew.O(s, E(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (U(obj, s, i5)) {
                        ax = Cnew.ae(s, E(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (U(obj, s, i5)) {
                        ax = Cnew.M(s, t(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (U(obj, s, i5)) {
                        ax = Cnew.az(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (U(obj, s, i5)) {
                        ax = Cnew.ay(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (U(obj, s, i5)) {
                        ax = Cnew.aw(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (U(obj, s, i5)) {
                        Object object2 = unsafe.getObject(obj, D);
                        if (object2 instanceof nem) {
                            ax = Cnew.H(s, (nem) object2);
                        } else {
                            ax = Cnew.Z(s, (String) object2);
                        }
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (U(obj, s, i5)) {
                        ax = nhp.i(s, unsafe.getObject(obj, D), G(i5));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (U(obj, s, i5)) {
                        ax = Cnew.H(s, (nem) unsafe.getObject(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (U(obj, s, i5)) {
                        ax = Cnew.ac(s, t(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (U(obj, s, i5)) {
                        ax = Cnew.J(s, t(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (U(obj, s, i5)) {
                        ax = Cnew.aB(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (U(obj, s, i5)) {
                        ax = Cnew.aC(s);
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (U(obj, s, i5)) {
                        ax = Cnew.V(s, t(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (U(obj, s, i5)) {
                        ax = Cnew.X(s, E(obj, D));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (U(obj, s, i5)) {
                        ax = Cnew.K(s, (ngz) unsafe.getObject(obj, D), G(i5));
                        i2 += ax;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int Z = i2 + Z(obj);
        if (this.h) {
            nfd N = ndb.N(obj);
            int i8 = 0;
            for (int i9 = 0; i9 < N.b.a(); i9++) {
                Map.Entry f = N.b.f(i9);
                i8 += nfd.j((nfl) f.getKey(), f.getValue());
            }
            for (Map.Entry entry : N.b.c()) {
                i8 += nfd.j((nfl) entry.getKey(), entry.getValue());
            }
            return Z + i8;
        }
        return Z;
    }

    private final int r(Object obj) {
        int ax;
        int e;
        int ab;
        int ad;
        Unsafe unsafe = b;
        int i = 0;
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int C = C(i2);
            int B = B(C);
            int s = s(i2);
            long D = D(C);
            if (B >= nfe.DOUBLE_LIST_PACKED.Z && B <= nfe.SINT64_LIST_PACKED.Z) {
                int i3 = this.c[i2 + 2];
            }
            switch (B) {
                case 0:
                    if (R(obj, i2)) {
                        ax = Cnew.ax(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (R(obj, i2)) {
                        ax = Cnew.aA(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (R(obj, i2)) {
                        ax = Cnew.O(s, nih.f(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (R(obj, i2)) {
                        ax = Cnew.ae(s, nih.f(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (R(obj, i2)) {
                        ax = Cnew.M(s, nih.d(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (R(obj, i2)) {
                        ax = Cnew.az(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (R(obj, i2)) {
                        ax = Cnew.ay(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (R(obj, i2)) {
                        ax = Cnew.aw(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (R(obj, i2)) {
                        Object h = nih.h(obj, D);
                        if (h instanceof nem) {
                            ax = Cnew.H(s, (nem) h);
                        } else {
                            ax = Cnew.Z(s, (String) h);
                        }
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (R(obj, i2)) {
                        ax = nhp.i(s, nih.h(obj, D), G(i2));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (R(obj, i2)) {
                        ax = Cnew.H(s, (nem) nih.h(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (R(obj, i2)) {
                        ax = Cnew.ac(s, nih.d(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (R(obj, i2)) {
                        ax = Cnew.J(s, nih.d(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (R(obj, i2)) {
                        ax = Cnew.aB(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (R(obj, i2)) {
                        ax = Cnew.aC(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (R(obj, i2)) {
                        ax = Cnew.V(s, nih.d(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (R(obj, i2)) {
                        ax = Cnew.X(s, nih.f(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (R(obj, i2)) {
                        ax = Cnew.K(s, (ngz) nih.h(obj, D), G(i2));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    ax = nhp.u(s, J(obj, D));
                    i += ax;
                    break;
                case 19:
                    ax = nhp.t(s, J(obj, D));
                    i += ax;
                    break;
                case 20:
                    ax = nhp.w(s, J(obj, D));
                    i += ax;
                    break;
                case 21:
                    ax = nhp.A(s, J(obj, D));
                    i += ax;
                    break;
                case 22:
                    ax = nhp.v(s, J(obj, D));
                    i += ax;
                    break;
                case 23:
                    ax = nhp.u(s, J(obj, D));
                    i += ax;
                    break;
                case 24:
                    ax = nhp.t(s, J(obj, D));
                    i += ax;
                    break;
                case 25:
                    ax = nhp.r(s, J(obj, D));
                    i += ax;
                    break;
                case 26:
                    ax = nhp.m(s, J(obj, D));
                    i += ax;
                    break;
                case 27:
                    ax = nhp.j(s, J(obj, D), G(i2));
                    i += ax;
                    break;
                case 28:
                    ax = nhp.b(s, J(obj, D));
                    i += ax;
                    break;
                case 29:
                    ax = nhp.z(s, J(obj, D));
                    i += ax;
                    break;
                case 30:
                    ax = nhp.s(s, J(obj, D));
                    i += ax;
                    break;
                case 31:
                    ax = nhp.t(s, J(obj, D));
                    i += ax;
                    break;
                case 32:
                    ax = nhp.u(s, J(obj, D));
                    i += ax;
                    break;
                case 33:
                    ax = nhp.x(s, J(obj, D));
                    i += ax;
                    break;
                case 34:
                    ax = nhp.y(s, J(obj, D));
                    i += ax;
                    break;
                case 35:
                    e = nhp.e((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    e = nhp.d((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    e = nhp.h((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    e = nhp.o((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    e = nhp.g((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    e = nhp.e((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    e = nhp.d((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    e = nhp.a((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    e = nhp.n((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    e = nhp.c((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e = nhp.d((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    e = nhp.e((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    e = nhp.k((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    e = nhp.l((List) unsafe.getObject(obj, D));
                    if (e > 0) {
                        ab = Cnew.ab(s);
                        ad = Cnew.ad(e);
                        i += ab + ad + e;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ax = nhp.f(s, J(obj, D), G(i2));
                    i += ax;
                    break;
                case 50:
                    ax = ndb.I(s, nih.h(obj, D), H(i2));
                    i += ax;
                    break;
                case 51:
                    if (U(obj, s, i2)) {
                        ax = Cnew.ax(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (U(obj, s, i2)) {
                        ax = Cnew.aA(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (U(obj, s, i2)) {
                        ax = Cnew.O(s, E(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (U(obj, s, i2)) {
                        ax = Cnew.ae(s, E(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (U(obj, s, i2)) {
                        ax = Cnew.M(s, t(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (U(obj, s, i2)) {
                        ax = Cnew.az(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (U(obj, s, i2)) {
                        ax = Cnew.ay(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (U(obj, s, i2)) {
                        ax = Cnew.aw(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (U(obj, s, i2)) {
                        Object h2 = nih.h(obj, D);
                        if (h2 instanceof nem) {
                            ax = Cnew.H(s, (nem) h2);
                        } else {
                            ax = Cnew.Z(s, (String) h2);
                        }
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (U(obj, s, i2)) {
                        ax = nhp.i(s, nih.h(obj, D), G(i2));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (U(obj, s, i2)) {
                        ax = Cnew.H(s, (nem) nih.h(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (U(obj, s, i2)) {
                        ax = Cnew.ac(s, t(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (U(obj, s, i2)) {
                        ax = Cnew.J(s, t(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (U(obj, s, i2)) {
                        ax = Cnew.aB(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (U(obj, s, i2)) {
                        ax = Cnew.aC(s);
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (U(obj, s, i2)) {
                        ax = Cnew.V(s, t(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (U(obj, s, i2)) {
                        ax = Cnew.X(s, E(obj, D));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (U(obj, s, i2)) {
                        ax = Cnew.K(s, (ngz) nih.h(obj, D), G(i2));
                        i += ax;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i + Z(obj);
    }

    private final int s(int i) {
        return this.c[i];
    }

    private static int t(Object obj, long j) {
        return ((Integer) nih.h(obj, j)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    private final int u(Object obj, byte[] bArr, int i, int i2, int i3, long j, ndz ndzVar) {
        Unsafe unsafe = b;
        Object H = H(i3);
        Object object = unsafe.getObject(obj, j);
        if (ndb.J(object)) {
            Object L = ndb.L();
            ndb.K(L, object);
            unsafe.putObject(obj, j, L);
            object = L;
        }
        ngt H2 = ndb.H(H);
        ngu nguVar = (ngu) object;
        int n = ndb.n(bArr, i, ndzVar);
        int i4 = ndzVar.a;
        if (i4 < 0 || i4 > i2 - n) {
            throw ngd.i();
        }
        int i5 = n + i4;
        Object obj2 = H2.a;
        Object obj3 = H2.b;
        while (n < i5) {
            int i6 = n + 1;
            byte b2 = bArr[n];
            if (b2 < 0) {
                i6 = ndb.o(b2, bArr, i6, ndzVar);
                b2 = ndzVar.a;
            }
            int i7 = b2 & 7;
            int i8 = b2 >>> 3;
            if (i8 != 1) {
                if (i8 == 2) {
                    nik nikVar = (nik) H2.d;
                    if (i7 == nikVar.t) {
                        n = W(bArr, i6, i2, nikVar, H2.b.getClass(), ndzVar);
                        obj3 = ndzVar.c;
                    }
                }
                n = ndb.r(b2, bArr, i6, i2, ndzVar);
            } else {
                nik nikVar2 = (nik) H2.c;
                if (i7 == nikVar2.t) {
                    n = W(bArr, i6, i2, nikVar2, null, ndzVar);
                    obj2 = ndzVar.c;
                } else {
                    n = ndb.r(b2, bArr, i6, i2, ndzVar);
                }
            }
        }
        if (n != i5) {
            throw ngd.g();
        }
        nguVar.put(obj2, obj3);
        return i5;
    }

    private final int v(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ndz ndzVar) {
        Unsafe unsafe = b;
        long j2 = this.c[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(ndb.c(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(ndb.d(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int q = ndb.q(bArr, i, ndzVar);
                    unsafe.putObject(obj, j, Long.valueOf(ndzVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return q;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int n = ndb.n(bArr, i, ndzVar);
                    unsafe.putObject(obj, j, Integer.valueOf(ndzVar.a));
                    unsafe.putInt(obj, j2, i4);
                    return n;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(ndb.s(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(ndb.f(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int q2 = ndb.q(bArr, i, ndzVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(ndzVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return q2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int n2 = ndb.n(bArr, i, ndzVar);
                    int i9 = ndzVar.a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) == 0 || nij.h(bArr, n2, n2 + i9)) {
                        unsafe.putObject(obj, j, new String(bArr, n2, i9, ngb.a));
                        n2 += i9;
                    } else {
                        throw ngd.d();
                    }
                    unsafe.putInt(obj, j2, i4);
                    return n2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int h = ndb.h(G(i8), bArr, i, i2, ndzVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, ndzVar.c);
                    } else {
                        unsafe.putObject(obj, j, ngb.e(object, ndzVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return h;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int e = ndb.e(bArr, i, ndzVar);
                    unsafe.putObject(obj, j, ndzVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int n3 = ndb.n(bArr, i, ndzVar);
                    int i10 = ndzVar.a;
                    nfq F = F(i8);
                    if (F == null || F.a(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        d(obj).d(i3, Long.valueOf(i10));
                    }
                    return n3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int n4 = ndb.n(bArr, i, ndzVar);
                    unsafe.putObject(obj, j, Integer.valueOf(ner.F(ndzVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return n4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int q3 = ndb.q(bArr, i, ndzVar);
                    unsafe.putObject(obj, j, Long.valueOf(ner.G(ndzVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return q3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int g = ndb.g(G(i8), bArr, i, i2, (i3 & (-8)) | 4, ndzVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, ndzVar.c);
                    } else {
                        unsafe.putObject(obj, j, ngb.e(object2, ndzVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return g;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x01c8 -> B:99:0x01c9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0216 -> B:117:0x0217). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x014b -> B:68:0x014c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int w(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, defpackage.ndz r29) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhb.w(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, ndz):int");
    }

    private final int x(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return A(i, 0);
    }

    private final int y(int i, int i2) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return A(i, i2);
    }

    private final int z(int i) {
        return this.c[i + 2];
    }

    @Override // defpackage.nho
    public final int a(Object obj) {
        return this.j ? r(obj) : q(obj);
    }

    @Override // defpackage.nho
    public final int b(Object obj) {
        int i;
        int c;
        int length = this.c.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int C = C(i3);
            int s = s(i3);
            long D = D(C);
            int i4 = 37;
            switch (B(C)) {
                case 0:
                    i = i2 * 53;
                    c = ngb.c(Double.doubleToLongBits(nih.b(obj, D)));
                    i2 = i + c;
                    break;
                case 1:
                    i = i2 * 53;
                    c = Float.floatToIntBits(nih.c(obj, D));
                    i2 = i + c;
                    break;
                case 2:
                    i = i2 * 53;
                    c = ngb.c(nih.f(obj, D));
                    i2 = i + c;
                    break;
                case 3:
                    i = i2 * 53;
                    c = ngb.c(nih.f(obj, D));
                    i2 = i + c;
                    break;
                case 4:
                    i = i2 * 53;
                    c = nih.d(obj, D);
                    i2 = i + c;
                    break;
                case 5:
                    i = i2 * 53;
                    c = ngb.c(nih.f(obj, D));
                    i2 = i + c;
                    break;
                case 6:
                    i = i2 * 53;
                    c = nih.d(obj, D);
                    i2 = i + c;
                    break;
                case 7:
                    i = i2 * 53;
                    c = ngb.a(nih.w(obj, D));
                    i2 = i + c;
                    break;
                case 8:
                    i = i2 * 53;
                    c = ((String) nih.h(obj, D)).hashCode();
                    i2 = i + c;
                    break;
                case 9:
                    Object h = nih.h(obj, D);
                    if (h != null) {
                        i4 = h.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    c = nih.h(obj, D).hashCode();
                    i2 = i + c;
                    break;
                case 11:
                    i = i2 * 53;
                    c = nih.d(obj, D);
                    i2 = i + c;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    i = i2 * 53;
                    c = nih.d(obj, D);
                    i2 = i + c;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    i = i2 * 53;
                    c = nih.d(obj, D);
                    i2 = i + c;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    i = i2 * 53;
                    c = ngb.c(nih.f(obj, D));
                    i2 = i + c;
                    break;
                case 15:
                    i = i2 * 53;
                    c = nih.d(obj, D);
                    i2 = i + c;
                    break;
                case 16:
                    i = i2 * 53;
                    c = ngb.c(nih.f(obj, D));
                    i2 = i + c;
                    break;
                case 17:
                    Object h2 = nih.h(obj, D);
                    if (h2 != null) {
                        i4 = h2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    c = nih.h(obj, D).hashCode();
                    i2 = i + c;
                    break;
                case 50:
                    i = i2 * 53;
                    c = nih.h(obj, D).hashCode();
                    i2 = i + c;
                    break;
                case 51:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ngb.c(Double.doubleToLongBits(o(obj, D)));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = Float.floatToIntBits(p(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ngb.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ngb.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ngb.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ngb.a(V(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ((String) nih.h(obj, D)).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = nih.h(obj, D).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = nih.h(obj, D).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ngb.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ngb.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = nih.h(obj, D).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + ndb.z(obj).hashCode();
        return this.h ? (hashCode * 53) + ndb.N(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0601, code lost:
        if (r2 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0603, code lost:
        r30.putInt(r13, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0609, code lost:
        r2 = r9.l;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x060f, code lost:
        if (r2 >= r9.m) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0611, code lost:
        r3 = r9.Y(r13, r9.k[r2], r3);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x061c, code lost:
        if (r3 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x061e, code lost:
        defpackage.ndb.A(r13, (defpackage.nia) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0623, code lost:
        if (r7 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0625, code lost:
        if (r0 != r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x062c, code lost:
        throw defpackage.ngd.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0631, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x062d, code lost:
        if (r0 > r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x062f, code lost:
        if (r1 != r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0637, code lost:
        throw defpackage.ngd.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, defpackage.ndz r37) {
        /*
            Method dump skipped, instructions count: 1672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhb.c(java.lang.Object, byte[], int, int, int, ndz):int");
    }

    @Override // defpackage.nho
    public final Object e() {
        return ((nfm) this.g).N(4);
    }

    @Override // defpackage.nho
    public final void f(Object obj) {
        int i;
        int i2 = this.l;
        while (true) {
            i = this.m;
            if (i2 >= i) {
                break;
            }
            long D = D(C(this.k[i2]));
            Object h = nih.h(obj, D);
            if (h != null) {
                ((ngu) h).c();
                nih.u(obj, D, h);
            }
            i2++;
        }
        int length = this.k.length;
        while (i < length) {
            this.n.c(obj, this.k[i]);
            i++;
        }
        ndb.C(obj);
        if (this.h) {
            ndb.Q(obj);
        }
    }

    @Override // defpackage.nho
    public final void h(Object obj, nhk nhkVar, nfb nfbVar) {
        Object valueOf;
        Object k;
        nfbVar.getClass();
        ndb ndbVar = this.o;
        Object obj2 = null;
        nfd nfdVar = null;
        while (true) {
            try {
                int c = nhkVar.c();
                int x = x(c);
                if (x >= 0) {
                    int C = C(x);
                    try {
                        switch (B(C)) {
                            case 0:
                                nih.q(obj, D(C), nhkVar.a());
                                N(obj, x);
                                break;
                            case 1:
                                nih.r(obj, D(C), nhkVar.b());
                                N(obj, x);
                                break;
                            case 2:
                                nih.t(obj, D(C), nhkVar.l());
                                N(obj, x);
                                break;
                            case 3:
                                nih.t(obj, D(C), nhkVar.o());
                                N(obj, x);
                                break;
                            case 4:
                                nih.s(obj, D(C), nhkVar.g());
                                N(obj, x);
                                break;
                            case 5:
                                nih.t(obj, D(C), nhkVar.k());
                                N(obj, x);
                                break;
                            case 6:
                                nih.s(obj, D(C), nhkVar.f());
                                N(obj, x);
                                break;
                            case 7:
                                nih.m(obj, D(C), nhkVar.T());
                                N(obj, x);
                                break;
                            case 8:
                                M(obj, C, nhkVar);
                                N(obj, x);
                                break;
                            case 9:
                                if (R(obj, x)) {
                                    nih.u(obj, D(C), ngb.e(nih.h(obj, D(C)), nhkVar.u(G(x), nfbVar)));
                                    break;
                                } else {
                                    nih.u(obj, D(C), nhkVar.u(G(x), nfbVar));
                                    N(obj, x);
                                    break;
                                }
                            case 10:
                                nih.u(obj, D(C), nhkVar.q());
                                N(obj, x);
                                break;
                            case 11:
                                nih.s(obj, D(C), nhkVar.j());
                                N(obj, x);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                int e = nhkVar.e();
                                nfq F = F(x);
                                if (F != null && !F.a(e)) {
                                    obj2 = nhp.E(c, e, obj2);
                                    break;
                                }
                                nih.s(obj, D(C), e);
                                N(obj, x);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                nih.s(obj, D(C), nhkVar.h());
                                N(obj, x);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                nih.t(obj, D(C), nhkVar.m());
                                N(obj, x);
                                break;
                            case 15:
                                nih.s(obj, D(C), nhkVar.i());
                                N(obj, x);
                                break;
                            case 16:
                                nih.t(obj, D(C), nhkVar.n());
                                N(obj, x);
                                break;
                            case 17:
                                if (R(obj, x)) {
                                    nih.u(obj, D(C), ngb.e(nih.h(obj, D(C)), nhkVar.s(G(x), nfbVar)));
                                    break;
                                } else {
                                    nih.u(obj, D(C), nhkVar.s(G(x), nfbVar));
                                    N(obj, x);
                                    break;
                                }
                            case 18:
                                nhkVar.A(this.n.b(obj, D(C)));
                                break;
                            case 19:
                                nhkVar.E(this.n.b(obj, D(C)));
                                break;
                            case 20:
                                nhkVar.H(this.n.b(obj, D(C)));
                                break;
                            case 21:
                                nhkVar.S(this.n.b(obj, D(C)));
                                break;
                            case 22:
                                nhkVar.G(this.n.b(obj, D(C)));
                                break;
                            case 23:
                                nhkVar.D(this.n.b(obj, D(C)));
                                break;
                            case 24:
                                nhkVar.C(this.n.b(obj, D(C)));
                                break;
                            case 25:
                                nhkVar.y(this.n.b(obj, D(C)));
                                break;
                            case 26:
                                if (Q(C)) {
                                    nhkVar.Q(this.n.b(obj, D(C)));
                                    break;
                                } else {
                                    nhkVar.O(this.n.b(obj, D(C)));
                                    break;
                                }
                            case 27:
                                nhkVar.J(this.n.b(obj, D(C)), G(x), nfbVar);
                                break;
                            case 28:
                                nhkVar.z(this.n.b(obj, D(C)));
                                break;
                            case 29:
                                nhkVar.R(this.n.b(obj, D(C)));
                                break;
                            case 30:
                                List b2 = this.n.b(obj, D(C));
                                nhkVar.B(b2);
                                obj2 = nhp.F(c, b2, F(x), obj2);
                                break;
                            case 31:
                                nhkVar.K(this.n.b(obj, D(C)));
                                break;
                            case 32:
                                nhkVar.L(this.n.b(obj, D(C)));
                                break;
                            case 33:
                                nhkVar.M(this.n.b(obj, D(C)));
                                break;
                            case 34:
                                nhkVar.N(this.n.b(obj, D(C)));
                                break;
                            case 35:
                                nhkVar.A(this.n.b(obj, D(C)));
                                break;
                            case 36:
                                nhkVar.E(this.n.b(obj, D(C)));
                                break;
                            case 37:
                                nhkVar.H(this.n.b(obj, D(C)));
                                break;
                            case 38:
                                nhkVar.S(this.n.b(obj, D(C)));
                                break;
                            case 39:
                                nhkVar.G(this.n.b(obj, D(C)));
                                break;
                            case 40:
                                nhkVar.D(this.n.b(obj, D(C)));
                                break;
                            case 41:
                                nhkVar.C(this.n.b(obj, D(C)));
                                break;
                            case 42:
                                nhkVar.y(this.n.b(obj, D(C)));
                                break;
                            case 43:
                                nhkVar.R(this.n.b(obj, D(C)));
                                break;
                            case 44:
                                List b3 = this.n.b(obj, D(C));
                                nhkVar.B(b3);
                                obj2 = nhp.F(c, b3, F(x), obj2);
                                break;
                            case 45:
                                nhkVar.K(this.n.b(obj, D(C)));
                                break;
                            case 46:
                                nhkVar.L(this.n.b(obj, D(C)));
                                break;
                            case 47:
                                nhkVar.M(this.n.b(obj, D(C)));
                                break;
                            case 48:
                                nhkVar.N(this.n.b(obj, D(C)));
                                break;
                            case 49:
                                nhkVar.F(this.n.b(obj, D(C)), G(x), nfbVar);
                                break;
                            case 50:
                                Object H = H(x);
                                long D = D(C(x));
                                Object h = nih.h(obj, D);
                                if (h == null) {
                                    h = ndb.L();
                                    nih.u(obj, D, h);
                                } else if (ndb.J(h)) {
                                    Object L = ndb.L();
                                    ndb.K(L, h);
                                    nih.u(obj, D, L);
                                    h = L;
                                }
                                nhkVar.I((ngu) h, ndb.H(H), nfbVar);
                                break;
                            case 51:
                                nih.u(obj, D(C), Double.valueOf(nhkVar.a()));
                                O(obj, c, x);
                                break;
                            case 52:
                                nih.u(obj, D(C), Float.valueOf(nhkVar.b()));
                                O(obj, c, x);
                                break;
                            case 53:
                                nih.u(obj, D(C), Long.valueOf(nhkVar.l()));
                                O(obj, c, x);
                                break;
                            case 54:
                                nih.u(obj, D(C), Long.valueOf(nhkVar.o()));
                                O(obj, c, x);
                                break;
                            case 55:
                                nih.u(obj, D(C), Integer.valueOf(nhkVar.g()));
                                O(obj, c, x);
                                break;
                            case 56:
                                nih.u(obj, D(C), Long.valueOf(nhkVar.k()));
                                O(obj, c, x);
                                break;
                            case 57:
                                nih.u(obj, D(C), Integer.valueOf(nhkVar.f()));
                                O(obj, c, x);
                                break;
                            case 58:
                                nih.u(obj, D(C), Boolean.valueOf(nhkVar.T()));
                                O(obj, c, x);
                                break;
                            case 59:
                                M(obj, C, nhkVar);
                                O(obj, c, x);
                                break;
                            case 60:
                                if (U(obj, c, x)) {
                                    nih.u(obj, D(C), ngb.e(nih.h(obj, D(C)), nhkVar.u(G(x), nfbVar)));
                                } else {
                                    nih.u(obj, D(C), nhkVar.u(G(x), nfbVar));
                                    N(obj, x);
                                }
                                O(obj, c, x);
                                break;
                            case 61:
                                nih.u(obj, D(C), nhkVar.q());
                                O(obj, c, x);
                                break;
                            case 62:
                                nih.u(obj, D(C), Integer.valueOf(nhkVar.j()));
                                O(obj, c, x);
                                break;
                            case 63:
                                int e2 = nhkVar.e();
                                nfq F2 = F(x);
                                if (F2 != null && !F2.a(e2)) {
                                    obj2 = nhp.E(c, e2, obj2);
                                    break;
                                }
                                nih.u(obj, D(C), Integer.valueOf(e2));
                                O(obj, c, x);
                                break;
                            case 64:
                                nih.u(obj, D(C), Integer.valueOf(nhkVar.h()));
                                O(obj, c, x);
                                break;
                            case 65:
                                nih.u(obj, D(C), Long.valueOf(nhkVar.m()));
                                O(obj, c, x);
                                break;
                            case 66:
                                nih.u(obj, D(C), Integer.valueOf(nhkVar.i()));
                                O(obj, c, x);
                                break;
                            case 67:
                                nih.u(obj, D(C), Long.valueOf(nhkVar.n()));
                                O(obj, c, x);
                                break;
                            case 68:
                                nih.u(obj, D(C), nhkVar.s(G(x), nfbVar));
                                O(obj, c, x);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = nia.b();
                                }
                                if (ndbVar.w(obj2, nhkVar)) {
                                    break;
                                } else {
                                    for (int i = this.l; i < this.m; i++) {
                                        obj2 = Y(obj, this.k[i], obj2);
                                    }
                                    if (obj2 == null) {
                                        return;
                                    }
                                }
                                break;
                        }
                    } catch (ngc unused) {
                        if (obj2 == null) {
                            obj2 = ndb.B(obj);
                        }
                        if (!ndbVar.w(obj2, nhkVar)) {
                            for (int i2 = this.l; i2 < this.m; i2++) {
                                obj2 = Y(obj, this.k[i2], obj2);
                            }
                            if (obj2 == null) {
                                return;
                            }
                            ndb.A(obj, (nia) obj2);
                            return;
                        }
                    }
                } else if (c == Integer.MAX_VALUE) {
                    for (int i3 = this.l; i3 < this.m; i3++) {
                        obj2 = Y(obj, this.k[i3], obj2);
                    }
                    if (obj2 == null) {
                        return;
                    }
                } else {
                    ngt c2 = !this.h ? null : nfbVar.c(this.g, c);
                    if (c2 != null) {
                        if (nfdVar == null) {
                            nfdVar = ndb.O(obj);
                        }
                        int i4 = ((nfl) c2.c).a;
                        if (c2.a() == nik.ENUM) {
                            nhkVar.g();
                            throw null;
                        }
                        switch (c2.a().ordinal()) {
                            case 0:
                                valueOf = Double.valueOf(nhkVar.a());
                                break;
                            case 1:
                                valueOf = Float.valueOf(nhkVar.b());
                                break;
                            case 2:
                                valueOf = Long.valueOf(nhkVar.l());
                                break;
                            case 3:
                                valueOf = Long.valueOf(nhkVar.o());
                                break;
                            case 4:
                                valueOf = Integer.valueOf(nhkVar.g());
                                break;
                            case 5:
                                valueOf = Long.valueOf(nhkVar.k());
                                break;
                            case 6:
                                valueOf = Integer.valueOf(nhkVar.f());
                                break;
                            case 7:
                                valueOf = Boolean.valueOf(nhkVar.T());
                                break;
                            case 8:
                                valueOf = nhkVar.v();
                                break;
                            case 9:
                                valueOf = nhkVar.r(c2.a.getClass(), nfbVar);
                                break;
                            case 10:
                                valueOf = nhkVar.t(c2.a.getClass(), nfbVar);
                                break;
                            case 11:
                                valueOf = nhkVar.q();
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                valueOf = Integer.valueOf(nhkVar.j());
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                valueOf = Integer.valueOf(nhkVar.h());
                                break;
                            case 15:
                                valueOf = Long.valueOf(nhkVar.m());
                                break;
                            case 16:
                                valueOf = Integer.valueOf(nhkVar.i());
                                break;
                            case 17:
                                valueOf = Long.valueOf(nhkVar.n());
                                break;
                            default:
                                valueOf = null;
                                break;
                        }
                        c2.b();
                        int ordinal = c2.a().ordinal();
                        if ((ordinal == 9 || ordinal == 10) && (k = nfdVar.k((nfl) c2.c)) != null) {
                            valueOf = ngb.e(k, valueOf);
                        }
                        nfdVar.l((nfl) c2.c, valueOf);
                    } else {
                        if (obj2 == null) {
                            obj2 = ndb.B(obj);
                        }
                        if (!ndbVar.w(obj2, nhkVar)) {
                            for (int i5 = this.l; i5 < this.m; i5++) {
                                obj2 = Y(obj, this.k[i5], obj2);
                            }
                            if (obj2 == null) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i6 = this.l; i6 < this.m; i6++) {
                    obj2 = Y(obj, this.k[i6], obj2);
                }
                if (obj2 != null) {
                    ndb.A(obj, (nia) obj2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.nho
    public final void i(Object obj, byte[] bArr, int i, int i2, ndz ndzVar) {
        if (this.j) {
            X(obj, bArr, i, i2, ndzVar);
        } else {
            c(obj, bArr, i, i2, 0, ndzVar);
        }
    }

    @Override // defpackage.nho
    public final boolean j(Object obj, Object obj2) {
        boolean q;
        int length = this.c.length;
        for (int i = 0; i < length; i += 3) {
            int C = C(i);
            long D = D(C);
            switch (B(C)) {
                case 0:
                    if (P(obj, obj2, i) && Double.doubleToLongBits(nih.b(obj, D)) == Double.doubleToLongBits(nih.b(obj2, D))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (P(obj, obj2, i) && Float.floatToIntBits(nih.c(obj, D)) == Float.floatToIntBits(nih.c(obj2, D))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (P(obj, obj2, i) && nih.f(obj, D) == nih.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (P(obj, obj2, i) && nih.f(obj, D) == nih.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (P(obj, obj2, i) && nih.d(obj, D) == nih.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (P(obj, obj2, i) && nih.f(obj, D) == nih.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (P(obj, obj2, i) && nih.d(obj, D) == nih.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (P(obj, obj2, i) && nih.w(obj, D) == nih.w(obj2, D)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (P(obj, obj2, i) && nhp.q(nih.h(obj, D), nih.h(obj2, D))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (P(obj, obj2, i) && nhp.q(nih.h(obj, D), nih.h(obj2, D))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (P(obj, obj2, i) && nhp.q(nih.h(obj, D), nih.h(obj2, D))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (P(obj, obj2, i) && nih.d(obj, D) == nih.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (P(obj, obj2, i) && nih.d(obj, D) == nih.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (P(obj, obj2, i) && nih.d(obj, D) == nih.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (P(obj, obj2, i) && nih.f(obj, D) == nih.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (P(obj, obj2, i) && nih.d(obj, D) == nih.d(obj2, D)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (P(obj, obj2, i) && nih.f(obj, D) == nih.f(obj2, D)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (P(obj, obj2, i) && nhp.q(nih.h(obj, D), nih.h(obj2, D))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    q = nhp.q(nih.h(obj, D), nih.h(obj2, D));
                    break;
                case 50:
                    q = nhp.q(nih.h(obj, D), nih.h(obj2, D));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long z = z(i) & 1048575;
                    if (nih.d(obj, z) == nih.d(obj2, z) && nhp.q(nih.h(obj, D), nih.h(obj2, D))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!q) {
                return false;
            }
        }
        if (!ndb.z(obj).equals(ndb.z(obj2))) {
            return false;
        }
        if (!this.h) {
            return true;
        }
        return ndb.N(obj).equals(ndb.N(obj2));
    }

    @Override // defpackage.nho
    public final boolean k(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.l) {
            int i6 = this.k[i5];
            int s = s(i6);
            int C = C(i6);
            int i7 = this.c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = b.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & C) != 0 && !S(obj, i6, i, i2, i9)) {
                return false;
            }
            int B = B(C);
            if (B != 9 && B != 17) {
                if (B != 27) {
                    if (B == 60 || B == 68) {
                        if (U(obj, s, i6) && !T(obj, C, G(i6))) {
                            return false;
                        }
                    } else if (B != 49) {
                        if (B != 50) {
                            continue;
                        } else {
                            ngu nguVar = (ngu) nih.h(obj, D(C));
                            if (!nguVar.isEmpty() && ((nik) ndb.H(H(i6)).d).s == nil.MESSAGE) {
                                nho nhoVar = null;
                                for (Object obj2 : nguVar.values()) {
                                    if (nhoVar == null) {
                                        nhoVar = nhh.a.a(obj2.getClass());
                                    }
                                    if (!nhoVar.k(obj2)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
                List list = (List) nih.h(obj, D(C));
                if (!list.isEmpty()) {
                    nho G = G(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!G.k(list.get(i10))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (S(obj, i6, i, i2, i9) && !T(obj, C, G(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.h || ndb.N(obj).i();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0586  */
    @Override // defpackage.nho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.lang.Object r13, defpackage.mlu r14) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhb.l(java.lang.Object, mlu):void");
    }

    @Override // defpackage.nho
    public final void g(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int C = C(i);
            long D = D(C);
            int s = s(i);
            switch (B(C)) {
                case 0:
                    if (R(obj2, i)) {
                        nih.q(obj, D, nih.b(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (R(obj2, i)) {
                        nih.r(obj, D, nih.c(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (R(obj2, i)) {
                        nih.t(obj, D, nih.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (R(obj2, i)) {
                        nih.t(obj, D, nih.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (R(obj2, i)) {
                        nih.s(obj, D, nih.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (R(obj2, i)) {
                        nih.t(obj, D, nih.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (R(obj2, i)) {
                        nih.s(obj, D, nih.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (R(obj2, i)) {
                        nih.m(obj, D, nih.w(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (R(obj2, i)) {
                        nih.u(obj, D, nih.h(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    K(obj, obj2, i);
                    break;
                case 10:
                    if (R(obj2, i)) {
                        nih.u(obj, D, nih.h(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (R(obj2, i)) {
                        nih.s(obj, D, nih.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (R(obj2, i)) {
                        nih.s(obj, D, nih.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (R(obj2, i)) {
                        nih.s(obj, D, nih.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (R(obj2, i)) {
                        nih.t(obj, D, nih.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (R(obj2, i)) {
                        nih.s(obj, D, nih.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (R(obj2, i)) {
                        nih.t(obj, D, nih.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    K(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.n.d(obj, obj2, D);
                    break;
                case 50:
                    nhp.C(obj, obj2, D);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (U(obj2, s, i)) {
                        nih.u(obj, D, nih.h(obj2, D));
                        O(obj, s, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    L(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (U(obj2, s, i)) {
                        nih.u(obj, D, nih.h(obj2, D));
                        O(obj, s, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    L(obj, obj2, i);
                    break;
            }
        }
        nhp.D(obj, obj2);
        if (this.h) {
            nhp.B(obj, obj2);
        }
    }
}
