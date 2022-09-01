package defpackage;

import android.view.View;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: oze  reason: default package */
/* loaded from: classes2.dex */
public final class oze {
    public int a;
    public int b;
    public int c;
    public final Object d;

    public oze() {
    }

    public oze(View view) {
        this.d = view;
    }

    public oze(byte[] bArr) {
        this.a = 0;
        this.b = 0;
        this.d = new byte[65531];
        this.c = 65531;
    }

    public static final void a(short[] sArr) {
        Arrays.fill(sArr, (short) 1024);
    }

    public final int b(short[] sArr, int i) {
        e();
        short s = sArr[i];
        int i2 = this.a;
        int i3 = (i2 >>> 11) * s;
        int i4 = this.b;
        if ((i4 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i3)) {
            this.a = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.a = i2 - i3;
        this.b = i4 - i3;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    public final int c(short[] sArr) {
        int length;
        int i = 1;
        do {
            i = b(sArr, i) | (i + i);
            length = sArr.length;
        } while (i < length);
        return i - length;
    }

    public final int d(short[] sArr) {
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int b = b(sArr, i);
            i = (i + i) | b;
            int i4 = i2 + 1;
            i3 |= b << i2;
            if (i < sArr.length) {
                i2 = i4;
            } else {
                return i3;
            }
        }
    }

    public final void e() {
        int i = this.a;
        if (((-16777216) & i) == 0) {
            try {
                Object obj = this.d;
                int i2 = this.c;
                this.c = i2 + 1;
                this.b = (this.b << 8) | (((byte[]) obj)[i2] & 255);
                this.a = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new oxz();
            }
        }
    }

    public final void f() {
        View view = (View) this.d;
        aad.F(view, this.a - (view.getTop() - this.c));
        View view2 = (View) this.d;
        aad.E(view2, -(view2.getLeft() - this.b));
    }

    public final void g() {
        this.c = ((View) this.d).getTop();
        this.b = ((View) this.d).getLeft();
    }

    public final boolean h(int i) {
        if (this.a != i) {
            this.a = i;
            f();
            return true;
        }
        return false;
    }
}
