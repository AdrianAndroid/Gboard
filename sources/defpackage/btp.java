package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: btp  reason: default package */
/* loaded from: classes.dex */
public final class btp {
    private static final Pattern a = Pattern.compile("[A-Za-z]+");
    private static final Pattern b = Pattern.compile("[A-Za-z0-9,/;\\.\\-ˉ]+");

    public static boolean a(iay iayVar) {
        return b(iayVar) && a.matcher((String) iayVar.e).matches();
    }

    public static boolean b(iay iayVar) {
        return iayVar.d == iax.DECODE && (iayVar.e instanceof String);
    }

    public static boolean c(iay iayVar) {
        if (!b(iayVar) || !b.matcher((String) iayVar.e).matches()) {
            return false;
        }
        int i = iayVar.c;
        return i < 144 || i > 153;
    }
}
