package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* renamed from: agd  reason: default package */
/* loaded from: classes.dex */
public class agd extends agc {
    @Override // defpackage.agc
    public void h(Object obj) {
        agc.b("setValue");
        this.h++;
        this.f = obj;
        c(null);
    }

    public final void i(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.g;
            obj3 = agc.a;
            this.g = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        pp b = pp.b();
        Runnable runnable = this.i;
        fy fyVar = b.a;
        pq pqVar = (pq) fyVar;
        if (pqVar.b == null) {
            synchronized (pqVar.a) {
                if (((pq) fyVar).b == null) {
                    ((pq) fyVar).b = pq.b(Looper.getMainLooper());
                }
            }
        }
        pqVar.b.post(runnable);
    }
}
