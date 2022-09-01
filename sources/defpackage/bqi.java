package defpackage;

import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: bqi  reason: default package */
/* loaded from: classes.dex */
public final class bqi extends dec {
    final int a;
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    final int g;
    final int h;
    final int i;
    final int j;

    public bqi(AttributeSet attributeSet) {
        super(attributeSet);
        if (attributeSet == null) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            return;
        }
        this.a = a(attributeSet, "contextual_candidate_layout");
        this.b = a(attributeSet, "contextual_special_candidate_layout");
        this.c = a(attributeSet, "email_candidate_layout");
        this.d = a(attributeSet, "bold_candidate_layout");
        this.e = a(attributeSet, "link_candidate_layout");
        this.f = a(attributeSet, "emoji_candidate_layout");
        this.g = a(attributeSet, "large_emoji_candidate_layout");
        this.h = a(attributeSet, "image_candidate_layout");
        this.i = a(attributeSet, "chip_candidate_layout");
        this.j = a(attributeSet, "flexible_chip_candidate_layout");
    }

    private static int a(AttributeSet attributeSet, String str) {
        return attributeSet.getAttributeResourceValue(null, str, 0);
    }
}
