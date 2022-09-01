package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lrq  reason: default package */
/* loaded from: classes.dex */
public final class lrq extends llw {
    public static final llw b = new lrq(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;

    private lrq(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    public static lrq a(int i, Object[] objArr) {
        return r(i, objArr, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lrq r(int i, Object[] objArr, lls llsVar) {
        if (i == 0) {
            return (lrq) b;
        }
        if (i == 1) {
            jez.U(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            return new lrq(null, objArr, 1);
        }
        jdg.P(i, objArr.length >> 1);
        Object u = u(objArr, i, lmz.e(i), 0);
        if (u instanceof Object[]) {
            Object[] objArr2 = (Object[]) u;
            kcq kcqVar = (kcq) objArr2[2];
            if (llsVar != null) {
                llsVar.c = kcqVar;
                Object obj = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue + intValue);
                u = obj;
                i = intValue;
            } else {
                throw kcqVar.j();
            }
        }
        return new lrq(u, objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object s(Object[] objArr, int i, int i2, int i3) {
        Object u = u(objArr, i, i2, i3);
        if (!(u instanceof Object[])) {
            return u;
        }
        throw ((kcq) ((Object[]) u)[2]).j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object t(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (!Objects.requireNonNull(objArr[i2]).equals(obj2)) {
                return null;
            }
            return Objects.requireNonNull(objArr[i2 ^ 1]);
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int G = jez.G(obj2.hashCode());
                while (true) {
                    int i3 = G & length;
                    int i4 = bArr[i3] & 255;
                    if (i4 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i4])) {
                        return objArr[i4 ^ 1];
                    }
                    G = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int G2 = jez.G(obj2.hashCode());
                while (true) {
                    int i5 = G2 & length2;
                    char c = (char) sArr[i5];
                    if (c == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[c])) {
                        return objArr[c ^ 1];
                    }
                    G2 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int G3 = jez.G(obj2.hashCode());
                while (true) {
                    int i6 = G3 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i7])) {
                        return objArr[i7 ^ 1];
                    }
                    G3 = i6 + 1;
                }
            }
        }
    }

    private static Object u(Object[] objArr, int i, int i2, int i3) {
        kcq kcqVar = null;
        if (i == 1) {
            jez.U(Objects.requireNonNull(objArr[i3]), Objects.requireNonNull(objArr[i3 ^ 1]));
            return null;
        }
        int i4 = i2 - 1;
        int i5 = -1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = i7 + i7 + i3;
                int i9 = i6 + i6 + i3;
                Object requireNonNull = Objects.requireNonNull(objArr[i8]);
                Object requireNonNull2 = Objects.requireNonNull(objArr[i8 ^ 1]);
                jez.U(requireNonNull, requireNonNull2);
                int G = jez.G(requireNonNull.hashCode());
                while (true) {
                    int i10 = G & i4;
                    int i11 = bArr[i10] & 255;
                    if (i11 != 255) {
                        if (requireNonNull.equals(objArr[i11])) {
                            int i12 = i11 ^ 1;
                            kcq kcqVar2 = new kcq(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr[i12]));
                            objArr[i12] = requireNonNull2;
                            kcqVar = kcqVar2;
                            break;
                        }
                        G = i10 + 1;
                    } else {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = requireNonNull;
                            objArr[i9 ^ 1] = requireNonNull2;
                        }
                        i6++;
                    }
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), kcqVar};
        } else if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = i14 + i14 + i3;
                int i16 = i13 + i13 + i3;
                Object requireNonNull3 = Objects.requireNonNull(objArr[i15]);
                Object requireNonNull4 = Objects.requireNonNull(objArr[i15 ^ 1]);
                jez.U(requireNonNull3, requireNonNull4);
                int G2 = jez.G(requireNonNull3.hashCode());
                while (true) {
                    int i17 = G2 & i4;
                    char c = (char) sArr[i17];
                    if (c != 65535) {
                        if (requireNonNull3.equals(objArr[c])) {
                            int i18 = c ^ 1;
                            kcq kcqVar3 = new kcq(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr[i18]));
                            objArr[i18] = requireNonNull4;
                            kcqVar = kcqVar3;
                            break;
                        }
                        G2 = i17 + 1;
                    } else {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = requireNonNull3;
                            objArr[i16 ^ 1] = requireNonNull4;
                        }
                        i13++;
                    }
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), kcqVar};
        } else {
            int[] iArr = new int[i2];
            Arrays.fill(iArr, -1);
            int i19 = 0;
            int i20 = 0;
            while (i19 < i) {
                int i21 = i19 + i19 + i3;
                int i22 = i20 + i20 + i3;
                Object requireNonNull5 = Objects.requireNonNull(objArr[i21]);
                Object requireNonNull6 = Objects.requireNonNull(objArr[i21 ^ 1]);
                jez.U(requireNonNull5, requireNonNull6);
                int G3 = jez.G(requireNonNull5.hashCode());
                while (true) {
                    int i23 = G3 & i4;
                    int i24 = iArr[i23];
                    if (i24 != i5) {
                        if (requireNonNull5.equals(objArr[i24])) {
                            int i25 = i24 ^ 1;
                            kcq kcqVar4 = new kcq(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr[i25]));
                            objArr[i25] = requireNonNull6;
                            kcqVar = kcqVar4;
                            break;
                        }
                        G3 = i23 + 1;
                        i5 = -1;
                    } else {
                        iArr[i23] = i22;
                        if (i20 < i19) {
                            objArr[i22] = requireNonNull5;
                            objArr[i22 ^ 1] = requireNonNull6;
                        }
                        i20++;
                    }
                }
                i19++;
                i5 = -1;
            }
            return i20 == i ? iArr : new Object[]{iArr, Integer.valueOf(i20), kcqVar};
        }
    }

    @Override // defpackage.llw
    public final llg c() {
        return new lrp(this.c, 1, this.d);
    }

    @Override // defpackage.llw
    public final lmz f() {
        return new lrn(this, this.c, 0, this.d);
    }

    @Override // defpackage.llw
    public final lmz g() {
        return new lro(this, new lrp(this.c, 0, this.d));
    }

    @Override // defpackage.llw, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object t = t(this.e, this.c, this.d, 0, obj);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // defpackage.llw
    public final boolean ig() {
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.d;
    }
}
