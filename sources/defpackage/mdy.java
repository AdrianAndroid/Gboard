package defpackage;

/* compiled from: PG */
/* renamed from: mdy  reason: default package */
/* loaded from: classes.dex */
public enum mdy implements nfp {
    EVENT_UNKNOWN(0),
    ENTRYPOINT_SHOWN(1),
    ENTRYPOINT_CLICKED(2),
    SHARE_CLICKED(3),
    CANCEL_CLICKED(4);
    
    public final int f;

    mdy(int i) {
        this.f = i;
    }

    public static mdy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ENTRYPOINT_SHOWN;
            }
            if (i == 2) {
                return ENTRYPOINT_CLICKED;
            }
            if (i == 3) {
                return SHARE_CLICKED;
            }
            if (i == 4) {
                return CANCEL_CLICKED;
            }
            return null;
        }
        return EVENT_UNKNOWN;
    }

    public static nfq c() {
        return mdw.c;
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
