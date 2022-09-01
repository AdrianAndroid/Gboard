package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsi  reason: default package */
/* loaded from: classes.dex */
public final class dsi extends Handler {
    long a = System.nanoTime();

    public dsi(Looper looper) {
        super(looper);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, dsj] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dsj dsjVar;
        if (message.obj.getClass() == dsl.class) {
            dsl dslVar = (dsl) message.obj;
            dslVar.b.a(null, (iay) dslVar.a);
            return;
        }
        dsh dshVar = (dsh) message.obj;
        if (dshVar.a - this.a <= 0 || (dsjVar = dshVar.e) == null) {
            return;
        }
        dsjVar.a(dshVar.c, dshVar.d);
    }
}
