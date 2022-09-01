package defpackage;

/* compiled from: PG */
/* renamed from: khw  reason: default package */
/* loaded from: classes.dex */
final class khw extends khz {
    private final boolean a;

    public khw(oor oorVar, boolean z) {
        super(oorVar);
        this.a = z;
    }

    private final oor f(Long l) {
        return this.a ? e(l) : d();
    }

    @Override // defpackage.khz
    public final long a(String str) {
        oor f = f(null);
        if (f.equals(oor.d)) {
            return 1000L;
        }
        return f.b;
    }

    @Override // defpackage.khz
    public final oor b(Long l) {
        return f(l);
    }

    @Override // defpackage.khz
    public final boolean c() {
        return this.a;
    }
}
