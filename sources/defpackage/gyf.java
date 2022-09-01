package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gyf  reason: default package */
/* loaded from: classes.dex */
final class gyf implements Runnable {
    final /* synthetic */ gyj a;

    public gyf(gyj gyjVar) {
        this.a = gyjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gyh gyhVar = this.a.k;
        if (gyhVar != null) {
            gyhVar.d = true;
            if (gyhVar.b != null) {
                gyhVar.b.cancel(true);
            }
            this.a.k = null;
        }
        synchronized (this.a) {
            if (this.a.i.isEmpty()) {
                this.a.r();
                return;
            }
            ArrayList B = lre.B(this.a.i);
            this.a.k = new gyh(this.a, B);
            gyh gyhVar2 = this.a.k;
            mks c = gxo.c(10);
            Void[] voidArr = new Void[0];
            if (gyhVar2.c == 0) {
                gyhVar2.c = 1;
                gyhVar2.b = c.hQ(new gnq(gyhVar2, voidArr, 3));
                gyhVar2.b.d(new gxd(gyhVar2, 1), c);
                return;
            }
            throw new IllegalStateException("Cannot execute task: the task is already submitted.");
        }
    }
}
