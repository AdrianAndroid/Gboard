package defpackage;

import j$.util.AbstractC0002b;
import j$.util.Comparator;
import j$.util.Iterator;
import j$.util.Objects;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: dea  reason: default package */
/* loaded from: classes.dex */
public class dea implements Comparator, Iterator, j$.util.Comparator, j$.util.Iterator {
    private final List a;
    private int b = 0;

    public dea(List list) {
        if (list.isEmpty()) {
            this.a = list;
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        this.a = arrayList;
        Collections.sort(arrayList, this);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a */
    public hln next() {
        int size = this.a.size() - 1;
        int i = this.b;
        if (i <= size) {
            List list = this.a;
            this.b = i + 1;
            return (hln) list.get(i);
        }
        throw new NoSuchElementException("Cannot iterate past " + size);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        hln hlnVar = (hln) obj;
        hln hlnVar2 = (hln) obj2;
        if (hlnVar == null || hlnVar2 == null) {
            return 0;
        }
        return hlnVar.i - hlnVar2.i;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ Comparator reversed() {
        Comparator reverseOrder;
        reverseOrder = Collections.reverseOrder(this);
        return reverseOrder;
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ Comparator thenComparing(Function function) {
        Comparator r;
        r = AbstractC0002b.r(this, Comparator.CC.comparing(function));
        return r;
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        java.util.Comparator r;
        r = AbstractC0002b.r(this, Comparator.CC.comparing(function, comparator));
        return r;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Objects.requireNonNull(comparator);
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Objects.requireNonNull(toDoubleFunction);
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        java.util.Comparator r;
        r = AbstractC0002b.r(this, Comparator.CC.comparingInt(toIntFunction));
        return r;
    }

    @Override // j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Objects.requireNonNull(toLongFunction);
    }
}
