package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ozy  reason: default package */
/* loaded from: classes2.dex */
public final class ozy extends ozk {
    private final Handler a;
    private volatile boolean b;

    public ozy(Handler handler) {
        this.a = handler;
        ozv.a.a();
    }

    @Override // defpackage.ozu
    public final void d() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.ozk
    public final void im(pam pamVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (this.b) {
            return;
        }
        Handler handler = this.a;
        ozz ozzVar = new ozz(pamVar, handler);
        Message obtain = Message.obtain(handler, ozzVar);
        obtain.obj = this;
        this.a.sendMessageDelayed(obtain, timeUnit.toMillis(0L));
        if (!this.b) {
            return;
        }
        this.a.removeCallbacks(ozzVar);
    }
}
