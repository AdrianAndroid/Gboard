package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dip  reason: default package */
/* loaded from: classes.dex */
public final class dip {
    public static String[] a(String str) {
        int i = 0;
        ArrayList E = lre.E(str.codePointCount(0, str.length()));
        int length = str.length();
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 97 && codePointAt <= 122) {
                E.add(String.valueOf(Character.toChars(codePointAt)).intern());
            }
            i += Character.charCount(codePointAt);
        }
        return (String[]) E.toArray(new String[E.size()]);
    }

    public static int[] b() {
        return new int[]{1, 2, 3, 4};
    }

    public static final dhx c(hlf hlfVar, View view, View view2) {
        if (hlfVar != null) {
            return new dhx(hlfVar, view, view2);
        }
        throw new IllegalStateException("Missing required properties: tooltip");
    }

    public static List d(gpm gpmVar) {
        ArrayList arrayList = new ArrayList(gpmVar.a());
        hlk hlkVar = new hlk();
        for (int i = 0; i < gpmVar.a(); i++) {
            hlkVar.a = gpmVar.b(i).a;
            hlkVar.e = hlm.RAW;
            hlkVar.h = i;
            arrayList.add(hlkVar.a());
        }
        return arrayList;
    }

    public static dba e(Object obj) {
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("sticker_activation");
            if (obj2 instanceof dba) {
                return (dba) obj2;
            }
        }
        return dba.a;
    }

    public static hfl f(Object obj) {
        Object obj2;
        if (!(obj instanceof Map) || (obj2 = ((Map) obj).get("activation_source")) == null || !(obj2 instanceof hfl)) {
            return null;
        }
        return (hfl) obj2;
    }

    public static hfl g(Object obj, hfl hflVar) {
        hfl f = f(obj);
        return f != null ? f : hflVar;
    }

    public static llw h(hfl hflVar) {
        return llw.l("activation_source", hflVar);
    }

    public static llw i(hfl hflVar, dba dbaVar) {
        if (dba.a.equals(dbaVar)) {
            return j("", hflVar);
        }
        return llw.n("activation_source", hflVar, "query", "", "sticker_activation", dbaVar);
    }

    public static llw j(String str, hfl hflVar) {
        return llw.m("query", str, "activation_source", hflVar);
    }

    public static mba k(Object obj) {
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("search_query_type");
            if (obj2 instanceof mba) {
                return (mba) obj2;
            }
        }
        return mba.UNKNOWN;
    }

    public static String l(Object obj) {
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("query");
            return obj2 instanceof String ? (String) obj2 : "";
        }
        return "";
    }

    public static boolean m(Object obj) {
        return f(obj) == hfl.INTERNAL && !TextUtils.isEmpty(l(obj));
    }

    public static lfb n(Iterable iterable) {
        if (iterable == null || lre.ai(iterable)) {
            return ldu.a;
        }
        return lfb.g(iterable);
    }

    public static lfb o(String str) {
        return TextUtils.isEmpty(str) ? ldu.a : lfb.g(str);
    }

    public static Uri q(cyw cywVar) {
        Uri.Builder buildUpon = Uri.parse(cywVar.g()).buildUpon();
        lsz it = cywVar.p().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build();
    }

    public static iih r(cyw cywVar) {
        iig a = iih.a();
        a.h(cywVar.m());
        a.d();
        a.g();
        a.c(cywVar.a());
        a.e(cywVar.o());
        a.f(cywVar.h());
        return a.a();
    }
}
