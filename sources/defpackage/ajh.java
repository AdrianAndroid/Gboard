package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: ajh  reason: default package */
/* loaded from: classes.dex */
public final class ajh {
    final Paint b;
    final Paint c;
    final Paint d;
    int[] i;
    float j;
    float k;
    float l;
    public float n;
    public int o;
    int q;
    final RectF a = new RectF();
    float e = 0.0f;
    float f = 0.0f;
    float g = 0.0f;
    float h = 5.0f;
    final float m = 1.0f;
    int p = 255;

    public ajh() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.i[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }

    public final void c(int[] iArr) {
        this.i = iArr;
        g();
    }

    public final void d(float f) {
        this.h = f;
        this.b.setStrokeWidth(f);
    }

    public final void e() {
        this.j = this.e;
        this.k = this.f;
        this.l = this.g;
    }

    public final void f() {
        int length = this.i.length;
    }

    public final void g() {
        this.q = this.i[0];
    }
}
