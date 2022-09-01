package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lna  reason: default package */
/* loaded from: classes.dex */
public final class lna extends lmh {
    @Override // defpackage.lmh
    public final Collection b() {
        return new lke();
    }

    public final lnd f() {
        Collection<Map.Entry> entrySet = this.a.entrySet();
        Comparator comparator = this.b;
        if (comparator != null) {
            entrySet = llp.z(lrc.b(comparator).c(), entrySet);
        }
        if (entrySet.isEmpty()) {
            return lkr.a;
        }
        lls llsVar = new lls(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            lmz p = lmz.p((Collection) entry.getValue());
            if (!p.isEmpty()) {
                llsVar.a(key, p);
                i += p.size();
            }
        }
        return new lnd(llsVar.l(), i);
    }

    public final void g(Object obj, Object obj2) {
        super.e(obj, obj2);
    }
}
