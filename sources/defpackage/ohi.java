package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: ohi  reason: default package */
/* loaded from: classes2.dex */
public final class ohi {
    public final out b;
    ohh[] e;
    int f;
    public final List a = new ArrayList();
    int g = 0;
    int h = 0;
    public int c = 4096;
    public int d = 4096;

    public ohi(ovp ovpVar) {
        ohh[] ohhVarArr = new ohh[8];
        this.e = ohhVarArr;
        this.f = ohhVarArr.length - 1;
        this.b = oix.e(ovpVar);
    }

    public static final boolean g(int i) {
        if (i >= 0) {
            int length = ohk.b.length;
            return i <= 60;
        }
        return false;
    }

    private final int h() {
        return this.b.d() & 255;
    }

    private final void i() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final void j(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].h;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            ohh[] ohhVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(ohhVarArr, i5, ohhVarArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    public final int a(int i) {
        return this.f + 1 + i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 >= i2) {
            int i4 = 0;
            while (true) {
                int h = h();
                if ((h & 128) == 0) {
                    return i2 + (h << i4);
                }
                i2 += (h & 127) << i4;
                i4 += 7;
            }
        } else {
            return i3;
        }
    }

    public final ouu c(int i) {
        if (g(i)) {
            return ohk.b[i].f;
        }
        int length = ohk.b.length;
        int a = a(i - 61);
        if (a >= 0) {
            ohh[] ohhVarArr = this.e;
            if (a < ohhVarArr.length) {
                return ohhVarArr[a].f;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ouu d() {
        int h = h();
        int b = b(h, 127);
        if ((h & 128) == 128) {
            ohp ohpVar = ohp.a;
            byte[] F = this.b.F(b);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            oth othVar = ohpVar.b;
            int i = 0;
            int i2 = 0;
            for (byte b2 : F) {
                i2 = (i2 << 8) | (b2 & 255);
                i += 8;
                while (i >= 8) {
                    int i3 = i - 8;
                    othVar = ((oth[]) othVar.c)[(i2 >>> i3) & 255];
                    if (othVar.c == null) {
                        byteArrayOutputStream.write(othVar.a);
                        i -= othVar.b;
                        othVar = ohpVar.b;
                    } else {
                        i = i3;
                    }
                }
            }
            while (i > 0) {
                oth othVar2 = ((oth[]) othVar.c)[(i2 << (8 - i)) & 255];
                if (othVar2.c != null || othVar2.b > i) {
                    break;
                }
                byteArrayOutputStream.write(othVar2.a);
                i -= othVar2.b;
                othVar = ohpVar.b;
            }
            return ouu.i(byteArrayOutputStream.toByteArray());
        }
        return this.b.s(b);
    }

    public final void e() {
        int i = this.d;
        int i2 = this.h;
        if (i < i2) {
            if (i == 0) {
                i();
            } else {
                j(i2 - i);
            }
        }
    }

    public final void f(ohh ohhVar) {
        this.a.add(ohhVar);
        int i = ohhVar.h;
        int i2 = this.d;
        if (i > i2) {
            i();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g;
        ohh[] ohhVarArr = this.e;
        int length = ohhVarArr.length;
        if (i3 + 1 > length) {
            ohh[] ohhVarArr2 = new ohh[length + length];
            System.arraycopy(ohhVarArr, 0, ohhVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = ohhVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = ohhVar;
        this.g++;
        this.h += i;
    }
}
