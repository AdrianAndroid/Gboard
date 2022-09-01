package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* renamed from: ort  reason: default package */
/* loaded from: classes2.dex */
public final class ort implements oqa {
    public volatile orj a;
    public Object b;
    public volatile boolean c;
    private final oqd d;

    public ort(oqd oqdVar) {
        this.d = oqdVar;
    }

    private final oou b(opz opzVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        opi opiVar;
        if (opzVar.q()) {
            oqd oqdVar = this.d;
            SSLSocketFactory sSLSocketFactory2 = oqdVar.m;
            HostnameVerifier hostnameVerifier2 = oqdVar.o;
            opiVar = oqdVar.p;
            sSLSocketFactory = sSLSocketFactory2;
            hostnameVerifier = hostnameVerifier2;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            opiVar = null;
        }
        String str = opzVar.b;
        int i = opzVar.c;
        oqd oqdVar2 = this.d;
        return new oou(str, i, oqdVar2.t, oqdVar2.l, sSLSocketFactory, hostnameVerifier, opiVar, oqdVar2.q, oqdVar2.d, oqdVar2.e, oqdVar2.f, oqdVar2.i);
    }

    private final boolean c(IOException iOException, orj orjVar, boolean z, oqi oqiVar) {
        orjVar.f(iOException);
        if (!this.d.v) {
            return false;
        }
        if ((z && (oqiVar.d instanceof orv)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        if (orjVar.b != null) {
            return true;
        }
        otj otjVar = orjVar.m;
        return (otjVar != null && otjVar.f()) || orjVar.f.a();
    }

    private static final int d(oql oqlVar, int i) {
        String a = oqlVar.a("Retry-After");
        if (a == null) {
            return i;
        }
        if (!a.matches("\\d+")) {
            return Integer.MAX_VALUE;
        }
        return Integer.valueOf(a).intValue();
    }

    private static final boolean e(oql oqlVar, opz opzVar) {
        opz opzVar2 = oqlVar.a.a;
        return opzVar2.b.equals(opzVar.b) && opzVar2.c == opzVar.c && opzVar2.a.equals(opzVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef A[Catch: IOException -> 0x01dc, TryCatch #4 {IOException -> 0x01dc, blocks: (B:17:0x004b, B:29:0x006b, B:31:0x00d5, B:34:0x00dc, B:37:0x00e5, B:39:0x00ef, B:42:0x00f8, B:44:0x010f, B:46:0x011d, B:48:0x0130, B:50:0x0125, B:51:0x012b, B:53:0x013f, B:55:0x0145, B:56:0x014a, B:92:0x006f, B:95:0x0076, B:98:0x007d, B:100:0x0081, B:103:0x0086, B:106:0x008d, B:108:0x0092, B:109:0x0099, B:113:0x00a2, B:114:0x00a9, B:116:0x0095, B:117:0x00aa, B:119:0x00ae, B:122:0x00b3, B:124:0x00bc, B:126:0x00c4, B:128:0x00cc), top: B:16:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8 A[Catch: IOException -> 0x01dc, TryCatch #4 {IOException -> 0x01dc, blocks: (B:17:0x004b, B:29:0x006b, B:31:0x00d5, B:34:0x00dc, B:37:0x00e5, B:39:0x00ef, B:42:0x00f8, B:44:0x010f, B:46:0x011d, B:48:0x0130, B:50:0x0125, B:51:0x012b, B:53:0x013f, B:55:0x0145, B:56:0x014a, B:92:0x006f, B:95:0x0076, B:98:0x007d, B:100:0x0081, B:103:0x0086, B:106:0x008d, B:108:0x0092, B:109:0x0099, B:113:0x00a2, B:114:0x00a9, B:116:0x0095, B:117:0x00aa, B:119:0x00ae, B:122:0x00b3, B:124:0x00bc, B:126:0x00c4, B:128:0x00cc), top: B:16:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    @Override // defpackage.oqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.oql a(defpackage.orr r15) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ort.a(orr):oql");
    }
}
