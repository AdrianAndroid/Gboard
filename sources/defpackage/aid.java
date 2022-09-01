package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aid  reason: default package */
/* loaded from: classes.dex */
public final class aid extends Handler {
    final /* synthetic */ aih a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aid(aih aihVar, Looper looper) {
        super(looper);
        this.a = aihVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.fM();
    }
}
