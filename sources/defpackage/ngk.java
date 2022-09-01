package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ngk  reason: default package */
/* loaded from: classes2.dex */
public final class ngk extends ndx implements RandomAccess, ngl {
    private static final ngk b;
    private final List c;

    static {
        ngk ngkVar = new ngk(10);
        b = ngkVar;
        ngkVar.b();
    }

    public ngk() {
        this(10);
    }

    private static String j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof nem) {
            return ((nem) obj).A();
        }
        return ngb.f((byte[]) obj);
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        ij();
        this.c.add(i, (String) obj);
        this.modCount++;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        ij();
        if (collection instanceof ngl) {
            collection = ((ngl) collection).h();
        }
        boolean addAll = this.c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        ij();
        this.c.clear();
        this.modCount++;
    }

    @Override // defpackage.ngl
    public final ngl d() {
        return this.a ? new nid(this) : this;
    }

    @Override // defpackage.nga
    public final /* bridge */ /* synthetic */ nga e(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new ngk(arrayList);
    }

    @Override // defpackage.ngl
    public final Object f(int i) {
        return this.c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public final String get(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof nem) {
            nem nemVar = (nem) obj;
            String A = nemVar.A();
            if (nemVar.p()) {
                this.c.set(i, A);
            }
            return A;
        }
        byte[] bArr = (byte[]) obj;
        String f = ngb.f(bArr);
        if (ngb.g(bArr)) {
            this.c.set(i, f);
        }
        return f;
    }

    @Override // defpackage.ngl
    public final List h() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // defpackage.ngl
    public final void i(nem nemVar) {
        ij();
        this.c.add(nemVar);
        this.modCount++;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        ij();
        Object remove = this.c.remove(i);
        this.modCount++;
        return j(remove);
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        ij();
        return j(this.c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    public ngk(int i) {
        this(new ArrayList(i));
    }

    private ngk(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // defpackage.ndx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
