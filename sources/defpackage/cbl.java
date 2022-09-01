package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cbl  reason: default package */
/* loaded from: classes.dex */
public final class cbl implements Runnable {
    public final msf a;
    private final cbm b;
    private final mrw c;
    private final msh d;
    private final ifn e;
    private final long f;
    private final long g;
    private final boolean h;
    private boolean k = false;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean(false);

    public cbl(cbm cbmVar, mrw mrwVar, msf msfVar, msh mshVar, boolean z, long j, long j2, ifn ifnVar) {
        this.b = cbmVar;
        this.c = mrwVar;
        this.a = msfVar;
        this.d = mshVar;
        this.h = z;
        this.f = j;
        this.g = j2;
        this.e = ifnVar;
    }

    public final void a() {
        synchronized (cbk.a) {
            this.k = true;
            run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return !this.i.get();
    }

    public final boolean c() {
        return this.j.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (cbk.a) {
            cbk.c(SystemClock.elapsedRealtime() - elapsedRealtime, true);
            boolean L = this.b.L(this.c, this.a, this.d, this.h, this.f, this.g, this.e);
            if (L && this.a == msf.OPERATION_DECODE_GESTURE_END) {
                this.b.u(false);
            }
            if (L && this.a == msf.OPERATION_FETCH_SUGGESTIONS) {
                this.b.v(false);
            }
            this.j.set(L);
            this.i.set(true);
            if (!this.k) {
                if (this.a == msf.OPERATION_DECODE_GESTURE_END) {
                    cbm cbmVar = this.b;
                    if (cbmVar.d) {
                        cbmVar.a.hO().e(cap.WAIT_FOR_DECODE_GESTURE, true, Boolean.valueOf(L));
                        cbmVar.d = false;
                    }
                } else if (this.a == msf.OPERATION_FETCH_SUGGESTIONS) {
                    cbm cbmVar2 = this.b;
                    if (cbmVar2.e) {
                        cbmVar2.a.hO().e(cap.WAIT_FOR_FETCH_SUGGESTIONS, true, Boolean.valueOf(L));
                        cbmVar2.e = false;
                    }
                }
            }
        }
    }
}
