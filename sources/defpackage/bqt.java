package defpackage;

/* compiled from: PG */
/* renamed from: bqt  reason: default package */
/* loaded from: classes.dex */
final class bqt extends iew {
    final /* synthetic */ ieh a;
    final /* synthetic */ idi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqt(ino inoVar, ieh iehVar, idi idiVar) {
        super(inoVar);
        this.a = iehVar;
        this.b = idiVar;
    }

    @Override // defpackage.iew
    protected final void a() {
        this.a.u(new bra(this.b));
        this.a.u(new cto(this.b));
        ieh iehVar = this.a;
        idi idiVar = this.b;
        if (!jez.h()) {
            return;
        }
        iehVar.u(new jfb(idiVar));
    }

    @Override // defpackage.iew
    protected final void b() {
        this.a.x(bra.class);
        cto.c(this.a);
        ieh iehVar = this.a;
        if (!jez.h()) {
            return;
        }
        iehVar.x(jfb.class);
    }
}
