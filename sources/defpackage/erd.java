package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: erd  reason: default package */
/* loaded from: classes.dex */
public final class erd extends eqh implements gyz {
    private final eqm b;
    private final equ c;

    public erd(LayoutInflater layoutInflater, eqm eqmVar, equ equVar) {
        super(layoutInflater);
        this.b = eqmVar;
        this.c = equVar;
    }

    private final void c(View view, View view2) {
        kcq a = this.c.a();
        if (a != null) {
            a.B(view, view2 == null ? null : kcq.z(view2));
        }
        gqa.v(view);
    }

    @Override // defpackage.gyz
    public final ColorStateList a(int i) {
        ColorStateList a;
        kcq a2 = this.c.a();
        ColorStateList colorStateList = null;
        if (a2 != null) {
            llw llwVar = eqb.b;
            Integer valueOf = Integer.valueOf(i);
            String str = (String) llwVar.get(valueOf);
            if (str == null) {
                String str2 = (String) eqb.a.get(valueOf);
                if (str2 != null) {
                    for (eqr eqrVar : a2.A(str2, null)) {
                        a = eqrVar.a();
                        if (a != null) {
                            colorStateList = a;
                            break;
                        }
                    }
                }
            } else {
                for (eqr eqrVar2 : a2.A(str, null)) {
                    a = eqrVar2.b();
                    if (a != null) {
                        colorStateList = a;
                        break;
                    }
                }
            }
        }
        return colorStateList != null ? colorStateList : getContext().getResources().getColorStateList(i);
    }

    @Override // defpackage.gyz
    public final Drawable b(int i) {
        String str;
        kcq a = this.c.a();
        Drawable drawable = null;
        if (a != null && (str = (String) eqb.c.get(Integer.valueOf(i))) != null) {
            Iterator it = a.A(str, null).iterator();
            while (true) {
                if (it.hasNext()) {
                    Drawable c = ((eqr) it.next()).c(getContext());
                    if (c != null) {
                        drawable = c;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return drawable != null ? drawable : getContext().getResources().getDrawable(i, getContext().getTheme());
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new erd(this.a.cloneInContext(context), this.b, this.c);
    }

    @Override // defpackage.eqh, android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup) {
        return inflate(i, viewGroup, viewGroup != null);
    }

    public erd(LayoutInflater layoutInflater, equ equVar) {
        this(layoutInflater, new eqb(), equVar);
    }

    @Override // defpackage.eqh, android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        try {
            if (viewGroup == null || !z) {
                View inflate = super.inflate(i, viewGroup, z);
                c(inflate, viewGroup);
                return inflate;
            }
            View inflate2 = super.inflate(i, viewGroup, true);
            for (int childCount = viewGroup.getChildCount(); childCount < viewGroup.getChildCount(); childCount++) {
                c(viewGroup.getChildAt(childCount), viewGroup);
            }
            return inflate2;
        } catch (InflateException e) {
            throw new InflateException("Failed to inflate resource: ".concat(jbi.h(i)), e);
        }
    }

    @Override // defpackage.eqh, android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        return inflate(xmlPullParser, viewGroup, viewGroup != null);
    }

    @Override // defpackage.eqh, android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        if (viewGroup == null || !z) {
            View inflate = super.inflate(xmlPullParser, viewGroup, z);
            c(inflate, viewGroup);
            return inflate;
        }
        View inflate2 = super.inflate(xmlPullParser, viewGroup, true);
        for (int childCount = viewGroup.getChildCount(); childCount < viewGroup.getChildCount(); childCount++) {
            c(viewGroup.getChildAt(childCount), viewGroup);
        }
        return inflate2;
    }
}
