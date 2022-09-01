package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: lrp  reason: default package */
/* loaded from: classes.dex */
final class lrp extends llp {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public lrp(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jdg.N(i, this.c);
        return Objects.requireNonNull(this.a[i + i + this.b]);
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
