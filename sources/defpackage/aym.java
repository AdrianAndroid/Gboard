package defpackage;

import android.os.Process;

/* compiled from: PG */
/* renamed from: aym  reason: default package */
/* loaded from: classes.dex */
final class aym extends Thread {
    public aym(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
