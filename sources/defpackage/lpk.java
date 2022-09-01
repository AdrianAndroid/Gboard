package defpackage;

import java.util.AbstractSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lpk  reason: default package */
/* loaded from: classes.dex */
public abstract class lpk extends AbstractSet {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return lqc.d(this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return lqc.d(this).toArray(objArr);
    }
}
