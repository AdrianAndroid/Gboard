package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gni  reason: default package */
/* loaded from: classes.dex */
public final class gni {
    public static lfb a(final lgb lgbVar) {
        if (lgbVar == null) {
            return ldu.a;
        }
        Objects.requireNonNull(lgbVar);
        return lfb.g(new nox() { // from class: gnh
            @Override // defpackage.nox
            public final Object a() {
                return lgb.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(Object obj, nox noxVar) {
        return obj != null ? obj : noxVar.a();
    }

    public static mko c(gen genVar) {
        final gkt gktVar = new gkt(genVar);
        genVar.g(mjl.a, new gej() { // from class: gks
            @Override // defpackage.gej
            public final void a(gen genVar2) {
                gkt gktVar2 = gkt.this;
                if (((ger) genVar2).c) {
                    gktVar2.cancel(false);
                } else if (genVar2.e()) {
                    gktVar2.c(genVar2.c());
                } else {
                    Exception b = genVar2.b();
                    if (b != null) {
                        gktVar2.n(b);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return gktVar;
    }

    public static gen d(Exception exc) {
        ger gerVar = new ger();
        gerVar.n(exc);
        return gerVar;
    }

    public static gen e(Object obj) {
        ger gerVar = new ger();
        gerVar.o(obj);
        return gerVar;
    }

    public static gen f(Collection collection) {
        if (collection.isEmpty()) {
            return e(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((gen) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        ger gerVar = new ger();
        geu geuVar = new geu(collection.size(), gerVar);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            h((gen) it2.next(), geuVar);
        }
        return gerVar;
    }

    public static Object g(gen genVar) {
        if (!genVar.e()) {
            if (((ger) genVar).c) {
                throw new CancellationException("Task is already canceled");
            }
            throw new ExecutionException(genVar.b());
        }
        return genVar.c();
    }

    public static void h(gen genVar, get getVar) {
        genVar.l(gep.b, getVar);
        genVar.h(gep.b, getVar);
        genVar.f(gep.b, getVar);
    }

    public static void i(fpo fpoVar, Status status, jns jnsVar) {
        try {
            fpoVar.b(status);
        } catch (RemoteException e) {
            jnsVar.j(e, "Unexpected RemoteException");
        }
    }

    public static void j(fyz fyzVar, fpo fpoVar, Executor executor, jns jnsVar, Context context) {
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(fyzVar);
        kcu.U(kcu.P(new clc(fyzVar, 5), executor), new bpn(fpoVar, jnsVar, executor, applicationContext, 7), executor);
    }
}
