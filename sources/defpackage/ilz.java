package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: ilz  reason: default package */
/* loaded from: classes.dex */
public final class ilz {
    public final int a;
    public final int b;
    final int c;
    final boolean d;
    final float e;
    final boolean f;

    public ilz(Context context, AttributeSet attributeSet) {
        this.a = attributeSet.getAttributeResourceValue(null, "text_view", 0);
        this.b = attributeSet.getAttributeResourceValue(null, "image_view", 0);
        this.c = jgd.d(context, attributeSet, null, "max_item_per_row", 3);
        this.d = jgd.o(context, attributeSet, null, "balanced_placement", true);
        this.f = jgd.o(context, attributeSet, null, "first_key_as_default", true);
        this.e = jgd.b(context, attributeSet, null, "deselect_threshold_ratio", 1.5f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return !this.d && this.f;
    }
}
