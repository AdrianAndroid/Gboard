package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: bap  reason: default package */
/* loaded from: classes.dex */
public abstract class bap implements ave {
    @Override // defpackage.ave
    public final axh b(Context context, axh axhVar, int i, int i2) {
        if (!bgj.p(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        axp axpVar = atb.b(context).a;
        Bitmap bitmap = (Bitmap) axhVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c = c(axpVar, bitmap, i, i2);
        return bitmap.equals(c) ? axhVar : bbn.g(c, axpVar);
    }

    protected abstract Bitmap c(axp axpVar, Bitmap bitmap, int i, int i2);
}
