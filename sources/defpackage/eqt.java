package defpackage;

/* compiled from: PG */
/* renamed from: eqt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eqt implements equ {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eqt(dcu dcuVar, int i) {
        this.b = i;
        this.a = dcuVar;
    }

    public /* synthetic */ eqt(iss issVar, int i) {
        this.b = i;
        this.a = issVar;
    }

    public /* synthetic */ eqt(ist istVar, int i) {
        this.b = i;
        this.a = istVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [equ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [iss, equ] */
    /* JADX WARN: Type inference failed for: r0v9, types: [iss, equ] */
    @Override // defpackage.equ
    public final kcq a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ?? ab = ((dcu) this.a).ab();
                if (!(ab instanceof equ)) {
                    return null;
                }
                return ab.a();
            }
            ?? r0 = ((ist) this.a).a;
            if (!(r0 instanceof equ)) {
                return null;
            }
            return r0.a();
        }
        return this.a.a();
    }
}
