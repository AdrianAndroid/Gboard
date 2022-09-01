package defpackage;

/* compiled from: PG */
/* renamed from: mid  reason: default package */
/* loaded from: classes.dex */
final class mid extends mhv {
    @Override // defpackage.mhv
    public final mhz a(mik mikVar, mhz mhzVar) {
        mhz mhzVar2;
        synchronized (mikVar) {
            mhzVar2 = mikVar.listeners;
            if (mhzVar2 != mhzVar) {
                mikVar.listeners = mhzVar;
            }
        }
        return mhzVar2;
    }

    @Override // defpackage.mhv
    public final mij b(mik mikVar, mij mijVar) {
        mij mijVar2;
        synchronized (mikVar) {
            mijVar2 = mikVar.waiters;
            if (mijVar2 != mijVar) {
                mikVar.waiters = mijVar;
            }
        }
        return mijVar2;
    }

    @Override // defpackage.mhv
    public final void c(mij mijVar, mij mijVar2) {
        mijVar.next = mijVar2;
    }

    @Override // defpackage.mhv
    public final void d(mij mijVar, Thread thread) {
        mijVar.thread = thread;
    }

    @Override // defpackage.mhv
    public final boolean e(mik mikVar, mhz mhzVar, mhz mhzVar2) {
        synchronized (mikVar) {
            if (mikVar.listeners == mhzVar) {
                mikVar.listeners = mhzVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.mhv
    public final boolean f(mik mikVar, Object obj, Object obj2) {
        synchronized (mikVar) {
            if (mikVar.value == obj) {
                mikVar.value = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.mhv
    public final boolean g(mik mikVar, mij mijVar, mij mijVar2) {
        synchronized (mikVar) {
            if (mikVar.waiters == mijVar) {
                mikVar.waiters = mijVar2;
                return true;
            }
            return false;
        }
    }
}
