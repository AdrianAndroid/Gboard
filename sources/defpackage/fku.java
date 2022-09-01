package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fku  reason: default package */
/* loaded from: classes.dex */
public final class fku implements fkv {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public fku(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.fkv
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        fjc fjcVar;
        if (iBinder == null) {
            fjcVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            fjcVar = queryLocalInterface instanceof fjc ? (fjc) queryLocalInterface : new fjc(iBinder);
        }
        String str = this.a;
        Bundle bundle = this.b;
        Parcel a = fjcVar.a();
        a.writeString(str);
        bkh.d(a, bundle);
        Parcel hG = fjcVar.hG(2, a);
        Bundle bundle2 = (Bundle) bkh.a(hG, Bundle.CREATOR);
        hG.recycle();
        fkw.h(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new fkr(string);
    }
}
