package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oip  reason: default package */
/* loaded from: classes2.dex */
public final class oip extends ois {
    private final nvu a;

    public oip(nvu nvuVar) {
        jdg.Q(nvuVar, "status");
        this.a = nvuVar;
    }

    @Override // defpackage.nua
    public final ntw a() {
        return this.a.k() ? ntw.a : ntw.b(this.a);
    }

    @Override // defpackage.ois
    public final boolean b(ois oisVar) {
        if (oisVar instanceof oip) {
            oip oipVar = (oip) oisVar;
            if (jdg.W(this.a, oipVar.a)) {
                return true;
            }
            return this.a.k() && oipVar.a.k();
        }
        return false;
    }

    public final String toString() {
        lfa R = jdg.R(oip.class);
        R.b("status", this.a);
        return R.toString();
    }
}
