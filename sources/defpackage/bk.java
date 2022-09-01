package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: bk  reason: default package */
/* loaded from: classes.dex */
public final class bk extends agm {
    public static final agn a = new agx(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public bk(boolean z) {
        this.e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(an anVar) {
        if (bi.S(3)) {
            new StringBuilder("Clearing non-config state for ").append(anVar);
        }
        b(anVar.l);
    }

    public final void b(String str) {
        bk bkVar = (bk) this.c.get(str);
        if (bkVar != null) {
            bkVar.c();
            this.c.remove(str);
        }
        aqr aqrVar = (aqr) this.d.get(str);
        if (aqrVar != null) {
            aqrVar.m();
            this.d.remove(str);
        }
    }

    @Override // defpackage.agm
    public final void c() {
        if (bi.S(3)) {
            new StringBuilder("onCleared called for ").append(this);
        }
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(an anVar) {
        if (this.g) {
            bi.S(2);
        } else if (this.b.remove(anVar.l) == null || !bi.S(2)) {
        } else {
            new StringBuilder("Updating retained Fragments: Removed ").append(anVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(an anVar) {
        if (this.b.containsKey(anVar.l) && this.e) {
            return this.f;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bk bkVar = (bk) obj;
            if (this.b.equals(bkVar.b) && this.c.equals(bkVar.c) && this.d.equals(bkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
