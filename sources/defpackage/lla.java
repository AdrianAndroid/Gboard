package defpackage;

import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: lla  reason: default package */
/* loaded from: classes.dex */
public abstract class lla extends lkw implements Queue {
    @Override // defpackage.lkw
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Queue c();

    @Override // java.util.Queue
    public final Object element() {
        return c().element();
    }

    public boolean offer(Object obj) {
        return c().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return c().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return c().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return c().remove();
    }
}
