package defpackage;

import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cae  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cae implements lth {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cae(Keyboard keyboard, int i) {
        this.b = i;
        this.a = keyboard;
    }

    public /* synthetic */ cae(dqi dqiVar, int i) {
        this.b = i;
        this.a = dqiVar;
    }

    public /* synthetic */ cae(mrq mrqVar, int i) {
        this.b = i;
        this.a = mrqVar;
    }

    public /* synthetic */ cae(mrw mrwVar, int i) {
        this.b = i;
        this.a = mrwVar;
    }

    public /* synthetic */ cae(msz mszVar, int i) {
        this.b = i;
        this.a = mszVar;
    }

    public /* synthetic */ cae(mtc mtcVar, int i) {
        this.b = i;
        this.a = mtcVar;
    }

    public /* synthetic */ cae(mua muaVar, int i) {
        this.b = i;
        this.a = muaVar;
    }

    public /* synthetic */ cae(nfh nfhVar, int i) {
        this.b = i;
        this.a = nfhVar;
    }

    public /* synthetic */ cae(int[] iArr, int i) {
        this.b = i;
        this.a = iArr;
    }

    public /* synthetic */ cae(idm[] idmVarArr, int i) {
        this.b = i;
        this.a = idmVarArr;
    }

    public /* synthetic */ cae(idr[] idrVarArr, int i) {
        this.b = i;
        this.a = idrVarArr;
    }

    public /* synthetic */ cae(String[] strArr, int i) {
        this.b = i;
        this.a = strArr;
    }

    @Override // defpackage.lth
    public final Object a() {
        mrw mrwVar = null;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                lug lugVar = caj.a;
                return cbt.e((mrw) obj);
            case 1:
                Object obj2 = this.a;
                lug lugVar2 = caj.a;
                mtc mtcVar = (mtc) obj2;
                if ((mtcVar.a & 2) != 0 && (mrwVar = mtcVar.c) == null) {
                    mrwVar = mrw.h;
                }
                return cbt.e(mrwVar);
            case 2:
                Object obj3 = this.a;
                lug lugVar3 = caj.a;
                mua muaVar = (mua) obj3;
                if ((muaVar.a & 2) != 0 && (mrwVar = muaVar.c) == null) {
                    mrwVar = mrw.h;
                }
                return cbt.e(mrwVar);
            case 3:
                Object obj4 = this.a;
                lug lugVar4 = caj.a;
                msz mszVar = (msz) obj4;
                if ((mszVar.a & 2) != 0 && (mrwVar = mszVar.c) == null) {
                    mrwVar = mrw.h;
                }
                return cbt.e(mrwVar);
            case 4:
                Object obj5 = this.a;
                lug lugVar5 = caj.a;
                mtc mtcVar2 = (mtc) obj5;
                if ((mtcVar2.a & 2) != 0 && (mrwVar = mtcVar2.c) == null) {
                    mrwVar = mrw.h;
                }
                return cbt.e(mrwVar);
            case 5:
                Object obj6 = this.a;
                lug lugVar6 = caj.a;
                mrw mrwVar2 = ((mrq) obj6).b;
                if (mrwVar2 == null) {
                    mrwVar2 = mrw.h;
                }
                return cbt.e(mrwVar2);
            case 6:
                Object obj7 = this.a;
                lug lugVar7 = caj.a;
                mua muaVar2 = (mua) obj7;
                if ((muaVar2.a & 2) != 0 && (mrwVar = muaVar2.c) == null) {
                    mrwVar = mrw.h;
                }
                return cbt.e(mrwVar);
            case 7:
                Object obj8 = this.a;
                lug lugVar8 = caj.a;
                msz mszVar2 = (msz) obj8;
                if ((mszVar2.a & 2) != 0 && (mrwVar = mszVar2.c) == null) {
                    mrwVar = mrw.h;
                }
                return cbt.e(mrwVar);
            case 8:
                Object obj9 = this.a;
                lug lugVar9 = caj.a;
                muh muhVar = (muh) ((nfh) obj9).b;
                if ((muhVar.a & 2) != 0 && (mrwVar = muhVar.c) == null) {
                    mrwVar = mrw.h;
                }
                return cbt.e(mrwVar);
            case 9:
                Object obj10 = this.a;
                llp b = hqr.b();
                ArrayList arrayList = new ArrayList(b.size());
                hqt b2 = hqp.b();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    hqt hqtVar = (hqt) b.get(i);
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[3];
                    objArr[0] = (b2 == null || !b2.equals(hqtVar)) ? "" : '*';
                    objArr[1] = hqtVar.o(0);
                    objArr[2] = Integer.valueOf(iin.n(((dqi) obj10).c, hqtVar));
                    arrayList.add(String.format(locale, "%s%s(%s)", objArr));
                }
                return lex.d(",").f(arrayList);
            case 10:
                return iby.f(((Keyboard) this.a).B);
            case 11:
                Object obj11 = this.a;
                ltg ltgVar = ieh.a;
                return obj11 != null ? Arrays.toString((Object[]) obj11) : "null";
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Arrays.toString((Object[]) this.a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj12 = this.a;
                ltg ltgVar2 = ieh.a;
                return obj12 != null ? Arrays.toString((Object[]) obj12) : "null";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Arrays.toString((Object[]) this.a);
            case 15:
                return Arrays.toString((Object[]) this.a);
            default:
                return Arrays.toString((int[]) this.a);
        }
    }
}
