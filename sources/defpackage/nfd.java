package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: nfd  reason: default package */
/* loaded from: classes2.dex */
public final class nfd {
    public static final nfd a = new nfd(null);
    final nhw b = nhw.b(16);
    public boolean c;
    private boolean d;

    private nfd() {
    }

    public static int a(nik nikVar, int i, Object obj) {
        int ab = Cnew.ab(i);
        if (nikVar == nik.GROUP) {
            ngb.j((ngz) obj);
            ab += ab;
        }
        nil nilVar = nil.INT;
        int i2 = 4;
        switch (nikVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i2 = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i2 = Cnew.af(((Long) obj).longValue());
                break;
            case 3:
                i2 = Cnew.af(((Long) obj).longValue());
                break;
            case 4:
                i2 = Cnew.N(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i2 = 1;
                break;
            case 8:
                if (obj instanceof nem) {
                    i2 = Cnew.I((nem) obj);
                    break;
                } else {
                    i2 = Cnew.aa((String) obj);
                    break;
                }
            case 9:
                i2 = Cnew.L((ngz) obj);
                break;
            case 10:
                if (obj instanceof ngi) {
                    i2 = Cnew.Q((ngi) obj);
                    break;
                } else {
                    i2 = Cnew.S((ngz) obj);
                    break;
                }
            case 11:
                if (obj instanceof nem) {
                    i2 = Cnew.I((nem) obj);
                    break;
                } else {
                    i2 = Cnew.G((byte[]) obj);
                    break;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                i2 = Cnew.ad(((Integer) obj).intValue());
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (obj instanceof nfp) {
                    i2 = Cnew.N(((nfp) obj).a());
                    break;
                } else {
                    i2 = Cnew.N(((Integer) obj).intValue());
                    break;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 16:
                i2 = Cnew.W(((Integer) obj).intValue());
                break;
            case 17:
                i2 = Cnew.Y(((Long) obj).longValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return ab + i2;
    }

    public static void g(Cnew cnew, nik nikVar, int i, Object obj) {
        if (nikVar != nik.GROUP) {
            cnew.A(i, nikVar.t);
            nil nilVar = nil.INT;
            switch (nikVar.ordinal()) {
                case 0:
                    cnew.ao(((Double) obj).doubleValue());
                    return;
                case 1:
                    cnew.aq(((Float) obj).floatValue());
                    return;
                case 2:
                    cnew.E(((Long) obj).longValue());
                    return;
                case 3:
                    cnew.E(((Long) obj).longValue());
                    return;
                case 4:
                    cnew.t(((Integer) obj).intValue());
                    return;
                case 5:
                    cnew.r(((Long) obj).longValue());
                    return;
                case 6:
                    cnew.p(((Integer) obj).intValue());
                    return;
                case 7:
                    cnew.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof nem) {
                        cnew.n((nem) obj);
                        return;
                    } else {
                        cnew.z((String) obj);
                        return;
                    }
                case 9:
                    cnew.ar((ngz) obj);
                    return;
                case 10:
                    cnew.v((ngz) obj);
                    return;
                case 11:
                    if (obj instanceof nem) {
                        cnew.n((nem) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    cnew.F(bArr, bArr.length);
                    return;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    cnew.C(((Integer) obj).intValue());
                    return;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (obj instanceof nfp) {
                        cnew.t(((nfp) obj).a());
                        return;
                    } else {
                        cnew.t(((Integer) obj).intValue());
                        return;
                    }
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    cnew.p(((Integer) obj).intValue());
                    return;
                case 15:
                    cnew.r(((Long) obj).longValue());
                    return;
                case 16:
                    cnew.at(((Integer) obj).intValue());
                    return;
                case 17:
                    cnew.av(((Long) obj).longValue());
                    return;
                default:
                    return;
            }
        }
        ngz ngzVar = (ngz) obj;
        ngb.j(ngzVar);
        cnew.A(i, 3);
        cnew.ar(ngzVar);
        cnew.A(i, 4);
    }

    public static int j(nfl nflVar, Object obj) {
        return a(nflVar.b, nflVar.a, obj);
    }

    private static Object n(Object obj) {
        if (obj instanceof nhd) {
            return ((nhd) obj).c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static boolean o(Map.Entry entry) {
        if (((nfl) entry.getKey()).a() == nil.MESSAGE) {
            Object value = entry.getValue();
            if (value instanceof nha) {
                return ((nha) value).cE();
            }
            if (!(value instanceof ngi)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            return true;
        }
        return true;
    }

    public final int b(Map.Entry entry) {
        int ac;
        int ab;
        nfl nflVar = (nfl) entry.getKey();
        Object value = entry.getValue();
        if (nflVar.a() != nil.MESSAGE) {
            return j(nflVar, value);
        }
        if (value instanceof ngi) {
            int i = ((nfl) entry.getKey()).a;
            int ab2 = Cnew.ab(1);
            ac = ab2 + ab2 + Cnew.ac(2, i);
            ab = Cnew.P(3, (ngi) value);
        } else {
            int i2 = ((nfl) entry.getKey()).a;
            int ab3 = Cnew.ab(1);
            ac = ab3 + ab3 + Cnew.ac(2, i2);
            ab = Cnew.ab(3) + Cnew.S((ngz) value);
        }
        return ac + ab;
    }

    /* renamed from: c */
    public final nfd clone() {
        nfd nfdVar = new nfd();
        for (int i = 0; i < this.b.a(); i++) {
            Map.Entry f = this.b.f(i);
            nfdVar.l((nfl) f.getKey(), f.getValue());
        }
        for (Map.Entry entry : this.b.c()) {
            nfdVar.l((nfl) entry.getKey(), entry.getValue());
        }
        nfdVar.d = this.d;
        return nfdVar;
    }

    public final Iterator d() {
        return this.d ? new ngh(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final void e() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.c) {
            return;
        }
        nhw nhwVar = this.b;
        if (!nhwVar.c) {
            for (int i = 0; i < nhwVar.a(); i++) {
                nfl nflVar = (nfl) nhwVar.f(i).getKey();
            }
            for (Map.Entry entry : nhwVar.c()) {
                nfl nflVar2 = (nfl) entry.getKey();
            }
        }
        if (!nhwVar.c) {
            if (nhwVar.b.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(nhwVar.b);
            }
            nhwVar.b = unmodifiableMap;
            if (nhwVar.d.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(nhwVar.d);
            }
            nhwVar.d = unmodifiableMap2;
            nhwVar.c = true;
        }
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nfd) {
            return this.b.equals(((nfd) obj).b);
        }
        return false;
    }

    public final void f(Map.Entry entry) {
        nfl nflVar = (nfl) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof ngi)) {
            if (nflVar.a() == nil.MESSAGE) {
                Object k = k(nflVar);
                if (k == null) {
                    this.b.put(nflVar, n(value));
                    return;
                } else if (k instanceof nhd) {
                    nhd nhdVar = (nhd) k;
                    nhd nhdVar2 = (nhd) value;
                    throw new UnsupportedOperationException();
                } else {
                    ngy fk = ((ngz) k).fk();
                    ((nfh) fk).cG((nfm) ((ngz) value));
                    this.b.put(nflVar, fk.cz());
                    return;
                }
            }
            this.b.put(nflVar, n(value));
            return;
        }
        ngi ngiVar = (ngi) value;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this.b.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        for (int i = 0; i < this.b.a(); i++) {
            if (!o(this.b.f(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.b.c()) {
            if (!o(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Object k(nfl nflVar) {
        Object obj = this.b.get(nflVar);
        if (!(obj instanceof ngi)) {
            return obj;
        }
        ngi ngiVar = (ngi) obj;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
        if ((r7 instanceof defpackage.nfp) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        if ((r7 instanceof byte[]) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r7 instanceof defpackage.ngi) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.nfl r6, java.lang.Object r7) {
        /*
            r5 = this;
            nik r0 = r6.b
            defpackage.ngb.h(r7)
            nik r1 = defpackage.nik.DOUBLE
            nil r1 = defpackage.nil.INT
            nil r0 = r0.s
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L26;
                case 7: goto L1d;
                case 8: goto L14;
                default: goto L13;
            }
        L13:
            goto L4e
        L14:
            boolean r0 = r7 instanceof defpackage.ngz
            if (r0 != 0) goto L42
            boolean r0 = r7 instanceof defpackage.ngi
            if (r0 == 0) goto L4e
            goto L42
        L1d:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L42
            boolean r0 = r7 instanceof defpackage.nfp
            if (r0 == 0) goto L4e
            goto L42
        L26:
            boolean r0 = r7 instanceof defpackage.nem
            if (r0 != 0) goto L42
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L4e
            goto L42
        L2f:
            boolean r0 = r7 instanceof java.lang.String
            goto L40
        L32:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r0 = r7 instanceof java.lang.Double
            goto L40
        L38:
            boolean r0 = r7 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r0 = r7 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r0 = r7 instanceof java.lang.Integer
        L40:
            if (r0 == 0) goto L4e
        L42:
            boolean r0 = r7 instanceof defpackage.ngi
            if (r0 == 0) goto L48
            r5.d = r1
        L48:
            nhw r0 = r5.b
            r0.put(r6, r7)
            return
        L4e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            nik r6 = r6.b
            nil r6 = r6.s
            r2[r1] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r2[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfd.l(nfl, java.lang.Object):void");
    }

    public final boolean m(nfl nflVar) {
        return this.b.get(nflVar) != null;
    }

    private nfd(byte[] bArr) {
        e();
        e();
    }
}
