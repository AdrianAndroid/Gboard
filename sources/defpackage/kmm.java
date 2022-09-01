package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: kmm  reason: default package */
/* loaded from: classes.dex */
public final class kmm {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static PendingIntent a(Context context, Intent intent) {
        jdg.w(true, "Cannot set any dangerous parts of intent to be mutable.");
        jdg.w(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            jdg.w(!b(1275068416, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            jdg.w(b(1275068416, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!b(1275068416, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return PendingIntent.getBroadcast(context, 12345, intent2, 1275068416);
    }

    private static boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
