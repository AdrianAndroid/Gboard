package defpackage;

import j$.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: liz  reason: default package */
/* loaded from: classes.dex */
final class liz extends lix implements ListIterator, Iterator {
    final /* synthetic */ lja d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liz(lja ljaVar) {
        super(ljaVar);
        this.d = ljaVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.d.isEmpty();
        b().add(obj);
        ljc.r(this.d.f);
        if (isEmpty) {
            this.d.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liz(lja ljaVar, int i) {
        super(ljaVar, ljaVar.d().listIterator(i));
        this.d = ljaVar;
    }
}
