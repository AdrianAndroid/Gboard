package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oao  reason: default package */
/* loaded from: classes2.dex */
public final class oao {
    private static final Logger r = Logger.getLogger(oao.class.getName());
    public static final Charset a = Charset.forName("US-ASCII");
    public static final nuj b = nuj.c("grpc-timeout", new oan(0));
    public static final nuj c = nuj.c("grpc-encoding", num.b);
    public static final nuj d = nto.b("grpc-accept-encoding", new oaq(1));
    public static final nuj e = nuj.c("content-encoding", num.b);
    public static final nuj f = nto.b("accept-encoding", new oaq(1));
    public static final nuj g = nuj.c("content-length", num.b);
    public static final nuj h = nuj.c("content-type", num.b);
    public static final nuj i = nuj.c("te", num.b);
    public static final nuj j = nuj.c("user-agent", num.b);
    public static final lfy k = lfy.c(',').h();
    public static final long l = TimeUnit.SECONDS.toNanos(20);
    public static final nvi m = new odf();
    public static final nrz n = nrz.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
    private static final nxp s = new nxp();
    public static final ofd o = new oal();
    public static final ofd p = new ofx(1);
    public static final lgb q = new hvm(2);

    static {
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
    }

    private oao() {
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [ofn, java.lang.Object] */
    public static nyx b(ntw ntwVar, boolean z) {
        ntz ntzVar = ntwVar.b;
        nyx a2 = ntzVar != null ? ntzVar.b().a() : null;
        if (a2 == null) {
            if (!ntwVar.c.k()) {
                if (ntwVar.d) {
                    return new oae(ntwVar.c, nyv.DROPPED);
                }
                if (!z) {
                    return new oae(ntwVar.c, nyv.PROCESSED);
                }
            }
            return null;
        }
        return a2;
    }

    public static String c(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static URI d(String str) {
        jdg.Q(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException("Invalid authority: ".concat(String.valueOf(str)), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ofi ofiVar) {
        while (true) {
            InputStream g2 = ofiVar.g();
            if (g2 != null) {
                f(g2);
            } else {
                return;
            }
        }
    }

    public static void f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            r.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean g(String str) {
        char charAt;
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.startsWith("application/grpc")) {
                return false;
            }
            return lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';';
        }
        return false;
    }

    public static boolean h(nsa nsaVar) {
        return !Boolean.TRUE.equals(nsaVar.e(n));
    }

    public static ThreadFactory i(String str) {
        nzv nzvVar = new nzv((byte[]) null);
        nzvVar.b();
        nzvVar.c(str);
        return nzv.d(nzvVar);
    }

    public static String j(String str) {
        try {
            return new URI(null, null, str, 443, null, null, null).getAuthority();
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException("Invalid host or port: " + str + " 443", e2);
        }
    }

    public static String k(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append("grpc-java-okhttp/1.49.0-SNAPSHOT");
        return sb.toString();
    }

    public static boolean l(Iterable iterable) {
        for (Object obj : iterable) {
            if (jdg.W(obj, "identity")) {
                return true;
            }
        }
        return false;
    }

    public static nxp[] m(nsa nsaVar, int i2, boolean z) {
        List list = nsaVar.d;
        int size = list.size() + 1;
        nxp[] nxpVarArr = new nxp[size];
        jdg.Q(nsaVar, "callOptions cannot be null");
        nsg nsgVar = new nsg(nsaVar, i2, z);
        for (int i3 = 0; i3 < list.size(); i3++) {
            nxpVarArr[i3] = ((nxp) list.get(i3)).d(nsgVar);
        }
        nxpVarArr[size - 1] = s;
        return nxpVarArr;
    }

    public static nvu a(int i2) {
        nvr nvrVar;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    nvrVar = nvr.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    nvrVar = nvr.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    nvrVar = nvr.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    nvrVar = nvr.UNAVAILABLE;
                } else {
                    nvrVar = nvr.UNIMPLEMENTED;
                }
            }
            nvrVar = nvr.INTERNAL;
        } else {
            nvrVar = nvr.INTERNAL;
        }
        nvu b2 = nvrVar.b();
        return b2.f("HTTP status code " + i2);
    }
}
