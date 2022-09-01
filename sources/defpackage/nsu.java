package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nsu  reason: default package */
/* loaded from: classes2.dex */
public class nsu {
    public static final Logger c = Logger.getLogger(nsu.class.getName());
    public static final nsu d = new nsu();
    final nsn e;
    public final nvg f;
    public final int g;

    private nsu() {
        this.e = null;
        this.f = null;
        this.g = 0;
        e(0);
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static nsu k() {
        nsu a = nss.a.a();
        return a == null ? d : a;
    }

    public static void l(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }

    public static nsr m() {
        return new nsr();
    }

    public nsu a() {
        nsu b = nss.a.b(this);
        return b == null ? d : b;
    }

    public nsv b() {
        nsn nsnVar = this.e;
        if (nsnVar == null) {
            return null;
        }
        return nsnVar.a;
    }

    public Throwable c() {
        nsn nsnVar = this.e;
        if (nsnVar == null) {
            return null;
        }
        return nsnVar.c();
    }

    public void d(nso nsoVar, Executor executor) {
        l(nsoVar, "cancellationListener");
        l(executor, "executor");
        nsn nsnVar = this.e;
        if (nsnVar == null) {
            return;
        }
        nsnVar.e(new nsq(executor, nsoVar, this));
    }

    public void f(nsu nsuVar) {
        l(nsuVar, "toAttach");
        nss.a.c(this, nsuVar);
    }

    public void g(nso nsoVar) {
        nsn nsnVar = this.e;
        if (nsnVar == null) {
            return;
        }
        nsnVar.h(nsoVar, this);
    }

    public boolean i() {
        nsn nsnVar = this.e;
        if (nsnVar == null) {
            return false;
        }
        return nsnVar.i();
    }

    public nsu(nsu nsuVar, nvg nvgVar) {
        nsn nsnVar;
        if (nsuVar instanceof nsn) {
            nsnVar = (nsn) nsuVar;
        } else {
            nsnVar = nsuVar.e;
        }
        this.e = nsnVar;
        this.f = nvgVar;
        int i = nsuVar.g + 1;
        this.g = i;
        e(i);
    }

    public nsu(nvg nvgVar, int i) {
        this.e = null;
        this.f = nvgVar;
        this.g = i;
        e(i);
    }
}
