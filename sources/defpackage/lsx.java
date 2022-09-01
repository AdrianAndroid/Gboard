package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lsx  reason: default package */
/* loaded from: classes.dex */
final class lsx extends lkw implements Set {
    final Collection a;

    public lsx(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.lkw
    protected final Collection b() {
        return this.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return lvw.p(this, obj);
    }

    @Override // defpackage.lkz
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return lvw.h(this);
    }
}
