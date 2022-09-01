package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: ern  reason: default package */
/* loaded from: classes.dex */
final class ern extends Drawable.ConstantState {
    public final Paint a;
    public final Paint b;
    public final Bitmap c;
    public final Bitmap d;
    public final Bitmap e;
    public final float[] f;

    public ern(Paint paint, Paint paint2, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, float[] fArr) {
        this.a = paint;
        this.b = paint2;
        this.c = bitmap;
        this.d = bitmap2;
        this.e = bitmap3;
        this.f = fArr;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new ero(this);
    }
}
