package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: bas  reason: default package */
/* loaded from: classes.dex */
public final class bas extends bap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bap
    protected final Bitmap c(axp axpVar, Bitmap bitmap, int i, int i2) {
        return bbt.d(axpVar, bitmap, i, i2);
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        return obj instanceof bas;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return -670243078;
    }
}
