package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: mmq  reason: default package */
/* loaded from: classes2.dex */
public final class mmq {
    private final Set b;
    private mmt d;
    private final Set c = new HashSet();
    public int a = 0;
    private Set e = new HashSet();

    @SafeVarargs
    public mmq(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            msc.l(cls2, "Null interface");
        }
        Collections.addAll(this.b, clsArr);
    }

    public final void b(mmz mmzVar) {
        if (!this.b.contains(mmzVar.a)) {
            this.c.add(mmzVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final void c(mmt mmtVar) {
        msc.l(mmtVar, "Null factory");
        this.d = mmtVar;
    }

    public final mmr a() {
        if (this.d != null) {
            return new mmr(new HashSet(this.b), new HashSet(this.c), this.a, this.d, this.e);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }
}
