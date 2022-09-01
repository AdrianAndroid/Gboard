package defpackage;

import android.os.Process;

/* compiled from: PG */
/* renamed from: xh  reason: default package */
/* loaded from: classes2.dex */
public final class xh extends Thread {
    private final int a = 10;

    public xh(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
