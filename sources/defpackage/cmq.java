package defpackage;

/* compiled from: PG */
/* renamed from: cmq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cmq implements gqf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cmq(cgg cggVar, int i) {
        this.b = i;
        this.a = cggVar;
    }

    public /* synthetic */ cmq(cmr cmrVar, int i) {
        this.b = i;
        this.a = cmrVar;
    }

    @Override // defpackage.gqf
    public final void a() {
        if (this.b == 0) {
            ((cmr) this.a).a.b();
            return;
        }
        cgg cggVar = (cgg) this.a;
        if (cggVar.b == null) {
            return;
        }
        cggVar.b = null;
        cggVar.a.g(false);
        cggVar.a.c();
    }
}
