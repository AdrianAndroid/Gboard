package defpackage;

import android.text.Html;
import android.text.Spanned;
import java.util.List;

/* compiled from: PG */
/* renamed from: xk  reason: default package */
/* loaded from: classes2.dex */
public final class xk {
    static Spanned a(String str, int i) {
        return Html.fromHtml(str, i);
    }

    public static Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i, imageGetter, tagHandler);
    }

    static String c(Spanned spanned, int i) {
        return Html.toHtml(spanned, i);
    }

    public static apd d(arw arwVar, amp ampVar) {
        return new apd(k(arwVar, ampVar, aqy.b));
    }

    public static ape e(arw arwVar, amp ampVar) {
        return f(arwVar, ampVar, true);
    }

    public static ape f(arw arwVar, amp ampVar, boolean z) {
        return new ape(l(arwVar, z ? ash.a() : 1.0f, ampVar, aqy.a));
    }

    public static apf g(arw arwVar, amp ampVar, int i) {
        return new apf(k(arwVar, ampVar, new arb(i)));
    }

    public static apg h(arw arwVar, amp ampVar) {
        return new apg(k(arwVar, ampVar, aqy.c));
    }

    public static api i(arw arwVar, amp ampVar) {
        return new api(arg.a(arwVar, ampVar, ash.a(), aqy.e, true));
    }

    public static apk j(arw arwVar, amp ampVar) {
        return new apk(l(arwVar, ash.a(), ampVar, arn.a));
    }

    public static List k(arw arwVar, amp ampVar, art artVar) {
        return arg.a(arwVar, ampVar, 1.0f, artVar, false);
    }

    private static List l(arw arwVar, float f, amp ampVar, art artVar) {
        return arg.a(arwVar, ampVar, f, artVar, false);
    }
}
