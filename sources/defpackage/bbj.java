package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: bbj  reason: default package */
/* loaded from: classes.dex */
public final class bbj extends bap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bap
    protected final Bitmap c(axp axpVar, Bitmap bitmap, int i, int i2) {
        return bbt.e(axpVar, bitmap, i, i2);
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        return obj instanceof bbj;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return 1572326941;
    }
}
