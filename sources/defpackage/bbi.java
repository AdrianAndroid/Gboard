package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bbi  reason: default package */
/* loaded from: classes.dex */
public final class bbi implements auq {
    @Override // defpackage.auq
    public final int a(InputStream inputStream, axn axnVar) {
        aet aetVar = new aet(inputStream);
        aer a = aetVar.a("Orientation");
        int i = 1;
        if (a != null) {
            try {
                i = a.a(aetVar.i);
            } catch (NumberFormatException unused) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.auq
    public final int b(ByteBuffer byteBuffer, axn axnVar) {
        return a(bfw.a(byteBuffer), axnVar);
    }

    @Override // defpackage.auq
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.auq
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
