package defpackage;

/* compiled from: PG */
/* renamed from: myu  reason: default package */
/* loaded from: classes2.dex */
public final class myu implements fwi {
    final /* synthetic */ fwj a;
    final /* synthetic */ myr b;
    final /* synthetic */ fwi c;
    final /* synthetic */ myz d;

    public myu(myz myzVar, fwj fwjVar, myr myrVar, fwi fwiVar) {
        this.d = myzVar;
        this.a = fwjVar;
        this.b = myrVar;
        this.c = fwiVar;
    }

    @Override // defpackage.fwi
    public final void a(int i, String str) {
        this.c.a(i, str);
    }

    @Override // defpackage.fwi
    public final void b(fwh fwhVar) {
        this.c.b(new myx(this.a, this.d.b, this.b, fwhVar));
    }
}
