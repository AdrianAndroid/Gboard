package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: dpa  reason: default package */
/* loaded from: classes.dex */
public final class dpa implements doz {
    private final cbh a;
    private final Context b;
    private final dlr c;
    private final cdx d;

    public dpa(Context context) {
        cbh cewVar;
        if (!((Boolean) cas.d.c()).booleanValue()) {
            cewVar = new cew(context, ieh.j(), "");
        } else {
            cewVar = new ceh(context, "");
        }
        dlr b = dlr.b(context);
        this.a = cewVar;
        this.b = context;
        this.c = b;
        this.d = cdx.b(context);
    }

    private static mvm f(mvl mvlVar, Locale locale, String str) {
        if (str == null) {
            return null;
        }
        return cbw.d(mvlVar, str, locale);
    }

    @Override // defpackage.iui
    public final jav c(jav javVar) {
        Locale c = cdx.b(this.b).c(javVar.q());
        if (c != null) {
            return jav.d(c);
        }
        return null;
    }

    @Override // defpackage.iui
    public final List d(mvl mvlVar, List list) {
        mvm f;
        llk e = llp.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            mvl mvlVar2 = mvl.UNKNOWN;
            int ordinal = mvlVar.ordinal();
            if (ordinal != 3) {
                switch (ordinal) {
                    case 19:
                        f = f(mvlVar, locale, this.c.d());
                        break;
                    case 20:
                        f = ccd.b(this.b, this.d.d(locale));
                        break;
                    case 21:
                        f = f(mvlVar, locale, this.c.c());
                        break;
                    case 22:
                        f = f(mvlVar, locale, this.c.e());
                        break;
                    default:
                        f = null;
                        break;
                }
            } else {
                Context context = this.b;
                f = cfm.f(context, locale, ino.M(context).y(R.string.f160340_resource_name_obfuscated_res_0x7f14063f), 159107666);
            }
            if (f != null) {
                e.h(f);
            }
        }
        return e.g();
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.iui
    public final List e(List list) {
        List<ewj> c = this.a.c(list, true);
        llk e = llp.e();
        for (ewj ewjVar : c) {
            Object obj = ewjVar.b;
            if (obj != null) {
                e.h(obj);
            }
        }
        return e.g();
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
