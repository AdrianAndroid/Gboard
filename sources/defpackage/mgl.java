package defpackage;

/* compiled from: PG */
/* renamed from: mgl  reason: default package */
/* loaded from: classes.dex */
public enum mgl implements nfp {
    TRAINING_DATA_SOURCE_UNDEFINED(0),
    FEED(1),
    DATASET(2);
    
    public final int d;

    mgl(int i) {
        this.d = i;
    }

    public static mgl b(int i) {
        if (i != 0) {
            if (i == 1) {
                return FEED;
            }
            if (i == 2) {
                return DATASET;
            }
            return null;
        }
        return TRAINING_DATA_SOURCE_UNDEFINED;
    }

    public static nfq c() {
        return mgk.a;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
