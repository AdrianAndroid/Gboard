package defpackage;

import android.content.Context;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: hey  reason: default package */
/* loaded from: classes.dex */
public final class hey implements hfa {
    public static final Pattern a = Pattern.compile("(\\+\\d{1,2}\\s?)?\\(?\\d{3,4}\\)?[\\s.-]?\\d{3,4}[\\s.-]?\\d{4}");
    public static final Pattern b = Pattern.compile("\\d+");
    public static final Pattern c = Pattern.compile("\\s+");

    public static hex a(String str, int i, int i2) {
        hew a2 = hex.a();
        a2.d(str);
        a2.b(i);
        a2.c(i2);
        return a2.a();
    }

    @Override // defpackage.hfa
    public final mko b(Context context, String str, String[] strArr, mkr mkrVar) {
        return mkrVar.hQ(new gnq(strArr, str, 5));
    }
}
