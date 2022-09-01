package defpackage;

/* compiled from: PG */
/* renamed from: lfl  reason: default package */
/* loaded from: classes.dex */
public enum lfl implements lfe {
    ALWAYS_TRUE,
    ALWAYS_FALSE,
    IS_NULL,
    NOT_NULL;

    @Override // defpackage.lfe
    public final /* synthetic */ boolean a(Object obj) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw null;
                    }
                    return obj != null;
                } else if (obj == null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }
}
