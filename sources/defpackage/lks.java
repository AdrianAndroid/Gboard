package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: lks  reason: default package */
/* loaded from: classes.dex */
public final class lks extends lla implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final Queue b;

    private lks(int i) {
        jdg.y(true, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    public static lks a(int i) {
        return new lks(i);
    }

    @Override // defpackage.lkw, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        jdg.u(obj);
        if (size() == this.a) {
            this.b.remove();
        }
        this.b.add(obj);
        return true;
    }

    @Override // defpackage.lkw, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.a) {
            return lre.U(this, collection.iterator());
        }
        clear();
        int i = size - this.a;
        jdg.u(collection);
        jdg.w(i >= 0, "number to skip cannot be negative");
        return lre.af(this, new lnu(collection, i));
    }

    @Override // defpackage.lla, defpackage.lkw
    protected final /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.lla
    protected final Queue c() {
        return this.b;
    }

    @Override // defpackage.lkz
    protected final /* synthetic */ Object f() {
        return this.b;
    }

    @Override // defpackage.lla, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
