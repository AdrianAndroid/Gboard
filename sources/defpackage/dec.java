package defpackage;

import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: dec  reason: default package */
/* loaded from: classes.dex */
public class dec {
    final int k;
    final int l;
    public final int m;
    final boolean n;

    public dec(AttributeSet attributeSet) {
        if (attributeSet == null) {
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = true;
            return;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "candidate_background", 0);
        this.k = attributeResourceValue;
        this.l = attributeSet.getAttributeResourceValue(null, "last_column_candidate_background", attributeResourceValue);
        this.m = attributeSet.getAttributeResourceValue(null, "candidate_layout", 0);
        this.n = attributeSet.getAttributeBooleanValue(null, "support_deletable", true);
    }
}
