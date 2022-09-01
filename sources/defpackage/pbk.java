package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: pbk  reason: default package */
/* loaded from: classes2.dex */
public final class pbk implements ozu {
    public List a;
    public volatile boolean b;

    public final void a(ozu ozuVar) {
        if (ozuVar.e()) {
            return;
        }
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.a;
                    if (list == null) {
                        list = new LinkedList();
                        this.a = list;
                    }
                    list.add(ozuVar);
                    return;
                }
            }
        }
        ozuVar.d();
    }

    @Override // defpackage.ozu
    public final void d() {
        if (!this.b) {
            synchronized (this) {
                if (this.b) {
                    return;
                }
                this.b = true;
                List<ozu> list = this.a;
                ArrayList arrayList = null;
                this.a = null;
                if (list == null) {
                    return;
                }
                for (ozu ozuVar : list) {
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
        return this.b;
    }
}
