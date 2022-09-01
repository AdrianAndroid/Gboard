package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: kwe  reason: default package */
/* loaded from: classes.dex */
public final class kwe extends kwb {
    public final kwc a;
    public final kwd b;

    public kwe(Context context, kvp kvpVar, kwc kwcVar, kwd kwdVar) {
        super(context, kvpVar);
        this.a = kwcVar;
        kwcVar.b = this;
        this.b = kwdVar;
        kwdVar.j = this;
    }

    @Override // defpackage.kwb
    public final boolean b(boolean z, boolean z2, boolean z3) {
        boolean b = super.b(z, z2, z3);
        if (!isRunning()) {
            this.b.a();
        }
        kws.g(this.c.getContentResolver());
        if (z && z3) {
            this.b.d();
        }
        return b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.a.f(canvas, getBounds(), c());
        this.a.e(canvas, this.g);
        int i = 0;
        while (true) {
            kwd kwdVar = this.b;
            int[] iArr = kwdVar.l;
            if (i < iArr.length) {
                kwc kwcVar = this.a;
                Paint paint = this.g;
                float[] fArr = kwdVar.k;
                int i2 = i + i;
                kwcVar.d(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                i++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.kwb, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
