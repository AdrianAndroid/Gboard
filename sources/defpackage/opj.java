package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: opj  reason: default package */
/* loaded from: classes2.dex */
public final class opj {
    public final String t;
    public static final Comparator a = new kp(12);
    private static final Map u = new LinkedHashMap();
    public static final opj b = c("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final opj c = c("TLS_RSA_WITH_AES_128_CBC_SHA");
    public static final opj d = c("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final opj e = c("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final opj f = c("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final opj g = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final opj h = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final opj i = c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final opj j = c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final opj k = c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final opj l = c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final opj m = c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final opj n = c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final opj o = c("TLS_AES_128_GCM_SHA256");
    public static final opj p = c("TLS_AES_256_GCM_SHA384");
    public static final opj q = c("TLS_CHACHA20_POLY1305_SHA256");
    public static final opj r = c("TLS_AES_128_CCM_SHA256");
    public static final opj s = c("TLS_AES_256_CCM_8_SHA256");

    static {
        c("SSL_RSA_WITH_NULL_MD5");
        c("SSL_RSA_WITH_NULL_SHA");
        c("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        c("SSL_RSA_WITH_RC4_128_MD5");
        c("SSL_RSA_WITH_RC4_128_SHA");
        c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_RSA_WITH_DES_CBC_SHA");
        c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        c("SSL_DH_anon_WITH_RC4_128_MD5");
        c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_DH_anon_WITH_DES_CBC_SHA");
        c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        c("TLS_KRB5_WITH_DES_CBC_SHA");
        c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        c("TLS_KRB5_WITH_RC4_128_SHA");
        c("TLS_KRB5_WITH_DES_CBC_MD5");
        c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        c("TLS_KRB5_WITH_RC4_128_MD5");
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        c("TLS_RSA_WITH_NULL_SHA256");
        c("TLS_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_RSA_WITH_AES_256_CBC_SHA256");
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        c("TLS_PSK_WITH_RC4_128_SHA");
        c("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        c("TLS_PSK_WITH_AES_128_CBC_SHA");
        c("TLS_PSK_WITH_AES_256_CBC_SHA");
        c("TLS_RSA_WITH_SEED_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        c("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        c("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        c("TLS_FALLBACK_SCSV");
        c("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDH_RSA_WITH_NULL_SHA");
        c("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDHE_RSA_WITH_NULL_SHA");
        c("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_anon_WITH_NULL_SHA");
        c("TLS_ECDH_anon_WITH_RC4_128_SHA");
        c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    }

    private opj(String str) {
        str.getClass();
        this.t = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(b(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized opj b(String str) {
        opj opjVar;
        String concat;
        synchronized (opj.class) {
            Map map = u;
            opjVar = (opj) map.get(str);
            if (opjVar == null) {
                if (str.startsWith("TLS_")) {
                    concat = "SSL_".concat(String.valueOf(str.substring(4)));
                } else {
                    concat = str.startsWith("SSL_") ? "TLS_".concat(String.valueOf(str.substring(4))) : str;
                }
                opjVar = (opj) map.get(concat);
                if (opjVar == null) {
                    opjVar = new opj(str);
                }
                map.put(str, opjVar);
            }
        }
        return opjVar;
    }

    private static opj c(String str) {
        opj opjVar = new opj(str);
        u.put(str, opjVar);
        return opjVar;
    }

    public final String toString() {
        return this.t;
    }
}
