package defpackage;

/* compiled from: PG */
/* renamed from: mdt  reason: default package */
/* loaded from: classes.dex */
public enum mdt implements nfp {
    EVENT_UNKNOWN(0),
    ENABLE_SHOWN(1),
    LANGUAGE_ENABLED(2),
    CANCEL_CLICKED(3),
    LINK_PARSED(4);
    
    public final int f;

    mdt(int i) {
        this.f = i;
    }

    public static mdt b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ENABLE_SHOWN;
            }
            if (i == 2) {
                return LANGUAGE_ENABLED;
            }
            if (i == 3) {
                return CANCEL_CLICKED;
            }
            if (i == 4) {
                return LINK_PARSED;
            }
            return null;
        }
        return EVENT_UNKNOWN;
    }

    public static nfq c() {
        return mco.u;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
