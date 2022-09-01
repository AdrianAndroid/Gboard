package defpackage;

import android.view.View;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import j$.util.Collection$EL;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dzr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dzr implements leq {
    private final /* synthetic */ int v;
    public static final /* synthetic */ dzr u = new dzr(20);
    public static final /* synthetic */ dzr t = new dzr(19);
    public static final /* synthetic */ dzr s = new dzr(18);
    public static final /* synthetic */ dzr r = new dzr(17);
    public static final /* synthetic */ dzr q = new dzr(16);
    public static final /* synthetic */ dzr p = new dzr(15);
    public static final /* synthetic */ dzr o = new dzr(14);
    public static final /* synthetic */ dzr n = new dzr(13);
    public static final /* synthetic */ dzr m = new dzr(12);
    public static final /* synthetic */ dzr l = new dzr(11);
    public static final /* synthetic */ dzr k = new dzr(10);
    public static final /* synthetic */ dzr j = new dzr(9);
    public static final /* synthetic */ dzr i = new dzr(8);
    public static final /* synthetic */ dzr h = new dzr(7);
    public static final /* synthetic */ dzr g = new dzr(6);
    public static final /* synthetic */ dzr f = new dzr(5);
    public static final /* synthetic */ dzr e = new dzr(4);
    public static final /* synthetic */ dzr d = new dzr(3);
    public static final /* synthetic */ dzr c = new dzr(2);
    public static final /* synthetic */ dzr b = new dzr(1);
    public static final /* synthetic */ dzr a = new dzr(0);

    private /* synthetic */ dzr(int i2) {
        this.v = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                ltg ltgVar = ContentSuggestionKeyboard.a;
                return ((dzq) obj).d().a;
            case 1:
                return ((dzq) obj).c();
            case 2:
                return dzq.e((dzp) obj);
            case 3:
                ltg ltgVar2 = ContentSuggestionKeyboard.a;
                return Integer.valueOf(((dzq) obj).b() - 1);
            case 4:
                ltg ltgVar3 = ContentSuggestionKeyboard.a;
                return new eaf((View) obj, b);
            case 5:
                return new cuu((View) obj);
            case 6:
                ltg ltgVar4 = ContentSuggestionKeyboard.a;
                return ((dzq) obj).a().a;
            case 7:
                return (cqp) lre.ad((llp) obj);
            case 8:
                cqo h2 = ((cqp) obj).h();
                h2.e(mbr.EMOJI_KITCHEN_MIX);
                return dzp.a(h2.a(), dzo.MIX_QUERY);
            case 9:
                llp llpVar = (llp) obj;
                if (((Boolean) dzn.m.c()).booleanValue()) {
                    llpVar = fgy.o(llpVar);
                }
                return (llp) Collection$EL.stream(llpVar).map(dwn.j).collect(ljr.a);
            case 10:
                dzq dzqVar = (dzq) obj;
                return atk.HIGH;
            case 11:
                return ((mwv) obj).a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                if (((ebd) obj).b() - 1 == 0) {
                    return 1;
                }
                return 0;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((ece) obj).a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                llp llpVar2 = (llp) obj;
                int i2 = ecp.a;
                if (llpVar2 != null) {
                    llpVar2.size();
                    return Integer.valueOf(llpVar2.size());
                }
                return 0;
            case 15:
                String str = (String) obj;
                str.getClass();
                return new ecf(str);
            case 16:
                ltg ltgVar5 = ede.a;
                return Integer.valueOf(((ecz) obj).b() - 1);
            case 17:
                return new cuu((View) obj);
            case 18:
                return llp.i(lre.aa((llp) obj, ((Long) edl.l.c()).intValue()));
            case 19:
                int b2 = ((edw) obj).b() - 1;
                if (b2 == 0) {
                    return 0;
                }
                if (b2 == 1) {
                    return 2;
                }
                return 1;
            default:
                return llp.i(lre.aa((llp) obj, ((Long) efy.p.c()).intValue()));
        }
    }
}
