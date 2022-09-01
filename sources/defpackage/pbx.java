package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: pbx  reason: default package */
/* loaded from: classes2.dex */
public final class pbx implements ozu {
    public volatile boolean a;
    private Set b;

    public final void a(ozu ozuVar) {
        if (ozuVar.e()) {
            return;
        }
        if (!this.a) {
            synchronized (this) {
                if (!this.a) {
                    if (this.b == null) {
                        this.b = new HashSet(4);
                    }
                    this.b.add(ozuVar);
                    return;
                }
            }
        }
        ozuVar.d();
    }

    public final void b(ozu ozuVar) {
        Set set;
        if (!this.a) {
            synchronized (this) {
                if (!this.a && (set = this.b) != null) {
                    boolean remove = set.remove(ozuVar);
                    if (!remove) {
                        return;
                    }
                    ozuVar.d();
                }
            }
        }
    }

    @Override // defpackage.ozu
    public final void d() {
        if (!this.a) {
            synchronized (this) {
                if (this.a) {
                    return;
                }
                this.a = true;
                Set<ozu> set = this.b;
                ArrayList arrayList = null;
                this.b = null;
                if (set == null) {
                    return;
                }
                for (ozu ozuVar : set) {
                    try {
                        ozuVar.d();
                    } catch (Throwable th) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                ols.o(arrayList);
            }
        }
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.a;
    }
}
