package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: aur  reason: default package */
/* loaded from: classes.dex */
public final class aur implements auv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aur(InputStream inputStream, int i) {
        this.b = i;
        this.a = inputStream;
    }

    public aur(ByteBuffer byteBuffer, int i) {
        this.b = i;
        this.a = byteBuffer;
    }

    @Override // defpackage.auv
    public final ImageHeaderParser$ImageType a(auq auqVar) {
        if (this.b == 0) {
            try {
                return auqVar.d((ByteBuffer) this.a);
            } finally {
                bfw.d((ByteBuffer) this.a);
            }
        }
        try {
            return auqVar.c((InputStream) this.a);
        } finally {
            ((InputStream) this.a).reset();
        }
    }
}
