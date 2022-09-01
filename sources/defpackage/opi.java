package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* renamed from: opi  reason: default package */
/* loaded from: classes2.dex */
public final class opi {
    public static final opi a = new opi(new LinkedHashSet(new ArrayList()), null);
    public final Set b;
    public final oty c;

    public opi(Set set, oty otyVar) {
        this.b = set;
        this.c = otyVar;
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/".concat(ouu.i(((X509Certificate) certificate).getPublicKey().getEncoded()).g("SHA-256").c());
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final void b(String str, List list) {
        List emptyList = Collections.emptyList();
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            oph ophVar = (oph) it.next();
            throw null;
        } else if (!emptyList.isEmpty()) {
            oty otyVar = this.c;
            if (otyVar != null) {
                list = otyVar.a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                if (emptyList.size() > 0) {
                    String str2 = ((oph) emptyList.get(0)).a;
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(a(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = emptyList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sb.append("\n    ");
                sb.append((oph) emptyList.get(i3));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof opi)) {
            return false;
        }
        opi opiVar = (opi) obj;
        return oqs.t(this.c, opiVar.c) && this.b.equals(opiVar.b);
    }

    public final int hashCode() {
        oty otyVar = this.c;
        return ((otyVar != null ? otyVar.hashCode() : 0) * 31) + this.b.hashCode();
    }
}
