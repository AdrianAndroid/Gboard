package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: ibk  reason: default package */
/* loaded from: classes.dex */
public final class ibk implements iar, jfx {
    public int a = 0;
    public String b = null;
    public int c = 0;
    public long d = 0;
    public float e = 1.0f;
    public float f = 1.0f;
    public long g = 0;
    public String h = null;
    public long i = 0;
    public ibl j = ibl.NONE;
    public ibz k = null;
    public int l = 0;
    public int m = 0;
    public final List n;
    public jls o;

    public ibk() {
        ArrayList A = lre.A();
        this.n = A;
        A.clear();
    }

    private final ica f() {
        ica icaVar = new ica();
        this.n.add(icaVar);
        return icaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    @Override // defpackage.jfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.jfy r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibk.a(jfy):void");
    }

    public final ibm b() {
        if (this.a != 0) {
            if (this.k == null || this.l != 0) {
                return new ibm(this);
            }
            throw new IllegalStateException("Invalid recent_key_layout");
        }
        throw new IllegalStateException("Invalid keyboard id ");
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    public final void d(jfy jfyVar) {
        int i = jgd.a;
        AttributeSet a = jfyVar.a();
        int attributeCount = a.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = a.getAttributeName(i2);
            if ("class".equals(attributeName)) {
                this.b = a.getAttributeValue(i2);
            } else if ("popup".equals(attributeName)) {
                this.c = a.getAttributeResourceValue(i2, this.c);
            } else if ("initial_states".equals(attributeName)) {
                this.d = iby.a(a.getAttributeValue(i2));
            } else if ("candidate_text_size_ratio".equals(attributeName)) {
                float attributeFloatValue = a.getAttributeFloatValue(i2, this.e);
                this.e = attributeFloatValue;
                if (attributeFloatValue <= 0.0f) {
                    throw jfyVar.c("Invalid candidate_text_size_ratio");
                }
            } else if ("key_text_size_ratio".equals(attributeName)) {
                float attributeFloatValue2 = a.getAttributeFloatValue(i2, this.f);
                this.f = attributeFloatValue2;
                if (attributeFloatValue2 <= 0.0f) {
                    throw jfyVar.c("Invalid key_text_size_ratio");
                }
            } else if ("persistent_states".equals(attributeName)) {
                this.g = iby.a(a.getAttributeValue(i2));
            } else if ("persistent_states_pref_key".equals(attributeName)) {
                this.h = a.getAttributeValue(i2);
            } else if ("session_states".equals(attributeName)) {
                this.i = iby.a(a.getAttributeValue(i2));
            } else if ("remember_recent_key".equals(attributeName)) {
                this.j = (ibl) jak.b(a.getAttributeValue(i2), ibl.NONE);
            } else if ("recent_key_type".equals(attributeName)) {
                String attributeValue = a.getAttributeValue(i2);
                this.k = TextUtils.isEmpty(attributeValue) ? null : ibz.a(attributeValue);
            } else if ("recent_key_layout".equals(attributeName)) {
                this.l = a.getAttributeResourceValue(i2, this.l);
            } else if ("recent_key_popup_layout".equals(attributeName)) {
                this.m = a.getAttributeResourceValue(i2, this.m);
            } else if ("id".equals(attributeName)) {
                this.a = a.getIdAttributeResourceValue(0);
            } else {
                throw jfyVar.c("Invalid attribute: ".concat(String.valueOf(attributeName)));
            }
        }
        if (this.c == 0) {
            this.c = jbt.j(jfyVar.a, R.attr.f5940_resource_name_obfuscated_res_0x7f040185);
        }
        jfyVar.e(this);
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ void m(jfy jfyVar) {
        throw null;
    }

    public final void e(Context context, int i) {
        try {
            jfy.f(context, i, this.o, new hue(this, 3));
        } catch (IOException | XmlPullParserException e) {
            throw new lgj(String.format("Failed to load KeyboardDef from: %s", Integer.valueOf(i)), e);
        }
    }
}
