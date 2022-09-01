package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* renamed from: ock  reason: default package */
/* loaded from: classes2.dex */
final class ock extends WeakReference {
    private static final boolean a = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException b;
    private final ReferenceQueue c;
    private final ConcurrentMap d;
    private final String e;
    private final Reference f;
    private final AtomicBoolean g = new AtomicBoolean();

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        b = runtimeException;
    }

    public ock(ocl oclVar, nuf nufVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(oclVar, referenceQueue);
        RuntimeException runtimeException;
        if (a) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = b;
        }
        this.f = new SoftReference(runtimeException);
        this.e = nufVar.toString();
        this.c = referenceQueue;
        this.d = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    static void a(ReferenceQueue referenceQueue) {
        while (true) {
            ock ockVar = (ock) referenceQueue.poll();
            if (ockVar != null) {
                RuntimeException runtimeException = (RuntimeException) ockVar.f.get();
                ockVar.b();
                if (!ockVar.g.get()) {
                    Level level = Level.SEVERE;
                    if (ocl.a.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(ocl.a.getName());
                        logRecord.setParameters(new Object[]{ockVar.e});
                        logRecord.setThrown(runtimeException);
                        ocl.a.log(logRecord);
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void b() {
        super.clear();
        this.d.remove(this);
        this.f.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        b();
        a(this.c);
    }
}
