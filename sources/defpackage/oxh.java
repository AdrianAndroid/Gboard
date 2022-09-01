package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* renamed from: oxh  reason: default package */
/* loaded from: classes2.dex */
public final class oxh extends UrlResponseInfo {
    private final List a;
    private final int b;
    private final String c;
    private final String d;
    private final String e = "";
    private final AtomicLong f = new AtomicLong(0);
    private final oxg g;

    public oxh(List list, int i, String str, List list2, String str2) {
        this.a = Collections.unmodifiableList(list);
        this.b = i;
        this.c = str;
        this.g = new oxg(Collections.unmodifiableList(list2));
        this.d = str2;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        oxg oxgVar = this.g;
        Map map = oxgVar.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : oxgVar.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        oxgVar.b = Collections.unmodifiableMap(treeMap);
        return oxgVar.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.g.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.d;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        List list = this.a;
        return (String) list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), getUrl(), this.a.toString(), Integer.valueOf(this.b), this.c, this.g.a.toString(), false, this.d, this.e, Long.valueOf(getReceivedByteCount()));
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return false;
    }
}
