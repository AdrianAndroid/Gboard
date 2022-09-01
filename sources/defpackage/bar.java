package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: bar  reason: default package */
/* loaded from: classes.dex */
public final class bar extends bap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bap
    protected final Bitmap c(axp axpVar, Bitmap bitmap, int i, int i2) {
        return bbt.c(axpVar, bitmap, i, i2);
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        return obj instanceof bar;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return -599754482;
    }
}
