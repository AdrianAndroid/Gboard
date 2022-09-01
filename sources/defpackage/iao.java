package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: iao  reason: default package */
/* loaded from: classes.dex */
public final class iao implements iar, jfx {
    public SparseArray a;

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        SparseArray sparseArray;
        String b = jfyVar.b();
        if ("item".equals(b)) {
            AttributeSet a = jfyVar.a();
            if (a.getAttributeCount() == 2) {
                TypedValue typedValue = null;
                int i = 0;
                for (int i2 = 0; i2 < 2; i2++) {
                    String attributeName = a.getAttributeName(i2);
                    if (!"id".equals(attributeName) || i != 0) {
                        if ("value".equals(attributeName) && typedValue == null) {
                            typedValue = new TypedValue();
                            int attributeResourceValue = a.getAttributeResourceValue(i2, 0);
                            if (attributeResourceValue != 0) {
                                Context context = jfyVar.a;
                                if (!context.getTheme().resolveAttribute(attributeResourceValue, typedValue, true)) {
                                    context.getResources().getValue(attributeResourceValue, typedValue, true);
                                }
                            } else {
                                typedValue.string = a.getAttributeValue(i2);
                                typedValue.type = 3;
                            }
                        } else {
                            throw jfyVar.c("Unexpected attribute:".concat(String.valueOf(attributeName)));
                        }
                    } else {
                        i = a.getAttributeResourceValue(i2, 0);
                    }
                }
                if (i != 0 && (((sparseArray = this.a) == null || sparseArray.indexOfKey(i) < 0) && typedValue != null)) {
                    d(i, typedValue);
                    return;
                }
                throw jfyVar.c("Invalid item node.");
            }
            throw jfyVar.c("Invalid item node.");
        }
        throw jfyVar.c("Unexpected xml node:".concat(String.valueOf(b)));
    }

    public final iap b() {
        return this.a == null ? iap.b : new iap(this.a);
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    public final void d(int i, TypedValue typedValue) {
        if (i == 0) {
            ((luc) iap.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/ExtraValuesDef$Builder", "addValue", 306, "ExtraValuesDef.java")).t("Invalid resource 0");
            i = 0;
        }
        if (this.a == null) {
            this.a = new SparseArray();
        }
        this.a.put(i, typedValue);
    }

    public final void e() {
        this.a = null;
    }

    @Override // defpackage.iar
    public final void m(jfy jfyVar) {
        throw null;
    }
}
