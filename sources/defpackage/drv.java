package defpackage;

import j$.util.function.ToIntFunction;

/* compiled from: PG */
/* renamed from: drv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class drv implements ToIntFunction {
    private final /* synthetic */ int d;
    public static final /* synthetic */ drv c = new drv(2);
    public static final /* synthetic */ drv b = new drv(1);
    public static final /* synthetic */ drv a = new drv(0);

    private /* synthetic */ drv(int i) {
        this.d = i;
    }

    @Override // j$.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                ltg ltgVar = czj.a;
                return ((czs) obj).b.size();
            }
            int i2 = jcp.q;
            return ((Integer) obj).intValue();
        }
        return ((llp) obj).size();
    }
}
