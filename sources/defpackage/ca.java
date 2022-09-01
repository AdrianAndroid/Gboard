package defpackage;

import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ca  reason: default package */
/* loaded from: classes.dex */
public final class ca {
    public final ViewGroup a;
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    boolean d = false;

    public ca(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ca b(ViewGroup viewGroup, bi biVar) {
        biVar.ac();
        return g(viewGroup);
    }

    public static void f(bz bzVar) {
        cd.t(bzVar.e, bzVar.a.O);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ca g(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.f128880_resource_name_obfuscated_res_0x7f0b2111);
        if (!(tag instanceof ca)) {
            ca caVar = new ca(viewGroup);
            viewGroup.setTag(R.id.f128880_resource_name_obfuscated_res_0x7f0b2111, caVar);
            return caVar;
        }
        return (ca) tag;
    }

    public final bz a(an anVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bz bzVar = (bz) arrayList.get(i);
            if (bzVar.a.equals(anVar) && !bzVar.c) {
                return bzVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        String str;
        String str2;
        bi.S(2);
        boolean ag = aad.ag(this.a);
        synchronized (this.b) {
            d();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((bz) it.next()).b();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                bz bzVar = (bz) it2.next();
                if (bi.S(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (ag) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(bzVar);
                }
                bzVar.d();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                bz bzVar2 = (bz) it3.next();
                if (bi.S(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (ag) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(bzVar2);
                }
                bzVar2.d();
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bz bzVar = (bz) arrayList.get(i);
            if (bzVar.f == 2) {
                bzVar.f(cd.r(bzVar.a.H().getVisibility()), 1);
            }
        }
    }

    public final void e(int i, int i2, bn bnVar) {
        synchronized (this.b) {
            wq wqVar = new wq();
            bz a = a(bnVar.b);
            if (a != null) {
                a.f(i, i2);
                return;
            }
            bx bxVar = new bx(i, i2, bnVar, wqVar);
            this.b.add(bxVar);
            bxVar.c(new bw(this, bxVar, 0));
            bxVar.c(new bw(this, bxVar, 2));
        }
    }
}
