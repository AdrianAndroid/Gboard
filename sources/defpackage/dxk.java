package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: dxk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dxk implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dxk(dvx dvxVar, int i, int i2) {
        this.c = i2;
        this.b = dvxVar;
        this.a = i;
    }

    public /* synthetic */ dxk(dxl dxlVar, int i, int i2) {
        this.c = i2;
        this.b = dxlVar;
        this.a = i;
    }

    public /* synthetic */ dxk(hcl hclVar, int i, int i2) {
        this.c = i2;
        this.b = hclVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.b;
                ((hci) ((hcl) obj).e.a).i(this.a, 3);
                return;
            }
            ((dvx) this.b).h(this.a);
            return;
        }
        Object obj2 = this.b;
        int i2 = this.a;
        dxl dxlVar = (dxl) obj2;
        if (view == dxlVar.a.d.get(i2)) {
            return;
        }
        dxlVar.a.d.set(i2, view);
        Iterator it = ((List) dxlVar.a.c.get(i2)).iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            View view2 = (View) it.next();
            if (view2 == view) {
                z = true;
            }
            view2.setSelected(z);
        }
        if (i2 != 0) {
            return;
        }
        dxlVar.a.f(0);
    }
}
