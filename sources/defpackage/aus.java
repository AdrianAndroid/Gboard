package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;

/* compiled from: PG */
/* renamed from: aus  reason: default package */
/* loaded from: classes.dex */
public final class aus implements auv {
    final /* synthetic */ avx a;
    final /* synthetic */ axn b;

    public aus(avx avxVar, axn axnVar) {
        this.a = avxVar;
        this.b = axnVar;
    }

    @Override // defpackage.auv
    public final ImageHeaderParser$ImageType a(auq auqVar) {
        bbp bbpVar;
        try {
            bbpVar = new bbp(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                ImageHeaderParser$ImageType c = auqVar.c(bbpVar);
                bbpVar.b();
                this.a.a();
                return c;
            } catch (Throwable th) {
                th = th;
                if (bbpVar != null) {
                    bbpVar.b();
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bbpVar = null;
        }
    }
}
