package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lvh  reason: default package */
/* loaded from: classes.dex */
public final class lvh extends lvi {
    private final Map a;

    public lvh(lur lurVar, lur lurVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, lurVar);
        e(linkedHashMap, lurVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((lty) entry.getKey()).b) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, lur lurVar) {
        for (int i = 0; i < lurVar.b(); i++) {
            lty c = lurVar.c(i);
            Object obj = map.get(c);
            if (c.b) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    map.put(c, list);
                }
                list.add(c.d(lurVar.e(i)));
            } else {
                map.put(c, c.d(lurVar.e(i)));
            }
        }
    }

    @Override // defpackage.lvi
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.lvi
    public final Object b(lty ltyVar) {
        lxj.c(!ltyVar.b, "key must be single valued");
        Object obj = this.a.get(ltyVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.lvi
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.lvi
    public final void d(luy luyVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            lty ltyVar = (lty) entry.getKey();
            Object value = entry.getValue();
            if (ltyVar.b) {
                luyVar.b(ltyVar, ((List) value).iterator(), obj);
            } else {
                luyVar.a(ltyVar, value, obj);
            }
        }
    }
}
