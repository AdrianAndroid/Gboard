package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: fxi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fxi {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public fxi(dbn dbnVar, hfl hflVar, long j) {
        this.b = dbnVar;
        this.c = hflVar;
        this.a = j;
    }

    public /* synthetic */ fxi(fxj fxjVar, byte[] bArr, long j) {
        this.b = fxjVar;
        this.c = bArr;
        this.a = j;
    }

    public final void a(byte[] bArr, boolean z) {
        Object obj = this.b;
        Object obj2 = this.c;
        long j = this.a;
        fxj fxjVar = (fxj) obj;
        long addAndGet = fxjVar.d.addAndGet(fxjVar.b.a() - fxjVar.c.get());
        fxp fxpVar = fxjVar.a;
        if (true != z) {
            obj2 = null;
        }
        fxpVar.e(bArr, z, (byte[]) obj2, true != z ? 0L : j, true != z ? 0L : addAndGet);
        if (!z) {
            fxjVar.c.set(fxjVar.b.a());
        }
    }

    public final void b(hsy hsyVar, ibz ibzVar, boolean z) {
        if (z) {
            this.b.getClass().getSimpleName();
        } else {
            this.b.getClass().getSimpleName();
            ((dbn) this.b).hw(hsyVar);
        }
        dbn dbnVar = (dbn) this.b;
        if (!dbnVar.R()) {
            ((ltd) ((ltd) dbn.b.d()).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension$2", "onKeyboardReady", 288, "AbstractOpenableExtension.java")).G("%s is already deactivated when keyboard %s is ready.", this.b.getClass().getSimpleName(), ibzVar);
            return;
        }
        if (dbnVar.h && dbnVar.e != null) {
            dbnVar.K();
        }
        dbn dbnVar2 = (dbn) this.b;
        dbnVar2.f = ibzVar;
        dbnVar2.e = hsyVar;
        dbnVar2.m((hfl) this.c);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dbn dbnVar3 = (dbn) this.b;
        dbnVar3.g.g(dbnVar3.U(3), elapsedRealtime - this.a);
    }
}
