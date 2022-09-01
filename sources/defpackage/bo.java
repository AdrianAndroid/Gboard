package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bo  reason: default package */
/* loaded from: classes.dex */
public final class bo {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public bk d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final an a(String str) {
        bn bnVar = (bn) this.b.get(str);
        if (bnVar != null) {
            return bnVar.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final an b(String str) {
        for (bn bnVar : this.b.values()) {
            if (bnVar != null) {
                an anVar = bnVar.b;
                if (!str.equals(anVar.l)) {
                    anVar = anVar.B.a.b(str);
                }
                if (anVar != null) {
                    return anVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bm c(String str, bm bmVar) {
        if (bmVar != null) {
            return (bm) this.c.put(str, bmVar);
        }
        return (bm) this.c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bn d(String str) {
        return (bn) this.b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (bn bnVar : this.b.values()) {
            if (bnVar != null) {
                arrayList.add(bnVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f() {
        ArrayList arrayList = new ArrayList();
        for (bn bnVar : this.b.values()) {
            if (bnVar != null) {
                arrayList.add(bnVar.b);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List g() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(an anVar) {
        if (!this.a.contains(anVar)) {
            synchronized (this.a) {
                this.a.add(anVar);
            }
            anVar.r = true;
            return;
        }
        new StringBuilder("Fragment already added: ").append(anVar);
        throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(anVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(bn bnVar) {
        an anVar = bnVar.b;
        if (m(anVar.l)) {
            return;
        }
        this.b.put(anVar.l, bnVar);
        boolean z = anVar.J;
        if (!bi.S(2)) {
            return;
        }
        new StringBuilder("Added fragment to active set ").append(anVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(bn bnVar) {
        an anVar = bnVar.b;
        if (anVar.I) {
            this.d.d(anVar);
        }
        if (((bn) this.b.put(anVar.l, null)) != null && bi.S(2)) {
            new StringBuilder("Removed fragment from active set ").append(anVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(an anVar) {
        synchronized (this.a) {
            this.a.remove(anVar);
        }
        anVar.r = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(String str) {
        return this.b.get(str) != null;
    }
}
