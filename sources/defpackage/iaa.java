package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: iaa  reason: default package */
/* loaded from: classes.dex */
public final class iaa extends hzu {
    public iaa(Integer num) {
        super(num);
    }

    @Override // defpackage.hzu
    protected final /* bridge */ /* synthetic */ Object a(Context context, String str, lfy lfyVar) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            ((luc) iag.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/AbstractTemplateBuilder$IntAttributeWrapper", "stringToValue", 242, "AbstractTemplateBuilder.java")).w("Invalid int attribute: %s", str);
            return null;
        }
    }

    @Override // defpackage.hzu, defpackage.hzv
    public final void b(Context context, AttributeSet attributeSet, int i, String str, lfy lfyVar) {
        this.a = Integer.valueOf(attributeSet.getAttributeIntValue(i, ((Integer) this.b).intValue()));
    }
}
