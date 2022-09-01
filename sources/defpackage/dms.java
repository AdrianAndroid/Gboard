package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.languageselection.LanguageDraggableView;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: dms  reason: default package */
/* loaded from: classes.dex */
public final class dms extends ls implements View.OnClickListener {
    public final Context d;
    public RecyclerView e;
    public boolean f;
    public boolean g;
    public ot h;
    public dmr i;
    public List j = llp.q();
    public boolean k = false;
    public final hqy l;

    public dms(Context context, hqy hqyVar) {
        this.d = context;
        this.l = hqyVar;
    }

    public static void z(int i) {
        ieh.j().e(hxs.a, Integer.valueOf(i));
    }

    public final void A(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new dmv((hqt) it.next()));
        }
        if (arrayList.equals(this.j)) {
            return;
        }
        this.j = arrayList;
        B();
        fc();
    }

    public final void B() {
        boolean z = false;
        boolean z2 = ha() > 1 && !gqa.a(this.d).e;
        this.f = z2;
        if (z2 && !this.k) {
            z = true;
        }
        this.g = z;
    }

    public final void C() {
        ArrayList arrayList = new ArrayList(this.j.size());
        for (dmv dmvVar : this.j) {
            arrayList.add(dmvVar.a);
            iin.p(this.d, dmvVar.a, 2);
        }
        this.l.l(arrayList);
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        dmu dmuVar = new dmu(this.d, (LanguageDraggableView) LayoutInflater.from(this.d).inflate(R.layout.f142680_resource_name_obfuscated_res_0x7f0e0413, viewGroup, false), this);
        ((LanguageDraggableView) dmuVar.a).d.setOnTouchListener(dmuVar);
        return dmuVar;
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.j.size();
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        dmv dmvVar = (dmv) this.j.get(i);
        LanguageDraggableView languageDraggableView = (LanguageDraggableView) ((dmu) moVar).a;
        String o = dmvVar.a.o(1);
        String o2 = dmvVar.a.o(2);
        languageDraggableView.a.setText(o);
        languageDraggableView.c.setText(o2);
        languageDraggableView.setContentDescription(o + ", " + o2);
        int i2 = 8;
        boolean z = false;
        languageDraggableView.b.setVisibility(true != this.k ? 8 : 0);
        boolean z2 = this.k && this.f;
        ImageView imageView = languageDraggableView.d;
        if (true == z2) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        CheckBox checkBox = languageDraggableView.b;
        checkBox.setOnCheckedChangeListener(null);
        if (this.k) {
            z = dmvVar.b;
        }
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(new aix(dmvVar, 3));
        languageDraggableView.e = dmvVar;
        aad.S(languageDraggableView, 0.0f);
        languageDraggableView.invalidate();
        languageDraggableView.requestLayout();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dmr dmrVar = this.i;
        if (dmrVar != null) {
            this.e.c(view);
            dmrVar.a(view);
        }
    }

    public final boolean x(int i, int i2) {
        int ha;
        if (i < 0 || i2 < 0 || i == i2 || i >= (ha = ha()) || i2 >= ha) {
            return false;
        }
        Collections.swap(this.j, i, i2);
        C();
        z(5);
        hj(i, i2);
        return true;
    }

    public final boolean y(int i) {
        if (i < 0 || i >= ha() || ha() <= 1) {
            return false;
        }
        this.j.remove(i);
        C();
        B();
        z(4);
        m(i);
        dmr dmrVar = this.i;
        if (dmrVar != null) {
            dmrVar.b();
        }
        return true;
    }
}
