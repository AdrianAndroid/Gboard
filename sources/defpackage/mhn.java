package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: mhn  reason: default package */
/* loaded from: classes.dex */
public final class mhn implements Serializable {
    static final String[] a = {null};
    private static final long serialVersionUID = 1;
    public int[] b;
    public int[] c;
    public int[] d;
    public String[][] e;
    public int[] f;
    public int g;
    public final boolean h;
    public final boolean i;
    public int j;

    private mhn() {
        this(0);
    }

    public static mhn b(String[] strArr, int i) {
        mhn mhnVar = new mhn(i);
        mhnVar.d(strArr);
        return mhnVar;
    }

    private final int e(int i, int i2) {
        int length;
        int i3;
        int i4 = this.d[i];
        while (true) {
            int i5 = -i4;
            if (i5 == 0 || i5 - i2 >= this.d.length - 256) {
                int[] iArr = this.c;
                int length2 = (iArr.length * 3) / 2;
                int[] copyOf = Arrays.copyOf(iArr, length2);
                int[] copyOf2 = Arrays.copyOf(this.d, length2);
                int i6 = -this.c[0];
                int length3 = this.d.length;
                copyOf2[i6] = -length3;
                while (true) {
                    length = copyOf2.length - 1;
                    if (length3 >= length) {
                        break;
                    }
                    int i7 = length3 + 1;
                    copyOf2[length3] = -i7;
                    length3 = i7;
                }
                copyOf2[length] = 0;
                int length4 = this.c.length;
                while (true) {
                    int i8 = length4;
                    i3 = i6;
                    i6 = i8;
                    if (i6 < copyOf.length) {
                        copyOf[i6] = -i3;
                        length4 = i6 + 1;
                    }
                }
                copyOf[0] = -i3;
                this.c = copyOf;
                this.d = copyOf2;
                i4 = copyOf2[i];
            } else {
                return i5;
            }
        }
    }

    private final String f(int i) {
        return this.e[i][0];
    }

    private final void g(int i, String str) {
        String[][] strArr = this.e;
        String[] strArr2 = strArr[i];
        strArr[i] = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        this.e[i][0] = str;
    }

