package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: rp  reason: default package */
/* loaded from: classes2.dex */
public final class rp {
    protected final gkn f;
    private final rq g;
    int a = 0;
    private int h = 8;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    private int i = -1;
    private boolean j = false;

    public rp(rq rqVar, gkn gknVar, byte[] bArr, byte[] bArr2) {
        this.g = rqVar;
        this.f = gknVar;
    }

    public final float a(ru ruVar) {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.b[i] != ruVar.c) {
                i = this.c[i];
            } else {
                return this.d[i];
            }
        }
        return 0.0f;
    }

    public final float c(ru ruVar, boolean z) {
        int i = this.e;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                if (this.b[i] != ruVar.c) {
                    i2++;
                    i3 = i;
                    i = this.c[i];
                } else {
                    if (i == this.e) {
                        this.e = this.c[i];
                    } else {
                        int[] iArr = this.c;
                        iArr[i3] = iArr[i];
                    }
                    if (z) {
                        ruVar.b(this.g);
                    }
                    ruVar.l--;
                    this.a--;
                    this.b[i] = -1;
                    if (this.j) {
                        this.i = i;
                    }
                    return this.d[i];
                }
            }
        }
        return 0.0f;
    }

    public final void f() {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            ru ruVar = ((ru[]) this.f.c)[this.b[i]];
            if (ruVar != null) {
                ruVar.b(this.g);
            }
            i = this.c[i];
        }
        this.e = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final void g(ru ruVar, float f) {
        if (f == 0.0f) {
            c(ruVar, true);
            return;
        }
        int i = this.e;
        if (i != -1) {
            int i2 = -1;
            for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                int i4 = this.b[i];
                int i5 = ruVar.c;
                if (i4 != i5) {
                    if (i4 < i5) {
                        i2 = i;
                    }
                    i = this.c[i];
                } else {
                    this.d[i] = f;
                    return;
                }
            }
            int i6 = this.i;
            int i7 = i6 + 1;
            if (this.j) {
                int[] iArr = this.b;
                if (iArr[i6] != -1) {
                    i6 = iArr.length;
                }
            } else {
                i6 = i7;
            }
            int length = this.b.length;
            if (i6 >= length && this.a < length) {
                int i8 = 0;
                while (true) {
                    int[] iArr2 = this.b;
                    if (i8 >= iArr2.length) {
                        break;
                    } else if (iArr2[i8] == -1) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int length2 = this.b.length;
            if (i6 >= length2) {
                int i9 = this.h;
                int i10 = i9 + i9;
                this.h = i10;
                this.j = false;
                this.i = length2 - 1;
                this.d = Arrays.copyOf(this.d, i10);
                this.b = Arrays.copyOf(this.b, this.h);
                this.c = Arrays.copyOf(this.c, this.h);
                i6 = length2;
            }
            this.b[i6] = ruVar.c;
            this.d[i6] = f;
            if (i2 != -1) {
                int[] iArr3 = this.c;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = i6;
            } else {
                this.c[i6] = this.e;
                this.e = i6;
            }
            ruVar.l++;
            ruVar.a(this.g);
            int i11 = this.a + 1;
            this.a = i11;
            if (!this.j) {
                this.i++;
            }
            int length3 = this.b.length;
            if (i11 >= length3) {
                this.j = true;
            }
            if (this.i < length3) {
                return;
            }
            this.j = true;
            this.i = length3 - 1;
            return;
        }
        this.e = 0;
        this.d[0] = f;
        this.b[0] = ruVar.c;
        this.c[0] = -1;
        ruVar.l++;
        ruVar.a(this.g);
        this.a++;
        if (this.j) {
            return;
        }
        int i12 = this.i + 1;
        this.i = i12;
        int length4 = this.b.length;
        if (i12 < length4) {
            return;
        }
        this.j = true;
        this.i = length4 - 1;
    }

    public final String toString() {
        int i = this.e;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float f = this.d[i];
            str = (str.concat(" -> ") + f + " : ").concat(String.valueOf(String.valueOf(((ru[]) this.f.c)[this.b[i]])));
            i = this.c[i];
        }
        return str;
    }

    public final float b(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.d[i2];
            }
            i2 = this.c[i2];
        }
        return 0.0f;
    }

    public final ru d(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((ru[]) this.f.c)[this.b[i2]];
            }
            i2 = this.c[i2];
        }
        return null;
    }

    public final void e(ru ruVar, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.e;
            if (i != -1) {
                int i2 = -1;
                for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                    int i4 = this.b[i];
                    int i5 = ruVar.c;
                    if (i4 != i5) {
                        if (i4 < i5) {
                            i2 = i;
                        }
                        i = this.c[i];
                    } else {
                        float[] fArr = this.d;
                        float f2 = fArr[i] + f;
                        if (f2 > -0.001f && f2 < 0.001f) {
                            f2 = 0.0f;
                        }
                        fArr[i] = f2;
                        if (f2 != 0.0f) {
                            return;
                        }
                        if (i == this.e) {
                            this.e = this.c[i];
                        } else {
                            int[] iArr = this.c;
                            iArr[i2] = iArr[i];
                        }
                        if (z) {
                            ruVar.b(this.g);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        ruVar.l--;
                        this.a--;
                        return;
                    }
                }
                int i6 = this.i;
                int i7 = i6 + 1;
                if (this.j) {
                    int[] iArr2 = this.b;
                    if (iArr2[i6] != -1) {
                        i6 = iArr2.length;
                    }
                } else {
                    i6 = i7;
                }
                int length = this.b.length;
                if (i6 >= length && this.a < length) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr3 = this.b;
                        if (i8 >= iArr3.length) {
                            break;
                        } else if (iArr3[i8] == -1) {
                            i6 = i8;
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                int length2 = this.b.length;
                if (i6 >= length2) {
                    int i9 = this.h;
                    int i10 = i9 + i9;
                    this.h = i10;
                    this.j = false;
                    this.i = length2 - 1;
                    this.d = Arrays.copyOf(this.d, i10);
                    this.b = Arrays.copyOf(this.b, this.h);
                    this.c = Arrays.copyOf(this.c, this.h);
                    i6 = length2;
                }
                this.b[i6] = ruVar.c;
                this.d[i6] = f;
                if (i2 != -1) {
                    int[] iArr4 = this.c;
                    iArr4[i6] = iArr4[i2];
                    iArr4[i2] = i6;
                } else {
                    this.c[i6] = this.e;
                    this.e = i6;
                }
                ruVar.l++;
                ruVar.a(this.g);
                this.a++;
                if (!this.j) {
                    this.i++;
                }
                int i11 = this.i;
                int length3 = this.b.length;
                if (i11 < length3) {
                    return;
                }
                this.j = true;
                this.i = length3 - 1;
                return;
            }
            this.e = 0;
            this.d[0] = f;
            this.b[0] = ruVar.c;
            this.c[0] = -1;
            ruVar.l++;
            ruVar.a(this.g);
            this.a++;
            if (this.j) {
                return;
            }
            int i12 = this.i + 1;
            this.i = i12;
            int length4 = this.b.length;
            if (i12 < length4) {
                return;
            }
            this.j = true;
            this.i = length4 - 1;
        }
    }
}
