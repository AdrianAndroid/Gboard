package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mlh  reason: default package */
/* loaded from: classes.dex */
public final class mlh extends mju {
    public mko a;
    public ScheduledFuture b;

    public mlh(mko mkoVar) {
        jdg.u(mkoVar);
        this.a = mkoVar;
    }

    @Override // defpackage.mik
    protected final void a() {
        m(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        mko mkoVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (mkoVar != null) {
            String str = "inputFuture=[" + mkoVar + "]";
            if (scheduledFuture == null) {
                return str;
            }
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay <= 0) {
                return str;
            }
            return str + ", remaining delay=[" + delay + " ms]";
        }
        return null;
    }
}
