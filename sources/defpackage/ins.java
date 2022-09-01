package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: ins  reason: default package */
/* loaded from: classes.dex */
public final class ins extends Intent {
    public ins(int i) {
        putExtra("entry", i);
        setFlags(276856832);
        setAction("android.intent.action.MAIN");
    }

    public final void a(int i) {
        putExtra("SETTINGS_HEADER_ID", i);
    }

    public final void b(Context context, int... iArr) {
        Resources resources = context.getResources();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            if (sb.length() > 0) {
                sb.append(">");
            }
            sb.append(resources.getString(i2));
        }
        putExtra(":settings:fragment_args_key", sb.toString());
    }

    public final void c(int i) {
        putExtra(":android:show_fragment_title", i);
    }

    public final void d(String str, Bundle bundle) {
        putExtra(":android:show_fragment", str);
        putExtra(":android:show_fragment_args", bundle);
    }
}
