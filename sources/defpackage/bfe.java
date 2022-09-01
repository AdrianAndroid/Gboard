package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: bfe  reason: default package */
/* loaded from: classes.dex */
public final class bfe implements Handler.Callback {
    private final /* synthetic */ int a;

    public bfe(int i) {
        this.a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.a != 0) {
            if (message.what != 1) {
                return false;
            }
            ((axh) message.obj).e();
            return true;
        } else if (message.what != 1) {
            return false;
        } else {
            bff bffVar = (bff) message.obj;
            bffVar.a.l(bffVar);
            return true;
        }
    }
}
