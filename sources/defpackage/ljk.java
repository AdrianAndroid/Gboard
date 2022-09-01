package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: ljk  reason: default package */
/* loaded from: classes.dex */
public abstract class ljk extends lsz {
    private Object a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ljk(Object obj) {
        this.a = obj;
    }

    protected abstract Object a(Object obj);

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        Object obj = this.a;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.a = a(obj);
        return obj;
    }
}
