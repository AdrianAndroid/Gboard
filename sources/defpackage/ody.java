package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ody  reason: default package */
/* loaded from: classes2.dex */
public final class ody {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final oea f;
    final boolean g;
    final boolean h;

    public ody(List list, Collection collection, Collection collection2, oea oeaVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        jdg.Q(collection, "drainedSubstreams");
        this.c = collection;
        this.f = oeaVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        boolean z4 = false;
        jdg.G(!z2 || list == null, "passThrough should imply buffer is null");
        jdg.G(!z2 || oeaVar != null, "passThrough should imply winningSubstream != null");
        jdg.G(!z2 || (collection.size() == 1 && collection.contains(oeaVar)) || (collection.size() == 0 && oeaVar.b), "passThrough should imply winningSubstream is drained");
        jdg.G((!z || oeaVar != null) ? true : z4, "cancelled should imply committed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ody a(oea oeaVar) {
        Collection unmodifiableCollection;
        jdg.G(!this.h, "hedging frozen");
        jdg.G(this.f == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(oeaVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(oeaVar);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new ody(this.b, this.c, unmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ody b() {
        return this.h ? this : new ody(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }
}
