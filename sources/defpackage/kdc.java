package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: kdc  reason: default package */
/* loaded from: classes.dex */
public abstract class kdc {
    public abstract ngz a(String str, Object obj);

    public abstract ngz b(ngz ngzVar, ngz ngzVar2);

    public abstract String c(ngz ngzVar);

    public final List d(Map map) {
        ngz a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (a = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e(List list, List list2) {
        ngz ngzVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ngz ngzVar2 = (ngz) it.next();
            String c = c(ngzVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    ngzVar = null;
                    break;
                }
                ngzVar = (ngz) it2.next();
                if (c.equals(c(ngzVar))) {
                    break;
                }
            }
            ngz b = b(ngzVar2, ngzVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
