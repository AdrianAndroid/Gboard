package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: vq  reason: default package */
/* loaded from: classes2.dex */
public final class vq {
    public static final vq a = new vq(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private vq(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static vq b(vq vqVar, vq vqVar2) {
        return d(Math.max(vqVar.b, vqVar2.b), Math.max(vqVar.c, vqVar2.c), Math.max(vqVar.d, vqVar2.d), Math.max(vqVar.e, vqVar2.e));
    }

    public static vq c(Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static vq d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else if (i4 == 0) {
                    return a;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new vq(i, i2, i3, i4);
    }

    public static vq e(Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets a() {
        return vp.a(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vq vqVar = (vq) obj;
        return this.e == vqVar.e && this.b == vqVar.b && this.d == vqVar.d && this.c == vqVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
