package defpackage;

/* compiled from: PG */
/* renamed from: dkt  reason: default package */
/* loaded from: classes.dex */
public enum dkt {
    UNINITIALIZED,
    HIDDEN,
    SHOWN,
    EXPANDED,
    SHOWN_TO_EXPANDED,
    EXPANDED_TO_SHOWN;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dkt a() {
        int ordinal = ordinal();
        if (ordinal != 4) {
            if (ordinal == 5) {
                return SHOWN;
            }
            return null;
        }
        return EXPANDED;
    }

    public final boolean b() {
        return this == EXPANDED || this == SHOWN_TO_EXPANDED;
    }

    public final boolean c() {
        return this != HIDDEN;
    }
}
