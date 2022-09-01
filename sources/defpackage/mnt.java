package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* renamed from: mnt  reason: default package */
/* loaded from: classes2.dex */
public final class mnt extends fqg {
    private final String a;
    private final moi e;

    public mnt(moi moiVar, String str) {
        super(null, false, 13201);
        this.a = str;
        this.e = moiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqg
    public final /* bridge */ /* synthetic */ void a(fnr fnrVar, fxa fxaVar) {
        mnp mnpVar = (mnp) fnrVar;
        mns mnsVar = new mns(this.e, fxaVar, null);
        String str = this.a;
        try {
            mnv mnvVar = (mnv) mnpVar.w();
            Parcel a = mnvVar.a();
            bkh.f(a, mnsVar);
            a.writeString(str);
            mnvVar.hI(1, a);
        } catch (RemoteException unused) {
        }
    }
}
