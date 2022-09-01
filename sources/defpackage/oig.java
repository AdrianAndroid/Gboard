package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oig  reason: default package */
/* loaded from: classes2.dex */
public final class oig {
    static final boolean a;
    public static final nrz b;
    private static final Logger c = Logger.getLogger(oig.class.getName());

    static {
        boolean z = false;
        if (!lfd.e(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            z = true;
        }
        a = z;
        b = nrz.a("internal-stub-type");
    }

    private oig() {
    }

    public static mko a(nsd nsdVar, Object obj) {
        oia oiaVar = new oia(nsdVar);
        e(nsdVar, obj, new oif(oiaVar));
        return oiaVar;
    }

    public static oin b(nsd nsdVar, oin oinVar) {
        ohz ohzVar = new ohz(nsdVar);
        f(nsdVar, new oic(oinVar, ohzVar));
        return ohzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static Object c(nsb nsbVar, nuq nuqVar, nsa nsaVar, Object obj) {
        RuntimeException e;
        Error e2;
        oie oieVar = new oie();
        nsd a2 = nsbVar.a(nuqVar, nsaVar.d(b, oid.BLOCKING).a(oieVar));
        ?? r4 = 0;
        try {
            try {
                try {
                    mko a3 = a(a2, obj);
                    while (!a3.isDone()) {
                        try {
                            try {
                                oie.b();
                                Runnable runnable = (Runnable) oieVar.poll();
                                if (runnable == null) {
                                    oieVar.b = Thread.currentThread();
                                    while (true) {
                                        try {
                                            runnable = (Runnable) oieVar.poll();
                                            if (runnable != null) {
                                                break;
                                            }
                                            LockSupport.park(oieVar);
                                            oie.b();
                                        } catch (Throwable th) {
                                            oieVar.b = null;
                                            throw th;
                                            break;
                                        }
                                    }
                                    oieVar.b = null;
                                }
                                do {
                                    oie.a(runnable);
                                    runnable = (Runnable) oieVar.poll();
                                } while (runnable != null);
                            } catch (InterruptedException e3) {
                                try {
                                    a2.b("Thread interrupted", e3);
                                    r4 = true;
                                } catch (Error e4) {
                                    e2 = e4;
                                    throw d(a2, e2);
                                } catch (RuntimeException e5) {
                                    e = e5;
                                    throw d(a2, e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    r4 = 1;
                                    if (r4 != 0) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Error e6) {
                            e2 = e6;
                        } catch (RuntimeException e7) {
                            ?? r42 = r4 == true ? 1 : 0;
                            ?? r43 = r4 == true ? 1 : 0;
                            e = e7;
                        }
                    }
                    oieVar.b = oie.a;
                    while (true) {
                        Runnable runnable2 = (Runnable) oieVar.poll();
                        if (runnable2 != null) {
                            oie.a(runnable2);
                        } else {
                            try {
                                break;
                            } catch (InterruptedException e8) {
                                Thread.currentThread().interrupt();
                                throw nvu.c.f("Thread interrupted").e(e8).h();
                            } catch (ExecutionException e9) {
                                Throwable cause = e9.getCause();
                                jdg.Q(cause, "t");
                                for (Throwable th3 = cause; th3 != null; th3 = th3.getCause()) {
                                    if (th3 instanceof nvv) {
                                        throw new nvw(((nvv) th3).a, null);
                                    }
                                    if (th3 instanceof nvw) {
                                        nvw nvwVar = (nvw) th3;
                                        throw new nvw(nvwVar.a, nvwVar.b);
                                    }
                                }
                                throw nvu.d.f("unexpected exception").e(cause).h();
                            }
                        }
                    }
                    Object obj2 = a3.get();
                    if (r4 != false) {
                        Thread.currentThread().interrupt();
                    }
                    return obj2;
                } catch (Throwable th4) {
                    th = th4;
                    r4 = obj;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Error e10) {
            e2 = e10;
        } catch (RuntimeException e11) {
            e = e11;
        }
    }

    private static RuntimeException d(nsd nsdVar, Throwable th) {
        try {
            nsdVar.b(null, th);
        } catch (Throwable th2) {
            c.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void e(nsd nsdVar, Object obj, oib oibVar) {
        f(nsdVar, oibVar);
        try {
            nsdVar.e(obj);
            nsdVar.c();
        } catch (Error e) {
            throw d(nsdVar, e);
        } catch (RuntimeException e2) {
            throw d(nsdVar, e2);
        }
    }

    private static void f(nsd nsdVar, oib oibVar) {
        nsdVar.a(oibVar, new num());
        oibVar.Y();
    }
}
