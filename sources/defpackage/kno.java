package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: kno  reason: default package */
/* loaded from: classes.dex */
public final class kno extends bap {
    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        messageDigest.update("horizontal_mirror".getBytes());
    }

    @Override // defpackage.bap
    protected final Bitmap c(axp axpVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }
}
