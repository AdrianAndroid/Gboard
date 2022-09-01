package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* renamed from: lmp  reason: default package */
/* loaded from: classes.dex */
final class lmp extends lnq {
    private static final long serialVersionUID = 0;
    final /* synthetic */ lmr a;

    public lmp(lmr lmrVar) {
        this.a = lmrVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // defpackage.lnq
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof lqw) {
            lqw lqwVar = (lqw) obj;
            if (lqwVar.a() > 0 && this.a.a(lqwVar.b()) == lqwVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lmz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.o().size();
    }

    @Override // defpackage.lmz, defpackage.llg
    Object writeReplace() {
        return new lmq(this.a);
    }
}
