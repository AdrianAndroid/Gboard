package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: eyw  reason: default package */
/* loaded from: classes.dex */
public final class eyw {
    public final LinkedList a;
    private final LinkedList b;

    public eyw() {
        this.a = new LinkedList();
        this.b = new LinkedList();
    }

    public final int a(Object obj) {
        if (obj != null) {
            return this.a.indexOf(obj);
        }
        return -1;
    }

    public final int b() {
        return this.a.size();
    }

    public final Object c() {
        if (b() > 0) {
            return this.a.getFirst();
        }
        return null;
    }

    public final List d() {
        return Collections.unmodifiableList(this.a);
    }

    public final void e() {
        this.a.clear();
        this.b.clear();
    }

    public final void f(Object obj) {
        this.a.remove(obj);
        this.a.addFirst(obj);
        if (this.a.size() > 5) {
            this.b.addFirst(this.a.getLast());
            this.a.removeLast();
        }
    }

    public final boolean g() {
        return b() == 0;
    }

    public final void h() {
        new ArrayList().addAll(this.b);
        this.b.clear();
    }

    public final String toString() {
        return this.a.toString();
    }

    public eyw(Collection collection) {
        this();
        if (!collection.isEmpty()) {
            Iterator it = new LinkedHashSet(collection).iterator();
            while (it.hasNext()) {
                this.a.addLast(it.next());
                if (this.a.size() >= 5) {
                    return;
                }
            }
        }
    }
}
