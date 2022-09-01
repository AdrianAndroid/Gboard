package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ovc  reason: default package */
/* loaded from: classes2.dex */
public final class ovc extends ojn implements RandomAccess {
    public static final oli c = new oli();
    public final ouu[] a;
    public final int[] b;

    public ovc(ouu[] ouuVarArr, int[] iArr) {
        this.a = ouuVarArr;
        this.b = iArr;
    }

    @Override // defpackage.ojj
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ojj, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof ouu)) {
            return false;
        }
        return super.contains((ouu) obj);
    }

    @Override // defpackage.ojn, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.ojn, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof ouu)) {
            return -1;
        }
        return super.indexOf((ouu) obj);
    }

    @Override // defpackage.ojn, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof ouu)) {
            return -1;
        }
        return super.lastIndexOf((ouu) obj);
    }
}
