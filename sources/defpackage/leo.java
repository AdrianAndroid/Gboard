package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: leo  reason: default package */
/* loaded from: classes.dex */
public final class leo extends lep implements Serializable {
    public static final leo a = new leo();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.lep
    protected final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // defpackage.lep
    protected final boolean b(Object obj, Object obj2) {
        return false;
    }
}
