package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osf  reason: default package */
/* loaded from: classes2.dex */
public final class osf {
    public final out b;
    ose[] d;
    int e;
    public final List a = new ArrayList();
    int f = 0;
    int g = 0;
    public int c = 4096;

    public osf(ovp ovpVar) {
        ose[] oseVarArr = new ose[8];
        this.d = oseVarArr;
        this.e = oseVarArr.length - 1;
        this.b = oix.e(ovpVar);
    }

    public static final boolean h(int i) {
        if (i >= 0) {
            int length = osh.a.length;
            return i <= 60;
        }
        return false;
    }

    private final int i() {
        return this.b.d() & 255;
    }

    public final int a(int i) {
        return this.e + 1 + i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 >= i2) {
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        } else {
            return i3;
        }
    }

    public final ouu c(int i) {
        if (h(i)) {
            return osh.a[i].g;
        }
        int length = osh.a.length;
        int a = a(i - 61);
        if (a >= 0) {
            ose[] oseVarArr = this.d;
            if (a < oseVarArr.length) {
                return oseVarArr[a].g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ouu d() {
        int i = i();
        int b = b(i, 127);
        if ((i & 128) == 128) {
            oti otiVar = oti.c;
            byte[] F = this.b.F(b);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            oth othVar = otiVar.d;
            int i2 = 0;
            int i3 = 0;
            for (byte b2 : F) {
                i3 = (i3 << 8) | (b2 & 255);
                i2 += 8;
                while (i2 >= 8) {
                    int i4 = i2 - 8;
                    othVar = ((oth[]) othVar.c)[(i3 >>> i4) & 255];
                    if (othVar.c == null) {
                        byteArrayOutputStream.write(othVar.a);
                        i2 -= othVar.b;
                        othVar = otiVar.d;
                    } else {
                        i2 = i4;
                    }
                }
            }
            while (i2 > 0) {
                oth othVar2 = ((oth[]) othVar.c)[(i3 << (8 - i2)) & 255];
                if (othVar2.c != null || othVar2.b > i2) {
                    break;
                }
                byteArrayOutputStream.write(othVar2.a);
                i2 -= othVar2.b;
                othVar = otiVar.d;
            }
            return ouu.i(byteArrayOutputStream.toByteArray());
        }
        return this.b.s(b);
    }

    public final void e() {
        Arrays.fill(this.d, (Object) null);
        this.e = this.d.length - 1;
        this.f = 0;
        this.g = 0;
    }

    public final void f(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.d[length].i;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
                length--;
            }
            ose[] oseVarArr = this.d;
            int i5 = i2 + 1;
            System.arraycopy(oseVarArr, i5, oseVarArr, i5 + i3, this.f);
            this.e += i3;
        }
    }

    public final void g(ose oseVar) {
        this.a.add(oseVar);
        int i = oseVar.i;
        int i2 = this.c;
        if (i > i2) {
            e();
            return;
        }
        f((this.g + i) - i2);
        int i3 = this.f;
        ose[] oseVarArr = this.d;
        int length = oseVarArr.length;
        if (i3 + 1 > length) {
            ose[] oseVarArr2 = new ose[length + length];
            System.arraycopy(oseVarArr, 0, oseVarArr2, length, length);
            this.e = this.d.length - 1;
            this.d = oseVarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = oseVar;
        this.f++;
        this.g += i;
    }
}
