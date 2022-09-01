package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: csm  reason: default package */
/* loaded from: classes.dex */
public final class csm implements npe {
    private final /* synthetic */ int a;
    private final Object b;

    public csm(jls jlsVar, int i) {
        this.a = i;
        this.b = jlsVar;
    }

    public csm(jlt jltVar, int i) {
        this.a = i;
        this.b = jltVar;
    }

    public csm(jlv jlvVar, int i) {
        this.a = i;
        this.b = jlvVar;
    }

    public csm(oiy oiyVar, int i) {
        this.a = i;
        this.b = oiyVar;
    }

    public static csm b(oiy oiyVar) {
        return new csm(oiyVar, 0);
    }

    public static csm c(oiy oiyVar) {
        return new csm(oiyVar, 1);
    }

    public static csm d(oiy oiyVar) {
        return new csm(oiyVar, 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, oiy] */
    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                csk b = cnx.b((llw) this.b.a(), ice.BODY);
                nxp.X(b);
                return b;
            case 1:
                return new cou(((csn) this.b).c(), null);
            case 2:
                csk b2 = cnx.b((llw) this.b.a(), ice.HEADER);
                nxp.X(b2);
                return b2;
            case 3:
                return new cws(((cui) this.b).a(), ciz.k(), ciz.c(), ciz.e());
            case 4:
                gms gmsVar = (gms) this.b.a();
                return new gni();
            case 5:
                return gni.a((lgb) ((npf) this.b).b);
            case 6:
                return gni.a((lgb) ((npf) this.b).b);
            case 7:
                return gni.a((lgb) ((npf) this.b).b);
            case 8:
                return lfb.f((bmr) ((npf) this.b).b);
            case 9:
                return new bll((blc) ((npf) this.b).b);
            case 10:
                ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) ((npf) this.b).b).getSystemService("connectivity");
                nxp.X(connectivityManager);
                return connectivityManager;
            case 11:
                return gni.a((lgb) ((npf) this.b).b);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return lfb.f((gkr) ((npf) this.b).b);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new bmf((gjz) this.b.a(), null);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return lfb.f((bml) ((npf) this.b).b);
            case 15:
                TelephonyManager telephonyManager = (TelephonyManager) ker.d((Context) ((npf) this.b).b, kmk.TAG_CLASSIC_SERVICES_TELEPHONY).getSystemService("phone");
                nxp.X(telephonyManager);
                return telephonyManager;
            case 16:
                WifiManager wifiManager = (WifiManager) ker.d((Context) ((npf) this.b).b, kmk.TAG_CLASSIC_SERVICES_WIFI).getSystemService("wifi");
                nxp.X(wifiManager);
                return wifiManager;
            case 17:
                return ((jls) this.b).a;
            case 18:
                Object obj = ((jls) this.b).b;
                nxp.X(obj);
                return obj;
            case 19:
                return ((jlt) this.b).a;
            default:
                lfb lfbVar = ((jlv) this.b).b;
                nxp.X(lfbVar);
                return lfbVar;
        }
    }
}
