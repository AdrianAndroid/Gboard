package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: bjq  reason: default package */
/* loaded from: classes.dex */
public final class bjq extends Drawable {
    private final bjd a;
    private final Picture b;
    private final Rect c;
    private Bitmap d;
    private final Paint e;
    private final djc f;

    public bjq(bjd bjdVar, djc djcVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Picture i;
        float g;
        this.a = bjdVar;
        this.f = djcVar;
        bie bieVar = bjdVar.a;
        bho bhoVar = bieVar.c;
        if (bhoVar != null) {
            float f = bjdVar.b;
            float g2 = bhoVar.g();
            bhb bhbVar = bieVar.w;
            if (bhbVar != null) {
                g = (bhbVar.d * g2) / bhbVar.c;
            } else {
                bho bhoVar2 = bieVar.d;
                g = bhoVar2 != null ? bhoVar2.g() : g2;
            }
            i = bjdVar.i((int) Math.ceil(g2), (int) Math.ceil(g), djcVar);
        } else {
            i = bjdVar.i(512, 512, djcVar);
        }
        this.b = i;
        this.e = new Paint();
        this.c = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() <= 0 || bounds.height() <= 0) {
            return;
        }
        if (!bounds.equals(this.c)) {
            copyBounds(this.c);
            int width = bounds.width();
            int height = bounds.height();
            this.d = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            new Canvas(this.d).drawPicture(this.b, new Rect(0, 0, width, height));
        }
        canvas.drawBitmap(this.d, bounds.left, bounds.top, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.ceil(this.a.b());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) Math.ceil(this.a.c());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
