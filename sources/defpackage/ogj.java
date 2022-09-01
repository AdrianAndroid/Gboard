package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: ogj  reason: default package */
/* loaded from: classes2.dex */
final class ogj extends ogk {
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static final Method i;
    private static final Constructor j;
    private static final mnl k = new mnl((Class) null, "setUseSessionTickets", Boolean.TYPE);
    private static final mnl l = new mnl((Class) null, "setHostname", String.class);
    private static final mnl m = new mnl(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final mnl n = new mnl((Class) null, "setAlpnProtocols", byte[].class);
    private static final mnl o = new mnl(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final mnl p = new mnl((Class) null, "setNpnProtocols", byte[].class);

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(3:2|3|(2:5|6))|(7:8|9|10|11|12|13|14)|15|16|17|(2:19|20)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0127, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0128, code lost:
        r9 = r0;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
        r9 = r0;
        r0 = null;
     */
    static {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogj.<clinit>():void");
    }

    public ogj(ohb ohbVar) {
        super(ohbVar);
    }

    @Override // defpackage.ogk
    public final String a(SSLSocket sSLSocket) {
        Method method = h;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (e3.getTargetException() instanceof UnsupportedOperationException) {
                    ogk.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
                } else {
                    throw new RuntimeException(e3);
                }
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) m.e(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, ohe.b);
                }
            } catch (Exception e4) {
                ogk.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.c.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) o.e(sSLSocket, new Object[0]);
                if (bArr2 == null) {
                    return null;
                }
                return new String(bArr2, ohe.b);
            } catch (Exception e5) {
                ogk.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.ogk
    public final String b(SSLSocket sSLSocket, String str, List list) {
        String a = a(sSLSocket);
        return a == null ? super.b(sSLSocket, str, list) : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011b  */
    @Override // defpackage.ogk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogj.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
    }
}
