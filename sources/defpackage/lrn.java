package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lrn  reason: default package */
/* loaded from: classes.dex */
public final class lrn extends lmz {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient llw d;

    public lrn(llw llwVar, Object[] objArr, int i, int i2) {
        this.d = llwVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.llg
    public final int b(Object[] objArr, int i) {
        return k().b(objArr, i);
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lmz
    public final llp f() {
        return new lrm(this);
    }

    @Override // defpackage.lmz, defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return k().listIterator();
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }
}
