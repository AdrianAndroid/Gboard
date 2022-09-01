package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kzb  reason: default package */
/* loaded from: classes.dex */
public final class kzb {
    private static final int[] a = {16842752, R.attr.f18380_resource_name_obfuscated_res_0x7f040763};
    private static final int[] b = {R.attr.f14880_resource_name_obfuscated_res_0x7f040584};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof po) && ((po) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        po poVar = new po(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            poVar.getTheme().applyStyle(resourceId2, true);
        }
        return poVar;
    }
}
