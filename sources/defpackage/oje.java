package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: oje  reason: default package */
/* loaded from: classes2.dex */
public final class oje implements Serializable, oja {
    private okf a;
    private volatile Object b = ojg.a;
    private final Object c = this;

    public oje(okf okfVar) {
        this.a = okfVar;
    }

    private final Object writeReplace() {
        return new oiz(a());
    }

    public final String toString() {
        return this.b != ojg.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }

    @Override // defpackage.oja
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != ojg.a) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == ojg.a) {
                okf okfVar = this.a;
                oll.b(okfVar);
                obj = okfVar.a();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
