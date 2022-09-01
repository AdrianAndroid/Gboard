package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lwq  reason: default package */
/* loaded from: classes.dex */
public final class lwq extends AbstractSet {
    final int a;
    final /* synthetic */ lwr b;

    public lwq(lwr lwrVar, int i) {
        this.b = lwrVar;
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.b.c[this.a + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object c(int i) {
        return this.b.b[b() + i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.b.b, b(), a(), obj, this.a == -1 ? lwr.a : lwt.a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lwp(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}
