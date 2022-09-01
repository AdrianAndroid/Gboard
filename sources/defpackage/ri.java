package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: ri  reason: default package */
/* loaded from: classes2.dex */
public abstract class ri implements mko {
    static final qy b;
    private static final Object d;
    volatile rc listeners;
    volatile Object value;
    volatile rh waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger c = Logger.getLogger(ri.class.getName());

    static {
        qy rgVar;
        try {
            rgVar = new re(AtomicReferenceFieldUpdater.newUpdater(rh.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(rh.class, rh.class, "next"), AtomicReferenceFieldUpdater.newUpdater(ri.class, rh.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(ri.class, rc.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(ri.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            rgVar = new rg();
        }
        b = rgVar;
        if (th != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    static Object a(mko mkoVar) {
        if (mkoVar instanceof ri) {
            Object obj = ((ri) mkoVar).value;
            if (!(obj instanceof qz)) {
                return obj;
            }
            qz qzVar = (qz) obj;
            if (!qzVar.c) {
                return obj;
            }
            Throwable th = qzVar.d;
            return th != null ? new qz(false, th) : qz.b;
        }
        boolean isCancelled = mkoVar.isCancelled();
        if ((!a) & isCancelled) {
            return qz.b;
        }
        try {
            Object b2 = b(mkoVar);
            return b2 == null ? d : b2;
        } catch (CancellationException e) {
            if (!isCancelled) {
                new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ").append(mkoVar);
                return new rb(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(mkoVar)), e));
            }
            return new qz(false, e);
        } catch (ExecutionException e2) {
            return new rb(e2.getCause());
        } catch (Throwable th2) {
            return new rb(th2);
        }
    }

    static Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ri riVar) {
        rc rcVar;
        rc rcVar2;
        rc rcVar3 = null;
        while (true) {
            rh rhVar = riVar.waiters;
            if (b.e(riVar, rhVar, rh.a)) {
                while (rhVar != null) {
                    Thread thread = rhVar.thread;
                    if (thread != null) {
                        rhVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    rhVar = rhVar.next;
                }
                do {
                    rcVar = riVar.listeners;
                } while (!b.c(riVar, rcVar, rc.a));
                while (true) {
                    rcVar2 = rcVar3;
                    rcVar3 = rcVar;
                    if (rcVar3 != null) {
                        rcVar = rcVar3.next;
                        rcVar3.next = rcVar2;
                    }
                }
                while (rcVar2 != null) {
                    rcVar3 = rcVar2.next;
                    Runnable runnable = rcVar2.b;
                    if (runnable instanceof rf) {
                        rf rfVar = (rf) runnable;
                        riVar = rfVar.a;
                        if (riVar.value == rfVar) {
                            if (b.d(riVar, rfVar, a(rfVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        j(runnable, rcVar2.c);
                    }
                    rcVar2 = rcVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj) {
        obj.getClass();
    }

    private final String h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void i(StringBuilder sb) {
        try {
            Object b2 = b(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(b2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = c;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    private final void k(rh rhVar) {
        rhVar.thread = null;
        while (true) {
            rh rhVar2 = this.waiters;
            if (rhVar2 != rh.a) {
                rh rhVar3 = null;
                while (rhVar2 != null) {
                    rh rhVar4 = rhVar2.next;
                    if (rhVar2.thread != null) {
                        rhVar3 = rhVar2;
                    } else if (rhVar3 != null) {
                        rhVar3.next = rhVar4;
                        if (rhVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, rhVar2, rhVar4)) {
                        break;
                    }
                    rhVar2 = rhVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object l(Object obj) {
        if (obj instanceof qz) {
            Throwable th = ((qz) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof rb) {
            throw new ExecutionException(((rb) obj).b);
        } else {
            if (obj != d) {
                return obj;
            }
            return null;
        }
    }

    protected String c() {
        Object obj = this.value;
        if (obj instanceof rf) {
            return "setFuture=[" + h(((rf) obj).b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        qz qzVar;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof rf)) {
            if (a) {
                qzVar = new qz(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                qzVar = qz.a;
            } else {
                qzVar = qz.b;
            }
            boolean z2 = false;
            ri riVar = this;
            while (true) {
                if (b.d(riVar, obj, qzVar)) {
                    e(riVar);
                    if (!(obj instanceof rf)) {
                        break;
                    }
                    mko mkoVar = ((rf) obj).b;
                    if (mkoVar instanceof ri) {
                        riVar = (ri) mkoVar;
                        obj = riVar.value;
                        if (!(obj == null) && !(obj instanceof rf)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        mkoVar.cancel(z);
                        break;
                    }
                } else {
                    obj = riVar.value;
                    if (!(obj instanceof rf)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.mko
    public final void d(Runnable runnable, Executor executor) {
        g(runnable);
        g(executor);
        rc rcVar = this.listeners;
        if (rcVar != rc.a) {
            rc rcVar2 = new rc(runnable, executor);
            do {
                rcVar2.next = rcVar;
                if (b.c(this, rcVar, rcVar2)) {
                    return;
                }
                rcVar = this.listeners;
            } while (rcVar != rc.a);
            j(runnable, executor);
        }
        j(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (b.d(this, null, obj)) {
            e(this);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (java.lang.Thread.interrupted() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        r0 = r6.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        if ((r4 & (!(r0 instanceof defpackage.rf))) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        return l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
        k(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get() {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r6.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof defpackage.rf
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = l(r0)
            return r0
        L1a:
            rh r0 = r6.waiters
            rh r3 = defpackage.rh.a
            if (r0 == r3) goto L5a
            rh r3 = new rh
            r3.<init>()
        L25:
            r3.a(r0)
            qy r4 = defpackage.ri.b
            boolean r0 = r4.e(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.value
            if (r0 == 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = 0
        L40:
            boolean r5 = r0 instanceof defpackage.rf
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = l(r0)
            return r0
        L4b:
            r6.k(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            rh r0 = r6.waiters
            rh r4 = defpackage.rh.a
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.value
            java.lang.Object r0 = l(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            goto L68
        L67:
            throw r0
        L68:
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri.get():java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof qz;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof rf)) & (obj != null);
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            try {
                concat = c();
            } catch (RuntimeException e) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                Class<?> cls = e.getClass();
                sb2.append(cls);
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (concat == null || concat.isEmpty()) {
                if (isDone()) {
                    i(sb);
                } else {
                    sb.append("PENDING");
                }
            } else {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r18, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (java.lang.Thread.interrupted() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        r4 = r18.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r4 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        if ((r5 & (!(r4 instanceof defpackage.rf))) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        if (r4 >= 1000) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        k(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
        return l(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
        k(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
