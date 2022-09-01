package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: gfn  reason: default package */
/* loaded from: classes.dex */
public final class gfn extends fra {
    private final AtomicReference s = new AtomicReference();

    public gfn(Context context, Looper looper, fqs fqsVar, fob fobVar, foc focVar) {
        super(context, looper, 41, fqsVar, fobVar, focVar);
    }

    public final void H(gdo gdoVar, gdo gdoVar2, fov fovVar) {
        gfm gfmVar = new gfm((gfj) w(), fovVar, gdoVar2, null);
        if (gdoVar == null) {
            if (gdoVar2 == null) {
                fovVar.h();
                return;
            } else {
                ((gfj) w()).e(gdoVar2, gfmVar);
                return;
            }
        }
        gfj gfjVar = (gfj) w();
        Parcel a = gfjVar.a();
        bkh.f(a, gdoVar);
        bkh.f(a, gfmVar);
        gfjVar.hI(10, a);
    }

    @Override // defpackage.fra, defpackage.fqq, defpackage.fnw
    public final int a() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return queryLocalInterface instanceof gfj ? (gfj) queryLocalInterface : new gfj(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.fqq
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fqq
    public final fmv[] h() {
        return gex.c;
    }

    @Override // defpackage.fqq, defpackage.fnw
    public final void l() {
        try {
            gdo gdoVar = (gdo) this.s.getAndSet(null);
            if (gdoVar != null) {
                gfl gflVar = new gfl();
                gfj gfjVar = (gfj) w();
                Parcel a = gfjVar.a();
                bkh.f(a, gdoVar);
                bkh.f(a, gflVar);
                gfjVar.hI(5, a);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.l();
    }
}
