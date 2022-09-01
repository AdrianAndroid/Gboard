package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* renamed from: eju  reason: default package */
/* loaded from: classes.dex */
public final class eju {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? "RECENTS" : "SEARCH" : "CATEGORY";
    }

    public static ejv b(String str) {
        return new ejm(str);
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "CLOSE_PACK_BANNER" : "FEATURED_PACK_BANNER" : "REMOVE_PACK_BANNER" : "ADD_PACK_BANNER";
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "STICKER_PACK";
            case 2:
                return "BROWSE";
            case 3:
                return "RECENTS";
            case 4:
                return "SETTINGS";
            case 5:
                return "SEARCH";
            case 6:
                return "STICKER_PROMO";
            default:
                return "FEATURED_STICKER_PACK";
        }
    }

    public static final eig e(csh cshVar) {
        nxp.U(cshVar, csh.class);
        return new ehb(cshVar);
    }

    public static final egs f(csh cshVar) {
        nxp.U(cshVar, csh.class);
        return new egy(cshVar);
    }

    public static /* synthetic */ String g(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "RECENTS" : "SEARCH" : "CONTEXTUAL" : "BITMOJI";
    }

    public static eib h(cxc cxcVar) {
        return new eft(cxcVar);
    }

    public static eib i(cxc cxcVar) {
        return new efu(cxcVar);
    }

    public static lfb j(Context context, cke ckeVar, mse mseVar, cqp cqpVar) {
        Object u = cqpVar.u();
        if (u == null) {
            Uri d = cqpVar.d();
            if ("android.resource".equals(d.getScheme()) || "content".equals(d.getScheme()) || "file".equals(d.getScheme()) || iin.b(cqpVar.d())) {
                u = cqpVar.d();
            } else {
                ((ltd) ((ltd) cjz.a.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ImageSupplier", "tryCreateGlideModel", 86, "ImageSupplier.java")).w("Image %s does not have local content", cqpVar.d());
            }
        }
        if (u == null) {
            return ldu.a;
        }
        kqg p = cjo.p();
        p.i(mseVar);
        p.l(cqpVar);
        p.k(u);
        p.j(hjq.a(context).i(u).a(hju.a).a(ckeVar));
        return lfb.g(p.h());
    }

    public static Object k(Random random, llp llpVar) {
        if (((Boolean) cit.w.c()).booleanValue()) {
            return llpVar.get(random.nextInt(llpVar.size()));
        }
        return llpVar.get(0);
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "SUCCESS_EXPRESSION_MOMENT" : "SUCCESS" : "DROP_ALL" : "UNHANDLED";
    }

    public static int m(mse mseVar) {
        if (mseVar == null) {
            return 0;
        }
        int b = msc.b(mseVar.c);
        if (b == 0) {
            b = 1;
        }
        int i = b - 1;
        if (i == 3) {
            return 4;
        }
        if (i == 22) {
            return 6;
        }
        if (i == 25) {
            return 7;
        }
        switch (i) {
            case 17:
                return 1;
            case 18:
                return 3;
            case 19:
                return 2;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static int n(mse mseVar, boolean z, boolean z2) {
        int b = msc.b(mseVar.c);
        if (b == 0) {
            b = 1;
        }
        int i = b - 1;
        if (i == 3) {
            return z2 ? 22 : 10;
        } else if (i == 22) {
            return 19;
        } else {
            if (i == 28) {
                return 23;
            }
            if (i == 30 || i == 32 || i == 25) {
                return 21;
            }
            if (i == 26) {
                return 22;
            }
            switch (i) {
                case 17:
                    if (z) {
                        return 21;
                    }
                    return z2 ? 22 : 9;
                case 18:
                    return 8;
                case 19:
                    return 9;
                case 20:
                    return 11;
                default:
                    return 0;
            }
        }
    }

    public static final cke o() {
        return new cke(ciz.i());
    }

    public static List p(Context context) {
        Account[] accounts;
        ArrayList arrayList = new ArrayList();
        for (Account account : AccountManager.get(context).getAccounts()) {
            if (r(account.name)) {
                String str = account.name;
                arrayList.add(account.name);
            }
        }
        return arrayList;
    }

    public static void q(List list, String str, int i, boolean z, int i2) {
        list.add(u(false, str, i, i2));
        if (z) {
            list.add(u(true, str, i, i2));
        }
    }

    public static boolean r(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static void s() {
        hkp.b("image_paste_failed_toast", false);
    }

    private static mur u(boolean z, String str, int i, int i2) {
        nfh t = mur.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mur murVar = (mur) t.b;
        str.getClass();
        int i3 = murVar.a | 1;
        murVar.a = i3;
        murVar.b = str;
        int i4 = i3 | 4;
        murVar.a = i4;
        murVar.d = i;
        int i5 = i4 | 8;
        murVar.a = i5;
        murVar.e = i2;
        if (z) {
            murVar.a = i5 | 2;
            murVar.c = "<S>";
        }
        return (mur) t.cz();
    }
}
