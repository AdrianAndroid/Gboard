package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* renamed from: la  reason: default package */
/* loaded from: classes.dex */
public final class la {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(me meVar) {
        List list = this.l;
        if (list == null) {
            View b = meVar.b(this.d);
            this.d += this.e;
            return b;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((mo) this.l.get(i)).a;
            lz lzVar = (lz) view.getLayoutParams();
            if (!lzVar.c() && this.d == lzVar.a()) {
                c(view);
                return view;
            }
        }
        return null;
    }

    public final void b() {
        c(null);
    }

    public final void c(View view) {
        int a;
        int size = this.l.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            View view3 = ((mo) this.l.get(i2)).a;
            lz lzVar = (lz) view3.getLayoutParams();
            if (view3 != view && !lzVar.c() && (a = (lzVar.a() - this.d) * this.e) >= 0 && a < i) {
                if (a == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i = a;
                }
            }
            i2++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((lz) view2.getLayoutParams()).a();
        }
    }

    public final boolean d(ml mlVar) {
        int i = this.d;
        return i >= 0 && i < mlVar.a();
    }
}
