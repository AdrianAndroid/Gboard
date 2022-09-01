package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: lbd  reason: default package */
/* loaded from: classes.dex */
final class lbd extends kzg {
    final /* synthetic */ List b;
    final /* synthetic */ lbg c;
    final /* synthetic */ fxa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbd(lbg lbgVar, fxa fxaVar, List list, fxa fxaVar2, byte[] bArr) {
        super(fxaVar, null);
        this.c = lbgVar;
        this.b = list;
        this.d = fxaVar2;
    }

    @Override // defpackage.kzg
    protected final void b() {
        try {
            lbg lbgVar = this.c;
            IInterface iInterface = lbgVar.b.k;
            String str = lbgVar.a;
            ArrayList c = lbg.c(this.b);
            Bundle a = lbg.a();
            lbe lbeVar = new lbe(this.c, this.d, null);
            Parcel a2 = ((bkf) iInterface).a();
            a2.writeString(str);
            a2.writeTypedList(c);
            bkh.d(a2, a);
            bkh.f(a2, lbeVar);
            ((bkf) iInterface).hJ(8, a2);
        } catch (RemoteException e) {
            lbg.c.f(e, "deferredInstall(%s)", this.b);
            this.d.e(new RuntimeException(e));
        }
    }
}
