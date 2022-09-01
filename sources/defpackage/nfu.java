package defpackage;

import java.util.AbstractList;
import java.util.List;

/* compiled from: PG */
/* renamed from: nfu  reason: default package */
/* loaded from: classes2.dex */
public final class nfu extends AbstractList {
    private final List a;
    private final nft b;

    public nfu(List list, nft nftVar) {
        this.a = list;
        this.b = nftVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
