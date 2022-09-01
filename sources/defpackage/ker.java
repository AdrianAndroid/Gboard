package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ker  reason: default package */
/* loaded from: classes.dex */
public class ker {
    public ker() {
    }

    public ker(kdr kdrVar, Executor executor, nox noxVar, oiy oiyVar) {
        kdrVar.a(executor, noxVar, oiyVar);
    }

    public ker(byte[] bArr) {
    }

    public ker(char[] cArr) {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static kmn b(llk llkVar, Boolean bool) {
        return new kmn(bool.booleanValue(), llkVar.g());
    }

    private static void c(Context context, int i, int i2, Object... objArr) {
        if (i2 != 0) {
            q(context, i, context.getString(i2, objArr));
        }
    }

    public static Context d(Context context, kmk kmkVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return context.createAttributionContext((kmkVar == kmk.TAG_DO_NOT_USE || kmkVar == kmk.TAG_INVALID_ATTRIBUTION_DO_NOT_USE || kmkVar == kmk.TAG_UNATTRIBUTED || !kml.a.containsKey(kmkVar)) ? "invalid_attribution" : (String) kml.a.get(kmkVar));
        }
        return context;
    }

    public static klh e(StringBuilder sb, List list) {
        return new klh(sb.toString(), list);
    }

    public static void f(String str, String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(strArr[i]);
            }
        }
    }

    public static int g(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int i(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int j(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static File k(Context context, Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("In app uri path is null.");
        }
        if (TextUtils.equals(uri.getScheme(), "appfiles")) {
            return new File(context.getFilesDir(), path);
        }
        if (!TextUtils.equals(uri.getScheme(), "appcache")) {
            throw new IllegalArgumentException("Unsupported scheme: ".concat(String.valueOf(uri.getScheme())));
        }
        return new File(context.getCacheDir(), path);
    }

    public static void l(Context context, int i, Object... objArr) {
        m(context, 0, i, objArr);
    }

    public static void m(Context context, int i, int i2, Object... objArr) {
        String string = context.getString(i2, objArr);
        if (!TextUtils.isEmpty(string)) {
            gyc.b.execute(new ov(context, i, string, 13));
        }
    }

    public static void n(Context context, int i, Object... objArr) {
        c(context, 1, i, objArr);
    }

    public static void o(Context context, CharSequence charSequence) {
        q(context, 0, charSequence);
    }

    public static void p(Context context, int i, Object... objArr) {
        c(context, 0, i, objArr);
    }

    public static void q(Context context, int i, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            hsu hsuVar = (hsu) ijl.b().a(hsu.class);
            if (hsuVar == null || !hsuVar.g() || !ijl.b().f(hkq.class) || hqp.b() == null) {
                Toast.makeText(context, gqa.b(context, charSequence), i).show();
                return;
            }
            String obj = charSequence.toString();
            boolean z = true;
            if (1 != i) {
                z = false;
            }
            hkq.b(jdg.e(obj, z).a());
        }
    }

    public static void r() {
        hkp.b("spell_check_add_to_dictionary", false);
    }
}
