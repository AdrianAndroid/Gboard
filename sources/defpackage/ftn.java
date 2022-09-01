package defpackage;

import android.os.Process;

/* compiled from: PG */
/* renamed from: ftn  reason: default package */
/* loaded from: classes.dex */
final class ftn extends Thread {
    public ftn(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
