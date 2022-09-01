package defpackage;

import android.os.Process;

/* compiled from: PG */
/* renamed from: gxq  reason: default package */
/* loaded from: classes.dex */
public final class gxq extends Thread {
    final /* synthetic */ kbs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxq(kbs kbsVar, Runnable runnable, String str, byte[] bArr) {
        super(runnable, str);
        this.a = kbsVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a.a);
        super.run();
    }
}
