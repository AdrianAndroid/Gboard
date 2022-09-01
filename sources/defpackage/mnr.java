package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* renamed from: mnr  reason: default package */
/* loaded from: classes2.dex */
public final class mnr extends fqg {
    private final Bundle a;

    public mnr(Bundle bundle) {
        super(null, false, 13202);
        this.a = bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqg
    public final /* bridge */ /* synthetic */ void a(fnr fnrVar, fxa fxaVar) {
        mnp mnpVar = (mnp) fnrVar;
        mnq mnqVar = new mnq(fxaVar, null);
        Bundle bundle = this.a;
        try {
            mnv mnvVar = (mnv) mnpVar.w();
            Parcel a = mnvVar.a();
            bkh.f(a, mnqVar);
            bkh.d(a, bundle);
            mnvVar.hI(2, a);
        } catch (RemoteException unused) {
        }
    }
}
