package j$.time.format;

/* loaded from: classes3.dex */
abstract /* synthetic */ class d {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[w.values().length];
        a = iArr;
        try {
            iArr[w.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[w.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[w.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[w.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
