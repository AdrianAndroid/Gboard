package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: npg  reason: default package */
/* loaded from: classes2.dex */
public final class npg implements npe {
    public static final npe a = npf.b(Collections.emptySet());
    private final List b;
    private final List c;

    public npg(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.oiy
    /* renamed from: b */
    public final Set a() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((oiy) this.c.get(i)).a();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = this.b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object a2 = ((oiy) this.b.get(i2)).a();
            nxp.V(a2);
            hashSet.add(a2);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                nxp.V(obj);
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