    private static String[] h(String str, String[] strArr) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 1, length);
        strArr2[0] = str;
        return strArr2;
    }

    public final int a(int i, int i2) {
        while (true) {
            int i3 = this.b[i] + i2;
            if (this.d[i3] == i) {
                return this.c[i3];
            }
            if (i == 1) {
                return 1;
            }
            i = this.f[i];
        }
    }

    public final Iterable c(CharSequence charSequence) {
        return new mhm(this, charSequence);
    }

    public final boolean d(String[] strArr) {
        int[] iArr;
        int length;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int[] iArr2;
        int i5;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4;
        String[] strArr2 = strArr;
        int length2 = strArr2.length;
        int i8 = 0;
        boolean z2 = false;
        while (true) {
            int i9 = 256;
            int i10 = 1;
            if (i8 >= length2) {
                break;
            }
            String str = strArr2[i8];
            if (!this.h) {
                int length3 = str.length();
                int i11 = length3 + length3;
                iArr = new int[i11];
                for (int i12 = 0; i12 < (i11 >> 1); i12++) {
                    char charAt = str.charAt(i12);
                    if (this.i) {
                        charAt = Character.toLowerCase(charAt);
                    }
                    int i13 = i12 + i12;
                    iArr[i13] = charAt >>> 8;
                    iArr[i13 + 1] = charAt & 255;
                }
            } else {
                int length4 = str.length();
                iArr = new int[length4];
                for (int i14 = 0; i14 < length4; i14++) {
                    char charAt2 = str.charAt(i14);
                    if (this.i) {
                        charAt2 = Character.toLowerCase(charAt2);
                    }
                    iArr[i14] = charAt2 & 255;
                }
            }
            int i15 = 0;
            int i16 = 1;
            while (true) {
                length = iArr.length;
                if (i15 >= length) {
                    break;
                }
                int i17 = this.b[i16] + iArr[i15];
                if (this.d[i17] != i16) {
                    break;
                }
                i16 = this.c[i17];
                i15++;
            }
            if (i15 < length) {
                while (i15 < iArr.length) {
                    int i18 = this.j + i10;
                    this.j = i18;
                    int[] iArr5 = this.b;
                    int length5 = iArr5.length;
                    if (i18 >= length5) {
                        int i19 = (length5 * 3) / 2;
                        int[] copyOf = Arrays.copyOf(iArr5, i19);
                        String[][] strArr3 = (String[][]) Arrays.copyOf(this.e, i19);
                        while (length5 < i19) {
                            copyOf[length5] = i10;
                            strArr3[length5] = a;
                            length5++;
                        }
                        this.b = copyOf;
                        this.e = strArr3;
                        this.f = Arrays.copyOf(this.f, i19);
                    }
                    int i20 = iArr[i15];
                    int i21 = this.j;
                    int[] iArr6 = this.d;
                    int[] iArr7 = this.b;
                    if (iArr6[iArr7[i16] + i20] > 0) {
                        int i22 = 0;
                        while (true) {
                            i22 = e(i22, i20);
                            if (i22 - i20 > 0) {
                                break;
                            }
                        }
                        while (true) {
                            int i23 = 0;
                            while (i23 < i9) {
                                int[] iArr8 = this.d;
                                if (iArr8[this.b[i16] + i23] == i16 && iArr8[(i22 - i20) + i23] >= 0) {
                                    break;
                                }
                                i23++;
                            }
                            if (i23 == i9) {
                                break;
                            }
                            i22 = e(i22, i20);
                            i9 = 256;
                        }
                        int i24 = i22 - i20;
                        int[] iArr9 = new int[i9];
                        int i25 = this.b[i16];
                        int i26 = 0;
                        while (i26 < i9) {
                            int i27 = i25 + i26;
                            if (this.d[i27] == i16) {
                                iArr9[i26] = this.c[i27];
                            } else {
                                iArr9[i26] = -1;
                            }
                            i26++;
                            i9 = 256;
                        }
                        int i28 = -this.d[0];
                        int i29 = 0;
                        for (int i30 = 256; i29 < i30; i30 = 256) {
                            int i31 = i25 + i29;
                            int i32 = length2;
                            if (this.d[i31] == i16) {
                                while (true) {
                                    iArr4 = this.d;
                                    i7 = i25;
                                    int i33 = iArr4[i28];
                                    if (i33 == 0 || i28 >= i31) {
                                        break;
                                    }
                                    i28 = -i33;
                                    i25 = i7;
                                }
                                iArr4[i31] = -i28;
                                int[] iArr10 = this.c;
                                iArr3 = iArr;
                                int i34 = -i31;
                                i6 = i8;
                                iArr4[-iArr10[i28]] = i34;
                                iArr10[i31] = iArr10[i28];
                                iArr10[i28] = i34;
                            } else {
                                i6 = i8;
                                i7 = i25;
                                iArr3 = iArr;
                            }
                            i29++;
                            length2 = i32;
                            i25 = i7;
                            iArr = iArr3;
                            i8 = i6;
                        }
                        i3 = length2;
                        i4 = i8;
                        iArr2 = iArr;
                        int i35 = 0;
                        while (true) {
                            if (i35 >= 256) {
                                break;
                            }
                            if (iArr9[i35] >= 0) {
                                int[] iArr11 = this.c;
                                int i36 = i24 + i35;
                                int i37 = iArr11[i36];
                                int[] iArr12 = this.d;
                                int i38 = iArr12[i36];
                                iArr12[-i37] = i38;
                                iArr11[-i38] = i37;
                            }
                            i35++;
                        }
                        int i39 = 0;
                        for (i5 = 256; i39 < i5; i5 = 256) {
                            if (iArr9[i39] >= 0) {
                                int i40 = i24 + i39;
                                this.d[i40] = i16;
                                this.c[i40] = iArr9[i39];
                            }
                            i39++;
                        }
                        iArr7 = this.b;
                        iArr7[i16] = i24;
                    } else {
                        i3 = length2;
                        i4 = i8;
                        iArr2 = iArr;
                    }
                    int i41 = iArr7[i16] + i20;
                    int[] iArr13 = this.c;
                    int i42 = iArr13[i41];
                    int[] iArr14 = this.d;
                    int i43 = iArr14[i41];
                    iArr14[-i42] = i43;
                    iArr13[-i43] = i42;
                    iArr14[i41] = i16;
                    iArr13[i41] = i21;
                    i16 = this.j;
                    i15++;
                    length2 = i3;
                    iArr = iArr2;
                    i8 = i4;
                    i9 = 256;
                    i10 = 1;
                }
                i = length2;
                i2 = i8;
                g(i16, str);
            } else {
                i = length2;
                i2 = i8;
                if (this.e[i16][0] != null) {
                    z = false;
                    z2 |= z;
                    i8 = i2 + 1;
                    strArr2 = strArr;
                    length2 = i;
                } else {
                    g(i16, str);
                }
            }
            z = true;
            z2 |= z;
            i8 = i2 + 1;
            strArr2 = strArr;
            length2 = i;
        }
        if (z2) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(1);
            this.f[1] = 1;
            while (!arrayDeque.isEmpty()) {
                int intValue = ((Integer) arrayDeque.removeFirst()).intValue();
                for (int i44 = 0; i44 < 256; i44++) {
                    int i45 = this.b[intValue] + i44;
                    if (this.d[i45] == intValue) {
                        int i46 = this.c[i45];
                        arrayDeque.add(Integer.valueOf(i46));
                        int[] iArr15 = this.f;
                        iArr15[i46] = intValue == 1 ? 1 : a(iArr15[intValue], i44);
                        int i47 = this.f[i46];
                        String f = f(i46);
                        String f2 = f(i47);
                        if (f == null) {
                            String[][] strArr4 = this.e;
                            strArr4[i46] = f2 == null ? strArr4[i47] : h(null, strArr4[i47]);
                        } else if (f2 != null) {
                            String[][] strArr5 = this.e;
                            strArr5[i46] = h(f, strArr5[i47]);
                        } else {
                            String[][] strArr6 = this.e;
                            if (strArr6[i46].length > 1) {
                                String[] strArr7 = new String[1];
                                strArr7[0] = f;
                                strArr6[i46] = strArr7;
                            }
                        }
                    }
                }
            }
        }
        return z2;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mhn)) {
            return false;
        }
        mhn mhnVar = (mhn) obj;
        if (this.h != mhnVar.h || this.i != mhnVar.i) {
            return false;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(lfc.a(1, 1));
        while (!arrayDeque.isEmpty()) {
            lfc lfcVar = (lfc) arrayDeque.removeFirst();
            int intValue = ((Integer) lfcVar.a).intValue();
            int intValue2 = ((Integer) lfcVar.b).intValue();
            for (int i = 0; i < 256; i++) {
                int i2 = this.b[intValue] + i;
                int i3 = mhnVar.b[intValue2] + i;
                int i4 = this.d[i2];
                if (i4 != intValue || mhnVar.d[i3] != intValue2) {
                    if (i4 == intValue || mhnVar.d[i3] == intValue2) {
                        return false;
                    }
                } else {
                    String f = f(intValue);
                    String f2 = mhnVar.f(intValue2);
                    if (f != null) {
                        if (f2 != null) {
                            if (this.i) {
                                equals = jdg.Z(f, f2);
                            } else {
                                equals = f.equals(f2);
                            }
                            if (!equals) {
                            }
                            arrayDeque.add(lfc.a(Integer.valueOf(this.c[i2]), Integer.valueOf(mhnVar.c[i3])));
                        }
                        return false;
                    }
                    if (f2 != null) {
                        return false;
                    }
                    arrayDeque.add(lfc.a(Integer.valueOf(this.c[i2]), Integer.valueOf(mhnVar.c[i3])));
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 1; i2 <= this.j; i2++) {
            String f = f(i2);
            if (f != null) {
                i += f.hashCode();
            }
        }
        return i;
    }

    public final String toString() {
        int i = this.g;
        boolean z = false;
        boolean z2 = (i & 2) != 0;
        int i2 = this.j;
        int length = this.b.length;
        int length2 = this.d.length;
        StringBuilder sb = new StringBuilder("<MultiKeyPattern:case-insensitive=");
        sb.append(z2);
        sb.append(",lowbytes-only=");
        if (1 == (i & 1)) {
            z = true;
        }
        sb.append(z);
        sb.append(",newstate=");
        sb.append(i2);
        sb.append(",output/failure/base=");
        sb.append(length);
        sb.append(",next/check=");
        sb.append(length2);
        sb.append(">");
        return sb.toString();
    }

    public mhn(int i) {
        int[] iArr;
        int length;
        this.b = new int[16];
        this.c = new int[512];
        this.d = new int[512];
        String[][] strArr = new String[16];
        this.e = strArr;
        this.f = new int[16];
        int i2 = 1;
        this.j = 1;
        this.g = i;
        this.h = 1 == (i & 1);
        this.i = (i & 2) != 0;
        Arrays.fill(strArr, a);
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.b;
            if (i3 >= iArr2.length) {
                break;
            }
            iArr2[i3] = 1;
            i3++;
        }
        int i4 = 0;
        while (true) {
            iArr = this.d;
            length = iArr.length - 1;
            if (i4 >= length) {
                break;
            }
            int i5 = i4 + 1;
            iArr[i4] = -i5;
            i4 = i5;
        }
        iArr[length] = 0;
        this.c[0] = -length;
        while (true) {
            int[] iArr3 = this.c;
            if (i2 < iArr3.length) {
                iArr3[i2] = -(i2 - 1);
                i2++;
            } else {
                return;
            }
        }
    }
}
