package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: len  reason: default package */
/* loaded from: classes.dex */
public final class len extends lep implements Serializable {
    public static final len a = new len();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.lep
    protected final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.lep
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
