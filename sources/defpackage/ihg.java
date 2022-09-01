package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: ihg  reason: default package */
/* loaded from: classes.dex */
final class ihg extends Handler {
    public ihh a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a != null && message.what == 1) {
            ihh ihhVar = this.a;
            hhl hhlVar = ihh.a;
            ihhVar.p = null;
            this.a.q = 0;
        }
    }
}
