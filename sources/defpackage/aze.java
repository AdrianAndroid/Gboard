package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aze  reason: default package */
/* loaded from: classes.dex */
public final class aze implements auw {
    public URL b;
    private final azf c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte[] g;
    private int h;

    public aze(String str) {
        azf azfVar = azf.a;
        this.d = null;
        ce.o(str);
        this.e = str;
        ce.m(azfVar);
        this.c = azfVar;
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        URL url = this.d;
        ce.m(url);
        return url.toString();
    }

    public final String c() {
        if (TextUtils.isEmpty(this.f)) {
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                URL url = this.d;
                ce.m(url);
                str = url.toString();
            }
            this.f = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f;
    }

    public final Map d() {
        azf azfVar = this.c;
        azi aziVar = (azi) azfVar;
        if (aziVar.c == null) {
            synchronized (azfVar) {
                if (((azi) azfVar).c == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((azi) azfVar).b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = ((azh) list.get(i)).a;
                            if (!TextUtils.isEmpty(str)) {
                                sb.append(str);
                                if (i != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(sb2)) {
                            hashMap.put((String) entry.getKey(), sb2);
                        }
                    }
                    ((azi) azfVar).c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return aziVar.c;
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof aze) {
            aze azeVar = (aze) obj;
            if (b().equals(azeVar.b()) && this.c.equals(azeVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        int i = this.h;
        if (i == 0) {
            int hashCode = b().hashCode();
            this.h = hashCode;
            int hashCode2 = (hashCode * 31) + this.c.hashCode();
            this.h = hashCode2;
            return hashCode2;
        }
        return i;
    }

    public final String toString() {
        return b();
    }

    public aze(URL url) {
        azf azfVar = azf.a;
        ce.m(url);
        this.d = url;
        this.e = null;
        ce.m(azfVar);
        this.c = azfVar;
    }
}
