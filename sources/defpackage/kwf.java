package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: kwf  reason: default package */
/* loaded from: classes.dex */
public final class kwf extends kwc {
    private float c = 300.0f;
    private float d;
    private float e;

    public kwf(kwn kwnVar) {
        super(kwnVar);
    }

    @Override // defpackage.kwc
    public final int a() {
        return ((kwn) this.a).a;
    }

    @Override // defpackage.kwc
    public final int b() {
        return -1;
    }

    @Override // defpackage.kwc
    public final void c(Canvas canvas, Rect rect, float f) {
        this.c = rect.width();
        float f2 = ((kwn) this.a).a;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((kwn) this.a).a) / 2.0f));
        if (((kwn) this.a).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.b.g() && ((kwn) this.a).e == 1) || (this.b.f() && ((kwn) this.a).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.b.g() || this.b.f()) {
            canvas.translate(0.0f, (((kwn) this.a).a * ((-1.0f) + f)) / 2.0f);
        }
        float f3 = this.c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        kwn kwnVar = (kwn) this.a;
        this.d = kwnVar.a * f;
        this.e = kwnVar.b * f;
    }

    @Override // defpackage.kwc
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.c;
        float f4 = (-f3) / 2.0f;
        float f5 = this.e;
        float f6 = f5 + f5;
        float f7 = f3 - f6;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f8 = this.d;
        RectF rectF = new RectF((f * f7) + f4, (-f8) / 2.0f, f4 + (f2 * f7) + f6, f8 / 2.0f);
        float f9 = this.e;
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    @Override // defpackage.kwc
    public final void e(Canvas canvas, Paint paint) {
        int e = kxc.e(((kwn) this.a).d, this.b.h);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(e);
        float f = this.c;
        float f2 = this.d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }
}
