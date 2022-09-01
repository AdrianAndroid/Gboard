package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: baq  reason: default package */
/* loaded from: classes.dex */
public final class baq implements avc {
    private final /* synthetic */ int a;
    private final Object b;

    public baq(int i) {
        this.a = i;
        this.b = new bao();
    }

    public baq(int i, byte[] bArr) {
        this.a = i;
        this.b = new bao();
    }

    public baq(axp axpVar, int i) {
        this.a = i;
        this.b = axpVar;
    }

    public baq(bbe bbeVar, int i) {
        this.a = i;
        this.b = bbeVar;
    }

    public baq(bek bekVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = bekVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [axn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.avc
    public final /* synthetic */ boolean b(Object obj, ava avaVar) {
        int i = this.a;
        if (i == 0) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            return true;
        } else if (i == 1) {
            ByteBuffer byteBuffer2 = (ByteBuffer) obj;
            return true;
        } else if (i == 2) {
            InputStream inputStream = (InputStream) obj;
            return true;
        } else if (i == 3) {
            return ((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && !"HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && avx.d();
        } else if (i == 4) {
            return bek.i(cf.i(((bek) this.b).a, (ByteBuffer) obj));
        } else if (i == 5) {
            bek bekVar = (bek) this.b;
            return bek.i(cf.j(bekVar.a, (InputStream) obj, bekVar.b));
        } else {
            aug augVar = (aug) obj;
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [axp, java.lang.Object] */
    @Override // defpackage.avc
    public final /* synthetic */ axh a(Object obj, int i, int i2, ava avaVar) {
        int i3 = this.a;
        if (i3 == 0) {
            return ((bao) this.b).a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, avaVar);
        } else if (i3 == 1) {
            bbe bbeVar = (bbe) this.b;
            return bbeVar.a(new bbl((ByteBuffer) obj, bbeVar.g, bbeVar.f, 1), i, i2, avaVar, bbe.e);
        } else if (i3 == 2) {
            return ((bao) this.b).a(ImageDecoder.createSource(bfw.c((InputStream) obj)), i, i2, avaVar);
        } else if (i3 == 3) {
            bbe bbeVar2 = (bbe) this.b;
            return bbeVar2.a(new bbl((ParcelFileDescriptor) obj, bbeVar2.g, bbeVar2.f, 2), i, i2, avaVar, bbe.e);
        } else if (i3 == 4) {
            return bek.h(ImageDecoder.createSource((ByteBuffer) obj), i, i2, avaVar);
        } else {
            if (i3 == 5) {
                return bek.h(ImageDecoder.createSource(bfw.c((InputStream) obj)), i, i2, avaVar);
            }
            return bbn.g(((aug) obj).a(), this.b);
        }
    }
}
