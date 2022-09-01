package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: lbc  reason: default package */
/* loaded from: classes.dex */
final class lbc extends kzg {
    final /* synthetic */ Collection b;
    final /* synthetic */ Collection c;
    final /* synthetic */ lbg d;
    final /* synthetic */ fxa e;
    final /* synthetic */ jlt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbc(lbg lbgVar, fxa fxaVar, Collection collection, Collection collection2, jlt jltVar, fxa fxaVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(fxaVar, null);
        this.d = lbgVar;
        this.b = collection;
        this.c = collection2;
        this.f = jltVar;
        this.e = fxaVar2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.kzg
    protected final void b() {
        ArrayList c = lbg.c(this.b);
        Collection<String> collection = this.c;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        c.addAll(arrayList);
        try {
            this.f.l(2);
            lbg lbgVar = this.d;
            IInterface iInterface = lbgVar.b.k;
            String str2 = lbgVar.a;
            jlt jltVar = this.f;
            Bundle a = lbg.a();
            ArrayList arrayList2 = new ArrayList();
            for (kzc kzcVar : jltVar.a) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("event_type", kzcVar.a);
                bundle2.putLong("event_timestamp", kzcVar.b);
                arrayList2.add(bundle2);
            }
            a.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
            lbf lbfVar = new lbf(this.d, this.e, null);
            Parcel a2 = ((bkf) iInterface).a();
            a2.writeString(str2);
            a2.writeTypedList(c);
            bkh.d(a2, a);
            bkh.f(a2, lbfVar);
            ((bkf) iInterface).hJ(2, a2);
        } catch (RemoteException e) {
            lbg.c.f(e, "startInstall(%s,%s)", this.b, this.c);
            this.e.e(new RuntimeException(e));
        }
    }
}
