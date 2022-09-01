package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: ics  reason: default package */
/* loaded from: classes.dex */
public final class ics extends iag implements icp, jfx {
    public lfy p;
    private List v;
    public final List b = lre.A();
    public final iaf c = new iaf();
    public final iaf d = new iaf();
    private final List r = lre.A();
    private final List s = lre.A();
    private final List t = lre.A();
    private final List u = lre.A();
    public final iad e = new iad(0);
    public final hzw f = new hzw(false);
    public final hzy g = new hzy(icq.ON_GESTURE);
    public final hzy h = new hzy(icr.NORMAL);
    public final iaa i = new iaa(50);
    public final iaa j = new iaa(400);
    public final iaa k = new iaa(-1);
    public final hzz l = new hzz(Float.valueOf(1.0f));
    public final iaa m = new iaa(255);
    public final hzw n = new hzw(false);
    public final hzw o = new hzw(false);
    private final ico q = new ico();

    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        String b = jfyVar.b();
        if ("action".equals(b)) {
            iak iakVar = new iak();
            iakVar.q = this.p;
            int i = jgd.a;
            AttributeSet a = jfyVar.a();
            Context context = jfyVar.a;
            int attributeCount = a.getAttributeCount();
            for (int i2 = 0; i2 < attributeCount; i2++) {
                String attributeName = a.getAttributeName(i2);
                if ("type".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.c, null);
                } else if ("data".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.f, iakVar.q);
                } else if ("keycode".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.d, iakVar.q);
                } else if ("intention".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.e, iakVar.q);
                } else if ("popup_label".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.g, iakVar.q);
                } else if ("popup_icon".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.h, iakVar.q);
                } else if ("action_on_down".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.i, null);
                } else if ("repeatable".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.j, null);
                } else if ("popup_layout".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.k, null);
                } else if ("always_show_popup".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.l, null);
                } else if ("play_media_effect".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.m, null);
                } else if ("icon_background_level".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.n, null);
                } else if ("merge_insertion_index".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.o, null);
                } else if ("content_description".equals(attributeName)) {
                    iakVar.b(context, a, i2, iakVar.p, null);
                } else {
                    throw jfyVar.c("Unexpected attribute: ".concat(String.valueOf(attributeName)));
                }
            }
            this.b.add(iakVar);
            return;
        }
        hzv hzvVar = null;
        if ("label".equals(b)) {
            AttributeSet a2 = jfyVar.a();
            Context context2 = jfyVar.a;
            int attributeCount2 = a2.getAttributeCount();
            int i3 = 0;
            for (int i4 = 0; i4 < attributeCount2; i4++) {
                String attributeName2 = a2.getAttributeName(i4);
                if ("location".equals(attributeName2)) {
                    i3 = a2.getAttributeResourceValue(i4, 0);
                } else if ("value".equals(attributeName2)) {
                    hzvVar = new iaf();
                    b(context2, a2, i4, hzvVar, null);
                }
            }
            if (i3 == 0 || hzvVar == null) {
                return;
            }
            this.u.add(Integer.valueOf(i3));
            this.t.add(hzvVar);
        } else if ("icon".equals(b)) {
            AttributeSet a3 = jfyVar.a();
            Context context3 = jfyVar.a;
            int attributeCount3 = a3.getAttributeCount();
            int i5 = 0;
            for (int i6 = 0; i6 < attributeCount3; i6++) {
                String attributeName3 = a3.getAttributeName(i6);
                if ("location".equals(attributeName3)) {
                    i5 = a3.getAttributeResourceValue(i6, 0);
                } else if ("value".equals(attributeName3)) {
                    hzvVar = new iad(0);
                    b(context3, a3, i6, hzvVar, null);
                }
            }
            if (i5 == 0 || hzvVar == null) {
                return;
            }
            this.s.add(Integer.valueOf(i5));
            this.r.add(hzvVar);
        } else {
            throw jfyVar.c("Unexpected xml node:".concat(String.valueOf(b)));
        }
    }

    @Override // defpackage.iar
    /* renamed from: f */
    public final ict c() {
        this.q.w = ((Integer) this.m.a).intValue();
        ico icoVar = this.q;
        icoVar.h = (String) this.c.a;
        icoVar.i = (String) this.d.a;
        icoVar.n = ((Integer) this.e.a).intValue();
        this.q.o = ((Integer) this.k.a).intValue();
        this.q.q = ((Boolean) this.f.a).booleanValue();
        ico icoVar2 = this.q;
        icoVar2.r = (icq) this.g.a;
        icoVar2.s = (icr) this.h.a;
        icoVar2.t = ((Float) this.l.a).floatValue();
        this.q.u = ((Integer) this.i.a).intValue();
        this.q.v = ((Integer) this.j.a).intValue();
        this.q.x = ((Boolean) this.n.a).booleanValue();
        this.q.y = ((Boolean) this.o.a).booleanValue();
        this.q.g();
        for (iak iakVar : this.b) {
            iakVar.b.k();
            iakVar.b.b = (iah) iakVar.c.a;
            iakVar.b.l((int[]) iakVar.d.a, (iax[]) iakVar.e.a, (Object[]) iakVar.f.a);
            iakVar.b.d = (String[]) iakVar.g.a;
            iakVar.b.e = (int[]) iakVar.h.a;
            iakVar.b.f = ((Boolean) iakVar.i.a).booleanValue();
            iakVar.b.g = ((Boolean) iakVar.j.a).booleanValue();
            iakVar.b.h = ((Integer) iakVar.k.a).intValue();
            iakVar.b.i = ((Boolean) iakVar.l.a).booleanValue();
            iakVar.b.j = ((Boolean) iakVar.m.a).booleanValue();
            iakVar.b.k = ((Integer) iakVar.n.a).intValue();
            iakVar.b.l = ((Integer) iakVar.o.a).intValue();
            iakVar.b.m = (String) iakVar.p.a;
            ial b = iakVar.b.b();
            if (b != null) {
                this.q.u(b);
            }
        }
        this.q.h();
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            this.q.f(((Integer) this.u.get(i)).intValue(), (CharSequence) ((iaf) this.t.get(i)).a);
        }
        ico icoVar3 = this.q;
        icoVar3.j.clear();
        icoVar3.k.d();
        int size2 = this.r.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.q.s(((Integer) this.s.get(i2)).intValue(), ((Integer) ((iad) this.r.get(i2)).a).intValue());
        }
        List list = this.v;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.q.d((AttributeSet) it.next(), ((Integer) it.next()).intValue());
            }
        }
        return this.q.c();
    }

    @Override // defpackage.iar
    /* renamed from: g */
    public final void m(jfy jfyVar) {
        int i = jgd.a;
        AttributeSet a = jfyVar.a();
        Context context = jfyVar.a;
        this.q.a = a.getIdAttributeResourceValue(0);
        int attributeCount = a.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = a.getAttributeName(i2);
            if (!"id".equals(attributeName) && !"template_id".equals(attributeName)) {
                try {
                    boolean d = d(context, a, attributeName, i2, this.p);
                    boolean z = d;
                    for (iak iakVar : this.b) {
                        z |= iakVar.d(context, a, attributeName, i2, this.p);
                    }
                    if (!z) {
                        if (this.v == null) {
                            this.v = new ArrayList();
                        }
                        this.v.add(a);
                        this.v.add(Integer.valueOf(i2));
                    }
                } catch (XmlPullParserException e) {
                    throw jfyVar.c(e.getMessage());
                }
            }
        }
    }

    @Override // defpackage.icp
    /* renamed from: h */
    public final void v() {
        this.q.v();
        x();
        for (iak iakVar : this.b) {
            iakVar.x();
        }
        this.p = null;
        this.v = null;
    }

    @Override // defpackage.icp
    /* renamed from: i */
    public final void w(float f) {
        this.l.b = Float.valueOf(f);
        this.l.d();
    }

    @Override // defpackage.ias
    public final /* synthetic */ void o(lfy lfyVar) {
        this.p = lfyVar;
    }
}
