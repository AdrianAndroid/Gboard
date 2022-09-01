package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class s {
    private final Map a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i = t.b;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = t.a;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((x) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = t.a;
        Collections.sort(arrayList, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(long j, x xVar) {
        Map map = (Map) this.a.get(xVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
