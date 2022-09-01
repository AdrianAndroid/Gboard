package defpackage;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hdp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hdp implements leq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hdp(int i) {
        this.b = i;
        this.a = "en-US";
    }

    public /* synthetic */ hdp(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ hdp(hcz hczVar, int i) {
        this.b = i;
        this.a = hczVar;
    }

    public /* synthetic */ hdp(hie hieVar, int i) {
        this.b = i;
        this.a = hieVar;
    }

    public /* synthetic */ hdp(hiu hiuVar, int i) {
        this.b = i;
        this.a = hiuVar;
    }

    public /* synthetic */ hdp(hkb hkbVar, int i) {
        this.b = i;
        this.a = hkbVar;
    }

    public /* synthetic */ hdp(hqt hqtVar, int i) {
        this.b = i;
        this.a = hqtVar;
    }

    public /* synthetic */ hdp(hrx hrxVar, int i) {
        this.b = i;
        this.a = hrxVar;
    }

    public /* synthetic */ hdp(idn idnVar, int i) {
        this.b = i;
        this.a = idnVar;
    }

    public /* synthetic */ hdp(iif iifVar, int i) {
        this.b = i;
        this.a = iifVar;
    }

    public /* synthetic */ hdp(ipr iprVar, int i) {
        this.b = i;
        this.a = iprVar;
    }

    public /* synthetic */ hdp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public /* synthetic */ hdp(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ hdp(Collection collection, int i) {
        this.b = i;
        this.a = collection;
    }

    public /* synthetic */ hdp(Map map, int i) {
        this.b = i;
        this.a = map;
    }

    public /* synthetic */ hdp(Set set, int i) {
        this.b = i;
        this.a = set;
    }

    public /* synthetic */ hdp(lfe lfeVar, int i) {
        this.b = i;
        this.a = lfeVar;
    }

    public /* synthetic */ hdp(ict[] ictVarArr, int i) {
        this.b = i;
        this.a = ictVarArr;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, lfe] */
    /* JADX WARN: Type inference failed for: r0v27, types: [hiu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, hqt] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, hcz] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.leq
    public final Object a(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                llw llwVar = (llw) obj;
                lug lugVar = hdq.a;
                llk e = llp.e();
                for (Integer num : hdq.d((Context) obj2, hdq.b)) {
                    llp llpVar = (llp) llwVar.get(Integer.valueOf(num.intValue()));
                    if (llpVar != null) {
                        int size = llpVar.size();
                        int i2 = 0;
                        while (i2 < size) {
                            hds hdsVar = (hds) llpVar.get(i2);
                            hdq.e(e, hdsVar.a);
                            e.h(hdsVar.a);
                            llp llpVar2 = hdsVar.b;
                            int size2 = llpVar2.size();
                            int i3 = 0;
                            while (true) {
                                i = i2 + 1;
                                if (i3 < size2) {
                                    hdq.e(e, (String) llpVar2.get(i3));
                                    i3++;
                                }
                            }
                            i2 = i;
                        }
                    }
                }
                return lmz.p(e.g());
            case 1:
                llp llpVar3 = (llp) obj;
                return llpVar3.isEmpty() ? llp.r(icu.o(this.a.d())) : llpVar3;
            case 2:
                Object obj3 = this.a;
                Void r11 = (Void) obj;
                ltg ltgVar = hhu.a;
                return obj3;
            case 3:
                Object obj4 = this.a;
                Void r112 = (Void) obj;
                ltg ltgVar2 = hhu.a;
                return obj4;
            case 4:
                Object obj5 = this.a;
                Void r113 = (Void) obj;
                ltg ltgVar3 = hhu.a;
                return obj5;
            case 5:
                Object obj6 = this.a;
                ltg ltgVar4 = hhu.a;
                return obj6;
            case 6:
                ?? r0 = this.a;
                hij hijVar = (hij) obj;
                nfh nfhVar = (nfh) hijVar.N(5);
                nfhVar.cG(hijVar);
                for (hhl hhlVar : r0) {
                    for (hie hieVar : hie.values()) {
                        ijk.d(nfhVar, hhlVar, hieVar);
                    }
                }
                return (hij) nfhVar.cz();
            case 7:
                Object obj7 = this.a;
                hij hijVar2 = (hij) obj;
                nfh nfhVar2 = (nfh) hijVar2.N(5);
                nfhVar2.cG(hijVar2);
                int i4 = ((hie) obj7).g;
                for (hif hifVar : Collections.unmodifiableMap(Collections.unmodifiableMap(((hij) nfhVar2.b).a)).values()) {
                    String str = hifVar.b;
                    nfh nfhVar3 = (nfh) hifVar.N(5);
                    nfhVar3.cG(hifVar);
                    nfhVar3.cT(i4);
                    nfhVar2.cU(str, (hif) nfhVar3.cz());
                }
                return (hij) nfhVar2.cz();
            case 8:
                Object obj8 = this.a;
                Throwable th = (Throwable) obj;
                ltg ltgVar5 = hiz.a;
                return obj8;
            case 9:
                ?? r02 = this.a;
                ltg ltgVar6 = hiz.a;
                if (r02.a(obj)) {
                    throw new IllegalStateException("result is invalid");
                }
                return obj;
            case 10:
                ?? r03 = this.a;
                ltg ltgVar7 = hiz.a;
                r03.a(obj);
                return null;
            case 11:
                return Boolean.valueOf(((hkb) this.a).c.containsKey(((hlf) obj).a));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj9 = this.a;
                hrb hrbVar = (hrb) obj;
                if (hrbVar == null) {
                    return null;
                }
                return (iav) hrbVar.a.get(obj9);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return hrj.c(this.a, (String) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj10 = this.a;
                hqt hqtVar = (hqt) obj;
                ltg ltgVar8 = hrx.a;
                if (hqtVar == null) {
                    throw new NullPointerException("The default entry of default language " + ((String) obj10) + "is null");
                }
                return llp.r(hqtVar);
            case 15:
                ?? r04 = this.a;
                hqt hqtVar2 = (hqt) obj;
                ltg ltgVar9 = hrx.a;
                if (hqtVar2 != null && r04.h().equals(hqtVar2.h())) {
                    return hqtVar2.g();
                }
                return null;
            case 16:
                llp llpVar4 = (llp) obj;
                hrx hrxVar = (hrx) this.a;
                if (hrxVar.x == null) {
                    return llp.o(llpVar4);
                }
                llk e2 = llp.e();
                e2.j(llpVar4);
                e2.j(hrxVar.x);
                return e2.g();
            case 17:
                return llp.i(lre.Z(this.a, new ein((lmz) obj, 13)));
            case 18:
                ArrayList arrayList = new ArrayList(((ict[]) this.a).length);
                for (List list : (List) obj) {
                    arrayList.addAll(list);
                }
                return (ict[]) lre.ak(arrayList, ict.class);
            case 19:
                return new iio((fws) obj, (iif) this.a, iio.b(), null, null);
            default:
                Object obj11 = this.a;
                Cursor cursor = (Cursor) obj;
                osr a = ipb.a();
                ipr iprVar = (ipr) obj11;
                a.a = iprVar.b;
                int i5 = 0;
                while (true) {
                    String[] strArr = iprVar.i;
                    if (i5 < strArr.length) {
                        String str2 = strArr[i5];
                        ngf ngfVar = iprVar.j[i5];
                        if (str2.equals("_blob_")) {
                            a.b = cursor.getBlob(i5);
                        } else {
                            ngf ngfVar2 = ngf.VOID;
                            switch (ngfVar.ordinal()) {
                                case 1:
                                    a.x().D(str2, cursor.getInt(i5));
                                    continue;
                                case 2:
                                    a.s(str2, cursor.getLong(i5));
                                    continue;
                                case 3:
                                    a.x().a.put(str2, Float.valueOf(cursor.getFloat(i5)));
                                    continue;
                                case 4:
                                    a.x().a.put(str2, Double.valueOf(cursor.getDouble(i5)));
                                    continue;
                                case 5:
                                    a.x().C(str2, cursor.getInt(i5) != 0);
                                    continue;
                                case 6:
                                    a.x().E(str2, lfd.d(cursor.getString(i5)));
                                    continue;
                                case 7:
                                    a.x().a.put(str2, nem.u(cursor.getBlob(i5)));
                                    continue;
                                case 8:
                                    a.x().D(str2, cursor.getInt(i5));
                                    continue;
                            }
                        }
                        i5++;
                    } else {
                        return a.r();
                    }
                }
                break;
        }
    }
}
