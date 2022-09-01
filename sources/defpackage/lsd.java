package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: lsd  reason: default package */
/* loaded from: classes.dex */
public final class lsd extends lsf {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public lsd(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.lsf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final lsz iterator() {
        return new lsc(this, this.a.iterator(), this.b.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.contains(obj) ^ this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.equals(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (Object obj : this.a) {
            if (!this.b.contains(obj)) {
                i++;
            }
        }
        for (Object obj2 : this.b) {
            if (!this.a.contains(obj2)) {
                i++;
            }
        }
        return i;
    }
}
