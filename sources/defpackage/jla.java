package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jla  reason: default package */
/* loaded from: classes.dex */
public final class jla implements jlk {
    public final Context a;
    public final jlu b;
    private final Executor c;
    private final jhy d;
    private final kqr e;

    public jla(Context context, jlu jluVar, kqr kqrVar, Executor executor, jhy jhyVar) {
        this.a = context;
        this.b = jluVar;
        this.e = kqrVar;
        this.c = executor;
        this.d = jhyVar;
    }

    @Override // defpackage.jlk
    public final mko a() {
        return this.e.b(jky.c, this.c);
    }

    public final mko b(jkr jkrVar, int i) {
        mko a;
        if (i <= jkrVar.d) {
            jkr a2 = jkr.a(i);
            int ordinal = a2.ordinal();
            if (ordinal == 1) {
                a = jnd.c(this.e.b(new jks(this, 14), this.c)).e(jky.d, this.c).a(IOException.class, new jky(5), this.c);
            } else if (ordinal == 2) {
                a = jnd.c(this.e.b(new jks(this, 16), this.c)).e(jkc.t, this.c).a(IOException.class, new jky(1), this.c);
            } else {
                String name = a2.name();
                a = kcu.J(new UnsupportedOperationException("Upgrade to version " + name + "not supported!"));
            }
            return jco.j(a, new dke(this, i, jkrVar, 3), this.c);
        }
        return kcu.K(true);
    }

    @Override // defpackage.jlk
    public final mko c() {
        AtomicReference atomicReference = new AtomicReference(new ArrayList());
        return jco.i(this.e.b(new jkz(this, atomicReference, 1), this.c), new jks(atomicReference, 13), this.c);
    }

    @Override // defpackage.jlk
    public final mko d() {
        if (kki.u(this.a)) {
            this.d.o();
            jkr a = jkr.a(2);
            jkr x = kki.x(this.a);
            int i = a.d;
            int i2 = x.d;
            if (i == i2) {
                return kcu.K(true);
            }
            if (i < i2) {
                jmk.d("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", x, a);
                String valueOf = String.valueOf(x);
                String valueOf2 = String.valueOf(a);
                new Exception("Downgraded file key from " + valueOf + " to " + valueOf2 + ".");
                kki.v(this.a, a);
                return kcu.K(false);
            }
            return jnd.c(b(a, i2 + 1)).b(Exception.class, new jko(this, a, 14), this.c).g(new jko(this, a, 15), this.c);
        }
        int i3 = jmk.a;
        kki.w(this.a);
        Context context = this.a;
        this.d.o();
        kki.v(context, jkr.a(2));
        return kcu.K(false);
    }

    @Override // defpackage.jlk
    public final mko e(jit jitVar) {
        return jco.i(this.e.a(), new jks(jez.D(jitVar, this.a), 15), this.c);
    }

    @Override // defpackage.jlk
    public final mko f(jit jitVar) {
        return jnd.c(this.e.b(new jks(jez.D(jitVar, this.a), 12), this.c)).e(jky.a, this.c).a(IOException.class, jky.b, this.c);
    }

    @Override // defpackage.jlk
    public final mko g(jit jitVar, jiu jiuVar) {
        return jnd.c(this.e.b(new jkz(jez.D(jitVar, this.a), jiuVar, 0), this.c)).e(jky.e, this.c).a(IOException.class, jky.f, this.c);
    }

    public final void h(jkr jkrVar) {
        if (kki.x(this.a).d == jkrVar.d || kki.v(this.a, jkrVar)) {
            return;
        }
        String valueOf = String.valueOf(jkrVar);
        jmk.a("Failed to commit migration version to disk. Fail to set target version to " + valueOf + ".");
        String valueOf2 = String.valueOf(jkrVar);
        new Exception("Fail to set target version " + valueOf2 + ".");
    }
}
