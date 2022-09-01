package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jd  reason: default package */
/* loaded from: classes.dex */
public final class jd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static int b(Context context, String str, String str2) {
        return uc.b((AppOpsManager) uc.c(context, AppOpsManager.class), str, str2);
    }
}
