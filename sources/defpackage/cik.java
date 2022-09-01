package defpackage;

import android.content.Context;
import android.util.Printer;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cik  reason: default package */
/* loaded from: classes.dex */
public final class cik implements AutoCloseable, gzv {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final Executor b;
    public final idk c;
    public final daz d;
    public final cvx e;
    private final hzr f;
    private final hhk g;
    private final cvg h;

    public cik(Context context, cvx cvxVar, cqu cquVar, Executor executor, idk idkVar) {
        this.e = cvxVar;
        this.b = executor;
        this.c = idkVar;
        int a = a();
        eiy eiyVar = new eiy(idkVar, cvxVar, cquVar, executor, 1);
        bzg bzgVar = bzg.d;
        cii ciiVar = cii.a;
        if (a <= 0) {
            throw new IllegalStateException("maxSize <= 0");
        }
        daz dazVar = new daz(a, eiyVar, ciiVar, bzgVar);
        this.d = dazVar;
        this.f = icu.k(new bxj(this, 7), executor);
        bvl bvlVar = new bvl(this, 5);
        this.g = bvlVar;
        Objects.requireNonNull(dazVar);
        this.h = cvg.a(context, new cbq(dazVar, 7));
        cit.z.f(bvlVar, executor);
    }

    public static int a() {
        return Math.max(1, ((Long) cit.z.c()).intValue());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.a.getAndSet(true)) {
            return;
        }
        cit.z.g(this.g);
        this.h.close();
        this.f.e();
        this.d.d();
        this.d.e(1);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.a.get();
        printer.println("closed = " + z2);
        int b = this.d.b();
        printer.println("size = " + b);
        int a = this.d.a();
        printer.println("maxSize = " + a);
        int hitCount = this.d.a.hitCount();
        printer.println("hitCount = " + hitCount);
        int missCount = this.d.a.missCount();
        printer.println("missCount = " + missCount);
        int createCount = this.d.a.createCount();
        printer.println("createCount = " + createCount);
        int evictionCount = this.d.a.evictionCount();
        printer.println("evictionCount = " + evictionCount);
        int putCount = this.d.a.putCount();
        printer.println("putCount = " + putCount);
        if (!z) {
            printer.println("keys=".concat(lex.c(',').f(fhr.x(this.d.a.snapshot().entrySet(), bzg.c, bou.j))));
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "BitmojiSearchCache";
    }
}
