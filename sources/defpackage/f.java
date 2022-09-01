package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: f  reason: default package */
/* loaded from: classes.dex */
public final class f {
    public final gkn h;
    private final g i;
    public int a = 0;
    private int j = 8;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    public int f = -1;
    public boolean g = false;

    public f(g gVar, gkn gknVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.i = gVar;
        this.h = gknVar;
    }

    public final float a(j jVar) {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.b[i] != jVar.a) {
                i = this.c[i];
            } else {
                return this.d[i];
            }
        }
        return 0.0f;
    }

    public final float c(j jVar) {
        int i = this.e;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                int i4 = this.b[i];
                if (i4 != jVar.a) {
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
                    ((j[]) this.h.c)[i4].a(this.i);
                    this.a--;
                    this.b[i] = -1;
                    if (this.g) {
                        this.f = i;
                    }
                    return this.d[i];
                }
            }
        }
        return 0.0f;
    }

    public final void f(j jVar, float f) {
        if (f == 0.0f) {
            c(jVar);
            return;
        }
        int i = this.e;
        if (i != -1) {
            int i2 = -1;
            for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                int i4 = this.b[i];
                int i5 = jVar.a;
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
            int i6 = this.f;
            int i7 = i6 + 1;
            if (this.g) {
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
                int i9 = this.j;
                int i10 = i9 + i9;
                this.j = i10;
                this.g = false;
                this.f = length2 - 1;
                this.d = Arrays.copyOf(this.d, i10);
                this.b = Arrays.copyOf(this.b, this.j);
                this.c = Arrays.copyOf(this.c, this.j);
                i6 = length2;
            }
            int[] iArr3 = this.b;
            iArr3[i6] = jVar.a;
            this.d[i6] = f;
            if (i2 != -1) {
                int[] iArr4 = this.c;
                iArr4[i6] = iArr4[i2];
                iArr4[i2] = i6;
            } else {
                this.c[i6] = this.e;
                this.e = i6;
            }
            int i11 = this.a + 1;
            this.a = i11;
            if (!this.g) {
                this.f++;
            }
            if (i11 < iArr3.length) {
                return;
            }
            this.g = true;
            return;
        }
        this.e = 0;
        this.d[0] = f;
        this.b[0] = jVar.a;
        this.c[0] = -1;
        this.a++;
        if (this.g) {
            return;
        }
        this.f++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(g gVar, g gVar2) {
        int i = this.e;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                int i3 = this.b[i];
                j jVar = gVar2.a;
                if (i3 == jVar.a) {
                    float f = this.d[i];
                    c(jVar);
                    f fVar = gVar2.d;
                    int i4 = fVar.e;
                    for (int i5 = 0; i4 != -1 && i5 < fVar.a; i5++) {
                        e(((j[]) this.h.c)[fVar.b[i4]], fVar.d[i4] * f);
                        i4 = fVar.c[i4];
                    }
                    gVar.b += gVar2.b * f;
                    gVar2.a.a(gVar);
                    i = this.e;
                } else {
                    i = this.c[i];
                }
            }
            return;
        }
    }

    public final String toString() {
        int i = this.e;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String str2 = str.concat(" -> ") + this.d[i] + " : ";
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            j jVar = ((j[]) this.h.c)[this.b[i]];
            sb.append(jVar);
            str = str2.concat(String.valueOf(jVar));
            i = this.c[i];
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j d(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((j[]) this.h.c)[this.b[i2]];
            }
            i2 = this.c[i2];
        }
        return null;
    }

    public final void e(j jVar, float f) {
        if (f == 0.0f) {
            return;
        }
        int i = this.e;
        if (i != -1) {
            int i2 = -1;
            for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                int i4 = this.b[i];
                int i5 = jVar.a;
                if (i4 != i5) {
                    if (i4 < i5) {
                        i2 = i;
                    }
                    i = this.c[i];
                } else {
                    float[] fArr = this.d;
                    float f2 = fArr[i] + f;
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
                    ((j[]) this.h.c)[i4].a(this.i);
                    if (this.g) {
                        this.f = i;
                    }
                    this.a--;
                    return;
                }
            }
            int i6 = this.f;
            int i7 = i6 + 1;
            if (this.g) {
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
                int i9 = this.j;
                int i10 = i9 + i9;
                this.j = i10;
                this.g = false;
                this.f = length2 - 1;
                this.d = Arrays.copyOf(this.d, i10);
                this.b = Arrays.copyOf(this.b, this.j);
                this.c = Arrays.copyOf(this.c, this.j);
                i6 = length2;
            }
            int[] iArr4 = this.b;
            iArr4[i6] = jVar.a;
            this.d[i6] = f;
            if (i2 != -1) {
                int[] iArr5 = this.c;
                iArr5[i6] = iArr5[i2];
                iArr5[i2] = i6;
            } else {
                this.c[i6] = this.e;
                this.e = i6;
            }
            this.a++;
            if (!this.g) {
                this.f++;
            }
            int i11 = this.f;
            int length3 = iArr4.length;
            if (i11 < length3) {
                return;
            }
            this.g = true;
            this.f = length3 - 1;
            return;
        }
        this.e = 0;
        this.d[0] = f;
        this.b[0] = jVar.a;
        this.c[0] = -1;
        this.a++;
        if (this.g) {
            return;
        }
        this.f++;
    }
}
