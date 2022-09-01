package defpackage;

import android.graphics.Paint;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: wt  reason: default package */
/* loaded from: classes2.dex */
public final class wt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    static LocaleList c() {
        return LocaleList.getDefault();
    }

    public static Paint.Cap d(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }

    public static int[] e() {
        return new int[]{1, 2, 3};
    }
}
