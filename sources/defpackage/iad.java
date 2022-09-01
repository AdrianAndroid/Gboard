package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: iad  reason: default package */
/* loaded from: classes.dex */
public final class iad extends hzu {
    public iad(Integer num) {
        super(num);
    }

    @Override // defpackage.hzu
    protected final /* bridge */ /* synthetic */ Object a(Context context, String str, lfy lfyVar) {
        if (!str.startsWith("@")) {
            ((luc) iag.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/AbstractTemplateBuilder$ResourceIdAttributeWrapper", "stringToValue", 295, "AbstractTemplateBuilder.java")).w("Invalid resource ID attribute: %s", str);
            return null;
        }
        int a = jbi.a(context, str, null);
        if (a == 0) {
            ((luc) iag.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/AbstractTemplateBuilder$ResourceIdAttributeWrapper", "stringToValue", 300, "AbstractTemplateBuilder.java")).w("Invalid resource ID attribute: %s", str);
            a = 0;
        }
        return Integer.valueOf(a);
    }

    @Override // defpackage.hzu, defpackage.hzv
    public final void b(Context context, AttributeSet attributeSet, int i, String str, lfy lfyVar) {
        this.a = Integer.valueOf(jgd.e(context, attributeSet, i, ((Integer) this.b).intValue()));
    }
}
