package defpackage;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* renamed from: ogb  reason: default package */
/* loaded from: classes2.dex */
public final class ogb extends nxr {
    static final ogu a;
    static final oda b;
    private static final ofd i;
    public final ocj c;
    private SSLSocketFactory j;
    public final lbi h = ofo.i;
    public final oda d = b;
    public final oda e = off.c(oao.p);
    public final ogu f = a;
    public final long g = oao.l;

    static {
        Logger.getLogger(ogb.class.getName());
        opl oplVar = new opl(ogu.a);
        oplVar.h(ogt.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, ogt.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, ogt.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, ogt.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, ogt.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, ogt.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        oplVar.k(ohd.TLS_1_2);
        oplVar.j();
        a = oplVar.g();
        TimeUnit.DAYS.toNanos(1000L);
        ofx ofxVar = new ofx(0);
        i = ofxVar;
        b = off.c(ofxVar);
        EnumSet.of(nwb.MTLS, nwb.CUSTOM_MANAGERS);
    }

    public ogb(String str) {
        this.c = new ocj(str, new ofz(this, 0), new ofy(0));
    }

    @Override // defpackage.nxr
    public final nug a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SSLSocketFactory b() {
        try {
            if (this.j == null) {
                this.j = SSLContext.getInstance("Default", ohb.b.c).getSocketFactory();
            }
            return this.j;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("TLS Provider failure", e);
        }
    }
}
