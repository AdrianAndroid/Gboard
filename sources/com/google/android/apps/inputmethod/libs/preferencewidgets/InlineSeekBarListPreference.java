package com.google.android.apps.inputmethod.libs.preferencewidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InlineSeekBarListPreference extends InlineSeekBarPreference {
    private static final lug f = hin.a;
    private final llp g;

    public InlineSeekBarListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843256});
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(0);
        obtainStyledAttributes.recycle();
        if (textArray == null || textArray.length != (((InlineSeekBarPreference) this).c - ((InlineSeekBarPreference) this).b) + 1) {
            throw new IllegalArgumentException(String.format("Invalid entryValues size. size:%d, expected:%d, maxValue:%d, minValue:%d", Integer.valueOf(textArray.length), Integer.valueOf((((InlineSeekBarPreference) this).c - ((InlineSeekBarPreference) this).b) + 1), Integer.valueOf(((InlineSeekBarPreference) this).c), Integer.valueOf(((InlineSeekBarPreference) this).b)));
        }
        this.g = llp.p(textArray);
        if (((InlineSeekBarPreference) this).d == 1.0f) {
            return;
        }
        ((luc) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/preferencewidgets/InlineSeekBarListPreference", "<init>", 40, "InlineSeekBarListPreference.java")).w("Invalid scale: %f", Float.valueOf(((InlineSeekBarPreference) this).d));
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.InlineSeekBarPreference
    public final int k(String str, int i) {
        int indexOf = this.g.indexOf(str);
        return indexOf != -1 ? ((InlineSeekBarPreference) this).b + indexOf : i;
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.InlineSeekBarPreference
    public final void l(int i) {
        int i2 = i - ((InlineSeekBarPreference) this).b;
        if (i2 < 0 || ((lrl) this.g).c <= i2) {
            ((luc) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/preferencewidgets/InlineSeekBarListPreference", "persistValue", 58, "InlineSeekBarListPreference.java")).y("Invalid index. index:%d, entryValues.size():%d", i2, ((lrl) this.g).c);
        }
        ab(((CharSequence) this.g.get(i2)).toString());
    }
}
