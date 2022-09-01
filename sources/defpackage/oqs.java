package defpackage;

import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* renamed from: oqs  reason: default package */
/* loaded from: classes2.dex */
public final class oqs {
    public static final byte[] a;
    public static final oqn c;
    public static final Method p;
    private static final Pattern q;
    public static final String[] b = new String[0];
    public static final ouu d = ouu.f("efbbbf");
    public static final ouu e = ouu.f("feff");
    public static final ouu f = ouu.f("fffe");
    public static final ouu g = ouu.f("0000ffff");
    public static final ouu h = ouu.f("ffff0000");
    public static final Charset i = Charset.forName("UTF-8");
    public static final Charset j = Charset.forName("UTF-16BE");
    public static final Charset k = Charset.forName("UTF-16LE");
    public static final Charset l = Charset.forName("UTF-32BE");
    public static final Charset m = Charset.forName("UTF-32LE");
    public static final TimeZone n = DesugarTimeZone.getTimeZone("GMT");
    public static final Comparator o = new kp(13);

    static {
        Method method;
        byte[] bArr = new byte[0];
        a = bArr;
        our ourVar = new our();
        ourVar.U(bArr);
        c = new oqm(ourVar);
        B(0L, 0L);
        Charset.forName("ISO-8859-1");
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        p = method;
        q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static void B(long j2, long j3) {
        if (j2 < 0 || j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean C(ovp ovpVar, TimeUnit timeUnit) {
        try {
            return w(ovpVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static int D(Comparator comparator, String[] strArr) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], "TLS_FALLBACK_SCSV") == 0) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress E(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqs.E(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int a(char c2) {
        if (c2 < '0' || c2 > '9') {
            if (c2 >= 'a' && c2 <= 'f') {
                return c2 - 'W';
            }
            if (c2 >= 'A' && c2 <= 'F') {
                return c2 - '7';
            }
            return -1;
        }
        return c2 - '0';
    }

    public static int b(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int c(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int d(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static int e(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int f(String str, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 >= i2) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
            } else {
                return i2;
            }
        }
    }

    public static AssertionError g(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static String h(String str) {
        InetAddress E;
        int i2 = -1;
        int i3 = 0;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                E = E(str, 0, str.length());
            } else {
                E = E(str, 1, str.length() - 1);
            }
            if (E == null) {
                return null;
            }
            byte[] address = E.getAddress();
            if (address.length == 16) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i2 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                our ourVar = new our();
                while (i3 < address.length) {
                    if (i3 == i2) {
                        ourVar.N(58);
                        i3 += i5;
                        if (i3 == 16) {
                            ourVar.N(58);
                        }
                    } else {
                        if (i3 > 0) {
                            ourVar.N(58);
                        }
                        ourVar.V(((address[i3] & 255) << 8) | (address[i3 + 1] & 255));
                        i3 += 2;
                    }
                }
                return ourVar.n();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty()) {
                while (i3 < lowerCase.length()) {
                    char charAt = lowerCase.charAt(i3);
                    if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                        i3++;
                    }
                    return null;
                }
                return lowerCase;
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public static String i(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String j(opz opzVar, boolean z) {
        String str;
        if (opzVar.b.contains(":")) {
            str = "[" + opzVar.b + "]";
        } else {
            str = opzVar.b;
        }
        if (z || opzVar.c != opz.a(opzVar.a)) {
            return str + ":" + opzVar.c;
        }
        return str;
    }

    public static String k(String str, int i2, int i3) {
        int e2 = e(str, i2, i3);
        return str.substring(e2, f(str, e2, i3));
    }

    public static List l(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List m(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static Map n(Map map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static ThreadFactory o(String str, boolean z) {
        return new oqr(str, z);
    }

    public static X509TrustManager p() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            String arrays = Arrays.toString(trustManagers);
            throw new IllegalStateException("Unexpected default trust managers:" + arrays);
        } catch (GeneralSecurityException e2) {
            throw g("No System TLS", e2);
        }
    }

    public static opx q(List list) {
        mlu mluVar = new mlu((byte[]) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ose oseVar = (ose) it.next();
            mluVar.F(oseVar.g.e(), oseVar.h.e());
        }
        return mluVar.D();
    }

    public static void r(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void s(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!u(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean u(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean v(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && (r1 = strArr.length) != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean w(ovp ovpVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long j2 = ovpVar.a().h() ? ovpVar.a().j() - nanoTime : Long.MAX_VALUE;
        ovpVar.a().m(Math.min(j2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            our ourVar = new our();
            while (ovpVar.b(ourVar, 8192L) != -1) {
                ourVar.y();
            }
            if (j2 == Long.MAX_VALUE) {
                ovpVar.a().k();
                return true;
            }
            ovpVar.a().m(nanoTime + j2);
            return true;
        } catch (InterruptedIOException unused) {
            if (j2 == Long.MAX_VALUE) {
                ovpVar.a().k();
                return false;
            }
            ovpVar.a().m(nanoTime + j2);
            return false;
        } catch (Throwable th) {
            if (j2 == Long.MAX_VALUE) {
                ovpVar.a().k();
            } else {
                ovpVar.a().m(nanoTime + j2);
            }
            throw th;
        }
    }

    public static boolean x(String str) {
        return q.matcher(str).matches();
    }

    public static String[] y(String[] strArr, String str) {
        int length = strArr.length;
        int i2 = length + 1;
        String[] strArr2 = new String[i2];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[i2 - 1] = str;
        return strArr2;
    }

    public static String[] z(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int A(long j2, TimeUnit timeUnit) {
        long j3 = 0;
        if (j2 >= 0) {
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("timeout too large.");
            }
            if (millis != 0) {
                j3 = millis;
            } else if (j2 > 0) {
                throw new IllegalArgumentException("timeout too small.");
            }
            return (int) j3;
        }
        throw new IllegalArgumentException("timeout < 0");
    }
}
