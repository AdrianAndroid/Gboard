package defpackage;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: dyi  reason: default package */
/* loaded from: classes.dex */
public final class dyi implements imm {
    private final dyh c;
    private final qq a = new qq();
    private final qq b = new qq();
    private final View.OnLayoutChangeListener d = new dkr(this, 4);

    public dyi(dyh dyhVar) {
        this.c = dyhVar;
    }

    private final void g(View view) {
        if (!this.a.remove(view) || !this.a.isEmpty()) {
            return;
        }
        this.c.e(false);
    }

    private final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((View) it.next()).removeOnLayoutChangeListener(this.d);
        }
        this.a.clear();
        this.b.clear();
    }

    private static boolean i(View view, Rect rect) {
        if (view.willNotDraw() || !view.isShown()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (i(viewGroup.getChildAt(i), rect)) {
                        return true;
                    }
                }
            }
            return false;
        }
        Rect rect2 = new Rect();
        jdy.j(view, rect2);
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            rect2.set(rect2.left, rect2.top, rect2.left + view.getMeasuredWidth(), rect2.top + view.getMeasuredHeight());
        }
        return rect2.intersect(rect);
    }

    @Override // defpackage.imm
    public final void a() {
        this.c.e(false);
        h();
    }

    public final void b(View view) {
        View a;
        if ((view.getId() == R.id.f59070_resource_name_obfuscated_res_0x7f0b04ca && view.findViewById(R.id.f67800_resource_name_obfuscated_res_0x7f0b0890) == null) || (a = this.c.a()) == null) {
            return;
        }
        Rect rect = new Rect();
        jdy.j(a, rect);
        if (i(view, rect)) {
            if (!this.a.add(view)) {
                return;
            }
            this.c.e(true);
            return;
        }
        g(view);
    }

    @Override // defpackage.imm
    public final void c(View view) {
        view.removeOnLayoutChangeListener(this.d);
        g(view);
    }

    @Override // defpackage.imm
    public final void d(View view, Animator animator) {
        b(view);
        view.addOnLayoutChangeListener(this.d);
        this.b.add(view);
        if (animator != null) {
            animator.addListener(new dyg(this, view, 0));
        }
    }

    public final void e() {
        imn aa;
        hsk b = hsx.b();
        if (b == null || (aa = b.aa()) == null) {
            return;
        }
        ArrayList<View> arrayList = new ArrayList();
        imr imrVar = (imr) aa;
        arrayList.addAll(imrVar.a.g(this));
        arrayList.addAll(imrVar.b.g(this));
        for (View view : arrayList) {
            d(view, null);
        }
    }

    public final void f() {
        imn aa;
        hsk b = hsx.b();
        if (b == null || (aa = b.aa()) == null) {
            return;
        }
        imr imrVar = (imr) aa;
        imrVar.a.n(this);
        imrVar.b.n(this);
        h();
    }
}
