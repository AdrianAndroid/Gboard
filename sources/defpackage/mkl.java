package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mkl  reason: default package */
/* loaded from: classes.dex */
public final class mkl extends AbstractOwnableSynchronizer implements Runnable {
    private final mkn a;

    public mkl(mkn mknVar) {
        this.a = mknVar;
    }

    public final void a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }
}
