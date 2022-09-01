package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: PG */
/* renamed from: lrm  reason: default package */
/* loaded from: classes.dex */
final class lrm extends llp {
    final /* synthetic */ lrn a;

    public lrm(lrn lrnVar) {
        this.a = lrnVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        jdg.N(i, this.a.c);
        lrn lrnVar = this.a;
        int i2 = i + i;
        Object requireNonNull = Objects.requireNonNull(lrnVar.a[lrnVar.b + i2]);
        lrn lrnVar2 = this.a;
        return new AbstractMap.SimpleImmutableEntry(requireNonNull, Objects.requireNonNull(lrnVar2.a[i2 + (lrnVar2.b ^ 1)]));
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }
}
