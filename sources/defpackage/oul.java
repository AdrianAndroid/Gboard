package defpackage;

import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: oul  reason: default package */
/* loaded from: classes2.dex */
public final class oul implements URLStreamHandlerFactory, Cloneable {
    static final Set a = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));
    static final TimeZone b = DesugarTimeZone.getTimeZone("GMT");
    static final ThreadLocal c = new oub();
    static final Comparator d = jpf.i;
    public static final /* synthetic */ int e = 0;
    private final oqd f;

    public oul(oqd oqdVar) {
        this.f = oqdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException a(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(oql oqlVar) {
        String str = oqlVar.b == oqe.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
        int i = oqlVar.c;
        String str2 = oqlVar.d;
        return str + " " + i + " " + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map f(opx opxVar, String str) {
        TreeMap treeMap = new TreeMap(d);
        int a2 = opxVar.a();
        for (int i = 0; i < a2; i++) {
            String c2 = opxVar.c(i);
            String d2 = opxVar.d(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(c2);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(d2);
            treeMap.put(c2, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(oql oqlVar) {
        long parseLong;
        if (!oqlVar.a.b.equals("HEAD")) {
            int i = oqlVar.c;
            if ((i < 100 || i >= 200) && i != 204 && i != 304) {
                return true;
            }
            String b2 = oqlVar.f.b("Content-Length");
            if (b2 != null) {
                try {
                    parseLong = Long.parseLong(b2);
                } catch (NumberFormatException unused) {
                }
                return parseLong == -1 || "chunked".equalsIgnoreCase(oqlVar.a("Transfer-Encoding"));
            }
            parseLong = -1;
            if (parseLong == -1) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i() {
        String property;
        try {
            property = System.getProperty("http.agent");
        } catch (AccessControlException unused) {
        }
        if (property != null) {
            return property;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new oul(this.f);
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if (str.equals("http") || str.equals("https")) {
            return new ouc(this, str);
        }
        return null;
    }

    public final HttpURLConnection d(URL url) {
        return e(url, this.f.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final HttpURLConnection e(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        oqc a2 = this.f.a();
        a2.b = proxy;
        oqd a3 = a2.a();
        if (protocol.equals("http")) {
            return new oug(url, a3);
        }
        if (protocol.equals("https")) {
            return new oue(url, a3);
        }
        throw new IllegalArgumentException("Unexpected protocol: ".concat(String.valueOf(protocol)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(oql oqlVar) {
        oql oqlVar2 = oqlVar.h;
        if (oqlVar2 == null) {
            if (oqlVar.i == null) {
                return "NONE";
            }
            int i = oqlVar.c;
            return "CACHE " + i;
        } else if (oqlVar.i != null) {
            int i2 = oqlVar2.c;
            return "CONDITIONAL_CACHE " + i2;
        } else {
            int i3 = oqlVar.c;
            return "NETWORK " + i3;
        }
    }
}
