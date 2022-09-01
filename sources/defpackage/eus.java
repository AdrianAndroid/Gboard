package defpackage;

/* compiled from: PG */
@Deprecated
/* renamed from: eus  reason: default package */
/* loaded from: classes.dex */
public enum eus implements nfp {
    SCALE_MODE_FILL_HORIZONTAL(1),
    SCALE_MODE_FILL_VERTICAL(2);
    
    public final int c;

    eus(int i) {
        this.c = i;
    }

    public static eus b(int i) {
        if (i != 1) {
            if (i == 2) {
                return SCALE_MODE_FILL_VERTICAL;
            }
            return null;
        }
        return SCALE_MODE_FILL_HORIZONTAL;
    }

    public static nfq c() {
        return cgs.h;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
