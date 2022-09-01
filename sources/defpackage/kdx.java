package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kdx  reason: default package */
/* loaded from: classes.dex */
public final class kdx {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    private final lga d;
    private volatile Process e;
    public volatile boolean c = false;
    public final leq b = new kdw(this, 0);

    public kdx(lgh lghVar) {
        this.d = lga.c(lghVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (this.e != null) {
            try {
                if (this.e.exitValue() != 0) {
                    this.c = true;
                    this.e = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.c) {
            return;
        }
        synchronized (this) {
            lga lgaVar = this.d;
            if (lgaVar.a && lgaVar.a(TimeUnit.MILLISECONDS) < a) {
                return;
            }
            this.d.d();
            this.d.e();
            this.e = (Process) this.b.a(str);
        }
    }
}
