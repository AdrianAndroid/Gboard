package defpackage;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: owv  reason: default package */
/* loaded from: classes2.dex */
public final class owv implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public owv(owt owtVar, int i, byte[] bArr) {
        this.b = i;
        this.a = owtVar;
    }

    public owv(owz owzVar, int i) {
        this.b = i;
        this.a = owzVar;
    }

    public owv(oxa oxaVar, int i) {
        this.b = i;
        this.a = oxaVar;
    }

    public owv(pay payVar, int i) {
        this.b = i;
        this.a = payVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            oxa oxaVar = (oxa) this.a;
            oxaVar.f.add(oxaVar.m);
            ((oxa) this.a).j();
        } else if (i == 1) {
            ReadableByteChannel readableByteChannel = ((oxa) this.a).n;
            if (readableByteChannel == null) {
                return;
            }
            try {
                readableByteChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ((oxa) this.a).n = null;
        } else if (i == 2) {
            oxa oxaVar2 = (oxa) this.a;
            oxaVar2.m = oxaVar2.p;
            oxaVar2.p = null;
            oxaVar2.j();
        } else if (i == 3) {
            oxa oxaVar3 = (oxa) ((owt) this.a).b;
            owy owyVar = oxaVar3.b;
            owyVar.a(new oww(owyVar, oxaVar3.o, oxaVar3.p, 1));
        } else if (i != 4) {
            pay payVar = (pay) this.a;
            if (payVar.c.isEmpty()) {
                return;
            }
            long nanoTime = System.nanoTime();
            Iterator it = payVar.c.iterator();
            while (it.hasNext()) {
                pbb pbbVar = (pbb) it.next();
                if (pbbVar.a > nanoTime) {
                    return;
                }
                if (payVar.c.remove(pbbVar)) {
                    payVar.d.b(pbbVar);
                }
            }
        } else {
            synchronized (((owz) this.a).c) {
                Object obj = this.a;
                if (((owz) obj).d) {
                    return;
                }
                Runnable runnable = (Runnable) ((owz) obj).c.pollFirst();
                ((owz) this.a).d = runnable != null;
                while (runnable != null) {
                    try {
                        runnable.run();
                        synchronized (((owz) this.a).c) {
                            runnable = (Runnable) ((owz) this.a).c.pollFirst();
                            ((owz) this.a).d = runnable != null;
                        }
                    } catch (Throwable th) {
                        synchronized (((owz) this.a).c) {
                            Object obj2 = this.a;
                            ((owz) obj2).d = false;
                            try {
                                ((owz) obj2).a.execute(((owz) obj2).b);
                            } catch (RejectedExecutionException unused) {
                            }
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
