package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: ica  reason: default package */
/* loaded from: classes.dex */
public final class ica implements iar, jfx {
    public int a;
    public ice b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public icb g;
    private final SparseArray j = new SparseArray();
    private final SparseArray k = new SparseArray();
    public final List i = lre.A();
    public final ibd h = ibi.a();
    private final icv l = icw.a();

    public ica() {
        b();
    }

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        ict[] ictVarArr;
        String b = jfyVar.b();
        int i = 0;
        if ("softkeys".equals(b)) {
            icv icvVar = this.l;
            icvVar.a = 0;
            icvVar.b.clear();
            icvVar.c = null;
            icvVar.d = null;
            icvVar.d(jfyVar);
            icw b2 = icvVar.b();
            hgw.d(this.j, b2.b);
            int i2 = b2.a;
            if (i2 == 0) {
                return;
            }
            ict[] ictVarArr2 = (ict[]) this.k.get(i2);
            if (ictVarArr2 == null) {
                this.k.put(b2.a, b2.c);
            } else {
                this.k.put(b2.a, (ict[]) lre.e(ictVarArr2, b2.c, ict.class));
            }
        } else if ("key_mapping".equals(b) || "keygroup_mapping".equals(b) || "merge_key_mapping".equals(b)) {
            ibd ibdVar = this.h;
            ibdVar.c = this.j;
            ibdVar.d = this.k;
            String b3 = jfyVar.b();
            long[] d = ibd.d(jfyVar.a(), "state", ibd.a);
            int length = d.length;
            if (length <= 0) {
                return;
            }
            long j = d[0];
            if ("key_mapping".equals(b3)) {
                jfyVar.e(new iba(ibdVar, d, 0));
            } else if ("keygroup_mapping".equals(b3)) {
                int attributeResourceValue = jfyVar.a().getAttributeResourceValue(null, "group_view_id", 0);
                if (attributeResourceValue == 0) {
                    throw jfyVar.c("SoftKeyViewGroup ID is not set or invalid.");
                }
                ArrayList A = lre.A();
                jfyVar.e(new iba(ibdVar, A, 2));
                if (A.isEmpty() || (ictVarArr = (ict[]) A.toArray(new ict[A.size()])) == null) {
                    return;
                }
                fws fwsVar = (fws) ibdVar.f.get(attributeResourceValue);
                if (fwsVar == null) {
                    fwsVar = new fws(ibd.b);
                    ibdVar.f.put(attributeResourceValue, fwsVar);
                }
                while (i < length) {
                    fwsVar.i(d[i], ictVarArr);
                    i++;
                }
            } else if ("merge_key_mapping".equals(b3)) {
                jfyVar.e(new ibb(ibdVar, d, ibd.d(jfyVar.a(), "exclude_state", null)));
            } else {
                throw new XmlPullParserException("Unexpected xml node:".concat(String.valueOf(b3)));
            }
        } else if ("motion_event_handler".equals(b)) {
            Context context = jfyVar.a;
            AttributeSet a = jfyVar.a();
            String k = jgd.k(context, a, null, "class");
            String k2 = jgd.k(context, a, null, "preference_key");
            boolean o = jgd.o(context, a, null, "reverse_preference", false);
            if (TextUtils.isEmpty(k)) {
                throw new lgj("Invalid class name.");
            }
            icd icdVar = new icd(k, k2, o);
            int size = this.i.size();
            while (i < size) {
                if (k.equals(((icd) this.i.get(i)).a)) {
                    this.i.set(i, icdVar);
                    return;
                }
                i++;
            }
            this.i.add(icdVar);
        } else {
            throw jfyVar.c("Unexpected xml node:".concat(String.valueOf(b)));
        }
    }

    public final void b() {
        this.b = null;
        this.c = true;
        this.a = R.id.f53790_resource_name_obfuscated_res_0x7f0b014b;
        this.d = 0;
        this.e = true;
        this.f = true;
        this.g = null;
        this.j.clear();
        this.k.clear();
        this.h.f();
        this.i.clear();
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ void m(jfy jfyVar) {
        throw null;
    }
}
