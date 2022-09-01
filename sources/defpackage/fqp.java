package defpackage;

/* compiled from: PG */
/* renamed from: fqp  reason: default package */
/* loaded from: classes.dex */
public final class fqp extends fqi {
    final /* synthetic */ fqq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqp(fqq fqqVar, int i) {
        super(fqqVar, i, null);
        this.g = fqqVar;
    }

    @Override // defpackage.fqi
    protected final void a(fmt fmtVar) {
        this.g.f.a(fmtVar);
        System.currentTimeMillis();
    }

    @Override // defpackage.fqi
    protected final boolean c() {
        this.g.f.a(fmt.a);
        return true;
    }
}
