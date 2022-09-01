package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: ndi  reason: default package */
/* loaded from: classes2.dex */
public final class ndi {
    public final Object a;
    public Object b;

    private ndi(byte[] bArr) {
        this.a = new AtomicReference(mkk.a);
        this.b = new nzv((byte[]) null, (byte[]) null);
    }

    public static ndi c() {
        return new ndi(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ndj ndjVar) {
        ((ArrayList) this.a).add(ndjVar);
        int size = ((ArrayList) this.a).size();
        StringBuilder sb = new StringBuilder();
        sb.append(size);
        ndjVar.e = sb.toString();
    }

    public final mko b(mix mixVar, Executor executor) {
        jdg.u(mixVar);
        jdg.u(executor);
        final mjt mjtVar = new mjt(executor, this, null);
        mjr mjrVar = new mjr(mjtVar, mixVar, 0);
        final mld e = mld.e();
        final mko mkoVar = (mko) ((AtomicReference) this.a).getAndSet(e);
        final mlk e2 = mlk.e(mjrVar);
        mkoVar.d(e2, mjtVar);
        final mko L = kcu.L(e2);
        Runnable runnable = new Runnable() { // from class: mjp
            @Override // java.lang.Runnable
            public final void run() {
                mlk mlkVar = mlk.this;
                mld mldVar = e;
                mko mkoVar2 = mkoVar;
                mko mkoVar3 = L;
                mjt mjtVar2 = mjtVar;
                if (mlkVar.isDone()) {
                    mldVar.p(mkoVar2);
                } else if (!mkoVar3.isCancelled() || !mjtVar2.compareAndSet(mjs.NOT_RUN, mjs.CANCELLED)) {
                } else {
                    mlkVar.cancel(false);
                }
            }
        };
        L.d(runnable, mjl.a);
        e2.d(runnable, mjl.a);
        return L;
    }

    public ndi() {
        this.a = new ArrayList();
        this.b = "";
    }
}
