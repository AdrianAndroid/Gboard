package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: igc  reason: default package */
/* loaded from: classes.dex */
public final class igc implements iar, jfx {
    public final List a = new ArrayList();

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        int i = jgd.a;
        String attributeValue = jfyVar.a().getAttributeValue(null, "type");
        if (TextUtils.isEmpty(attributeValue)) {
            throw jfyVar.c("Invalid empty keyboard type.");
        }
        ibz a = ibz.a(attributeValue);
        if (this.a.contains(a)) {
            String str = a.l;
            String b = jfyVar.b();
            throw jfyVar.c("duplicated keyboard type " + str + " in " + b);
        }
        this.a.add(a);
    }

    public final void b(ibz ibzVar) {
        this.a.add(ibzVar);
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
