package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fzi  reason: default package */
/* loaded from: classes.dex */
public final class fzi implements fwi {
    private final fzr a;
    private final lgh b;
    private final long c;

    public fzi(fzr fzrVar) {
        this.a = fzrVar;
        lgh lghVar = ldt.a;
        this.b = lghVar;
        this.c = lghVar.a();
    }

    @Override // defpackage.fwi
    public final void a(int i, String str) {
        try {
            this.a.e(new Status(i, str), this.b.a() - this.c);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQueryFailure AIDL call failed, ignoring", e);
        }
    }

    @Override // defpackage.fwi
    public final void b(fwh fwhVar) {
        jdg.Q(fwhVar, "iterator must not be null");
        long a = this.b.a() - this.c;
        fzn fznVar = new fzn(fwhVar, this.b);
        try {
            this.a.f(fznVar, a);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQuerySuccess AIDL call failed, closing iterator", e);
            fznVar.e();
        }
    }
}
