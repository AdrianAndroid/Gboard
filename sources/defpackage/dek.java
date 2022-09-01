package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: dek  reason: default package */
/* loaded from: classes.dex */
public class dek extends ddz {
    private final Context a;
    private final deq c;
    private final SparseArray d = new SparseArray(2);

    public dek(Context context, deq deqVar) {
        this.a = context;
        this.c = deqVar;
    }

    private final xy m(int i) {
        xy xyVar = (xy) this.d.get(i);
        if (xyVar == null) {
            xy xyVar2 = new xy(5);
            this.d.put(i, xyVar2);
            return xyVar2;
        }
        return xyVar;
    }

    @Override // defpackage.ald
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.ald
    public Object b(ViewGroup viewGroup, int i) {
        deq deqVar = this.c;
        l(i);
        int e = deqVar.e();
        View view = (View) m(e).a();
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(e, viewGroup, false);
        }
        viewGroup.addView(view);
        this.c.d(view, l(i));
        return view;
    }

    @Override // defpackage.ald
    public void c(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        this.c.b(view);
        deq deqVar = this.c;
        l(i);
        m(deqVar.e()).b(obj);
    }

    @Override // defpackage.ald
    public final boolean h(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.ald
    public final int j() {
        return -2;
    }
}
