package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: deo  reason: default package */
/* loaded from: classes.dex */
public final class deo {
    public Rect a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    private final float g;
    private final float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;

    public deo(float f, float f2) {
        this.g = f;
        this.h = f2;
    }

    public final Rect a() {
        float f = this.i;
        float f2 = this.j;
        float f3 = this.d;
        if (f3 > 0.0f) {
            float f4 = 1.0f - f3;
            f = (f * f4) + (this.k * f3);
            f2 = (f4 * f2) + (f3 * this.l);
        }
        float f5 = this.e;
        if (f5 > 0.0f) {
            f = ((1.0f - f5) * f) + (f5 * this.a.left);
            float f6 = this.e;
            f2 = ((1.0f - f6) * f2) + (f6 * this.a.top);
        }
        int i = (int) f;
        int i2 = (int) f2;
        Rect rect = new Rect(i, i2, this.a.width() + i, this.a.height() + i2);
        float f7 = this.f;
        if (f7 != 1.0f) {
            int width = (int) ((f7 * this.a.width()) / 2.0f);
            int height = (int) ((this.f * this.a.height()) / 2.0f);
            return new Rect(rect.centerX() - width, rect.centerY() - height, rect.centerX() + width, rect.centerY() + height);
        }
        return rect;
    }

    public final void b(Rect rect, Rect rect2, float f, float f2) {
        float f3;
        this.a = rect;
        this.b = f;
        this.c = f2;
        this.k = rect2.exactCenterX() - (rect.width() / 2.0f);
        this.l = rect2.exactCenterY() - (rect.height() / 2.0f);
        this.d = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.m = this.k - rect.left;
        this.n = this.l - rect.top;
        float f4 = this.m;
        float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
        this.m /= sqrt;
        this.n /= sqrt;
        c(this.b, this.c);
    }

    public final void c(float f, float f2) {
        this.i = (this.a.left + f) - this.b;
        this.j = ((this.a.top + f2) - this.c) - this.g;
    }

    public final boolean d() {
        if (this.a.top - this.j <= this.h) {
            if (this.a.top - this.j < 0.0f) {
                return false;
            }
            return ((this.i - ((float) this.a.left)) * this.m) + ((this.j - ((float) this.a.top)) * this.n) > this.h;
        }
        return true;
    }
}
