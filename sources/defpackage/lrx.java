package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: lrx  reason: default package */
/* loaded from: classes.dex */
public final class lrx extends lsf {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Set b;

    public lrx(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.lsf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final lsz iterator() {
        return new lrw(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int size = this.a.size();
        for (Object obj : this.b) {
            if (!this.a.contains(obj)) {
                size++;
            }
        }
        return size;
    }
}
