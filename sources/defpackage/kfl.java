package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: kfl  reason: default package */
/* loaded from: classes.dex */
public class kfl {
    public kfl() {
    }

    public kfl(byte[] bArr) {
    }

    public kfl(char[] cArr) {
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static String f(String str) {
        return "sticker-" + str + ".pbg.gz";
    }

    public static String g(String str, Locale locale, ncx ncxVar) {
        return String.format(Locale.US, "%s-%s-%016X", locale, str, Long.valueOf(Arrays.hashCode(ncxVar.q())));
    }

    public static boolean h(kof kofVar, String str) {
        return kofVar != null && str.equals(kofVar.e);
    }

    public static Drawable i(Drawable drawable, View view, int i, int i2) {
        int i3 = view.getLayoutParams().width;
        InsetDrawable insetDrawable = new InsetDrawable(drawable, i3 > i ? (i3 - i) / 2 : 0);
        insetDrawable.setAlpha(i2);
        return insetDrawable;
    }

    public static ncw j(njs njsVar, njr njrVar) {
        nfh t = ncw.g.t();
        int i = njsVar.a;
        int i2 = njrVar.a;
        String str = k(i) + "/stickers/" + i2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((ncw) t.b).a = str;
        ((ncw) t.b).b = 2;
        String str2 = njrVar.b;
        ncw ncwVar = (ncw) t.b;
        str2.getClass();
        ncwVar.d = str2;
        String str3 = njrVar.c;
        str3.getClass();
        ncwVar.f = str3;
        return (ncw) t.cz();
    }

    public static String k(int i) {
        return "packs/" + i;
    }

    public static String l(String str) {
        int indexOf = str.indexOf(47, 6);
        return indexOf == -1 ? "" : str.substring(0, indexOf);
    }

    public static /* synthetic */ void m(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }
}
