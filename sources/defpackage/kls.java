package defpackage;

import java.util.List;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kls  reason: default package */
/* loaded from: classes.dex */
public final class kls extends olm implements okq {
    private final /* synthetic */ int v;
    public static final kls u = new kls(20);
    public static final kls t = new kls(19);
    public static final kls s = new kls(18);
    public static final kls r = new kls(17);
    public static final kls q = new kls(16);
    public static final kls p = new kls(15);
    public static final kls o = new kls(14);
    public static final kls n = new kls(13);
    public static final kls m = new kls(12);
    public static final kls l = new kls(11);
    public static final kls k = new kls(10);
    public static final kls j = new kls(9);
    public static final kls i = new kls(8);
    public static final kls h = new kls(7);
    public static final kls g = new kls(6);
    public static final kls f = new kls(5);
    public static final kls e = new kls(4);
    public static final kls d = new kls(3);
    public static final kls c = new kls(2);
    public static final kls b = new kls(1);
    public static final kls a = new kls(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kls(int i2) {
        super(1);
        this.v = i2;
    }

    @Override // defpackage.okq
    public final /* synthetic */ Object a(Object obj) {
        int parseInt;
        switch (this.v) {
            case 0:
                float[] fArr = (float[]) obj;
                oll.e(fArr, "it");
                if (fArr.length != 6) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                oll.e(fArr, "<this>");
                if (Math.abs(kmj.a(fArr) - 1.0f) < 1.0E-6f) {
                    return oji.a;
                }
                throw new IllegalArgumentException("Failed requirement.");
            case 1:
                hie hieVar = (hie) obj;
                oll.e(hieVar, "it");
                return hieVar.name();
            case 2:
                float floatValue = ((Number) obj).floatValue();
                if (floatValue < 0.0f) {
                    throw new IllegalStateException("Check failed.");
                }
                if (floatValue > 1.0f) {
                    throw new IllegalStateException("Check failed.");
                }
                return oji.a;
            case 3:
                String str = (String) obj;
                oll.e(str, "it");
                return "'" + str + "'";
            case 4:
                mzt mztVar = (mzt) obj;
                oll.e(mztVar, "it");
                return mztVar.c;
            case 5:
                mzt mztVar2 = (mzt) obj;
                oll.e(mztVar2, "it");
                return mztVar2.b;
            case 6:
                ojc ojcVar = (ojc) obj;
                oll.e(ojcVar, "<name for destructuring parameter 0>");
                return ojcVar.b;
            case 7:
                ojc ojcVar2 = (ojc) obj;
                oll.e(ojcVar2, "<name for destructuring parameter 0>");
                return ojcVar2.a;
            case 8:
                ojc ojcVar3 = (ojc) obj;
                oll.e(ojcVar3, "<name for destructuring parameter 0>");
                return nxp.s(nxp.n(ojcVar3.a), (List) ojcVar3.b);
            case 9:
                ojc ojcVar4 = (ojc) obj;
                oll.e(ojcVar4, "<name for destructuring parameter 0>");
                nap napVar = (nap) ojcVar4.a;
                String str2 = (String) ojcVar4.b;
                return str2 != null ? new nad(napVar, str2) : napVar;
            case 10:
                ojc ojcVar5 = (ojc) obj;
                oll.e(ojcVar5, "<name for destructuring parameter 0>");
                nap napVar2 = (nap) ojcVar5.a;
                for (ojc ojcVar6 : (List) ojcVar5.b) {
                    napVar2 = new nag(napVar2, (nap) ojcVar6.b, (nah) ojcVar6.a);
                }
                return napVar2;
            case 11:
                oll.e((oji) obj, "it");
                return nai.TRUE;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                oll.e((oji) obj, "it");
                return nai.FALSE;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                String str3 = (String) obj;
                oll.e(str3, "name");
                return new naj(str3);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ojc ojcVar7 = (ojc) obj;
                oll.e(ojcVar7, "<name for destructuring parameter 0>");
                return new nak((nap) ojcVar7.a, (nbx) ojcVar7.b);
            case 15:
                List list = (List) obj;
                oll.e(list, "ids");
                int size = list.size();
                if (size == 1) {
                    return new nal((String) list.get(0));
                }
                if (size != 2) {
                    if (size == 3) {
                        return new nal((String) list.get(0), (String) list.get(1), (String) list.get(2));
                    }
                    throw new IllegalStateException("Invalid identifier component count.");
                }
                String str4 = (String) list.get(0);
                String str5 = (String) list.get(1);
                oll.e(str4, "tableName");
                oll.e(str5, "columnName");
                return new nal(null, str4, str5);
            case 16:
                ojc ojcVar8 = (ojc) obj;
                oll.e(ojcVar8, "<name for destructuring parameter 0>");
                nbi nbiVar = (nbh) ojcVar8.a;
                oll.c(nbiVar, "null cannot be cast to non-null type com.google.intelligence.trieste.query.sql.SelectCoreOrCompound");
                for (ojc ojcVar9 : (List) ojcVar8.b) {
                    nbiVar = new nan(nbiVar, (nbh) ojcVar9.b, (nam) ojcVar9.a);
                }
                return nbiVar;
            case 17:
                String str6 = (String) obj;
                oll.e(str6, "it");
                return new nbz(ols.l(str6, "\"\"", "\""));
            case 18:
                String str7 = (String) obj;
                oll.e(str7, "string");
                String lowerCase = str7.toLowerCase(Locale.ROOT);
                oll.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                oll.e(lowerCase, "<this>");
                if (lowerCase.startsWith("0x")) {
                    String substring = str7.substring(2);
                    oll.d(substring, "this as java.lang.String).substring(startIndex)");
                    oll.l();
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str7);
                }
                return new naq(parseInt);
            case 19:
                List list2 = (List) obj;
                oll.e(list2, "it");
                return new nar(list2);
            default:
                ojc ojcVar10 = (ojc) obj;
                oll.e(ojcVar10, "<name for destructuring parameter 0>");
                nas nasVar = (nas) ojcVar10.a;
                List list3 = (List) ojcVar10.b;
                if (list3 == null) {
                    list3 = ojr.a;
                }
                return new nat(nasVar, list3);
        }
    }
}
