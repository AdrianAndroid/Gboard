package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: lfy  reason: default package */
/* loaded from: classes.dex */
public final class lfy {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;

    public lfy(int i, apk apkVar, apg apgVar, boolean z) {
        this.b = i;
        this.d = apkVar;
        this.c = apgVar;
        this.a = z;
    }

    public lfy(String str, boolean z) {
        this.c = "com.google.android.gms";
        this.d = str;
        this.b = 4225;
        this.a = z;
    }

    private lfy(lfx lfxVar) {
        this(lfxVar, false, (lek) leh.a, Integer.MAX_VALUE);
    }

    private lfy(lfx lfxVar, boolean z, lek lekVar, int i) {
        this.d = lfxVar;
        this.a = z;
        this.c = lekVar;
        this.b = i;
    }

    public static lfy c(char c) {
        return d(lek.f(c));
    }

    public static lfy d(lek lekVar) {
        jdg.u(lekVar);
        return new lfy(new lfu(lekVar, 1));
    }

    public static lfy e(String str) {
        jdg.w(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return c(str.charAt(0));
        }
        return new lfy(new lfu(str, 0));
    }

    public static lfy f(Pattern pattern) {
        return l(new let(pattern));
    }

    public static lfy g(String str) {
        return l(lfd.b(str));
    }

    private static lfy l(lem lemVar) {
        jdg.A(!((Matcher) lemVar.a("").a).matches(), "The pattern may not match the empty string: %s", lemVar);
        return new lfy(new lfu(lemVar, 2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lfx] */
    public final lfy a(int i) {
        jdg.y(true, "must be greater than zero: %s", i);
        return new lfy((lfx) this.d, this.a, (lek) this.c, i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lfx] */
    public final lfy b() {
        return new lfy((lfx) this.d, true, (lek) this.c, this.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lfx] */
    public final lfy h() {
        lej lejVar = lej.b;
        jdg.u(lejVar);
        return new lfy((lfx) this.d, this.a, lejVar, this.b);
    }

    public final Iterable i(CharSequence charSequence) {
        jdg.u(charSequence);
        return new lfw(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lfx] */
    public final Iterator j(CharSequence charSequence) {
        return this.d.a(this, charSequence);
    }

    public final List k(CharSequence charSequence) {
        jdg.u(charSequence);
        Iterator j = j(charSequence);
        ArrayList arrayList = new ArrayList();
        while (j.hasNext()) {
            arrayList.add((String) j.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
