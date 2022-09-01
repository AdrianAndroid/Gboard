package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: efq  reason: default package */
/* loaded from: classes.dex */
public final class efq {
    public static ehj a(cxc cxcVar) {
        return new efk(cxcVar);
    }

    public static ehj b(String str) {
        return new efm(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ehj c(cxc cxcVar) {
        cxcVar.getClass();
        return new efo(cxcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static egu d(cxc cxcVar) {
        cxcVar.getClass();
        return new eff(cxcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static egu e(cxc cxcVar) {
        cxcVar.getClass();
        return new efg(cxcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static egu f(cxf cxfVar) {
        cxfVar.getClass();
        return new efh(cxfVar);
    }

    public static efx g(cxc cxcVar) {
        cxcVar.getClass();
        return new efa(cxcVar);
    }

    public static efx h(cxc cxcVar) {
        cxcVar.getClass();
        return new efb(cxcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static efx i(String str) {
        str.getClass();
        return new efd(str);
    }

    public static int j(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return Integer.parseInt(charSequence.toString());
    }

    public static /* synthetic */ String k(int i) {
        return i != 1 ? i != 2 ? "SEARCH" : "RECENTS" : "GIF_CATEGORY";
    }

    public static final hiz l() {
        return hiz.n(llp.q());
    }

    public static /* synthetic */ String m(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "SEPARATOR" : "SETTINGS" : "IMAGE" : "EMOJI";
    }

    public static ebn n(Context context) {
        return new ebo(context);
    }

    public static cjd o(llp llpVar) {
        llpVar.getClass();
        return new chz(llpVar);
    }

    public static int p(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int q(Context context) {
        ColorStateList a = hjg.n(context).a(R.color.f21370_resource_name_obfuscated_res_0x7f0600da);
        if (a != null) {
            return a.getDefaultColor();
        }
        return 0;
    }

    public static Size r(Size size, Drawable drawable) {
        int i;
        if (size.getHeight() <= 0 || size.getWidth() <= 0) {
            int i2 = 100;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i = drawable.getIntrinsicHeight();
                if (i > 0 && intrinsicWidth > 0) {
                    i2 = intrinsicWidth;
                    return new Size(i2, i);
                }
            }
            i = 100;
            return new Size(i2, i);
        }
        return size;
    }

    public static bet s(cgz cgzVar, int i) {
        return new cgy(cgzVar, i);
    }

    public static int t(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static String u(Context context) {
        Delight5Facilitator g = Delight5Facilitator.g();
        if (g == null) {
            return null;
        }
        List<mvm> o = g.o();
        if (o.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Resources resources = context.getResources();
        for (mvm mvmVar : o) {
            jaz.b(mvmVar.g, mvmVar.h);
            StringBuilder sb2 = new StringBuilder();
            if (!mvmVar.g.isEmpty()) {
                sb2.append(mvmVar.g);
                if (!mvmVar.h.isEmpty()) {
                    sb2.append("_");
                    sb2.append(mvmVar.h);
                }
            }
            sb.append(resources.getString(R.string.f163400_resource_name_obfuscated_res_0x7f140791, sb2.toString()));
            sb.append("\n  ");
            sb.append(resources.getString(R.string.f163410_resource_name_obfuscated_res_0x7f140792, Long.valueOf(mvmVar.j)));
            sb.append("\n  ");
            int x = jco.x(mvmVar.c);
            int i = R.string.f163370_resource_name_obfuscated_res_0x7f14078e;
            if (x != 0 && x == 2) {
                i = R.string.f163380_resource_name_obfuscated_res_0x7f14078f;
            }
            sb.append(resources.getString(i));
            sb.append("\n");
            sb.append(true != g.H(mvmVar) ? "Update pending." : "Up to date");
            sb.append("\n");
        }
        return sb.toString().trim();
    }

    public static void v(nfh nfhVar, hhl... hhlVarArr) {
        nfh t = mqd.f.t();
        for (hhl hhlVar : hhlVarArr) {
            String d = hhlVar.d();
            boolean booleanValue = ((Boolean) hhlVar.c()).booleanValue();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mqd mqdVar = (mqd) t.b;
            mqdVar.a |= 1;
            mqdVar.b = booleanValue;
            nfhVar.dy(d, (mqd) t.cz());
        }
    }

    public static void w(nfh nfhVar, hhl... hhlVarArr) {
        nfh t = mqd.f.t();
        for (hhl hhlVar : hhlVarArr) {
            String d = hhlVar.d();
            float floatValue = ((Double) hhlVar.c()).floatValue();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mqd mqdVar = (mqd) t.b;
            mqdVar.a |= 4;
            mqdVar.d = floatValue;
            nfhVar.dy(d, (mqd) t.cz());
        }
    }

    public static void x(nfh nfhVar, hhl... hhlVarArr) {
        nfh t = mqd.f.t();
        for (hhl hhlVar : hhlVarArr) {
            String d = hhlVar.d();
            int intValue = ((Long) hhlVar.c()).intValue();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mqd mqdVar = (mqd) t.b;
            mqdVar.a |= 2;
            mqdVar.c = intValue;
            nfhVar.dy(d, (mqd) t.cz());
        }
    }

    public static String y(long j, String str, int i) {
        buj g = buk.g();
        g.a = j;
        g.b = j;
        g.e(str.replace("'", "''"));
        g.d(i);
        buk a = g.a();
        return String.format(Locale.US, "insert or replace into %s (%s, %s, %s, %s, %s, %s) values (%d, '%s', %d, %d, %d, '%s')", "clips", "_id", "text", "timestamp", "item_type", "entity_type", "uri", Long.valueOf(a.d), a.i(), Long.valueOf(a.e), Integer.valueOf(a.d()), Integer.valueOf(a.c()), a.j());
    }
}
