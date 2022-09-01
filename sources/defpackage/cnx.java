package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import com.google.android.apps.inputmethod.libs.expression.keyboard.ExpressionKeyboard;
import com.google.android.inputmethod.latin.R;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cnx */
/* loaded from: classes.dex */
public final class cnx {
    public static /* synthetic */ void a(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }

    public static csk b(llw llwVar, ice iceVar) {
        lsz it = llwVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((csl) entry.getKey()).c == iceVar) {
                return (csk) entry.getValue();
            }
        }
        throw new IllegalStateException("KeyboardView is missing for ".concat(String.valueOf(String.valueOf(iceVar))));
    }

    public static void c(hsy hsyVar, csi csiVar) {
        if (hsyVar instanceof ExpressionKeyboard) {
            ((ExpressionKeyboard) hsyVar).o(csiVar);
        }
    }

    public static hfd d(Context context, iay iayVar, Map map) {
        Object obj = iayVar.e;
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException("SWITCH_KEYBOARD data is not a string");
        }
        String str = (String) obj;
        if (str.equals(ibz.d.l) && !dip.l(map).isEmpty()) {
            str = cuz.a.i(context) ? context.getString(R.string.f154960_resource_name_obfuscated_res_0x7f1403a3) : context.getString(R.string.f154950_resource_name_obfuscated_res_0x7f1403a2);
        }
        return hfd.d(new iay(-10104, null, new icz(str, map)));
    }

    public static boolean e(Uri uri) {
        return "content".equals(uri.getScheme()) && "com.bitstrips.imoji.provider".equals(uri.getAuthority());
    }

    public static final cuj f(lls llsVar, Context context, ot otVar, LayoutInflater layoutInflater) {
        if (layoutInflater == null) {
            layoutInflater = dbf.a(context);
        }
        return new cuj(context, layoutInflater, llsVar.l(), otVar);
    }

    public static String g(String str) {
        return str.replaceAll("[!\"#$%&()*+,-./:;<=>?@\\[\\]^_`{|}~\\\\]", "");
    }

    public static final String h() {
        bxd q = ffb.q();
        return g(q.e() ? q.b() : "");
    }

    public static gmi i() {
        return new gmi((byte[]) null);
    }
}
