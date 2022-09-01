package defpackage;

import android.util.AttributeSet;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: iba  reason: default package */
/* loaded from: classes.dex */
public final class iba implements jfx {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ iba(iat iatVar, llk llkVar, int i) {
        this.c = i;
        this.b = iatVar;
        this.a = llkVar;
    }

    public iba(ibd ibdVar, List list, int i) {
        this.c = i;
        this.b = ibdVar;
        this.a = list;
    }

    public iba(ibd ibdVar, long[] jArr, int i) {
        this.c = i;
        this.b = ibdVar;
        this.a = jArr;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        int i = this.c;
        if (i == 0) {
            if ("mapping".equals(jfyVar.b())) {
                AttributeSet a = jfyVar.a();
                int attributeResourceValue = a.getAttributeResourceValue(null, "view_id", 0);
                if (attributeResourceValue == 0) {
                    throw jfyVar.c("SoftKeyView ID is not set or invalid.");
                }
                int attributeResourceValue2 = a.getAttributeResourceValue(null, "key_id", 0);
                if (attributeResourceValue2 == 0) {
                    throw jfyVar.c("Softkey is not set or its ID is invalid." + attributeResourceValue);
                }
                ibd ibdVar = (ibd) this.b;
                ibdVar.e(attributeResourceValue, ibdVar.g(attributeResourceValue2), (long[]) this.a);
                return;
            }
            String b = jfyVar.b();
            throw jfyVar.c("Tag <" + b + "> should not be inside + <key_mapping>.");
        } else if (i == 1) {
            Object obj = this.b;
            Object obj2 = this.a;
            iav iavVar = iav.a;
            if (!"ime".equals(jfyVar.b())) {
                return;
            }
            iat iatVar = (iat) obj;
            iatVar.h();
            iatVar.f(jfyVar);
            ((llk) obj2).h(iatVar.e(null));
        } else if ("key".equals(jfyVar.b())) {
            int attributeResourceValue3 = jfyVar.a().getAttributeResourceValue(null, "key_id", 0);
            if (attributeResourceValue3 == 0) {
                throw jfyVar.c("Softkey is not set or its ID is invalid.");
            }
            ict g = ((ibd) this.b).g(attributeResourceValue3);
            if (g == null) {
                return;
            }
            this.a.add(g);
        } else if ("keys".equals(jfyVar.b())) {
            int attributeResourceValue4 = jfyVar.a().getAttributeResourceValue(null, "softkeys_id", 0);
            if (attributeResourceValue4 == 0) {
                throw jfyVar.c("SoftkeyGroup is not set or its ID is invalid.");
            }
            ict[] ictVarArr = (ict[]) ((ibd) this.b).d.get(attributeResourceValue4);
            if (ictVarArr == null) {
                return;
            }
            this.a.addAll(Arrays.asList(ictVarArr));
        } else {
            String b2 = jfyVar.b();
            throw jfyVar.c("Tag <" + b2 + "> should not be inside + <keygroup_mapping>.");
        }
    }
}
