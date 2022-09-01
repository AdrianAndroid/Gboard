package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: jgx  reason: default package */
/* loaded from: classes.dex */
public final class jgx {
    private static final int[] b = {R.attr.f11110_resource_name_obfuscated_res_0x7f0403d8};
    public static final jgw a = jgu.a;

    public static int a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void b(Activity activity, jgw jgwVar) {
        int a2;
        if (kts.a() && (a2 = a(activity)) != 0 && jgwVar.a(activity)) {
            activity.setTheme(a2);
        }
    }
}
