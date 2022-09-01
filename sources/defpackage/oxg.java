package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* renamed from: oxg  reason: default package */
/* loaded from: classes2.dex */
public final class oxg extends UrlResponseInfo.HeaderBlock {
    public final List a;
    public Map b;

    public oxg(List list) {
        this.a = list;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final List getAsList() {
        return this.a;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final Map getAsMap() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : this.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.b = unmodifiableMap;
        return unmodifiableMap;
    }
}
