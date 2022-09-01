package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: nbp  reason: default package */
/* loaded from: classes2.dex */
public final class nbp extends olm implements okq {
    private final /* synthetic */ int v;
    public static final nbp u = new nbp(20);
    public static final nbp t = new nbp(19);
    public static final nbp s = new nbp(18);
    public static final nbp r = new nbp(17);
    public static final nbp q = new nbp(16);
    public static final nbp p = new nbp(15);
    public static final nbp o = new nbp(14);
    public static final nbp n = new nbp(13);
    public static final nbp m = new nbp(12);
    public static final nbp l = new nbp(11);
    public static final nbp k = new nbp(10);
    public static final nbp j = new nbp(9);
    public static final nbp i = new nbp(8);
    public static final nbp h = new nbp(7);
    public static final nbp g = new nbp(6);
    public static final nbp f = new nbp(5);
    public static final nbp e = new nbp(4);
    public static final nbp d = new nbp(3);
    public static final nbp c = new nbp(2);
    public static final nbp b = new nbp(1);
    public static final nbp a = new nbp(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbp(int i2) {
        super(1);
        this.v = i2;
    }

    @Override // defpackage.okq
    public final /* synthetic */ Object a(Object obj) {
        boolean z = false;
        switch (this.v) {
            case 0:
                ojc ojcVar = (ojc) obj;
                oll.e(ojcVar, "<name for destructuring parameter 0>");
                return new nav((nau) ojcVar.a, (nap) ojcVar.b);
            case 1:
                ojc ojcVar2 = (ojc) obj;
                oll.e(ojcVar2, "<name for destructuring parameter 0>");
                return new nau((nbk) ojcVar2.a, (List) ojcVar2.b);
            case 2:
                ojc ojcVar3 = (ojc) obj;
                oll.e(ojcVar3, "<name for destructuring parameter 0>");
                nao naoVar = (nao) ojcVar3.a;
                Iterator it = ((List) ojcVar3.b).iterator();
                while (true) {
                    nao naoVar2 = naoVar;
                    if (!it.hasNext()) {
                        return naoVar2;
                    }
                    ojf ojfVar = (ojf) it.next();
                    naoVar = new naw(naoVar2, (nao) ojfVar.b, (naz) ojfVar.a, (ndb) ojfVar.c, null, null);
                }
            case 3:
                nap napVar = (nap) obj;
                oll.e(napVar, "it");
                return new nax(napVar);
            case 4:
                List<String> list = (List) obj;
                oll.e(list, "columns");
                ArrayList arrayList = new ArrayList(nxp.u(list));
                for (String str : list) {
                    arrayList.add(new nal(str));
                }
                return new nay(arrayList);
            case 5:
                ojc ojcVar4 = (ojc) obj;
                oll.e(ojcVar4, "<name for destructuring parameter 0>");
                return new nba((nap) ojcVar4.a, (nap) ojcVar4.b);
            case 6:
                oll.e((oji) obj, "it");
                return nbb.a;
            case 7:
                String str2 = (String) obj;
                oll.e(str2, "it");
                return new nbc(str2);
            case 8:
                List<ojc> list2 = (List) obj;
                oll.e(list2, "expressions");
                ArrayList arrayList2 = new ArrayList(nxp.u(list2));
                for (ojc ojcVar5 : list2) {
                    nap napVar2 = (nap) ojcVar5.a;
                    nbf nbfVar = (nbf) ojcVar5.b;
                    if (nbfVar == null) {
                        nbfVar = nbf.ASC;
                    }
                    arrayList2.add(new ojc(napVar2, nbfVar));
                }
                return new nbe(arrayList2);
            case 9:
                oll.e((oji) obj, "it");
                return nbf.ASC;
            case 10:
                oll.e((oji) obj, "it");
                return nbf.DESC;
            case 11:
                ojf ojfVar2 = (ojf) obj;
                oll.e(ojfVar2, "<name for destructuring parameter 0>");
                return new nbg((nbi) ojfVar2.a, (nbe) ojfVar2.b, (nba) ojfVar2.c);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ojc ojcVar6 = (ojc) obj;
                oll.e(ojcVar6, "<name for destructuring parameter 0>");
                return new nbh((List) ojcVar6.a, (nbj) ojcVar6.b);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                oll.e((String) obj, "it");
                return naf.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                String str3 = (String) obj;
                oll.e(str3, "it");
                return new nbz(ols.l(str3, "''", "'"));
            case 15:
                List list3 = (List) obj;
                oll.e(list3, "ids");
                int size = list3.size();
                if (size != 1) {
                    if (size == 2) {
                        return new nca((String) list3.get(0), (String) list3.get(1));
                    }
                    throw new IllegalStateException("Invalid identifier component count");
                }
                String str4 = (String) list3.get(0);
                oll.e(str4, "tableName");
                return new nca(null, str4);
            case 16:
                ojc ojcVar7 = (ojc) obj;
                oll.e(ojcVar7, "<name for destructuring parameter 0>");
                nao naoVar3 = (nao) ojcVar7.a;
                String str5 = (String) ojcVar7.b;
                return str5 != null ? new nae(naoVar3, str5) : naoVar3;
            case 17:
                ojc ojcVar8 = (ojc) obj;
                oll.e(ojcVar8, "<name for destructuring parameter 0>");
                return new ncb((nap) ojcVar8.b, (ncc) ojcVar8.a);
            case 18:
                ojc ojcVar9 = (ojc) obj;
                oll.e(ojcVar9, "<name for destructuring parameter 0>");
                return new ncd((nao) ojcVar9.a, (nap) ojcVar9.b);
            case 19:
                if (obj == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                String str6 = (String) obj;
                oll.e(str6, "line");
                return str6;
        }
    }
}
