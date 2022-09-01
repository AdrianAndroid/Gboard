package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* renamed from: inv  reason: default package */
/* loaded from: classes.dex */
public final class inv extends imu {
    public qv c;

    public inv(Context context) {
        super(context);
    }

    @Override // defpackage.imt
    public final /* bridge */ /* synthetic */ Object b(int i) {
        this.c = new qv();
        return (PreferenceGroup) super.b(i);
    }

    @Override // defpackage.imt
    protected final /* bridge */ /* synthetic */ void c(Object obj, AttributeSet attributeSet) {
        Preference preference = (Preference) obj;
        if (!preference.W()) {
            return;
        }
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(attributeSet, ait.g, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
            if (resourceId != 0) {
                this.c.put(preference, Integer.valueOf(resourceId));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
