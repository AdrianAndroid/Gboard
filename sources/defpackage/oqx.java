package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oqx  reason: default package */
/* loaded from: classes2.dex */
public final class oqx extends orc {
    final /* synthetic */ oqy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqx(oqy oqyVar, ovn ovnVar) {
        super(ovnVar);
        this.a = oqyVar;
    }

    @Override // defpackage.orc
    protected final void c() {
        synchronized (this.a.c) {
            this.a.d();
        }
    }
}
