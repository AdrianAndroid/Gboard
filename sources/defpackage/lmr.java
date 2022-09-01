package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lmr  reason: default package */
/* loaded from: classes.dex */
public abstract class lmr extends lms implements lqx {
    private transient llp a;
    private transient lmz b;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.llg
    public final int b(Object[] objArr, int i) {
        lsz it = f().iterator();
        while (it.hasNext()) {
            lqw lqwVar = (lqw) it.next();
            Arrays.fill(objArr, i, lqwVar.a() + i, lqwVar.b());
            i += lqwVar.a();
        }
        return i;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return a(obj) > 0;
    }

    @Override // defpackage.lqx
    @Deprecated
    public final int d(Object obj, int i) {
        throw null;
    }

    public /* bridge */ /* synthetic */ Set e() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return lre.k(this, obj);
    }

    @Override // defpackage.lqx
    @Deprecated
    public final void g() {
        throw null;
    }

    @Override // defpackage.lqx
    @Deprecated
    public final void h(Object obj) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return lvw.h(f());
    }

    @Override // defpackage.lqx
    @Deprecated
    public final boolean i(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.llg
    public final llp k() {
        llp llpVar = this.a;
        if (llpVar == null) {
            llp k = super.k();
            this.a = k;
            return k;
        }
        return llpVar;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return new lmo(f().iterator());
    }

    public abstract lmz o();

    public abstract lqw p(int i);

    @Override // defpackage.lqx
    /* renamed from: q */
    public final lmz f() {
        lmz lmzVar = this.b;
        if (lmzVar == null) {
            if (isEmpty()) {
                lmzVar = lrr.a;
            } else {
                lmzVar = new lmp(this);
            }
            this.b = lmzVar;
        }
        return lmzVar;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return f().toString();
    }

    @Override // defpackage.llg
    abstract Object writeReplace();
}
