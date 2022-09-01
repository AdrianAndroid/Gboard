package defpackage;

/* compiled from: PG */
/* renamed from: axk  reason: default package */
/* loaded from: classes.dex */
final class axk implements avi {
    final /* synthetic */ axl a;
    final /* synthetic */ fws b;

    public axk(axl axlVar, fws fwsVar, byte[] bArr, byte[] bArr2) {
        this.a = axlVar;
        this.b = fwsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [auw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [avj, java.lang.Object] */
    @Override // defpackage.avi
    public final void b(Object obj) {
        if (this.a.f(this.b)) {
            axl axlVar = this.a;
            fws fwsVar = this.b;
            awt awtVar = axlVar.a.o;
            if (obj == null || !awtVar.c(fwsVar.a.g())) {
                awj awjVar = axlVar.b;
                ?? r3 = fwsVar.c;
                ?? r4 = fwsVar.a;
                awjVar.e(r3, obj, r4, r4.g(), axlVar.d);
                return;
            }
            axlVar.c = obj;
            axlVar.b.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [avj, java.lang.Object] */
    @Override // defpackage.avi
    public final void e(Exception exc) {
        if (this.a.f(this.b)) {
            axl axlVar = this.a;
            fws fwsVar = this.b;
            awj awjVar = axlVar.b;
            awi awiVar = axlVar.d;
            ?? r1 = fwsVar.a;
            awjVar.d(awiVar, exc, r1, r1.g());
        }
    }
}
