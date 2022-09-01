package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: icv  reason: default package */
/* loaded from: classes.dex */
public final class icv implements iar, jfx {
    public int a;
    public SparseArray c;
    public SparseArray d;
    private ics f;
    private lfy g;
    private ida h;
    public final List b = lre.A();
    private float i = 1.0f;
    private final ico e = ict.d();

    private final float e(AttributeSet attributeSet) {
        float f = this.i;
        float attributeFloatValue = attributeSet.getAttributeFloatValue(null, "span", -1.0f);
        if (attributeFloatValue <= 0.0f) {
            attributeFloatValue = f;
        }
        this.i = attributeFloatValue;
        return f;
    }

    private final SparseArray f() {
        if (this.d == null) {
            this.d = new SparseArray(2);
        }
        return this.d;
    }

    private final SparseArray g() {
        if (this.c == null) {
            this.c = new SparseArray();
        }
        return this.c;
    }

    private final ics h(AttributeSet attributeSet) {
        ics icsVar = this.f;
        ics icsVar2 = (ics) f().get(attributeSet.getAttributeResourceValue(null, "template_id", 0));
        if (icsVar2 == null) {
            icsVar2 = icsVar;
        }
        this.f = icsVar2;
        return icsVar;
    }

    private final lfy i(AttributeSet attributeSet) {
        lfy lfyVar = this.g;
        lfy lfyVar2 = null;
        String attributeValue = attributeSet.getAttributeValue(null, "splitter");
        if (!TextUtils.isEmpty(attributeValue)) {
            lfyVar2 = lfy.e(attributeValue).h();
        }
        if (lfyVar2 == null) {
            lfyVar2 = lfyVar;
        }
        this.g = lfyVar2;
        return lfyVar;
    }

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        icp icpVar;
        int i;
        String b = jfyVar.b();
        if ("softkey_list".equals(b)) {
            AttributeSet a = jfyVar.a();
            ics h = h(a);
            lfy i2 = i(a);
            float e = e(a);
            jfyVar.e(this);
            this.f = h;
            this.g = i2;
            this.i = e;
        } else if ("unicode_range".equals(b)) {
            AttributeSet a2 = jfyVar.a();
            ics h2 = h(a2);
            lfy i3 = i(a2);
            float e2 = e(a2);
            ida a3 = ida.a(a2, this.g);
            this.h = a3;
            if (a3 == null) {
                throw jfyVar.c("Invalid Unicode Range node");
            }
            jfyVar.e(this);
            this.f = h2;
            this.g = i3;
            this.i = e2;
            this.h = null;
        } else {
            if ("softkey".equals(b)) {
                int attributeResourceValue = jfyVar.a().getAttributeResourceValue(null, "template_id", 0);
                if (attributeResourceValue == 0) {
                    icpVar = this.f;
                    if (icpVar == null) {
                        icpVar = this.e;
                    }
                } else {
                    icp icpVar2 = (icp) f().get(attributeResourceValue);
                    if (icpVar2 == null) {
                        throw jfyVar.c("Undefined SoftKey template: " + attributeResourceValue);
                    }
                    icpVar = icpVar2;
                }
                if (this.h == null) {
                    synchronized (icpVar) {
                        icpVar.v();
                        icpVar.w(this.i);
                        icpVar.o(this.g);
                        icpVar.m(jfyVar);
                        Object c = icpVar.c();
                        if (((ict) c).c != 0) {
                            g().put(((ict) c).c, c);
                        }
                        this.b.add(c);
                    }
                } else if (icpVar instanceof ics) {
                    ics icsVar = (ics) icpVar;
                    Context context = jfyVar.a;
                    synchronized (icsVar) {
                        icsVar.v();
                        icsVar.w(this.i);
                        icsVar.p = this.g;
                        icsVar.m(jfyVar);
                        ida idaVar = this.h;
                        String str = idaVar.e;
                        int[] iArr = idaVar.d;
                        int i4 = idaVar.b;
                        int i5 = idaVar.c;
                        int i6 = i4 <= i5 ? 1 : -1;
                        int i7 = i5 + i6;
                        int i8 = i4;
                        while (i8 != i7) {
                            if (idaVar.d != null && Arrays.binarySearch(iArr, i8) >= 0) {
                                i = i8;
                                i8 = i + i6;
                            }
                            i = i8;
                            icu.a(str, new String(idaVar.a, 0, Character.toChars(i8, idaVar.a, 0)), icsVar, context, jfyVar, this);
                            i8 = i + i6;
                        }
                    }
                } else {
                    throw jfyVar.c("<unicode_range> requires a SoftKey template");
                }
            } else if ("softkey_template".equals(b)) {
                int idAttributeResourceValue = jfyVar.a().getIdAttributeResourceValue(0);
                ics icsVar2 = new ics();
                icsVar2.p = this.g;
                int i9 = jgd.a;
                AttributeSet a4 = jfyVar.a();
                Context context2 = jfyVar.a;
                int attributeCount = a4.getAttributeCount();
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    String attributeName = a4.getAttributeName(i10);
                    if ("layout".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.e, null);
                    } else if ("popup_timing".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.g, null);
                    } else if ("touch_action_repeat_interval".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.i, null);
                    } else if ("touch_action_repeat_start_delay".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.j, null);
                    } else if ("long_press_delay".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.k, null);
                    } else if ("slide_sensitivity".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.h, null);
                    } else if ("multi_touch".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.f, null);
                    } else if ("span".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.l, null);
                    } else if ("content_description".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.c, null);
                    } else if ("additional_content_description".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.d, null);
                    } else if ("alpha".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.m, null);
                    } else if ("disable_lift_to_tap".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.n, null);
                    } else if ("enable_slide_actions_in_a11y_mode".equals(attributeName)) {
                        icsVar2.b(context2, a4, i10, icsVar2.o, null);
                    } else if (!"id".equals(attributeName)) {
                        throw jfyVar.c("Unexpected attribute: ".concat(String.valueOf(attributeName)));
                    }
                }
                jfyVar.e(icsVar2);
                icsVar2.p = null;
                f().put(idAttributeResourceValue, icsVar2);
            } else {
                throw jfyVar.c("Unexpected xml node:".concat(String.valueOf(b)));
            }
        }
    }

    public final icw b() {
        return new icw(this);
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    public final void d(jfy jfyVar) {
        int i = jgd.a;
        AttributeSet a = jfyVar.a();
        this.a = a.getIdAttributeResourceValue(0);
        int attributeResourceValue = a.getAttributeResourceValue(null, "href", 0);
        if (attributeResourceValue != 0) {
            Context context = jfyVar.a;
            jls jlsVar = jfyVar.c;
            icv a2 = icw.a();
            jfy.f(context, attributeResourceValue, jlsVar, new hue(a2, 5));
            icw b = a2.b();
            hgw.d(g(), b.b);
            this.b.addAll(Arrays.asList(b.c));
            hgw.d(f(), b.d);
        }
        jfyVar.e(this);
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ void m(jfy jfyVar) {
        throw null;
    }
}
