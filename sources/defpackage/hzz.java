package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: hzz  reason: default package */
/* loaded from: classes.dex */
public final class hzz extends hzu {
    public hzz(Float f) {
        super(f);
    }

    @Override // defpackage.hzu
    protected final /* bridge */ /* synthetic */ Object a(Context context, String str, lfy lfyVar) {
        try {
            return Float.valueOf(str);
        } catch (NumberFormatException unused) {
            ((luc) iag.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/AbstractTemplateBuilder$FloatAttributeWrapper", "stringToValue", 269, "AbstractTemplateBuilder.java")).w("Invalid float attribute: %s", str);
            return null;
        }
    }

    @Override // defpackage.hzu, defpackage.hzv
    public final void b(Context context, AttributeSet attributeSet, int i, String str, lfy lfyVar) {
        this.a = Float.valueOf(attributeSet.getAttributeFloatValue(i, ((Float) this.b).floatValue()));
    }
}
