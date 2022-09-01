package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: icj  reason: default package */
/* loaded from: classes.dex */
public final class icj implements iar, jfx {
    public final List a = lre.A();

    private static String d(jfy jfyVar, AttributeSet attributeSet) {
        String attributeValue = attributeSet.getAttributeValue(null, "name");
        if (!TextUtils.isEmpty(attributeValue)) {
            return attributeValue;
        }
        throw jfyVar.c("Condition matcher name unspecified in node ".concat(String.valueOf(jfyVar.b())));
    }

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        AttributeSet a = jfyVar.a();
        if ("bool".equals(jfyVar.b())) {
            this.a.add(new jfi(d(jfyVar, a), a.getAttributeBooleanValue(null, "value", false)));
        } else if ("string".equals(jfyVar.b())) {
            this.a.add(new jgb(d(jfyVar, a), a.getAttributeValue(null, "value")));
        } else if (!"language".equals(jfyVar.b())) {
        } else {
            this.a.add(new jfu(jav.f(a.getAttributeValue(null, "value"))));
        }
    }

    public final void b(jfn[] jfnVarArr) {
        Collections.addAll(this.a, jfnVarArr);
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    @Override // defpackage.iar
    public final void m(jfy jfyVar) {
        throw null;
    }
}
