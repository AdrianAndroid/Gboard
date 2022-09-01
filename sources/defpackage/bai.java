package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Size;

/* compiled from: PG */
/* renamed from: bai  reason: default package */
/* loaded from: classes.dex */
public final class bai implements ImageDecoder.OnHeaderDecodedListener {
    private final bbk a = bbk.a();
    private final int b;
    private final int c;
    private final aun d;
    private final bbb e;
    private final boolean f;
    private final avb g;

    public bai(int i, int i2, ava avaVar) {
        this.b = i;
        this.c = i2;
        this.d = (aun) avaVar.b(bbe.a);
        this.e = (bbb) avaVar.b(bbb.f);
        boolean z = false;
        if (avaVar.b(bbe.d) != null && ((Boolean) avaVar.b(bbe.d)).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.g = (avb) avaVar.b(bbe.b);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.a.c(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == aun.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new bah());
        Size size = imageInfo.getSize();
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float a = this.e.a(size.getWidth(), size.getHeight(), i, i2);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * a), Math.round(a * size.getHeight()));
        if (this.g != null) {
            if (Build.VERSION.SDK_INT < 28) {
                if (Build.VERSION.SDK_INT < 26) {
                    return;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                return;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get((this.g != avb.DISPLAY_P3 || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3));
        }
    }
}
