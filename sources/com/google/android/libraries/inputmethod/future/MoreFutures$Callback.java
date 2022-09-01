package com.google.android.libraries.inputmethod.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MoreFutures$Callback implements aft, hix {
    private final AtomicReference a;
    private final afp b;
    private final Executor c;

    public MoreFutures$Callback(Executor executor, afp afpVar, hjf hjfVar) {
        this.c = executor;
        this.b = afpVar;
        this.a = new AtomicReference(hjfVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        hjf hjfVar = (hjf) this.a.get();
        int i = 0;
        if ((th instanceof CancellationException) || (th instanceof InterruptedException)) {
            ?? r0 = hjfVar.d;
            int i2 = ((lrl) r0).c;
            while (i < i2) {
                ((hiu) r0.get(i)).a(th);
                i++;
            }
            return;
        }
        ?? r02 = hjfVar.c;
        int i3 = ((lrl) r02).c;
        while (i < i3) {
            ((hiu) r02.get(i)).a(th);
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.mka
    public final void b(Object obj) {
        ?? r0 = ((hjf) this.a.get()).b;
        int i = ((lrl) r0).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((hiu) r0.get(i2)).a(obj);
        }
    }

    @Override // defpackage.hix
    public final void c(mko mkoVar) {
        kcu.U(mkoVar, this, this.c);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [afv, java.lang.Object] */
    @Override // defpackage.hix, java.lang.AutoCloseable
    public final void close() {
        ?? r0 = ((hjf) this.a.getAndSet(new hjf(null, llp.q(), llp.q(), llp.q()))).a;
        if (r0 != 0) {
            r0.I().d(this);
        }
    }

    @Override // defpackage.aft
    public final void hS(afv afvVar, afo afoVar) {
        if (!afvVar.I().a.a(this.b)) {
            close();
        }
    }
}
