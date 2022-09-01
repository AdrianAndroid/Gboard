package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: aik  reason: default package */
/* loaded from: classes.dex */
public final class aik extends ls implements ahu {
    private final PreferenceGroup e;
    private final Runnable i = new od(this, 17);
    private final Handler h = new Handler(Looper.getMainLooper());
    private List f = new ArrayList();
    public List d = new ArrayList();
    private final List g = new ArrayList();

    public aik(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.H = this;
        if (preferenceGroup instanceof PreferenceScreen) {
            u(((PreferenceScreen) preferenceGroup).d);
        } else {
            u(true);
        }
        y();
    }

    private final void A(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int k = preferenceGroup.k();
        for (int i = 0; i < k; i++) {
            Preference o = preferenceGroup.o(i);
            list.add(o);
            aij aijVar = new aij(o);
            if (!this.g.contains(aijVar)) {
                this.g.add(aijVar);
            }
            if (o instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                if (preferenceGroup2.ag()) {
                    A(list, preferenceGroup2);
                }
            }
            o.H = this;
        }
    }

    private static final boolean B(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    private final List z(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int k = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            Preference o = preferenceGroup.o(i2);
            if (o.A) {
                if (!B(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(o);
                } else {
                    arrayList2.add(o);
                }
                if (!(o instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                    if (!preferenceGroup2.ag()) {
                        continue;
                    } else if (!B(preferenceGroup) || !B(preferenceGroup2)) {
                        for (Preference preference : z(preferenceGroup2)) {
                            if (!B(preferenceGroup) || i < preferenceGroup.c) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (B(preferenceGroup) && i > preferenceGroup.c) {
            ahm ahmVar = new ahm(preferenceGroup.j, arrayList2, preferenceGroup.eZ());
            ahmVar.o = new bta(this, preferenceGroup, 1);
            arrayList.add(ahmVar);
        }
        return arrayList;
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        aij aijVar = (aij) this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, ait.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = ej.a(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(aijVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            aad.O(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = aijVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new ais(inflate);
    }

    @Override // defpackage.ahu
    public final void e() {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.d.size();
    }

    @Override // defpackage.ls
    public final int he(int i) {
        aij aijVar = new aij(x(i));
        int indexOf = this.g.indexOf(aijVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.g.size();
        this.g.add(aijVar);
        return size;
    }

    @Override // defpackage.ls
    public final long hf(int i) {
        if (!this.b) {
            return -1L;
        }
        return x(i).eZ();
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        ais aisVar = (ais) moVar;
        Preference x = x(i);
        Drawable background = aisVar.a.getBackground();
        Drawable drawable = aisVar.s;
        if (background != drawable) {
            aad.O(aisVar.a, drawable);
        }
        TextView textView = (TextView) aisVar.F(16908310);
        if (textView != null && aisVar.t != null && !textView.getTextColors().equals(aisVar.t)) {
            textView.setTextColor(aisVar.t);
        }
        x.a(aisVar);
    }

    public final Preference x(int i) {
        if (i < 0 || i >= ha()) {
            return null;
        }
        return (Preference) this.d.get(i);
    }

    public final void y() {
        for (Preference preference : this.f) {
            preference.H = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        A(arrayList, this.e);
        this.d = z(this.e);
        aip aipVar = this.e.k;
        fc();
        for (Preference preference2 : this.f) {
        }
    }
}
