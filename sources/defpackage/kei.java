package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kei  reason: default package */
/* loaded from: classes.dex */
public final class kei implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;
    private final oiy d;
    private final oiy e;
    private final oiy f;
    private final oiy g;
    private final oiy h;
    private final oiy i;
    private final oiy j;
    private final /* synthetic */ int k;

    public kei(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7, oiy oiyVar8, oiy oiyVar9, oiy oiyVar10, int i) {
        this.k = i;
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
        this.d = oiyVar4;
        this.e = oiyVar5;
        this.f = oiyVar6;
        this.g = oiyVar7;
        this.h = oiyVar8;
        this.i = oiyVar9;
        this.j = oiyVar10;
    }

    public kei(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7, oiy oiyVar8, oiy oiyVar9, oiy oiyVar10, int i, byte[] bArr) {
        this.k = i;
        this.i = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
        this.e = oiyVar4;
        this.j = oiyVar5;
        this.f = oiyVar6;
        this.a = oiyVar7;
        this.g = oiyVar8;
        this.h = oiyVar9;
        this.d = oiyVar10;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        if (this.k == 0) {
            return new keh(((kds) this.a).a(), ((lba) this.b).b(), (Executor) this.c.a(), npd.b(this.d), ((gmy) this.e).b(), (kcl) this.f.a(), ((kho) this.g).a(), npd.b(this.h), (lfb) ((npf) this.i).b, this.j, null, null);
        }
        Context context = (Context) ((npf) this.i).b;
        gjz gjzVar = (gjz) this.b.a();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c.a();
        TelephonyManager telephonyManager = (TelephonyManager) this.e.a();
        WifiManager wifiManager = (WifiManager) this.j.a();
        gnn gnnVar = (gnn) ((npf) this.f).b;
        gnn gnnVar2 = (gnn) ((npf) this.a).b;
        gnn gnnVar3 = (gnn) ((npf) this.g).b;
        lfb lfbVar = (lfb) this.h.a();
        bvq bvqVar = (bvq) this.d.a();
        return new gms(context, connectivityManager, telephonyManager, wifiManager, gnnVar, gnnVar2, lfbVar);
    }
}
