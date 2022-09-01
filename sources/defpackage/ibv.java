package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: ibv  reason: default package */
/* loaded from: classes.dex */
public final class ibv implements iar, iaq, jfx {
    public String a;
    public int b;
    public final HashMap c;
    public final List d;
    public int e;
    public boolean f;
    public boolean g;
    public final icj h;

    public ibv() {
        this.c = new HashMap();
        this.d = new ArrayList(4);
        this.e = 0;
        this.f = false;
        this.g = true;
        this.h = ick.a();
    }

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        if (icu.j(jfyVar, this)) {
            return;
        }
        String b = jfyVar.b();
        if ("keyboard".equals(b)) {
            AttributeSet a = jfyVar.a();
            String attributeValue = a.getAttributeValue(null, "type");
            if (TextUtils.isEmpty(attributeValue)) {
                throw jfyVar.c("Invalid empty keyboard type.");
            }
            ibz a2 = ibz.a(attributeValue);
            ibn a3 = ibo.a();
            a3.a = a.getAttributeBooleanValue(null, "finish_composing_on_activate", true);
            a3.b = iby.a(a.getAttributeValue(null, "initial_states"));
            int attributeResourceValue = a.getAttributeResourceValue(null, "def", 0);
            if (attributeResourceValue != 0) {
                a3.b(attributeResourceValue);
            }
            jfyVar.e(new hue(a3, 4));
            e(a2, a3.a());
        } else if ("layout_specific_settings".equals(b)) {
            AttributeSet a4 = jfyVar.a();
            int attributeResourceValue2 = a4.getAttributeResourceValue(null, "resource_id", 0);
            if (attributeResourceValue2 == 0) {
                ((ltd) ibw.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/KeyboardGroupDef$Builder", "handleNode", 344, "KeyboardGroupDef.java")).w("Invalid resource %s", a4.getAttributeValue(null, "resource_id"));
            } else {
                this.d.add(Integer.valueOf(attributeResourceValue2));
            }
        } else if ("override_keyboard_xml_conditions".equals(b)) {
            icj icjVar = this.h;
            int i = jgd.a;
            jfyVar.e(icjVar);
        } else {
            ((ltd) ibw.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/KeyboardGroupDef$Builder", "handleNode", 353, "KeyboardGroupDef.java")).w("Unexpected %s element was found", b);
        }
    }

    @Override // defpackage.iaq
    public final void b(jfy jfyVar) {
        AttributeSet a = jfyVar.a();
        String attributeValue = a.getAttributeValue(null, "variant");
        if (attributeValue != null) {
            this.a = attributeValue;
        }
        this.f = a.getAttributeBooleanValue(null, "supports_split_mode", this.f);
        this.g = a.getAttributeBooleanValue(null, "supports_one_handed_mode", this.g);
        this.b = a.getAttributeResourceValue(null, "variant_label", this.b);
        this.e = a.getAttributeResourceValue(null, "layout_theme", this.e);
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    public final ibw d() {
        return new ibw(this);
    }

    public final void e(ibz ibzVar, ibo iboVar) {
        this.c.put(ibzVar, iboVar);
    }

    public final void f(jfy jfyVar) {
        int i = jgd.a;
        b(jfyVar);
        jfyVar.e(this);
    }

    public final void g() {
        this.a = null;
        this.b = 0;
        this.c.clear();
        this.d.clear();
        this.e = 0;
        this.f = false;
        this.g = true;
        this.h.a.clear();
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ void m(jfy jfyVar) {
        throw null;
    }

    public ibv(ibw ibwVar) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.d = new ArrayList(4);
        this.e = 0;
        this.f = false;
        this.g = true;
        icj a = ick.a();
        this.h = a;
        this.a = ibwVar.c;
        this.b = ibwVar.d;
        hashMap.putAll(ibwVar.j);
        this.e = ibwVar.f;
        int i = ibwVar.g;
        this.f = ibwVar.h;
        this.g = ibwVar.i;
        a.b(ibwVar.k.b);
    }
}
