package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lob  reason: default package */
/* loaded from: classes.dex */
public final class lob extends lsz {
    boolean a;
    final /* synthetic */ Object b;

    public lob(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!this.a) {
            this.a = true;
            return this.b;
        }
        throw new NoSuchElementException();
    }
}
