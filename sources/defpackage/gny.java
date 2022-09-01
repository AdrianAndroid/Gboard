package defpackage;

/* compiled from: PG */
/* renamed from: gny  reason: default package */
/* loaded from: classes.dex */
final class gny extends gob {
    private final gpb c;

    public gny(goc gocVar, mox moxVar, String str, bmc bmcVar, blq blqVar, gpa gpaVar, gpb gpbVar, gnx gnxVar) {
        super(gocVar, moxVar, str, bmcVar, blqVar, gpaVar, gnxVar);
        this.c = gpbVar;
    }

    @Override // defpackage.gnz
    protected final void a() {
        if (!this.a) {
            return;
        }
        throw new InterruptedException();
    }

    @Override // defpackage.gob
    protected final boolean b(gou gouVar) {
        this.c.b().a();
        return false;
    }
}
