package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ico  reason: default package */
/* loaded from: classes.dex */
public final class ico implements icp, jfx {
    public ial[] c;
    public CharSequence[] d;
    public int[] e;
    public Object[] f;
    public int[] g;
    public String h;
    public String i;
    public int n;
    private lfy z;
    public int a = 0;
    public final ial[] b = new ial[iah.values().length];
    public final List j = lre.A();
    public final gvy k = new gvy(2);
    public final List l = lre.A();
    public final gvy m = new gvy(2);
    public int o = -1;
    public hhl p = null;
    public boolean q = false;
    public icq r = icq.ON_GESTURE;
    public icr s = icr.NO_SLIDE;
    public float t = 1.0f;
    public int u = 50;
    public int v = 400;
    public int w = 255;
    public boolean x = false;
    public boolean y = false;
    private final iaj A = ial.c();

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        String b = jfyVar.b();
        int[] iArr = null;
        if ("action".equals(b)) {
            iaj iajVar = this.A;
            iajVar.k();
            iajVar.n = this.z;
            int i = jgd.a;
            AttributeSet a = jfyVar.a();
            int attributeCount = a.getAttributeCount();
            iax[] iaxVarArr = null;
            String[] strArr = null;
            for (int i2 = 0; i2 < attributeCount; i2++) {
                String attributeName = a.getAttributeName(i2);
                if ("type".equals(attributeName)) {
                    iajVar.b = (iah) jak.a(a.getAttributeValue(i2), iah.class);
                } else if ("data".equals(attributeName)) {
                    strArr = jgd.t(jfyVar.a, a, i2, iajVar.n);
                    jgd.l(strArr);
                } else if ("keycode".equals(attributeName)) {
                    iArr = iaz.k(jgd.j(jfyVar.a, a, i2), iajVar.n);
                } else if ("intention".equals(attributeName)) {
                    iaxVarArr = (iax[]) jgd.s(jgd.j(jfyVar.a, a, i2), iajVar.n, iax.class);
                } else if ("popup_label".equals(attributeName)) {
                    iajVar.d = jgd.t(jfyVar.a, a, i2, iajVar.n);
                    jgd.l(iajVar.d);
                } else if ("popup_icon".equals(attributeName)) {
                    iajVar.e = jgd.p(jfyVar.a, a, i2, iajVar.n);
                } else if ("action_on_down".equals(attributeName)) {
                    iajVar.f = a.getAttributeBooleanValue(i2, iajVar.f);
                } else if ("repeatable".equals(attributeName)) {
                    iajVar.g = a.getAttributeBooleanValue(i2, false);
                } else if ("popup_layout".equals(attributeName)) {
                    iajVar.h = a.getAttributeResourceValue(i2, 0);
                } else if ("always_show_popup".equals(attributeName)) {
                    iajVar.i = a.getAttributeBooleanValue(i2, iajVar.i);
                } else if ("play_media_effect".equals(attributeName)) {
                    iajVar.j = a.getAttributeBooleanValue(i2, iajVar.j);
                } else if ("icon_background_level".equals(attributeName)) {
                    iajVar.k = a.getAttributeIntValue(i2, iajVar.k);
                } else if ("merge_insertion_index".equals(attributeName)) {
                    iajVar.l = a.getAttributeIntValue(i2, iajVar.l);
                } else if ("content_description".equals(attributeName)) {
                    iajVar.m = a.getAttributeValue(i2);
                } else {
                    throw jfyVar.c("Unexpected attribute: ".concat(String.valueOf(attributeName)));
                }
            }
            iajVar.l(iArr, iaxVarArr, strArr);
            jfyVar.e(iaj.a);
            ial b2 = iajVar.b();
            if (b2 == null) {
                return;
            }
            u(b2);
        } else if ("label".equals(b)) {
            AttributeSet a2 = jfyVar.a();
            f(a2.getAttributeResourceValue(null, "location", 0), jgd.i(a2.getAttributeValue(null, "value")));
        } else if ("icon".equals(b)) {
            AttributeSet a3 = jfyVar.a();
            s(a3.getAttributeResourceValue(null, "location", 0), jgd.f(jfyVar.a, a3, null, "value", 0));
        } else {
            throw jfyVar.c("Unexpected xml node");
        }
    }

    @Override // defpackage.iar
    /* renamed from: b */
    public final ict c() {
        return new ict(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(AttributeSet attributeSet, int i) {
        String attributeName = attributeSet.getAttributeName(i);
        if ("layout".equals(attributeName)) {
            this.n = attributeSet.getAttributeResourceValue(i, 0);
        } else if ("popup_timing".equals(attributeName)) {
            this.r = (icq) jak.b(attributeSet.getAttributeValue(i), icq.ON_GESTURE);
        } else if ("touch_action_repeat_interval".equals(attributeName)) {
            this.u = attributeSet.getAttributeIntValue(i, 50);
        } else if ("touch_action_repeat_start_delay".equals(attributeName)) {
            this.v = attributeSet.getAttributeIntValue(i, 400);
        } else if ("long_press_delay".equals(attributeName)) {
            this.o = attributeSet.getAttributeIntValue(i, -1);
        } else if ("long_press_delay_flag".equals(attributeName)) {
            String attributeValue = attributeSet.getAttributeValue(i);
            this.p = !TextUtils.isEmpty(attributeValue) ? hhq.g(attributeValue) : null;
        } else if ("slide_sensitivity".equals(attributeName)) {
            this.s = (icr) jak.b(attributeSet.getAttributeValue(i), icr.NORMAL);
        } else if ("multi_touch".equals(attributeName)) {
            this.q = attributeSet.getAttributeBooleanValue(i, false);
        } else if ("span".equals(attributeName)) {
            this.t = attributeSet.getAttributeFloatValue(i, 1.0f);
        } else if ("content_description".equals(attributeName)) {
            this.h = attributeSet.getAttributeValue(i);
        } else if ("additional_content_description".equals(attributeName)) {
            this.i = attributeSet.getAttributeValue(i);
        } else if ("alpha".equals(attributeName)) {
            this.w = attributeSet.getAttributeIntValue(i, 255);
        } else if ("disable_lift_to_tap".equals(attributeName)) {
            this.x = attributeSet.getAttributeBooleanValue(i, false);
        } else if (!"enable_slide_actions_in_a11y_mode".equals(attributeName)) {
        } else {
            this.y = attributeSet.getAttributeBooleanValue(i, false);
        }
    }

    public final void e(int i, Object obj) {
        this.j.add(obj);
        this.k.b(i);
    }

    public final void f(int i, CharSequence charSequence) {
        this.l.add(charSequence);
        this.m.b(i);
    }

    public final void g() {
        Arrays.fill(this.b, (Object) null);
    }

    public final void h() {
        this.l.clear();
        this.m.d();
    }

    public final void i(ict ictVar) {
        j(ictVar);
        Arrays.fill(this.b, (Object) null);
        l(ictVar.m, false);
    }

    public final void j(ict ictVar) {
        this.a = ictVar.c;
        this.h = ictVar.t;
        this.j.clear();
        Collections.addAll(this.j, ictVar.p);
        this.k.d();
        for (int i : ictVar.q) {
            this.k.b(i);
        }
        this.l.clear();
        Collections.addAll(this.l, ictVar.n);
        this.m.d();
        for (int i2 : ictVar.o) {
            this.m.b(i2);
        }
        this.n = ictVar.e;
        this.o = ictVar.i;
        this.p = null;
        this.q = ictVar.r;
        this.r = ictVar.f;
        this.s = ictVar.d;
        this.t = ictVar.s;
        this.u = ictVar.h;
        this.v = ictVar.g;
        this.w = ictVar.u;
        this.x = ictVar.k;
        this.y = ictVar.l;
    }

    public final void k(ial ialVar, boolean z) {
        int i;
        ial[] ialVarArr;
        iaj iajVar;
        iay[] iayVarArr;
        int[] iArr;
        int i2;
        ial[] ialVarArr2;
        iaj iajVar2;
        boolean z2;
        int ordinal = ialVar.c.ordinal();
        ial[] ialVarArr3 = this.b;
        ial ialVar2 = ialVarArr3[ordinal];
        if (ialVar2 == null) {
            ialVarArr3[ordinal] = ialVar;
        } else if (!z || !ialVar2.equals(ialVar)) {
            ial[] ialVarArr4 = this.b;
            iaj c = ial.c();
            c.h(ialVar2);
            if (ialVar != null) {
                if (c.b == ialVar.c) {
                    if (c.c == null || (iayVarArr = ialVar.d) == null) {
                        i = ordinal;
                        ialVarArr = ialVarArr4;
                        iajVar = c;
                        ((luc) ial.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/ActionDef$Builder", "merge", 609, "ActionDef.java")).G("Cannot merge key datas %s with %s.", Arrays.toString(iajVar.c), Arrays.toString(ialVar.d));
                    } else {
                        if (ialVar.e) {
                            c.f = true;
                        }
                        if (ialVar.f) {
                            c.g = true;
                        }
                        int i3 = ialVar.g;
                        if (i3 != 0) {
                            c.h = i3;
                        }
                        if (ialVar.h) {
                            c.i = true;
                        }
                        if (!ialVar.i) {
                            c.j = false;
                        }
                        int i4 = ialVar.j;
                        if (i4 != 0) {
                            c.k = i4;
                        }
                        if (!z) {
                            i = ordinal;
                            ialVarArr = ialVarArr4;
                            iajVar = c;
                            int length = iayVarArr.length;
                            int a = iajVar.a();
                            int i5 = a + length;
                            int i6 = iajVar.l;
                            if (i6 >= 0 && i6 < a) {
                                a = i6;
                            }
                            int i7 = a + length;
                            if (i6 >= 0) {
                                iajVar.l = i6 + length;
                            }
                            iajVar.c = (iay[]) iaj.g(new iay[i5], iajVar.c, iay.b, a, i7);
                            for (int i8 = 0; i8 < length; i8++) {
                                iay iayVar = ialVar.d[i8];
                                iajVar.c[a + i8] = new iay(iayVar.c, iayVar.d, iayVar.e);
                            }
                            if (!iaj.f(iajVar.d, ialVar.m)) {
                                iajVar.d = (String[]) iaj.g(new String[i5], iajVar.d, ialVar.m, a, i7);
                            }
                            if (!iaj.e(iajVar.e, ialVar.n)) {
                                int[] iArr2 = new int[i5];
                                iaj.j(iArr2, iajVar.e, ialVar.n, a, i7);
                                iajVar.e = iArr2;
                            }
                        } else {
                            int length2 = iayVarArr.length;
                            int a2 = c.a();
                            int i9 = a2 + length2;
                            iay[] iayVarArr2 = (iay[]) iaj.g(new iay[i9], c.c, iay.b, a2, i9);
                            boolean z3 = !iaj.f(c.d, ialVar.m);
                            boolean z4 = !iaj.e(c.e, ialVar.n);
                            String[] strArr = z3 ? (String[]) iaj.g(new String[i9], c.d, gvw.g, a2, i9) : null;
                            if (z4) {
                                iArr = new int[i9];
                                iaj.j(iArr, c.e, gvw.b, a2, i9);
                            } else {
                                iArr = null;
                            }
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < length2) {
                                iay iayVar2 = ialVar.d[i10];
                                int i12 = iayVar2.c;
                                iax iaxVar = iayVar2.d;
                                Object obj = iayVar2.e;
                                int i13 = length2;
                                int i14 = 0;
                                while (true) {
                                    i2 = ordinal;
                                    if (i14 >= a2) {
                                        ialVarArr2 = ialVarArr4;
                                        break;
                                    }
                                    ialVarArr2 = ialVarArr4;
                                    iay iayVar3 = (iay) iaj.d(c.c, i14, null);
                                    if (iayVar3 == null) {
                                        break;
                                    }
                                    iax iaxVar2 = iayVar3.d;
                                    if (!(iaxVar2 == null && iaxVar == null) && (iaxVar2 == null || !iaxVar2.equals(iaxVar))) {
                                        iajVar2 = c;
                                        z2 = false;
                                    } else {
                                        iajVar2 = c;
                                        z2 = true;
                                    }
                                    Object obj2 = iayVar3.e;
                                    boolean z5 = (obj2 == null && obj == null) || (obj2 != null && obj2.equals(obj));
                                    if (iayVar3.c != i12 || !z2 || !z5) {
                                        i14++;
                                        ordinal = i2;
                                        ialVarArr4 = ialVarArr2;
                                        c = iajVar2;
                                    }
                                }
                                iajVar2 = c;
                                int i15 = a2 + i11;
                                iayVarArr2[i15] = new iay(i12, iaxVar, obj);
                                if (z4) {
                                    int[] iArr3 = ialVar.n;
                                    int i16 = iArr3[0];
                                    int length3 = iArr3.length;
                                    if (length3 != 0 && length3 != 1) {
                                        i16 = iArr3[i10];
                                    }
                                    iArr[i15] = i16;
                                }
                                if (z3) {
                                    String[] strArr2 = ialVar.m;
                                    strArr[i15] = (String) iaj.d(strArr2, i10, strArr2[0]);
                                }
                                i11++;
                                i10++;
                                length2 = i13;
                                ordinal = i2;
                                ialVarArr4 = ialVarArr2;
                                c = iajVar2;
                            }
                            i = ordinal;
                            ialVarArr = ialVarArr4;
                            int i17 = a2 + i11;
                            iajVar = c;
                            iajVar.c = (iay[]) Arrays.copyOf(iayVarArr2, i17);
                            if (z4) {
                                iajVar.e = Arrays.copyOf(iArr, i17);
                            }
                            if (z3) {
                                iajVar.d = (String[]) Arrays.copyOf(strArr, i17);
                            }
                        }
                    }
                    ialVarArr[i] = iajVar.b();
                }
                ((luc) ial.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/ActionDef$Builder", "merge", 605, "ActionDef.java")).G("Cannot merge action %s with %s.", c.b, ialVar.c);
            } else {
                ((luc) ial.a.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/ActionDef$Builder", "merge", 601, "ActionDef.java")).t("Cannot merge with null.");
            }
            i = ordinal;
            ialVarArr = ialVarArr4;
            iajVar = c;
            ialVarArr[i] = iajVar.b();
        }
    }

    public final void l(ial[] ialVarArr, boolean z) {
        for (ial ialVar : ialVarArr) {
            if (ialVar != null) {
                k(ialVar, z);
            }
        }
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ void m(jfy jfyVar) {
        int i = jgd.a;
        AttributeSet a = jfyVar.a();
        this.a = a.getIdAttributeResourceValue(0);
        int attributeCount = a.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            d(a, i2);
        }
        jfyVar.e(this);
    }

    @Override // defpackage.icp
    /* renamed from: n */
    public final void v() {
        this.a = 0;
        Arrays.fill(this.b, (Object) null);
        this.c = null;
        this.h = null;
        this.i = null;
        this.j.clear();
        this.f = null;
        this.k.d();
        this.g = null;
        this.l.clear();
        this.d = null;
        this.m.d();
        this.e = null;
        this.n = 0;
        this.o = -1;
        this.p = null;
        this.q = false;
        this.r = icq.ON_GESTURE;
        this.s = icr.NO_SLIDE;
        this.t = 1.0f;
        this.z = null;
        this.u = 50;
        this.v = 400;
        this.w = 255;
        this.x = false;
        this.y = false;
    }

    @Override // defpackage.ias
    public final /* synthetic */ void o(lfy lfyVar) {
        this.z = lfyVar;
    }

    public final void p(ial ialVar) {
        if (ialVar != null) {
            this.b[ialVar.c.ordinal()] = ialVar;
        }
    }

    public final void q(int[] iArr, Object[] objArr) {
        this.f = objArr;
        this.g = iArr;
    }

    public final void r(int[] iArr, CharSequence[] charSequenceArr) {
        this.d = charSequenceArr;
        this.e = iArr;
    }

    public final void s(int i, int i2) {
        e(i, Integer.valueOf(i2));
    }

    public final void t(CharSequence charSequence) {
        f(0, charSequence);
    }

    public final void u(ial ialVar) {
        k(ialVar, false);
    }

    @Override // defpackage.icp
    public final /* synthetic */ void w(float f) {
        this.t = f;
    }
}
