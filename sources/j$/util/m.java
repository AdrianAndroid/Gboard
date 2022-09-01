package j$.util;

import java.util.Collection;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m extends D {
    final /* synthetic */ SortedSet f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.D, j$.util.r
    public final java.util.Comparator getComparator() {
        return this.f.comparator();
    }
}
