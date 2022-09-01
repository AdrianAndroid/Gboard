package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: bbl  reason: default package */
/* loaded from: classes.dex */
public final class bbl implements bbm {
    private final List a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public bbl(InputStream inputStream, List list, axn axnVar, int i) {
        this.b = i;
        ce.m(axnVar);
        this.d = axnVar;
        ce.m(list);
        this.a = list;
        this.c = new avu(inputStream, axnVar);
    }

    public bbl(ByteBuffer byteBuffer, List list, axn axnVar, int i) {
        this.b = i;
        this.d = byteBuffer;
        this.a = list;
        this.c = axnVar;
    }

    @Override // defpackage.bbm
    public final void d() {
        if (this.b != 0) {
            return;
        }
        ((avu) this.c).a.a();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [axn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [axn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [axn, java.lang.Object] */
    @Override // defpackage.bbm
    public final int a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                List list = this.a;
                ByteBuffer d = bfw.d((ByteBuffer) this.d);
                ?? r3 = this.c;
                if (d != null) {
                    return cf.h(list, new aut(d, (axn) r3, 1));
                }
                return -1;
            }
            return cf.h(this.a, new aut((avx) this.c, (axn) this.d, 2));
        }
        return cf.g(this.a, ((avu) this.c).a(), this.d);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [axn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [axn, java.lang.Object] */
    @Override // defpackage.bbm
    public final ImageHeaderParser$ImageType c() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return cf.i(this.a, bfw.d((ByteBuffer) this.d));
            }
            return cf.k(this.a, new aus((avx) this.c, this.d));
        }
        return cf.j(this.a, ((avu) this.c).a(), this.d);
    }

    public bbl(ParcelFileDescriptor parcelFileDescriptor, List list, axn axnVar, int i) {
        this.b = i;
        ce.m(axnVar);
        this.d = axnVar;
        ce.m(list);
        this.a = list;
        this.c = new avx(parcelFileDescriptor);
    }

    @Override // defpackage.bbm
    public final Bitmap b(BitmapFactory.Options options) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return BitmapFactory.decodeStream(bfw.a(bfw.d((ByteBuffer) this.d)), null, options);
            }
            return BitmapFactory.decodeFileDescriptor(((avx) this.c).a().getFileDescriptor(), null, options);
        }
        return BitmapFactory.decodeStream(((avu) this.c).a(), null, options);
    }
}
