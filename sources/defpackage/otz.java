package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* renamed from: otz  reason: default package */
/* loaded from: classes2.dex */
public final class otz implements HostnameVerifier {
    public static final otz a = new otz();

    private otz() {
    }

    public static List a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static final boolean b(String str, X509Certificate x509Certificate) {
        if (!oqs.x(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            for (String str2 : a(x509Certificate, 2)) {
                if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
                    String concat = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                    if (!str2.endsWith(".")) {
                        str2 = str2.concat(".");
                    }
                    String lowerCase2 = str2.toLowerCase(Locale.US);
                    if (!lowerCase2.contains("*")) {
                        if (concat.equals(lowerCase2)) {
                        }
                    } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && concat.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                        String substring = lowerCase2.substring(1);
                        if (!concat.endsWith(substring)) {
                            continue;
                        } else {
                            int length = concat.length() - substring.length();
                            if (length > 0 && concat.lastIndexOf(46, length - 1) != -1) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        List a2 = a(x509Certificate, 7);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            if (!str.equalsIgnoreCase((String) a2.get(i))) {
            }
        }
        return false;
        return true;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
