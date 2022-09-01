package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gld  reason: default package */
/* loaded from: classes.dex */
public final class gld extends bly {
    public final Object a = new Object();
    public final bmp b;
    public final bll c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final glz g;

    public gld(bll bllVar, glz glzVar) {
        lty ltyVar = luh.a;
        this.b = new bmp(bllVar);
        this.c = bllVar;
        this.g = glzVar;
    }

    @Override // defpackage.blw
    public final int a() {
        return -1;
    }

    @Override // defpackage.blw
    public final mko b() {
        lty ltyVar = luh.a;
        mko b = this.b.b();
        f();
        return b;
    }

    @Override // defpackage.blw
    public final void c() {
        lty ltyVar = luh.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.b.c();
            this.e = true;
            this.g.a(262182);
        }
    }

    public final void f() {
        boolean z;
        int size;
        ByteBuffer byteBuffer;
        lty ltyVar = luh.a;
        synchronized (this.a) {
            if (!this.e && !this.f && this.d) {
                bmp bmpVar = this.b;
                synchronized (bmpVar.a) {
                    if (!bmpVar.b.isEmpty() && bmpVar.h()) {
                        z = false;
                        jdg.F(z);
                        size = bmpVar.c.size() - bmpVar.b.size();
                        byteBuffer = bmpVar.d;
                        if (byteBuffer != null && byteBuffer.position() > 0) {
                            size++;
                        }
                    }
                    z = true;
                    jdg.F(z);
                    size = bmpVar.c.size() - bmpVar.b.size();
                    byteBuffer = bmpVar.d;
                    if (byteBuffer != null) {
                        size++;
                    }
                }
                if (size <= 0) {
                    glz glzVar = this.g;
                    ByteBuffer b = this.c.b();
                    int i = glzVar.b.get();
                    if (i == 2) {
                        gme gmeVar = glzVar.i;
                        gmeVar.c.e();
                        gmeVar.k = true;
                        glzVar.l = b;
                        UrlRequest urlRequest = glzVar.k;
                        jdg.u(urlRequest);
                        urlRequest.read(b);
                    } else {
                        ((ltd) ((ltd) glz.a.d()).k("com/google/android/libraries/gsa/io/impl/MonitoredCronetRequest", "requestRead", 151, "MonitoredCronetRequest.java")).u("Did not request read due to an unexpected state: %d", i);
                        glzVar.e.d(b);
                    }
                    this.d = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(blj bljVar) {
        lty ltyVar = luh.a;
        jdg.v(bljVar.c != 1);
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            jdg.F(!this.f);
            this.f = true;
            this.b.f(bljVar);
        }
    }
}
