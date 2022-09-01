package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.inputmethod.libs.expression.startactivityforresult.StartActivityForResult;

/* compiled from: PG */
/* renamed from: efz  reason: default package */
/* loaded from: classes.dex */
public final class efz {
    static final hhl a = hhq.a("enable_bitmoji_alley_oop", false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context) {
        Intent data = new Intent("android.intent.action.VIEW").setData(cva.b);
        return data != null && dax.a(context, data);
    }

    public static boolean b(Context context) {
        if (!((Boolean) a.c()).booleanValue()) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setPackage("com.android.vending");
            intent.setData(cva.a);
            return dax.a(context, intent);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage("com.android.vending");
        intent2.setData(cva.a);
        intent2.putExtra("overlay", true);
        intent2.putExtra("callerId", context.getPackageName());
        intent2.addFlags(8388608);
        return StartActivityForResult.l(context, intent2, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.bitstrips.imoji");
        return launchIntentForPackage != null && dax.a(context, launchIntentForPackage);
    }
}
