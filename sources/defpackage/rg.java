package defpackage;

/* compiled from: PG */
/* renamed from: rg  reason: default package */
/* loaded from: classes2.dex */
final class rg extends qy {
    @Override // defpackage.qy
    public final void a(rh rhVar, rh rhVar2) {
        rhVar.next = rhVar2;
    }

    @Override // defpackage.qy
    public final void b(rh rhVar, Thread thread) {
        rhVar.thread = thread;
    }

    @Override // defpackage.qy
    public final boolean c(ri riVar, rc rcVar, rc rcVar2) {
        synchronized (riVar) {
            if (riVar.listeners == rcVar) {
                riVar.listeners = rcVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.qy
    public final boolean d(ri riVar, Object obj, Object obj2) {
        synchronized (riVar) {
            if (riVar.value == obj) {
                riVar.value = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.qy
    public final boolean e(ri riVar, rh rhVar, rh rhVar2) {
        synchronized (riVar) {
            if (riVar.waiters == rhVar) {
                riVar.waiters = rhVar2;
                return true;
            }
            return false;
        }
    }
}
