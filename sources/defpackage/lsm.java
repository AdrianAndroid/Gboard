package defpackage;

import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: lsm  reason: default package */
/* loaded from: classes.dex */
public final class lsm extends lsk implements Queue {
    private static final long serialVersionUID = 0;

    public lsm(Queue queue) {
        super(queue);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.lsk
    public final /* synthetic */ Collection a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    @Override // java.util.Queue
    public final Object element() {
        Object element;
        synchronized (this.b) {
            element = this.a.element();
        }
        return element;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Queue] */
    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        boolean offer;
        synchronized (this.b) {
            offer = this.a.offer(obj);
        }
        return offer;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    @Override // java.util.Queue
    public final Object peek() {
        Object peek;
        synchronized (this.b) {
            peek = this.a.peek();
        }
        return peek;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    @Override // java.util.Queue
    public final Object poll() {
        Object poll;
        synchronized (this.b) {
            poll = this.a.poll();
        }
        return poll;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    @Override // java.util.Queue
    public final Object remove() {
        Object remove;
        synchronized (this.b) {
            remove = this.a.remove();
        }
        return remove;
    }
}
