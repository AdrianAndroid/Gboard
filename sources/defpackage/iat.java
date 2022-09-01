package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: iat  reason: default package */
/* loaded from: classes.dex */
public final class iat implements iar, iaq, jfx {
    public static final /* synthetic */ int E = 0;
    private static final iau F = iau.SOFT;
    public jls D;
    public int e;
    public String f;
    public int[] k;
    public final ArrayList a = new ArrayList();
    public String b = "IME_STRING_ID";
    public String c = "com.google.android.libraries.inputmethod.ime.DummyIme";
    public String d = "und";
    public boolean g = true;
    public boolean h = false;
    public boolean i = false;
    public int j = 0;
    public long l = 0;
    public iau m = F;
    public int n = 0;
    public boolean o = false;
    public int p = 4098;
    public int q = 0;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public String u = "";
    public int v = 0;
    public boolean w = true;
    public String x = null;
    public boolean y = false;
    public boolean z = true;
    public final iao A = iap.b();
    public final icl B = new icl();
    private final ibv G = ibw.b();
    public iat C = null;

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        if (icu.j(jfyVar, this)) {
            return;
        }
        String b = jfyVar.b();
        if ("keyboard_group".equals(b)) {
            ibv ibvVar = this.G;
            ibvVar.g();
            ibvVar.f(jfyVar);
            ibw d = ibvVar.d();
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (TextUtils.equals(((ibw) arrayList.get(i)).c, d.c)) {
                    throw jfyVar.c("Duplicated keyboard group: ".concat(d.c));
                }
                i = i2;
            }
            this.a.add(d);
        } else if ("extra_values".equals(b)) {
            iao iaoVar = this.A;
            String b2 = jfyVar.b();
            if ("extra_values".equals(b2)) {
                jfyVar.e(iaoVar);
                return;
            }
            throw jfyVar.c("Unexpected xml node:".concat(String.valueOf(b2)));
        } else if ("processors".equals(b)) {
            icl iclVar = this.B;
            int i3 = jgd.a;
            jfyVar.e(iclVar);
        } else {
            throw jfyVar.c("Unexpected xml node:".concat(String.valueOf(jfyVar.b())));
        }
    }

    @Override // defpackage.iaq
    public final void b(jfy jfyVar) {
        AttributeSet a = jfyVar.a();
        int attributeCount = a.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = a.getAttributeName(i);
            if ("string_id".equals(attributeName)) {
                this.b = a.getAttributeValue(i);
            } else if ("class".equals(attributeName)) {
                String attributeValue = a.getAttributeValue(i);
                this.c = attributeValue;
                if (TextUtils.isEmpty(attributeValue)) {
                    this.c = "com.google.android.libraries.inputmethod.ime.DummyIme";
                }
            } else if ("language".equals(attributeName)) {
                this.d = a.getAttributeValue(i);
            } else if ("language_tag".equals(attributeName)) {
                a.getAttributeValue(i);
            } else if ("label".equals(attributeName)) {
                this.e = a.getAttributeResourceValue(i, 0);
            } else if ("keyevent_interpreter".equals(attributeName)) {
                this.f = a.getAttributeValue(i);
            } else if ("inline_composing".equals(attributeName)) {
                this.g = a.getAttributeBooleanValue(i, true);
            } else if ("auto_capital".equals(attributeName)) {
                this.h = a.getAttributeBooleanValue(i, false);
            } else if ("announce_auto_selected_candidate".equals(attributeName)) {
                this.i = a.getAttributeBooleanValue(i, false);
            } else if ("status_icon".equals(attributeName)) {
                this.j = a.getAttributeResourceValue(i, 0);
            } else if ("candidate_selection_keys".equals(attributeName)) {
                this.k = iaz.k(jgd.j(jfyVar.a, a, i), lfy.e(",").h());
            } else if ("candidate_selection_keys_enable_state".equals(attributeName)) {
                this.l = iby.a(a.getAttributeValue(i));
            } else if ("prime_keyboard_type".equals(attributeName)) {
                this.m = (iau) jak.b(a.getAttributeValue(i), F);
            } else if ("indicator_icon".equals(attributeName)) {
                this.n = a.getAttributeResourceValue(i, 0);
            } else if ("display_app_completions".equals(attributeName)) {
                this.o = a.getAttributeBooleanValue(i, false);
            } else if ("unacceptable_meta_keys".equals(attributeName)) {
                this.p = iaz.d(a.getAttributeValue(i));
            } else if ("language_specific_settings".equals(attributeName)) {
                this.q = a.getAttributeResourceValue(i, 0);
            } else if ("ascii_capable".equals(attributeName)) {
                this.r = a.getAttributeBooleanValue(i, false);
            } else if ("always_show_suggestions".equals(attributeName)) {
                this.s = a.getAttributeBooleanValue(i, false);
            } else if ("use_ascii_password_keyboard".equals(attributeName)) {
                this.t = a.getAttributeBooleanValue(i, false);
            } else if ("secondary_ime_def".equals(attributeName)) {
                int attributeResourceValue = a.getAttributeResourceValue(i, 0);
                if (attributeResourceValue != 0) {
                    iat d = iav.d(this.D);
                    d.g(jfyVar.a, attributeResourceValue);
                    this.C = d;
                }
            } else if ("is_unicode".equals(attributeName)) {
                this.w = a.getAttributeBooleanValue(i, true);
            } else if ("localization_language".equals(attributeName)) {
                this.x = a.getAttributeValue(i);
            } else if ("supports_inline_suggestion".equals(attributeName)) {
                this.y = a.getAttributeBooleanValue(i, false);
            } else if ("supports_access_points".equals(attributeName)) {
                this.z = a.getAttributeBooleanValue(i, true);
            } else {
                throw jfyVar.c("Unexpected attribute: ".concat(String.valueOf(attributeName)));
            }
        }
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    public final iav d() {
        return e(null);
    }

    public final iav e(String str) {
        if (TextUtils.isEmpty(this.d)) {
            throw new IllegalArgumentException("language is empty");
        }
        return new iav(this, str);
    }

    public final void f(jfy jfyVar) {
        int i = jgd.a;
        b(jfyVar);
        jfyVar.b.clear();
        jfyVar.e(this);
        ArrayList arrayList = new ArrayList(jfyVar.b);
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append("_");
            sb.append((String) arrayList.get(i2));
        }
        this.u = sb.toString();
    }

    public final void h() {
        this.b = "IME_STRING_ID";
        this.c = "com.google.android.libraries.inputmethod.ime.DummyIme";
        this.d = "und";
        this.e = 0;
        this.a.clear();
        this.f = null;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.l = 0L;
        this.m = F;
        this.n = 0;
        this.o = false;
        this.p = 4098;
        this.q = 0;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = "";
        this.A.e();
        this.B.a.clear();
        this.G.g();
        this.C = null;
        this.v = 0;
        this.w = true;
        this.x = null;
        this.y = false;
        this.z = true;
    }

    public final void i(ibw ibwVar) {
        this.a.clear();
        this.a.add(ibwVar);
    }

    public final void j(String str) {
        if (str == null) {
            str = "und";
        }
        this.d = str;
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ void m(jfy jfyVar) {
        throw null;
    }

    public final void g(Context context, int i) {
        try {
            jfy.f(context, i, this.D, new hue(this, 2));
        } catch (IOException | XmlPullParserException e) {
            throw new lgj(e);
        }
    }
}
