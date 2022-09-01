package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: lzi  reason: default package */
/* loaded from: classes.dex */
public final class lzi extends mik {
    public static final Object a = new Object();
    public final lgb b;
    public final lzf c;
    public final lfe d;
    public final lga e;
    public final lzh f;
    private final Executor j;
    public volatile int g = 0;
    private final AtomicReference k = new AtomicReference(kcu.K(new Object()));

    static {
        Logger.getLogger(lzi.class.getCanonicalName());
    }

    public lzi(lgb lgbVar, lzf lzfVar, lfe lfeVar, Executor executor, ScheduledExecutorService scheduledExecutorService, lgh lghVar, lzh lzhVar) {
        this.b = lgbVar;
        this.c = lzfVar;
        jdg.u(lfeVar);
        this.d = lfeVar;
        mkt mktVar = new mkt(this, executor, 1);
        this.j = mktVar;
        kcu.D(scheduledExecutorService);
        this.f = lzhVar;
        lga lgaVar = new lga(lghVar);
        lgaVar.e();
        this.e = lgaVar;
        e();
        d(new mkm(1), mktVar);
    }

    @Override // defpackage.mik
    protected final void a() {
        mko mkoVar = (mko) this.k.getAndSet(kcu.I());
        if (mkoVar != null) {
            boolean z = true;
            if (isCancelled() && !o()) {
                z = false;
            }
            mkoVar.cancel(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        String str;
        mko mkoVar = (mko) this.k.get();
        String obj = mkoVar.toString();
        String obj2 = this.b.toString();
        String obj3 = this.d.toString();
        String obj4 = this.c.toString();
        int i = this.g;
        if (mkoVar.isDone()) {
            str = "";
        } else {
            str = ", activeTry=[" + obj + "]";
        }
        return "futureSupplier=[" + obj2 + "], shouldContinue=[" + obj3 + "], strategy=[" + obj4 + "], tries=[" + i + "]" + str;
    }

    public final void e() {
        mld e = mld.e();
        mko h = mio.h((mko) this.k.getAndSet(e), new jzh(this, 14), this.j);
        e.p(mhu.h(h, Exception.class, new jmg(this, h, 8), this.j));
        e.d(new lzg(this, e), mjl.a);
    }
}
