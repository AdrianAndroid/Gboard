package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lfb  reason: default package */
/* loaded from: classes.dex */
public abstract class lfb implements Serializable {
    private static final long serialVersionUID = 0;

    public static lfb f(Object obj) {
        return obj == null ? ldu.a : new lfm(obj);
    }

    public static lfb g(Object obj) {
        jdg.u(obj);
        return new lfm(obj);
    }

    public abstract Object a();

    public abstract Object b(lgb lgbVar);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract boolean e();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
