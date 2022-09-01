package defpackage;

/* compiled from: PG */
/* renamed from: oox  reason: default package */
/* loaded from: classes2.dex */
final class oox extends ouv {
    final /* synthetic */ oqy a;
    final /* synthetic */ ooy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oox(ooy ooyVar, ovn ovnVar, oqy oqyVar) {
        super(ovnVar);
        this.b = ooyVar;
        this.a = oqyVar;
    }

    @Override // defpackage.ouv, defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b.c) {
            ooy ooyVar = this.b;
            if (!ooyVar.b) {
                ooyVar.b = true;
                ooyVar.c.b++;
                super.close();
                this.a.c();
            }
        }
    }
}
