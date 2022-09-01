package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: osh  reason: default package */
/* loaded from: classes2.dex */
final class osh {
    static final ose[] a = {new ose(ose.f, ""), new ose(ose.c, "GET"), new ose(ose.c, "POST"), new ose(ose.d, "/"), new ose(ose.d, "/index.html"), new ose(ose.e, "http"), new ose(ose.e, "https"), new ose(ose.b, "200"), new ose(ose.b, "204"), new ose(ose.b, "206"), new ose(ose.b, "304"), new ose(ose.b, "400"), new ose(ose.b, "404"), new ose(ose.b, "500"), new ose("accept-charset", ""), new ose("accept-encoding", "gzip, deflate"), new ose("accept-language", ""), new ose("accept-ranges", ""), new ose("accept", ""), new ose("access-control-allow-origin", ""), new ose("age", ""), new ose("allow", ""), new ose("authorization", ""), new ose("cache-control", ""), new ose("content-disposition", ""), new ose("content-encoding", ""), new ose("content-language", ""), new ose("content-length", ""), new ose("content-location", ""), new ose("content-range", ""), new ose("content-type", ""), new ose("cookie", ""), new ose("date", ""), new ose("etag", ""), new ose("expect", ""), new ose("expires", ""), new ose("from", ""), new ose("host", ""), new ose("if-match", ""), new ose("if-modified-since", ""), new ose("if-none-match", ""), new ose("if-range", ""), new ose("if-unmodified-since", ""), new ose("last-modified", ""), new ose("link", ""), new ose("location", ""), new ose("max-forwards", ""), new ose("proxy-authenticate", ""), new ose("proxy-authorization", ""), new ose("range", ""), new ose("referer", ""), new ose("refresh", ""), new ose("retry-after", ""), new ose("server", ""), new ose("set-cookie", ""), new ose("strict-transport-security", ""), new ose("transfer-encoding", ""), new ose("user-agent", ""), new ose("vary", ""), new ose("via", ""), new ose("www-authenticate", "")};
    static final Map b;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            ose[] oseVarArr = a;
            int length = oseVarArr.length;
            if (i < 61) {
                if (!linkedHashMap.containsKey(oseVarArr[i].g)) {
                    linkedHashMap.put(oseVarArr[i].g, Integer.valueOf(i));
                }
                i++;
            } else {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
