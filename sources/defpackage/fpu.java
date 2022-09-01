package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fpu  reason: default package */
/* loaded from: classes.dex */
public final class fpu implements gej {
    private final fpj a;
    private final int b;
    private final Cfor c;
    private final long d;
    private final long e;

    public fpu(fpj fpjVar, int i, Cfor cfor, long j, long j2) {
        this.a = fpjVar;
        this.b = i;
        this.c = cfor;
        this.d = j;
        this.e = j2;
    }

    public static fqv b(fpg fpgVar, fqq fqqVar, int i) {
        int[] iArr;
        int[] iArr2;
        fqu fquVar = fqqVar.m;
        fqv fqvVar = fquVar == null ? null : fquVar.d;
        if (fqvVar == null || !fqvVar.b || ((iArr = fqvVar.d) != null ? !fyb.A(iArr, i) : !((iArr2 = fqvVar.f) == null || !fyb.A(iArr2, i))) || fpgVar.h >= fqvVar.e) {
            return null;
        }
        return fqvVar;
    }

    @Override // defpackage.gej
    public final void a(gen genVar) {
        fpg b;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5;
        if (!this.a.g()) {
            return;
        }
        frt frtVar = frs.a().a;
        if ((frtVar != null && !frtVar.b) || (b = this.a.b(this.c)) == null) {
            return;
        }
        fnw fnwVar = b.b;
        if (!(fnwVar instanceof fqq)) {
            return;
        }
        boolean z = true;
        int i6 = 0;
        boolean z2 = this.d > 0;
        fqq fqqVar = (fqq) fnwVar;
        int i7 = fqqVar.i;
        if (frtVar != null) {
            z2 &= frtVar.c;
            int i8 = frtVar.d;
            int i9 = frtVar.e;
            i = frtVar.a;
            if (fqqVar.B() && !fqqVar.n()) {
                fqv b2 = b(b, fqqVar, this.b);
                if (b2 == null) {
                    return;
                }
                if (!b2.c || this.d <= 0) {
                    z = false;
                }
                i9 = b2.e;
                z2 = z;
            }
            i2 = i8;
            i3 = i9;
        } else {
            i = 0;
            i2 = 5000;
            i3 = 100;
        }
        fpj fpjVar = this.a;
        if (genVar.e()) {
            i4 = 0;
        } else {
            if (((ger) genVar).c) {
                i6 = 100;
            } else {
                Exception b3 = genVar.b();
                if (b3 instanceof fnx) {
                    Status status = ((fnx) b3).a;
                    int i10 = status.f;
                    fmt fmtVar = status.i;
                    i4 = fmtVar == null ? -1 : fmtVar.c;
                    i6 = i10;
                } else {
                    i6 = 101;
                }
            }
            i4 = -1;
        }
        if (z2) {
            long j3 = this.d;
            long currentTimeMillis = System.currentTimeMillis();
            i5 = (int) (SystemClock.elapsedRealtime() - this.e);
            j = j3;
            j2 = currentTimeMillis;
        } else {
            j = 0;
            j2 = 0;
            i5 = -1;
        }
        fro froVar = new fro(this.b, i6, i4, j, j2, null, null, i7, i5);
        Handler handler = fpjVar.m;
        handler.sendMessage(handler.obtainMessage(18, new fpv(froVar, i, i2, i3)));
    }
}
