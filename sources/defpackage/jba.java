package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: jba  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class jba {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        a = iArr;
        try {
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Bitmap.CompressFormat.JPEG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
