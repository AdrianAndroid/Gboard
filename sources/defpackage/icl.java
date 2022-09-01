package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: icl  reason: default package */
/* loaded from: classes.dex */
public final class icl implements iar, jfx {
    public final List a = lre.A();

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        int i = jgd.a;
        AttributeSet a = jfyVar.a();
        int idAttributeResourceValue = a.getIdAttributeResourceValue(0);
        if (idAttributeResourceValue == 0) {
            throw jfyVar.c("Invalid resource id in node: ".concat(String.valueOf(jfyVar.b())));
        }
        String attributeValue = a.getAttributeValue(null, "class");
        if (TextUtils.isEmpty(attributeValue)) {
            throw jfyVar.c("Not specify the class name of processor.");
        }
        this.a.add(new krm(idAttributeResourceValue, attributeValue));
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
