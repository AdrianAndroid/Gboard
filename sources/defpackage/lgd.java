package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: lgd  reason: default package */
/* loaded from: classes.dex */
public final class lgd implements lgb {
    volatile lgb a;
    volatile boolean b;
    Object c;

    public lgd(lgb lgbVar) {
        jdg.u(lgbVar);
        this.a = lgbVar;
    }

    @Override // defpackage.lgb
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object a = ((lgb) Objects.requireNonNull(this.a)).a();
                    this.c = a;
                    this.b = true;
                    this.a = null;
                    return a;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
