package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nzr  reason: default package */
/* loaded from: classes2.dex */
public final class nzr implements ocq {
    public final nvz b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public ocp f;
    public nvu h;
    private final Executor j;
    private nua k;
    private long l;
    private final ntm i = ntm.a(nzr.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();

    public nzr(Executor executor, nvz nvzVar) {
        this.j = executor;
        this.b = nvzVar;
    }

    private final nzq e(ntx ntxVar, nxp[] nxpVarArr) {
        int size;
        nzq nzqVar = new nzq(this, ntxVar, nxpVarArr, null, null, null);
        this.g.add(nzqVar);
        synchronized (this.a) {
            size = this.g.size();
        }
        if (size == 1) {
            this.b.b(this.c);
        }
        return nzqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(nua nuaVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.k = nuaVar;
            this.l++;
            if (nuaVar != null && b()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    nzq nzqVar = (nzq) arrayList.get(i);
                    ntx ntxVar = nzqVar.a;
                    ntw a = nuaVar.a();
                    nsa nsaVar = nzqVar.a.a;
                    nyx b = oao.b(a, nsaVar.f());
                    if (b != null) {
                        Executor executor = this.j;
                        Executor executor2 = nsaVar.c;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        Runnable p = nzqVar.p(b);
                        if (p != null) {
                            executor.execute(p);
                        }
                        arrayList2.add(nzqVar);
                    }
                }
                synchronized (this.a) {
                    if (!b()) {
                        return;
                    }
                    this.g.removeAll(arrayList2);
                    if (this.g.isEmpty()) {
                        this.g = new LinkedHashSet();
                    }
                    if (!b()) {
                        this.b.b(this.d);
                        if (this.h != null && (runnable = this.e) != null) {
                            this.b.b(runnable);
                            this.e = null;
                        }
                    }
                    this.b.a();
                }
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.ntr
    public final ntm c() {
        return this.i;
    }

    @Override // defpackage.ocq
    public final Runnable d(ocp ocpVar) {
        throw null;
    }

    @Override // defpackage.ocq
    public final void j(nvu nvuVar) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h != null) {
                return;
            }
            this.h = nvuVar;
            this.b.b(new nzp(this, 3));
            if (!b() && (runnable = this.e) != null) {
                this.b.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }

    @Override // defpackage.ocq
    public final void k(nvu nvuVar) {
        throw null;
    }

    @Override // defpackage.nyx
    public final nyu m(nuq nuqVar, num numVar, nsa nsaVar, nxp[] nxpVarArr) {
        nyu oadVar;
        nvz nvzVar;
        try {
            ntx ntxVar = new ntx(nuqVar, numVar, nsaVar);
            nua nuaVar = null;
            long j = -1;
            while (true) {
                synchronized (this.a) {
                    nvu nvuVar = this.h;
                    if (nvuVar == null) {
                        nua nuaVar2 = this.k;
                        if (nuaVar2 != null) {
                            if (nuaVar != null && j == this.l) {
                                oadVar = e(ntxVar, nxpVarArr);
                                nvzVar = this.b;
                                break;
                            }
                            j = this.l;
                            nyx b = oao.b(nuaVar2.a(), nsaVar.f());
                            if (b != null) {
                                oadVar = b.m(ntxVar.c, ntxVar.b, ntxVar.a, nxpVarArr);
                                nvzVar = this.b;
                                break;
                            }
                            nuaVar = nuaVar2;
                        } else {
                            oadVar = e(ntxVar, nxpVarArr);
                            nvzVar = this.b;
                            break;
                        }
                    } else {
                        oadVar = new oad(nvuVar, nxpVarArr, null, null, null);
                        nvzVar = this.b;
                        break;
                    }
                }
            }
            nvzVar.a();
            return oadVar;
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }
}
