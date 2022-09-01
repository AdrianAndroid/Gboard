package defpackage;

import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

/* compiled from: PG */
/* renamed from: lon  reason: default package */
/* loaded from: classes.dex */
public class lon extends AbstractList {
    final List a;
    final int b = 32;

    public lon(List list) {
        this.a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        jdg.N(i, size());
        int i2 = this.b;
        int i3 = i * i2;
        return this.a.subList(i3, Math.min(i2 + i3, this.a.size()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return mhq.v(this.a.size(), this.b, RoundingMode.CEILING);
    }
}
