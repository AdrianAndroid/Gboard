package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: lnn  reason: default package */
/* loaded from: classes.dex */
public abstract class lnn extends lno implements NavigableSet, lsh {
    final transient Comparator a;
    transient lnn b;

    public lnn(Comparator comparator) {
        this.a = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lrs G(Comparator comparator) {
        if (lrb.a.equals(comparator)) {
            return lrs.c;
        }
        return new lrs(llp.q(), comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    /* renamed from: A */
    public final lnn headSet(Object obj, boolean z) {
        jdg.u(obj);
        return B(obj, z);
    }

    public abstract lnn B(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: C */
    public final lnn subSet(Object obj, boolean z, Object obj2, boolean z2) {
        jdg.u(obj);
        jdg.u(obj2);
        jdg.v(this.a.compare(obj, obj2) <= 0);
        return D(obj, z, obj2, z2);
    }

    public abstract lnn D(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* renamed from: E */
    public final lnn tailSet(Object obj, boolean z) {
        jdg.u(obj);
        return F(obj, z);
    }

    public abstract lnn F(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: H */
    public abstract lsz descendingIterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return lre.ao(tailSet(obj, true));
    }

    @Override // java.util.SortedSet, defpackage.lsh
    public final Comparator comparator() {
        return this.a;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return lre.W(headSet(obj, true).descendingIterator());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return lre.ao(tailSet(obj, false));
    }

    @Override // defpackage.lmz, defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public abstract lsz iterator();

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return lre.W(headSet(obj, false).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // defpackage.lmz, defpackage.llg
    Object writeReplace() {
        return new lnm(this.a, toArray());
    }

    public abstract lnn y();

    @Override // java.util.NavigableSet
    /* renamed from: z */
    public final lnn descendingSet() {
        lnn lnnVar = this.b;
        if (lnnVar == null) {
            lnn y = y();
            this.b = y;
            y.b = this;
            return y;
        }
        return lnnVar;
    }
}
