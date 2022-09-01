package defpackage;

/* compiled from: PG */
/* renamed from: oeh  reason: default package */
/* loaded from: classes2.dex */
final class oeh extends oef {
    @Override // defpackage.oef
    public final boolean a(oei oeiVar) {
        synchronized (oeiVar) {
            if (oeiVar.runState == 0) {
                oeiVar.runState = -1;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.oef
    public final void b(oei oeiVar) {
        synchronized (oeiVar) {
            oeiVar.runState = 0;
        }
    }
}
