package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: awy  reason: default package */
/* loaded from: classes.dex */
final class awy implements Iterable {
    public final List a;

    public awy() {
        this(new ArrayList(2));
    }

    public awy(List list) {
        this.a = list;
    }

    public static awx b(bev bevVar) {
        return new awx(bevVar, bgb.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final awy c() {
        return new awy(new ArrayList(this.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(bev bevVar) {
        return this.a.contains(b(bevVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
