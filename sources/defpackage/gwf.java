package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: gwf  reason: default package */
/* loaded from: classes.dex */
public final class gwf {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/betterbug/BetterBugUtils");

    public static mko a(Context context, gwe gweVar) {
        Intent putExtra = new Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK").addFlags(268435456).putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_REQUIRE_BUGREPORT", gweVar.e);
        if (!TextUtils.isEmpty(gweVar.a)) {
            putExtra.putExtra("EXTRA_ISSUE_TITLE", gweVar.a);
        }
        long j = gweVar.b;
        if (j > 0) {
            putExtra.putExtra("EXTRA_COMPONENT_ID", j);
        }
        long j2 = gweVar.c;
        if (j2 > 0) {
            putExtra.putExtra("EXTRA_HAPPENED_TIME", j2);
        }
        if (!TextUtils.isEmpty(gweVar.d)) {
            putExtra.putExtra("EXTRA_BUG_ASSIGNEE", gweVar.d);
        }
        mhf mhfVar = gweVar.g;
        if (mhfVar != null && !mhfVar.c()) {
            putExtra.putExtra("EXTRA_HOTLIST_ID_LIST", mhfVar.d());
        }
        if (!gweVar.f.isEmpty()) {
            llp llpVar = gweVar.f;
            int i = ((lrl) llpVar).c;
            ClipData clipData = null;
            for (int i2 = 0; i2 < i; i2++) {
                ClipData.Item item = new ClipData.Item((Uri) llpVar.get(i2));
                if (clipData == null) {
                    clipData = new ClipData("URIs", new String[]{"text/uri-list"}, item);
                } else {
                    clipData.addItem(item);
                }
            }
            if (clipData != null) {
                putExtra.setClipData(clipData);
                putExtra.addFlags(1);
            }
        }
        if (context.getPackageManager().queryIntentActivities(putExtra, 0).isEmpty()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/betterbug/BetterBugUtils", "reportIssueToBetterBug", 41, "BetterBugUtils.java")).t("No matching activities, probably better bug is not installed on device.");
            return kcu.K(Boolean.FALSE);
        }
        try {
            context.startActivity(putExtra);
            return kcu.K(Boolean.TRUE);
        } catch (SecurityException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/betterbug/BetterBugUtils", "reportIssueToBetterBug", '2', "BetterBugUtils.java")).t("Failed to report issue to BetterBug");
            return kcu.K(Boolean.FALSE);
        }
    }
}
