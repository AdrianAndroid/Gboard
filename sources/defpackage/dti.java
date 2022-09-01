package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: dti  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dti implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dti(long j, cwm cwmVar, int i) {
        this.c = i;
        this.a = j;
        this.b = cwmVar;
    }

    public /* synthetic */ dti(dtj dtjVar, long j, int i) {
        this.c = i;
        this.b = dtjVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            Object obj = this.b;
            dtj dtjVar = (dtj) obj;
            if (dtjVar.b != this.a) {
                return;
            }
            dtjVar.c = SystemClock.elapsedRealtime();
            dtjVar.a.run();
            return;
        }
        long j = this.a;
        Object obj2 = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        ((ltd) ((ltd) cwn.a.b()).k("com/google/android/apps/inputmethod/libs/expression/sticker/ExpressiveStickerClientSupplier$ExpressiveStickerClients", "lambda$sync$2", 423, "ExpressiveStickerClientSupplier.java")).C("sync(): Completed in %dms for %s", elapsedRealtime, obj2);
        ieh.j().g(ctg.EXPRESSIVE_STICKER_CLIENT_SYNC, elapsedRealtime);
    }
}
