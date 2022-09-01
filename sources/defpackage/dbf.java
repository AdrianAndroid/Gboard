package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: dbf  reason: default package */
/* loaded from: classes.dex */
public final class dbf {
    public final Object a;
    public Object b;

    public dbf(Context context) {
        this.a = context;
    }

    public dbf(djm djmVar) {
        this.a = guw.a().getString(R.string.f159390_resource_name_obfuscated_res_0x7f1405d8);
        InputStream c = djmVar.c("word_explanation");
        InputStream c2 = djmVar.c("token_character");
        if (c == null || c2 == null) {
            return;
        }
        this.b = new bto(c, c2, djmVar.c("alternative_token"));
    }

    public static LayoutInflater a(Context context) {
        dbf dbfVar = dbe.a;
        boolean z = true;
        if (!jam.b && gwc.b(context, Application.class) != null) {
            z = false;
        }
        dau.e(z, "Application context must not be used with MaterialLayoutInflater");
        Object obj = dbfVar.b;
        if (obj == null) {
            if (context.getTheme().resolveAttribute(R.attr.f9930_resource_name_obfuscated_res_0x7f04034e, new TypedValue(), false)) {
                obj = LayoutInflater.from(context);
            } else {
                Object obj2 = dbfVar.a;
                mjl mjlVar = mjl.a;
                eqv eqvVar = (eqv) obj2;
                ((irm) eqvVar.b).f(mjlVar);
                ((hti) eqvVar.a).a(mjlVar);
                ((hqo) eqvVar.c).d(mjlVar);
                obj = LayoutInflater.from(new ContextThemeWrapper(context, (int) R.style.f201390_resource_name_obfuscated_res_0x7f15067e));
                dbfVar.b = obj;
            }
        }
        return (LayoutInflater) obj;
    }

    public static boolean b(String[] strArr, int i) {
        return strArr != null && strArr.length == i;
    }

    public final Delight5Facilitator c() {
        return Delight5Facilitator.h((Context) this.a);
    }

    public final mvm d() {
        return cbw.c(mvl.EMAIL, e(), c().q());
    }

    public final File e() {
        if (this.b == null) {
            this.b = new File(cbd.c.c((Context) this.a), "Email.dict");
        }
        return (File) this.b;
    }

    public final void f(StringBuilder sb, ifz ifzVar) {
        sb.append((String) ifzVar.b);
        sb.append((String) this.a);
        sb.append((String) ifzVar.c);
    }

    public dbf() {
        this.a = new eqv(new cvj(this, 9));
    }
}
