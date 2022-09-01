package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: lmw  reason: default package */
/* loaded from: classes.dex */
public final class lmw extends ljj implements Serializable {
    public static final lmw a = new lmw(llp.q());
    public static final lmw b = new lmw(llp.r(lrh.a));
    private final transient llp c;

    public lmw(llp llpVar) {
        this.c = llpVar;
    }

    public static lmw a(Iterable iterable) {
        lsy lsyVar = new lsy(new TreeMap());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            lrh lrhVar = (lrh) it.next();
            jdg.u(lrhVar);
            if (!lrhVar.q()) {
                lkp lkpVar = lrhVar.b;
                lkp lkpVar2 = lrhVar.c;
                Map.Entry lowerEntry = lsyVar.a.lowerEntry(lkpVar);
                if (lowerEntry != null) {
                    lrh lrhVar2 = (lrh) lowerEntry.getValue();
                    if (lrhVar2.c.compareTo(lkpVar) >= 0) {
                        if (lrhVar2.c.compareTo(lkpVar2) >= 0) {
                            lkpVar2 = lrhVar2.c;
                        }
                        lkpVar = lrhVar2.b;
                    }
                }
                Map.Entry floorEntry = lsyVar.a.floorEntry(lkpVar2);
                if (floorEntry != null) {
                    lrh lrhVar3 = (lrh) floorEntry.getValue();
                    if (lrhVar3.c.compareTo(lkpVar2) >= 0) {
                        lkpVar2 = lrhVar3.c;
                    }
                }
                lsyVar.a.subMap(lkpVar, lkpVar2).clear();
                lrh g = lrh.g(lkpVar, lkpVar2);
                if (g.q()) {
                    lsyVar.a.remove(g.b);
                } else {
                    lsyVar.a.put(g.b, g);
                }
            }
        }
        if (lsyVar.b().isEmpty()) {
            return a;
        }
        lrh lrhVar4 = lrh.a;
        jdg.u(lrhVar4);
        Map.Entry floorEntry2 = lsyVar.a.floorEntry(lrhVar4.b);
        return (floorEntry2 == null || !((lrh) floorEntry2.getValue()).m(lrhVar4)) ? new lmw(llp.o(lsyVar.b())) : b;
    }

    public static kcl e() {
        return new kcl((char[]) null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.lrj
    public final /* bridge */ /* synthetic */ Set b() {
        if (this.c.isEmpty()) {
            return lrr.a;
        }
        return new lrs(this.c, lrh.d());
    }

    public final boolean c(lrh lrhVar) {
        int f = lvw.f(this.c, lrh.c(), lrhVar.b, lrb.a, lsj.ANY_PRESENT, lsi.NEXT_HIGHER);
        if (f >= this.c.size() || !((lrh) this.c.get(f)).p(lrhVar) || ((lrh) this.c.get(f)).h(lrhVar).q()) {
            if (f <= 0) {
                return false;
            }
            int i = f - 1;
            return ((lrh) this.c.get(i)).p(lrhVar) && !((lrh) this.c.get(i)).h(lrhVar).q();
        }
        return true;
    }

    public final boolean d() {
        return this.c.isEmpty();
    }

    Object writeReplace() {
        return new lmv(this.c);
    }
}
