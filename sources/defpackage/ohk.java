package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ohk  reason: default package */
/* loaded from: classes2.dex */
public final class ohk {
    public static final ouu a = ouu.h(":");
    public static final ohh[] b = {new ohh(ohh.e, ""), new ohh(ohh.b, "GET"), new ohh(ohh.b, "POST"), new ohh(ohh.c, "/"), new ohh(ohh.c, "/index.html"), new ohh(ohh.d, "http"), new ohh(ohh.d, "https"), new ohh(ohh.a, "200"), new ohh(ohh.a, "204"), new ohh(ohh.a, "206"), new ohh(ohh.a, "304"), new ohh(ohh.a, "400"), new ohh(ohh.a, "404"), new ohh(ohh.a, "500"), new ohh("accept-charset", ""), new ohh("accept-encoding", "gzip, deflate"), new ohh("accept-language", ""), new ohh("accept-ranges", ""), new ohh("accept", ""), new ohh("access-control-allow-origin", ""), new ohh("age", ""), new ohh("allow", ""), new ohh("authorization", ""), new ohh("cache-control", ""), new ohh("content-disposition", ""), new ohh("content-encoding", ""), new ohh("content-language", ""), new ohh("content-length", ""), new ohh("content-location", ""), new ohh("content-range", ""), new ohh("content-type", ""), new ohh("cookie", ""), new ohh("date", ""), new ohh("etag", ""), new ohh("expect", ""), new ohh("expires", ""), new ohh("from", ""), new ohh("host", ""), new ohh("if-match", ""), new ohh("if-modified-since", ""), new ohh("if-none-match", ""), new ohh("if-range", ""), new ohh("if-unmodified-since", ""), new ohh("last-modified", ""), new ohh("link", ""), new ohh("location", ""), new ohh("max-forwards", ""), new ohh("proxy-authenticate", ""), new ohh("proxy-authorization", ""), new ohh("range", ""), new ohh("referer", ""), new ohh("refresh", ""), new ohh("retry-after", ""), new ohh("server", ""), new ohh("set-cookie", ""), new ohh("strict-transport-security", ""), new ohh("transfer-encoding", ""), new ohh("user-agent", ""), new ohh("vary", ""), new ohh("via", ""), new ohh("www-authenticate", "")};
    public static final Map c;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            ohh[] ohhVarArr = b;
            int length = ohhVarArr.length;
            if (i < 61) {
                if (!linkedHashMap.containsKey(ohhVarArr[i].f)) {
                    linkedHashMap.put(ohhVarArr[i].f, Integer.valueOf(i));
                }
                i++;
            } else {
                c = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static void a(ouu ouuVar) {
        int b2 = ouuVar.b();
        for (int i = 0; i < b2; i++) {
            byte a2 = ouuVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ouuVar.e()));
            }
        }
    }
}
