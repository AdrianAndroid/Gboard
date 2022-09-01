package defpackage;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: nxo  reason: default package */
/* loaded from: classes2.dex */
public class nxo {
    public nxo() {
    }

    public nxo(byte[] bArr) {
        this();
    }

    public static PasswordAuthentication b(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            odf.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static obk c() {
        if (odk.a != null) {
            return new nxz();
        }
        return new odk();
    }

    public static int d(String[] strArr) {
        return strArr.length >> 1;
    }

    public static String e(int i, String[] strArr) {
        int i2 = i + i;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static String f(int i, String[] strArr) {
        int i2 = i + i + 1;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static ogn g(int i) {
        return new ogn(new our(), Math.min(1048576, Math.max(4096, i)));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List, java.lang.Object] */
    public static void h(String str, String str2, lbi lbiVar) {
        if (!str.isEmpty()) {
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                }
            }
            if (str2 != null) {
                int length2 = str2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt2 = str2.charAt(i3);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str2));
                    }
                }
                while (i < lbiVar.a.size()) {
                    if (str.equalsIgnoreCase((String) lbiVar.a.get(i))) {
                        lbiVar.a.remove(i);
                        lbiVar.a.remove(i);
                        i -= 2;
                    }
                    i += 2;
                }
                lbiVar.a.add(str);
                lbiVar.a.add(str2.trim());
                return;
            }
            throw new IllegalArgumentException("value == null");
        }
        throw new IllegalArgumentException("name is empty");
    }

    public static void i(nuq nuqVar, nvm nvmVar, String str, Map map) {
        jdg.Q(nvmVar, "handler must not be null");
        oqv oqvVar = new oqv(nuqVar, nvmVar);
        nuq nuqVar2 = (nuq) oqvVar.a;
        jdg.D("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService".equals(nuqVar2.c), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", "java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", nuqVar2.b);
        String str2 = nuqVar2.b;
        jdg.J(!map.containsKey(str2), "Method by same name already registered: %s", str2);
        map.put(str2, oqvVar);
    }

    public static nuv n(List list, nry nryVar, nus nusVar) {
        return new nuv(list, nryVar, nusVar);
    }

    public static nty o(List list, nry nryVar, Object obj) {
        return new nty(list, nryVar, obj);
    }

    public static ntt p(List list, nry nryVar, Object[][] objArr) {
        return new ntt(list, nryVar, objArr);
    }

    public static nvm q(krm krmVar) {
        return new oil(krmVar, 2, null, null);
    }

    public void j() {
    }

    public void k() {
    }

    public void l(Object obj) {
    }

    public void m() {
    }
}
