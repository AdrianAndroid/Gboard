package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lgc  reason: default package */
/* loaded from: classes.dex */
public final class lgc implements Serializable, lgb {
    private static final long serialVersionUID = 0;
    final lgb a;
    volatile transient boolean b;
    transient Object c;

    public lgc(lgb lgbVar) {
        jdg.u(lgbVar);
        this.a = lgbVar;
    }

    @Override // defpackage.lgb
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object a = this.a.a();
                    this.c = a;
                    this.b = true;
                    return a;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.b) {
            obj = "<supplier that returned " + this.c + ">";
        } else {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
