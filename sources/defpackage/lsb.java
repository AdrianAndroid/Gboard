package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: lsb  reason: default package */
/* loaded from: classes.dex */
public final class lsb extends lsf {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public lsb(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.lsf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final lsz iterator() {
        return new lsa(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) && !this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.containsAll(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (Object obj : this.a) {
            if (!this.b.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
