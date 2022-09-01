package defpackage;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lse  reason: default package */
/* loaded from: classes.dex */
public abstract class lse extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return lvw.q(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        jdg.u(collection);
        return super.retainAll(collection);
    }
}
