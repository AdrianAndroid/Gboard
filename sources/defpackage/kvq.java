package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: kvq  reason: default package */
/* loaded from: classes.dex */
public final class kvq extends kwc {
    private int c = 1;
    private float d;
    private float e;
    private float f;

    public kvq(kvw kvwVar) {
        super(kvwVar);
    }

    private final int g() {
        kvw kvwVar = (kvw) this.a;
        int i = kvwVar.g;
        int i2 = kvwVar.h;
        return i + i2 + i2;
    }

    private final void h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    @Override // defpackage.kwc
    public final int a() {
        return g();
    }

    @Override // defpackage.kwc
    public final int b() {
        return g();
    }

    @Override // defpackage.kwc
    public final void c(Canvas canvas, Rect rect, float f) {
        int i;
        float width = rect.width() / g();
        float height = rect.height() / g();
        kvw kvwVar = (kvw) this.a;
        float f2 = (kvwVar.g / 2.0f) + kvwVar.h;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        kvw kvwVar2 = (kvw) this.a;
        this.c = kvwVar2.i == 0 ? 1 : -1;
        this.d = kvwVar2.a * f;
        this.e = kvwVar2.b * f;
        this.f = (kvwVar2.g - i) / 2.0f;
        if ((!this.b.g() || ((kvw) this.a).e != 2) && (!this.b.f() || ((kvw) this.a).f != 1)) {
            if ((!this.b.g() || ((kvw) this.a).e != 1) && (!this.b.f() || ((kvw) this.a).f != 2)) {
                return;
            }
            this.f -= ((1.0f - f) * ((kvw) this.a).a) / 2.0f;
            return;
        }
        this.f += ((1.0f - f) * ((kvw) this.a).a) / 2.0f;
    }

    @Override // defpackage.kwc
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.d);
        float f3 = this.c;
        float f4 = f * 360.0f * f3;
        float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.f;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.e <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, this.d, this.e, f4);
        h(canvas, paint, this.d, this.e, f4 + f5);
    }

    @Override // defpackage.kwc
    public final void e(Canvas canvas, Paint paint) {
        int e = kxc.e(((kvw) this.a).d, this.b.h);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(e);
        paint.setStrokeWidth(this.d);
        float f = this.f;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }
}
