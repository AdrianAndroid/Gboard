package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: ebl  reason: default package */
/* loaded from: classes.dex */
public final class ebl {
    public static hfd a(BreakIterator breakIterator, hfd hfdVar) {
        lfb g;
        boolean z = hfdVar.a == iah.PRESS;
        dau.d(z);
        if (z) {
            boolean z2 = hfdVar.b.length == 1;
            dau.d(z2);
            if (z2) {
                boolean z3 = hfdVar.b[0].c == -10027;
                dau.d(z3);
                if (z3) {
                    ict ictVar = hfdVar.c;
                    if (ictVar == null) {
                        dau.a("");
                    } else {
                        boolean z4 = ictVar.m.length == 1;
                        dau.h(z4);
                        if (!z4) {
                            return null;
                        }
                        ial b = ictVar.b(iah.PRESS);
                        if (!dau.c(b)) {
                            return null;
                        }
                        boolean z5 = b.d.length == 1;
                        dau.h(z5);
                        if (!z5) {
                            return null;
                        }
                        iay iayVar = b.d[0];
                        Object obj = iayVar.e;
                        if (!String.class.isInstance(obj)) {
                            dau.a("");
                            g = ldu.a;
                        } else {
                            g = lfb.g(String.class.cast(obj));
                        }
                        if (!g.e()) {
                            return null;
                        }
                        int i = iayVar.c;
                        iax iaxVar = iayVar.d;
                        String replace = ((String) g.a()).replace(' ', (char) 160).replace("\u2060", "");
                        StringBuilder sb = new StringBuilder();
                        breakIterator.setText(replace);
                        int first = breakIterator.first();
                        int next = breakIterator.next();
                        while (true) {
                            int i2 = next;
                            int i3 = first;
                            first = i2;
                            if (first == -1) {
                                break;
                            }
                            sb.append((CharSequence) replace, i3, first);
                            if (first < replace.length()) {
                                sb.append((char) 8288);
                            }
                            next = breakIterator.next();
                        }
                        iay iayVar2 = new iay(i, iaxVar, sb.toString());
                        iaj c = ial.c();
                        c.i(b);
                        c.c = new iay[]{iayVar2};
                        ial b2 = c.b();
                        if (b2 == null) {
                            return null;
                        }
                        hfd c2 = hfd.c(hfdVar);
                        c2.j(iayVar2);
                        ico d = ict.d();
                        d.j(ictVar);
                        d.p(b2);
                        c2.c = d.c();
                        c2.k = "non-breaking-override";
                        return c2;
                    }
                }
            }
        }
        return null;
    }

    public static String b(String str) {
        return str.replace((char) 160, ' ').replace("\u2060", "");
    }

    public static boolean c(String str) {
        return str.contains("\u2060") || str.contains(" ");
    }

    public static boolean d(hfd hfdVar) {
        return !"non-breaking-override".equals(hfdVar.k);
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? "CATEGORY" : "RECENTS";
    }

    public static bet f(eah eahVar) {
        return new eag(eahVar);
    }

    public static /* synthetic */ String g(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "SETTING_ICON" : "SEPARATOR" : "EMOJI_KITCHEN_MIX_RESULT" : "EMOJI_KITCHEN_MIX_STATUS" : "STANDARD_RESULT";
    }

    public static nfh h() {
        nfh t = fhy.d.t();
        ney c = nis.c(SystemClock.elapsedRealtimeNanos());
        if (t.c) {
            t.cD();
            t.c = false;
        }
        c.getClass();
        ((fhy) t.b).c = c;
        return t;
    }

    public static nwh i(Context context) {
        return new mor(context.getPackageManager(), lmz.s("com.google.android.googlequicksearchbox", dzg.g()), fno.b(context));
    }

    public static boolean j(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("*")) {
            return true;
        }
        List asList = Arrays.asList(str.split(","));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!asList.contains(jav.d((Locale) it.next()).n)) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(iav iavVar) {
        return iavVar.q.d(R.id.f54820_resource_name_obfuscated_res_0x7f0b01ca, false);
    }

    public static boolean l(iav iavVar) {
        return iavVar.q.d(R.id.f54990_resource_name_obfuscated_res_0x7f0b01dc, false);
    }

    public static boolean m(Context context, boolean z) {
        hrx.y(context);
        hqt b = hqp.b();
        return b != null && jav.d(Locale.US).equals(b.i()) && !z;
    }

    public static boolean n(hls hlsVar) {
        return ((Boolean) doa.es.c()).booleanValue() && !hlsVar.h().m();
    }
}
