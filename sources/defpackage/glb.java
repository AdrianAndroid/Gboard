package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* renamed from: glb  reason: default package */
/* loaded from: classes.dex */
final class glb implements gnl {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ UploadDataSink b;
    final /* synthetic */ glc c;

    public glb(glc glcVar, ByteBuffer byteBuffer, UploadDataSink uploadDataSink) {
        this.c = glcVar;
        this.a = byteBuffer;
        this.b = uploadDataSink;
    }

    @Override // defpackage.gnl
    public final void a(Throwable th) {
        this.b.onReadError(new blb(th, 656394));
    }

    @Override // defpackage.gnl
    public final /* synthetic */ void b(Object obj) {
        int j;
        blj bljVar = (blj) obj;
        int i = bljVar.c;
        boolean z = false;
        boolean z2 = true;
        if (i != 1) {
            if (i == 2) {
                UploadDataSink uploadDataSink = this.b;
                if (i == 2) {
                    z = true;
                }
                jdg.F(z);
                uploadDataSink.onReadError(bljVar.e);
                return;
            } else if (i == 3) {
                this.c.c.b();
                this.b.onReadSucceeded(true);
                return;
            } else {
                throw new AssertionError("Unexpected chunk type " + i);
            }
        }
        ByteBuffer byteBuffer = this.a;
        jdg.F(i == 1);
        synchronized (bljVar.b) {
            j = bvq.j(bljVar.d, byteBuffer);
        }
        if (bljVar.a() > 0) {
            lty ltyVar = luh.a;
            glr glrVar = this.c.b;
            if (bljVar.c != 1) {
                z2 = false;
            }
            jdg.v(z2);
            if (bljVar.a() != 0) {
                synchronized (glrVar.a) {
                    if (glrVar.c) {
                        bljVar.b();
                    } else {
                        glrVar.b.addFirst(kcu.K(bljVar));
                    }
                }
            }
        } else {
            bljVar.b();
        }
        this.c.c.b();
        ((blh) this.c.d).e += j;
        this.b.onReadSucceeded(false);
    }
}
