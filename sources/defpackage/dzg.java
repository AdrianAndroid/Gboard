package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: dzg  reason: default package */
/* loaded from: classes.dex */
public final class dzg {
    public static dzq a(ead eadVar) {
        return new dzb(eadVar);
    }

    public static iay b(SoftKeyView softKeyView, long j, ibi ibiVar) {
        ict ictVar;
        ial b;
        icy icyVar = (icy) ibiVar.b.get(softKeyView.getId());
        if (icyVar == null || (ictVar = (ict) icyVar.c(j)) == null || (b = ictVar.b(iah.PRESS)) == null) {
            return null;
        }
        return b.d();
    }

    public static void c(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("https://support.google.com/gboard?p=voice_typing"));
        context.startActivity(intent);
    }

    public static hqt d(Context context) {
        hrx.y(context);
        return hqp.b();
    }

    public static jav e(hqt hqtVar) {
        if (hqtVar == null) {
            return null;
        }
        return hqtVar.i();
    }

    public static lmz f(Context context) {
        String str;
        hqt d = d(context);
        jav e = e(d);
        lmz lmzVar = null;
        if (d != null && e != null && e.g != null) {
            lmx g = lmz.g();
            g.d(e.g);
            lsz it = d.k().iterator();
            while (it.hasNext()) {
                jav javVar = (jav) it.next();
                if (javVar != null && (str = javVar.g) != null) {
                    g.d(str);
                }
            }
            lmzVar = g.g();
        }
        lmx g2 = lmz.g();
        llp b = hqr.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            jav i2 = ((hqt) b.get(i)).i();
            if (lmzVar == null || lmzVar.contains(i2.g)) {
                g2.d(i2);
            }
        }
        return g2.g();
    }

    public static String g() {
        return true != ((Boolean) dsu.b.c()).booleanValue() ? "com.google.android.googlequicksearchbox" : "com.google.android.apps.search.assistant.surfaces.dictation.devapp";
    }

    public static fgw h(fgu fguVar) {
        boolean z = fguVar.c;
        if (!z) {
            fgt fgtVar = fgt.UNKNOWN;
            fgt b = fgt.b(fguVar.b);
            if (b == null) {
                b = fgt.UNRECOGNIZED;
            }
            int ordinal = b.ordinal();
            z = ordinal == 1 || ordinal == 7;
        }
        nfh t = fgw.f.t();
        int i = fguVar.a;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        fgw fgwVar = (fgw) t.b;
        fgwVar.a = i;
        fgwVar.d = z;
        String str = fguVar.d;
        str.getClass();
        fgwVar.e = str;
        return (fgw) t.cz();
    }

    public static boolean i(iay iayVar) {
        Object obj = iayVar.e;
        if ((obj instanceof String) && ((String) obj).length() != 0) {
            char charAt = ((String) iayVar.e).charAt(0);
            if (iayVar.d == iax.DECODE && j(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(char c) {
        int b = dmf.b(c);
        if (b == 1) {
            if (dmf.a[c - 12593] == -1) {
                b = 1;
            }
        }
        return b == 2 || b == 4;
    }

    public static /* synthetic */ void k(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }
}
