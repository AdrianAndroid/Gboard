package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bqu  reason: default package */
/* loaded from: classes.dex */
final class bqu extends iew {
    final /* synthetic */ ieh a;
    final /* synthetic */ idi b;
    final /* synthetic */ bqv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqu(bqv bqvVar, ino inoVar, ieh iehVar, idi idiVar) {
        super(inoVar);
        this.c = bqvVar;
        this.a = iehVar;
        this.b = idiVar;
    }

    @Override // defpackage.iew
    protected final void a() {
        ieh iehVar = this.a;
        bqv bqvVar = this.c;
        Context context = bqvVar.a;
        iehVar.u(new dxw(context, this.b, ino.M(context), bqvVar.b));
    }

    @Override // defpackage.iew
    protected final void b() {
        ieh iehVar = this.a;
        int i = dxw.e;
        iehVar.x(dxw.class);
    }
}
