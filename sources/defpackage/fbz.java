package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: fbz  reason: default package */
/* loaded from: classes.dex */
final class fbz {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManagerWrapper");
    public final Context b;
    public final ScheduledExecutorService d;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final Object f = new Object();

    public fbz(Context context) {
        mks c = gxo.c(19);
        this.b = context;
        this.d = c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final fby c(Context context, jbw jbwVar) {
        return new fby(context, jbwVar);
    }

    public final fby a() {
        fby fbyVar;
        synchronized (this.f) {
            fbyVar = (fby) this.c.get();
        }
        return fbyVar;
    }

    public final void b(fby fbyVar) {
        synchronized (this.f) {
            this.c.set(fbyVar);
        }
    }
}
